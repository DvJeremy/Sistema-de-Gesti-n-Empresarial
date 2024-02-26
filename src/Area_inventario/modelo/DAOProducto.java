
package Area_inventario.modelo;


public interface DAOProducto {
    
    public void registrar(Producto producto);
    public void modificar(Producto producto);
    public void eliminar(Producto producto);
    public void buscar(Producto producto);
    
}
