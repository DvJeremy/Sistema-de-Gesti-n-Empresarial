package Area_inventario.modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOProductoImplement implements DAOProducto {

    Conexion conexion = Conexion.getInstance();

    @Override
    public void registrar(Producto producto) {
        try {
            Connection conectar = conexion.conectar(); 
            PreparedStatement insertar = conectar.prepareStatement("insert into producto values(?,?,?,?,?,?,?,?,?)");
            insertar.setInt(1, producto.getIdProducto());
            insertar.setString(2, producto.getDescripcion());
            insertar.setInt(3, producto.getStock());
            insertar.setDouble(4, producto.getPrecioU());
            insertar.setDouble(5, producto.precioTotal());
            insertar.setDouble(6, producto.getPrecioV());
            insertar.setString(7, producto.getFecha_entrega());
            insertar.setString(8, producto.getFecha_vencimiento());
            insertar.setInt(9, producto.getIdProveedor());
            insertar.executeUpdate();

            conexion.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void modificar(Producto producto) {
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement modificar = conectar.prepareStatement("update producto set Descripcion = ? , Stock = ? , PrecioU = ? , PrecioV = ? , CostoTotal = ? , Fecha_entrega = ? , Fecha_vencimiento = ?  where idProducto = ?");
            
            modificar.setString(1, producto.getDescripcion());
            modificar.setInt(2, producto.getStock());
            modificar.setDouble(3, producto.getPrecioU());
            modificar.setDouble(4, producto.getPrecioV());
            modificar.setDouble(5, producto.precioTotal());
            modificar.setString(6, producto.getFecha_entrega());
            modificar.setString(7, producto.getFecha_vencimiento());
            //modificar.setInt(8, producto.getIdProveedor());
            modificar.setInt(8, producto.getIdProducto());
            modificar.executeUpdate();
            
            conexion.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminar(Producto producto) {
        try{
            Connection conectar = conexion.conectar();
            PreparedStatement eliminar = conectar.prepareStatement("delete from producto where idProducto = ?");
            eliminar.setInt(1, producto.getIdProducto());
            eliminar.executeUpdate();
            
            conexion.cerrarConexion();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    @Override
    public void buscar(Producto producto) {
        try{
            Connection conectar = conexion.conectar();
            PreparedStatement buscar = conectar.prepareStatement("select * from producto where idProducto = ?");
            
            buscar.setInt(1, producto.getIdProducto());
            ResultSet consulta = buscar.executeQuery();
            
            if(consulta.next()){
                producto.setIdProducto(Integer.parseInt(consulta.getString("idProducto")));
                producto.setDescripcion(consulta.getString("Descripcion"));
                producto.setStock(Integer.parseInt(consulta.getString("Stock")));
                producto.setPrecioU(Double.parseDouble(consulta.getNString("PrecioU")));
                producto.setPrecioV(Double.parseDouble(consulta.getNString("PrecioV")));
                producto.precioTotal();
            }
            
            conexion.cerrarConexion();
            
        }catch(NumberFormatException | SQLException e){
            System.out.println(e);
        }
    }
   
}
