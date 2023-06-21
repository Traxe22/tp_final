/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexion.Conexion;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hugo
 */
public class VentaData {

    private Connection con = null;

    public VentaData() {
        con = Conexion.getConnection();
    }

    public void registrarVenta(Venta venta) {
        String sql = "INSERT INTO venta(fecha, idCliente) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(venta.getFechaVenta()));
            ps.setInt(2, venta.getIdCliente());

            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo registrar la venta correctamente: " + e.getMessage());
        }
    }

    public int obtenerUltimoIddeVenta() {
        int ultimoId = 0;
        String sql = "SELECT idVenta FROM venta ORDER BY idVenta DESC LIMIT 1";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                ultimoId = rs.getInt("idVenta");
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el último ID de venta: " + e.getMessage());
        }
        return ultimoId;
    }
}
