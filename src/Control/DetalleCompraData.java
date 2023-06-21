package Control;

import Conexion.Conexion;
import Modelo.DetalleCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class DetalleCompraData {

    private Connection con;

    public DetalleCompraData() {
        con = Conexion.getConnection();
    }

    public void agregarDetalleCompra(DetalleCompra detalleCompra) {
        String sql = "INSERT INTO detallecompra(cantidad, precioCosto, idCompra, idProducto) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2, detalleCompra.getPrecioCosto());
            ps.setInt(3, detalleCompra.getIdCompra());
            ps.setInt(4, detalleCompra.getIdProducto());

            ps.executeUpdate();

            ps.close();
            System.out.println("Detalle de compra agregado a la base de datos correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al guardar el detalle de compra: " + e.getMessage());
        }
    }

    public List<DetalleCompra> obtenerDetallesCompraPorProveedor(int idProveedor) {
        List<DetalleCompra> detallesCompra = new ArrayList<>();
        String sql = "SELECT dc.idDetalle, dc.cantidad, dc.precioCosto, dc.idCompra, dc.idProducto "
                + "FROM detallecompra dc "
                + "JOIN compra c ON dc.idCompra = c.idCompra "
                + "JOIN proveedor p ON c.idProveedor = p.idProveedor "
                + "WHERE p.idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idDetalle = rs.getInt("idDetalle");
                int cantidad = rs.getInt("cantidad");
                double precioCosto = rs.getDouble("precioCosto");
                int idCompra = rs.getInt("idCompra");
                int idProducto = rs.getInt("idProducto");

                DetalleCompra detalleCompra = new DetalleCompra(idDetalle, cantidad, precioCosto, idCompra, idProducto);
                detallesCompra.add(detalleCompra);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener los detalles de compra por proveedor: " + e.getMessage());
        }
        return detallesCompra;
    }

    public List<DetalleCompra> obtenerCompras() {
        List<DetalleCompra> compras = new ArrayList<>();
        String sql = "SELECT * FROM compra";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int cantidad = rs.getInt("cantidad");
                double precioCosto = rs.getDouble("precioCosto");
                int idCompra = rs.getInt("idCompra");
                int idProducto = rs.getInt("idProducto");
                DetalleCompra compra = new DetalleCompra(cantidad, precioCosto, idCompra, idProducto);
                compras.add(compra);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener las compras: " + e.getMessage());
        }
        return compras;
    }
}
