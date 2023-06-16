/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexion.Conexion;
import Modelo.*;
import Modelo.DetalleCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class DetalleCompraData {
    private Connection con;
    public DetalleCompraData(){
       con =Conexion.getConnection(); 
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
    public List<DetalleCompra> consultarDetallesCompra() {
        List<DetalleCompra> detallesCompra = new ArrayList<>();

        String sql = "SELECT idDetalle, cantidad, precioCosto, idCompra, idProducto FROM detallecompra";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

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
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error al consultar los detalles de compra: " + e.getMessage());
}
        return detallesCompra;

    
    }
}
