/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexion.Conexion;
import Modelo.*;
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
    //Agregar lista de productos 
   public void sumarStock(int idProducto, int cantidad) {
        String sql = "UPDATE producto SET stock = stock + ? WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2, idProducto);

            ps.executeUpdate();

            ps.close();
            System.out.println("Stock actualizado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar el stock: " + e.getMessage());
        }
    } 
   public void restarStock(int idProducto, int cantidad) {
    String sql = "UPDATE producto SET stock = stock - ? WHERE idProducto = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cantidad);
        ps.setInt(2, idProducto);

        ps.executeUpdate();

        ps.close();
        System.out.println("Stock actualizado correctamente.");
    } catch (SQLException e) {
        System.out.println("Error al actualizar el stock: " + e.getMessage());
    }
}
   public List<Producto> obtenerProductos() {
    List<Producto> productos = new ArrayList<>();
    String sql = "SELECT * FROM producto WHERE estado = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setBoolean(1, true);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int idProducto = rs.getInt("idProducto");
            String nombreProducto = rs.getString("nombreProducto");
            double precioActual = rs.getDouble("precioActual");
            int stock = rs.getInt("stock");
            //boolean estado = rs.getBoolean("estado");
            Producto producto = new Producto(idProducto, nombreProducto, precioActual, stock);
            productos.add(producto);
        }
        rs.close();
        ps.close();
    } catch (SQLException e) {
        System.out.println("Error al obtener los productos: " + e.getMessage());
    }
    return productos;
}
   public List<Producto> obtenerProductosTodos() {
    List<Producto> productos = new ArrayList<>();
    String sql = "SELECT * FROM producto";
    try {
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            int idProducto = rs.getInt("idProducto");
            String nombreProducto = rs.getString("nombreProducto");
            double precioActual = rs.getDouble("precioActual");
            int stock = rs.getInt("stock");
            boolean estado = rs.getBoolean("estado");
            Producto producto = new Producto(idProducto, nombreProducto, precioActual, stock, estado);
            productos.add(producto);
        }
        rs.close();
        statement.close();
    } catch (SQLException e) {
        System.out.println("Error al obtener los productos: " + e.getMessage());
    }
    return productos;
}
   
//   public Producto obtenerProductoPorNombre(String nombre) {
//    Producto producto = null;
//    String query = "SELECT * FROM producto WHERE nombre = ?";
//    try (PreparedStatement stmt = con.prepareStatement(query)) {
//        stmt.setString(1, nombre);
//        ResultSet rs = stmt.executeQuery();
//        if (rs.next()) {
//            int idProducto = rs.getInt("idProducto");
//            String descripcion = rs.getString("descripcion");
//            double precio = rs.getDouble("precio");
//            int cantidad = rs.getInt("cantidad");
//            boolean disponible = rs.getBoolean("disponible");
//            producto = new Producto(idProducto, nombre, descripcion, precio, cantidad, disponible);
//        }
//    } catch (SQLException e) {
//        System.out.println("Error al obtener producto por nombre: " + e.getMessage());
//    }
//    return producto;
//}
}
