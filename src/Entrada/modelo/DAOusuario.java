
package Entrada.modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DAOusuario implements IDAOusuario{

    Conexion conexion = Conexion.getInstance();
    
    public boolean registrar(Usuario x) {
        try{
        Connection conectar = conexion.conectar();        
        Statement st = conectar.createStatement();
        st.execute("INSERT INTO usuarios (username,contraseña,recuperacion) values ('"+x.getUsername()+"','"+x.getContraseña()+"','"+x.getCdr()+"')");
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }finally{
            try {
                conexion.cerrarConexion();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    
    public boolean modificar(Usuario x) {
        try{
        Connection conectar = conexion.conectar();        
        Statement st = conectar.createStatement();
            st.execute("UPDATE usuarios SET contraseña='"+x.getContraseña()+"' WHERE usuarios.username='"+x.getUsername()+"' and usuarios.recuperacion='"+x.getCdr()+"'");
        return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }finally{
            try {
                conexion.cerrarConexion();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    
    public List<Usuario> recorrer() {
        List<Usuario> lu = new ArrayList<>();
        try{
        Connection conectar = conexion.conectar();        
        Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
            while(rs.next()){
                lu.add(new Usuario(rs.getString("username"),rs.getString("contraseña"),rs.getInt("recuperacion")));
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try {
                conexion.cerrarConexion();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return lu;
    }
    
}
