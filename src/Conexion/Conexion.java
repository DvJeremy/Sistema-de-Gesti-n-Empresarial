package Conexion;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    public Conexion() {
    }

    private static Connection conexion;
    private static Conexion instancia;
    
   private static final String URL = "jdbc:mysql://localhost/plazavea";
   private static final String USERNAME = "root";
   private static final String PASSWORD = "12345678";
   
   //metodo para conectarnos a la BD
   public Connection conectar(){
       try{
          Class.forName("com.mysql.cj.jdbc.Driver"); 
          conexion = DriverManager.getConnection(URL,USERNAME,PASSWORD); 
          return conexion;
       }catch(HeadlessException | ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, "Error: "+e);
       }
       return conexion;
       
   }
   
   public void cerrarConexion() throws SQLException{
       try{
           conexion.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error: "+e);
           conexion.close();
       }finally{
           conexion.close();
       }
   }
   
   public static Conexion getInstance(){
       if(instancia == null){
           instancia = new Conexion();
       }
       return instancia;
   }
}
