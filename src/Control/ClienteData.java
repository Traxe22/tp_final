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
public class ClienteData {
    private Connection con = null;
    public ClienteData(){
        con = Conexion.getConnection();
    }
    public void agregarCliente(Cliente cliente){
        String sql = "INSERT INTO cliente(apellido,nombre, domicilio, telefono) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());

            // Ejecuta la consulta
            ps.executeUpdate();

            // Cierra el statement
            ps.close();

            System.out.println("Cliente agregado correctamente a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente a la base de datos: " + e.getMessage());
        }
    }
    public void modificarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET apellido=?, nombre=?, domicilio=?, telefono=? WHERE idCliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setInt(5, cliente.getIdCliente());

            // Ejecuta la consulta
            ps.executeUpdate();

            // Cierra el statement
            ps.close();

            System.out.println("Cliente modificado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al modificar el cliente en la base de datos: " + e.getMessage());
        }
    }
     public void eliminarCliente(int idCliente) {
        String sql = "DELETE FROM cliente WHERE idCliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);

            // Ejecuta la consulta
            ps.executeUpdate();

            // Cierra el statement
            ps.close();

            System.out.println("Cliente eliminado correctamente de la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar el cliente de la base de datos: " + e.getMessage());
        }
    }
    
}
