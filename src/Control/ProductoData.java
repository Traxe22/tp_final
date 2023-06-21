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
 * @author Hugo, APOLO
 */
public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConnection();
    }

    public void agregarProducto(Producto producto) {
        String sql = "INSERT INTO producto(nombreProducto, descripcion, precioActual, stock, estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());

            ps.executeUpdate();

            ps.close();
            System.out.println("Producto agregado correctamente a la base de datos.");
        } catch (SQLException e) {
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
            // Obtener el stock actual del producto
            Producto producto = buscarProductoPorId(idProducto);
            int stockActual = producto.getStock();

            // Verificar si el stock es suficiente
            if (stockActual >= cantidad) {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, cantidad);
                ps.setInt(2, idProducto);

                ps.executeUpdate();

                ps.close();
                System.out.println("Stock actualizado correctamente.");
            } else {
                System.out.println("No hay suficiente stock disponible para restar.");
                // Aquí puedes mostrar un mensaje de error o lanzar una excepción según sea necesario
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar el stock: " + e.getMessage());
        }
    }

    public boolean verificarStockSuficiente(int idProducto, int cantidad) {
        String sql = "SELECT stock FROM producto WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int stock = rs.getInt("stock");
                return stock >= cantidad;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al verificar el stock: " + e.getMessage());
        }
        return false;
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
                String descripcion = rs.getString("descripcion");
                double precioActual = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                //boolean estado = rs.getBoolean("estado");
                Producto producto = new Producto(idProducto, nombreProducto, descripcion, precioActual, stock);
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
        String sql = "SELECT * FROM producto ORDER BY idProducto DESC";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int idProducto = rs.getInt("idProducto");
                String nombreProducto = rs.getString("nombreProducto");
                String descripcion = rs.getString("descripcion");
                double precioActual = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                boolean estado = rs.getBoolean("estado");
                Producto producto = new Producto(idProducto, nombreProducto, descripcion, precioActual, stock, estado);
                productos.add(producto);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener los productos: " + e.getMessage());
        }
        return productos;
    }

    public int obtenerUltimoIdProducto() {
        int ultimoId = 0;
        String sql = "SELECT idProducto FROM producto ORDER BY idProducto DESC LIMIT 1";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                ultimoId = rs.getInt("idProducto");
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el último ID de producto: " + e.getMessage());
        }
        return ultimoId;
    }

    public Producto buscarProductoPorId(int idProducto) {
        Producto producto = null;
        String sql = "SELECT * FROM producto WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("idProducto");
                String nombre = rs.getString("nombreProducto");
                double precio = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                boolean estado = rs.getBoolean("estado");
                producto = new Producto(id, nombre, precio, stock, estado);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar el producto: " + e.getMessage());
        }
        return producto;
    }
    
    public Producto buscarProductoPorId2(int idProducto) {
        Producto producto = null;
        String sql = "SELECT * FROM producto WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("idProducto");
                String nombre = rs.getString("nombreProducto");
                String descrip = rs.getString("descripcion");
                double precio = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                boolean estado = rs.getBoolean("estado");
                producto = new Producto(idProducto, nombre, descrip, precio, stock, estado);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar el producto: " + e.getMessage());
        }
        return producto;
    }

    public List<Producto> buscarProductoPorNombre(String nombreProducto) {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM producto WHERE nombreProducto LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombreProducto + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idProducto = rs.getInt("idProducto");
                String nombre = rs.getString("nombreProducto");
                String descripcion = rs.getString("descripcion");
                double precioActual = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                boolean estado = rs.getBoolean("estado");
                Producto producto = new Producto(idProducto, nombre, descripcion, precioActual, stock, estado);
                productos.add(producto);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar productos por nombre: " + e.getMessage());
        }
        return productos;
    }

    public void actualizarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombreProducto = ?, descripcion = ?, precioActual = ? WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getIdProducto());

            ps.executeUpdate();

            ps.close();
            System.out.println("Producto actualizado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar el producto en la base de datos: " + e.getMessage());
        }
    }
    public void actualizarProducto2(Producto producto) {
        String sql = "UPDATE producto SET nombreProducto = ?, descripcion = ?, precioActual = ?,stock = ?,estado = ? WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());

            ps.executeUpdate();

            ps.close();
            System.out.println("Producto actualizado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar el producto en la base de datos: " + e.getMessage());
        }
    }
    
    

    public void eliminarProducto(int idProducto) {
        String sql = "DELETE FROM producto WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ps.executeUpdate();

            ps.close();
            System.out.println("Producto eliminado correctamente de la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar el producto de la base de datos: " + e.getMessage());
        }
    }

}
