
package Area_inventario.modelo;


public class Producto {
    private int idProducto,Stock,idProveedor;
    private double PrecioU,PrecioV;
    private String Descripcion,Fecha_entrega,Fecha_vencimiento;
    
    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecioU() {
        return PrecioU;
    }

    public void setPrecioU(double PrecioU) {
        this.PrecioU = PrecioU;
    }

    public double getPrecioV() {
        return PrecioV;
    }

    public void setPrecioV(double PrecioV) {
        this.PrecioV = PrecioV;
    }

    

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha_entrega() {
        return Fecha_entrega;
    }

    public void setFecha_entrega(String Fecha_entrega) {
        this.Fecha_entrega = Fecha_entrega;
    }

    public String getFecha_vencimiento() {
        return Fecha_vencimiento;
    }

    public void setFecha_vencimiento(String Fecha_vencimiento) {
        this.Fecha_vencimiento = Fecha_vencimiento;
    }
    
    public double precioTotal(){
        return PrecioU*Stock;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
}
