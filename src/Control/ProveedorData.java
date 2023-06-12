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
