/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area_inventario.modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 51939
 */
public class DAOProveedorImplement {
    Conexion conectar=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public int Agregar(Proveedor p){
       String sql="insert into proveedor(ID_Proveedor,RUC,Empresa,Telefono) values(?,?,?,?)";
       
       try{
           con=conectar.conectar();
           ps=con.prepareStatement(sql);
           
           ps.setString(1, p.getCod());
           ps.setString(2, p.getRuc());
           ps.setString(3, p.getEmpresa());
           ps.setString(4, p.getTelf());    
           ps.executeUpdate();
           
       }catch(Exception e){
           System.out.println(e);
       }
       return 1;
  }
    
     public void modificar(Proveedor p) {
        
       String sql="update proveedor set RUC = ? , Empresa = ? , Telefono = ?  where ID_Proveedor = ?";  
         try {
             con = conectar.conectar();
             ps = con.prepareStatement(sql);
            
            ps.setString(1, p.getRuc());
            ps.setString(2, p.getEmpresa());
            ps.setString(3, p.getTelf());
            ps.setString(4, p.getCod());
            ps.executeUpdate();
            
            //conexion.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void eliminar(Proveedor p) {
         String sql="delete from proveedor where ID_Proveedor = ?";
        
        try{
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, p.getCod());
            ps.executeUpdate();
            
            //conexion.cerrarConexion();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void buscar(Proveedor p) {
        String sql="select * from proveedor where ID_Proveedor = ?";
        
        try{
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1,p.getCod());
            ResultSet consulta = ps.executeQuery();
            
            if(consulta.next()){
                p.setCod(consulta.getString("ID_Proveedor"));
                p.setRuc(consulta.getString("RUC"));
                p.setEmpresa(consulta.getString("Empresa"));
                p.setTelf(consulta.getString("Telefono"));
                
            }
            
           // conexion.cerrarConexion();
            
        }catch(NumberFormatException | SQLException e){
            System.out.println(e);
        }
    }
}
