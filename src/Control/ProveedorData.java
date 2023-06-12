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
}
