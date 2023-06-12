/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexion.Conexion;
import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hugo
 */
public class ProductoData {
    private Connection con = null;
    public ProductoData(){
        con=Conexion.getConnection();
    }
    public void agregarProducto(Producto producto){
        String sql = "INSERT INTO producto(nombreProducto, descripcion, precioActual, stock, estado) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            
            ps.executeUpdate();
            
            ps.close();
            System.out.println("Producto agregado correctamente a la base de datos.");
        } catch(SQLException e){
            System.out.println("Error al agregar el producto a la base de datos: " + e.getMessage());
        }
    }
}
