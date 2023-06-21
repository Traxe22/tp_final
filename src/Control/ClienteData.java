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
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo, APOLO
 */
public class ClienteData {

    private Connection con = null;

    public ClienteData() {
        con = Conexion.getConnection();
    }

    public void agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente(apellido,nombre, domicilio, telefono) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());

            // Ejecuta la consulta
            ps.executeUpdate();

            // Obtiene el ID asignado al cliente
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int idAsignado = rs.getInt(1);
                // Actualiza el ID del cliente en el objeto Cliente
                cliente.setIdCliente(idAsignado);
            }

            // Cierra el statement y el ResultSet
            rs.close();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar al cliente a la base de datos." + e.getMessage());
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

    public Cliente buscarClientePorId(int idCliente) {
        String sql = "SELECT idCliente, apellido, nombre, domicilio, telefono FROM cliente WHERE idCliente = ?";
        Cliente cliente = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("idCliente");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                String domicilio = rs.getString("domicilio");
                String telefono = rs.getString("telefono");

                cliente = new Cliente(id, apellido, nombre, domicilio, telefono);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar el cliente: " + e.getMessage());
        }

        return cliente;
    }

    public List<Cliente> obtenerClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT idCliente, nombre, apellido, domicilio, telefono FROM cliente";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("idCliente");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String domicilio = rs.getString("domicilio");
                String telefono = rs.getString("telefono");
                Cliente cliente = new Cliente(id, apellido, nombre, domicilio, telefono);
                clientes.add(cliente);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener los clientes: " + e.getMessage());
        }
        return clientes;
    }
}
