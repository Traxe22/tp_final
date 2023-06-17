/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexion.Conexion;
import Modelo.DetalleVenta;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class DetalleVentaData {
    private Connection con = null;
    public DetalleVentaData(){
        con = Conexion.getConnection();
    }
    public void agregarDetalleVenta(DetalleVenta detalleVenta){
        String sql ="INSERT INTO detalleventa( cantidad, idVenta, precioVenta, idProducto) VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detalleVenta.getCantidad());
            ps.setInt(2, detalleVenta.getIdVenta());
            ps.setDouble(3, detalleVenta.getPrecioVenta());
            ps.setInt(4, detalleVenta.getIdProducto());
            
            ps.executeUpdate();
            
            ps.close();
            System.out.println("Detalle de la venta fue agregar a la base de datos.");
        }catch(SQLException e){
            System.out.println("Error al guardar el detalle de Venta.");
        }
    }
    public List<DetalleVenta> consultarDetallesVenta() {
    List<DetalleVenta> detallesVenta = new ArrayList<>();

    String sql = "SELECT dv.idDetalleVent, dv.cantidad, dv.idVenta, dv.precioVenta, dv.idProducto "
            + "FROM detalleventa dv "
            + "INNER JOIN venta v ON dv.idVenta = v.idVenta";

    try {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int idDetalleVent = rs.getInt("idDetalleVent");
            int cantidad = rs.getInt("cantidad");
            int idVenta = rs.getInt("idVenta");
            double precioVenta = rs.getDouble("precioVenta");
            int idProducto = rs.getInt("idProducto");

            DetalleVenta detalleVenta = new DetalleVenta(idDetalleVent, cantidad, idVenta, precioVenta, idProducto);
            detallesVenta.add(detalleVenta);
        }

        rs.close();
        stmt.close();
    } catch (SQLException e) {
        System.out.println("Error al consultar los detalles de venta: " + e.getMessage());
    }

    return detallesVenta;
}
    
    public List<DetalleVenta> mostrarVenta(int idCliente) {
        List<DetalleVenta> ventas = new ArrayList<>();
        String sql = "SELECT dv.cantidad, dv.precioVenta, v.idVenta, p.idProducto " +
                     "FROM detalleventa dv " +
                     "INNER JOIN venta v ON dv.idVenta = v.idVenta " +
                     "INNER JOIN producto p ON dv.idProducto = p.idProducto " +
                     "WHERE v.idCliente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precioVenta");
                int idVenta = rs.getInt("idVenta");
                int idProducto = rs.getInt("idProducto");
                DetalleVenta venta = new DetalleVenta(cantidad, idVenta, precio, idProducto);
                ventas.add(venta);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener las ventas del cliente: " + e.getMessage());
        }
        return ventas;

}
}
