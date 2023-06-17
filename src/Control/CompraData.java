/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexion.Conexion;
import Modelo.Compra;
import java.sql.Connection;
import java.sql.Date;
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
public class CompraData {
    private Connection con = null;

    public CompraData() {
        con = Conexion.getConnection();
    }
    
//    public void registrarCompra(int idProveedor, Date fechaCompra) {
//    String sql = "INSERT INTO compra (idProveedor, fechaCompra) VALUES (?, ?)";
//    try {
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, idProveedor);
//        ps.setDate(2, new java.sql.Date(fechaCompra.getTime()));
//        
//        ps.executeUpdate();
//        
//        ps.close();
//        System.out.println("Compra registrada correctamente en la base de datos.");
//    } catch (SQLException e) {
//        System.out.println("Error al registrar la compra en la base de datos: " + e.getMessage());
//    }
//}

    public void registrarCompra(Compra compra) {
        String sql = "INSERT INTO compra(idProveedor, fecha) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getIdProveedor());
            ps.setDate(2, java.sql.Date.valueOf(compra.getFecha()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int idCompra = rs.getInt(1);
                compra.setIdCompra(idCompra);
            }

            rs.close();
            ps.close();
            System.out.println("Compra registrada correctamente. ID de compra: " + compra.getIdCompra());
        } catch (SQLException e) {
            System.out.println("No se pudo registrar la compra correctamente: " + e.getMessage());
        }
    }

    public List<Compra> consultarCompras() {
        List<Compra> compras = new ArrayList<>();

        String sql = "SELECT idCompra, idProveedor, fecha FROM compra";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int idCompra = rs.getInt("idCompra");
                int idProveedor = rs.getInt("idProveedor");
                LocalDate fecha = rs.getDate("fecha").toLocalDate();

                Compra compra = new Compra(idCompra, idProveedor, fecha);
                compras.add(compra);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error al consultar las compras: " + e.getMessage());
        }

        return compras;
    }
    
    public int obtenerUltimoIdCompra() {
    int ultimoId = 0;
    String sql = "SELECT idCompra FROM compra ORDER BY idCompra DESC LIMIT 1";
    try {
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        if (rs.next()) {
            ultimoId = rs.getInt("idCompra");
        }
        rs.close();
        statement.close();
    } catch (SQLException e) {
        System.out.println("Error al obtener el último ID de compra: " + e.getMessage());
    }
    return ultimoId;
}
    
}
