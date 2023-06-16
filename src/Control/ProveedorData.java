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
import java.util.ArrayList;
import java.util.List;
import org.mariadb.jdbc.internal.com.read.dao.Results;

/**
 *
 * @author Hugo
 */
public class ProveedorData {
    private Connection con = null;
    public ProveedorData(){
        con = Conexion.getConnection();
    }
   public void agregarProveedor(Proveedor proveedor){
       String sql = "INSERT INTO proveedor ( razonSocial, domicilio, telefono) VALUES (?,?,?)";
       try{
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, proveedor.getRazonSocial());
           ps.setString(2, proveedor.getDomicilio());
           ps.setString(3, proveedor.getTelefono());
           //Ejecuta la consola
           ps.executeUpdate();
           //Cierra el statement
           ps.close();
           System.out.println("Proveedor agregado correctamente a la base de datos.");
       }catch(SQLException e){
           System.out.println("Error al agregar el Proveedor." +e.getMessage());
       }
   } 
   
   public Proveedor buscarProveedor(int idProveedor) {
        Proveedor proveedor = null;
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono FROM proveedor WHERE idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar el proveedor en la base de datos: " + e.getMessage());
        }

        return proveedor;
    }
   
   public void modificarProveedor(Proveedor proveedor) {
        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ? WHERE idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());

            ps.executeUpdate();

            ps.close();
            System.out.println("Proveedor modificado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al modificar el proveedor en la base de datos: " + e.getMessage());
        }
    }
   
   public void eliminarProveedor(int idProveedor) {
        String sql = "DELETE FROM proveedor WHERE idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);

            ps.executeUpdate();

            ps.close();
            System.out.println("Proveedor eliminado correctamente de la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar el proveedor de la base de datos: " + e.getMessage());
        }
    }
   
   
   public List<Proveedor> obtenerProveedores(){
       List<Proveedor> proveedores = new ArrayList<>();
       String sql = "SELECT * FROM proveedor";
       try{
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               int idProveedor = rs.getInt("idProveedor");
               String razonSocial = rs.getString("razonSocial");
               String domicilio = rs.getString("domicilio");
               String telefono = rs.getString("telefono");
               Proveedor proveedor = new Proveedor(idProveedor, razonSocial, domicilio, telefono);
               proveedores.add(proveedor);
           }
           rs.close();
           ps.close();
       }catch(SQLException e){
           System.out.println("Error al obtener los proveedores."+e.getMessage());
       }
        return proveedores;
   }
}
