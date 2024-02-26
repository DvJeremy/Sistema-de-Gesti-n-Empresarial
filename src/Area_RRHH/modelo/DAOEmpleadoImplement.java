/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area_RRHH.modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author 51939
 */
public class DAOEmpleadoImplement implements DAOEmpleado{
    Conexion conexion = Conexion.getInstance();
   
  
    public void registrar(Empleado empleado) {
        try {
            Connection conectar = conexion.conectar(); 
            PreparedStatement insertar = conectar.prepareStatement("insert into empleados values(?,?,?,?,?,?,?,?,?,?,?)");
            insertar.setInt(1, empleado.getId());
            insertar.setString(2, empleado.getNom());
            insertar.setString(3, empleado.getAp());
            insertar.setString(4, empleado.getSexo());
            insertar.setString(5, empleado.getPt());
            insertar.setString(6, empleado.getEcivil());
            insertar.setString(7, empleado.getCorreo());
            insertar.setString(8, empleado.getTele());
            insertar.setString(9, empleado.getDirec());
            insertar.setString(10, empleado.getFn());
            insertar.setString(11, empleado.getJornada());
           
            insertar.executeUpdate();

            conexion.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

 
    @Override
    public void modificar(Empleado empleado) {
       try {
            Connection conectar = conexion.conectar(); 
            PreparedStatement modificar = conectar.prepareStatement("update empleados set Nombre = ? , Apellido = ? , Genero = ? , Puesto_Trabajo = ? , Estado_Civil = ? , Correo = ? , Telefono = ? , Direccion = ? , Fecha_Nacimiento = ? , Jornada_Trabajo =?  where id_Empleado = ?");
            
            modificar.setString(1, empleado.getNom());
            modificar.setString(2, empleado.getAp());
            modificar.setString(3, empleado.getSexo());
            modificar.setString(4, empleado.getPt());
            modificar.setString(5, empleado.getEcivil());
            modificar.setString(6, empleado.getCorreo());
            modificar.setString(7, empleado.getTele());
            modificar.setString(8, empleado.getDirec());
            modificar.setString(9, empleado.getFn());
            modificar.setString(10, empleado.getJornada());
            modificar.setInt(11, empleado.getId());
           
            modificar.executeUpdate();

            conexion.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }

   
    @Override
    public void eliminar(Empleado empleado) {
        try{
            Connection conectar = conexion.conectar();
            PreparedStatement eliminar = conectar.prepareStatement("delete from empleados where id_Empleado = ?");
            eliminar.setInt(1, empleado.getId());
            eliminar.executeUpdate();
            
            conexion.cerrarConexion();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }

   
    @Override
    public void buscar(Empleado empleado) {
        try{
            Connection conectar = conexion.conectar();
            PreparedStatement buscar = conectar.prepareStatement("select * from empleados where id_Empleado = ?");
            
            buscar.setInt(1, empleado.getId());
            ResultSet consulta = buscar.executeQuery();
            
            if(consulta.next()){
                empleado.setId(Integer.parseInt(consulta.getString("idProducto")));
                empleado.setNom(consulta.getString("Nombre"));
                empleado.setAp(consulta.getString("Apellido"));
                empleado.setSexo(consulta.getString("Genero"));
                empleado.setPt(consulta.getString("Puesto"));
                empleado.setEcivil(consulta.getString("Estado Civil"));
                empleado.setCorreo(consulta.getString("Correo"));
                empleado.setTele(consulta.getString("Telefono"));
                empleado.setDirec(consulta.getString("Direccion"));
                empleado.setFn(consulta.getString("Fecha_Nacimiento"));
                empleado.setJornada(consulta.getString("Jornada"));
                
            }
            
            conexion.cerrarConexion();
            
        }catch(NumberFormatException | SQLException e){
            System.out.println(e);
        }
    }

}
