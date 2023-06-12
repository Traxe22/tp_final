/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexion.Conexion;
import Modelo.Cliente;
import Modelo.Producto;
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
public class VentaData {
    private Connection con = null;
    public VentaData(){
        con = Conexion.getConnection();
    }
    public void registrarVenta(Venta venta) {
        String sql = "INSERT INTO venta(idProducto, idCliente, fecha) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, venta.getProducto().getIdProducto());
            ps.setInt(2, venta.getCliente().getIdCliente());
            ps.setDate(3, java.sql.Date.valueOf(venta.getFechaVenta()));
            
            ps.executeUpdate();
            
            ps.close();
            System.out.println("Venta registrada correctamente.");
        } catch (SQLException e) {
            System.out.println("No se pudo registrar la venta correctamente: " + e.getMessage());
        }
    }
    
    
}
