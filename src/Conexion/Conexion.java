/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class Conexion {
    private static final String DATABASE_URL = "jdbc:mariadb://";
    private static final String DATABASE_HOST ="localhost:3306";
    private static final String DATABASE_DB ="/tp_final_g6";
    private static final String DATABASE_USUARIO ="root";
    private static final String DATABASE_PASSWORD =""; 
    
    
    private static Conexion conexion = null;
    
    private Conexion(){
        try{
            //Cargar drivers
            Class.forName("org.mariadb.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Clase Conexion: Error al cargar los Driver"+ex);
        }
    }
    public static Connection getConnection(){
      Connection con = null;
      if(conexion ==null){
          conexion= new Conexion();
      }
      try{
          //Setup the connection with the DB
          con = DriverManager.getConnection(
                  DATABASE_URL+
                  DATABASE_HOST+
                  DATABASE_DB+
                  "?useLegacyDatetimeCode=false&serverTimeZone=UTC"+
                  "&user="+
                  DATABASE_USUARIO+
                  "&password="+
                  DATABASE_PASSWORD
          );
      }catch(SQLException ex){
          Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

      }
        return con;
    }
}
