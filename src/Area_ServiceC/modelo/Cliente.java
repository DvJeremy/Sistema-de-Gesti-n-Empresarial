
package Area_ServiceC.modelo;


public class Cliente implements Interface{
    private String nomb,correo,direccion;
    private int dni,telef;
    private Problema p;
    private Fecha fs;

    public Cliente(String nomb, String correo, String direccion, int dni,int telef) {
        this.nomb = nomb;
        this.correo = correo;
        this.direccion = direccion;
        this.dni = dni;
        this.telef = telef;
        fs = new Fecha();
    }

    public void setP(Problema p) {
        this.p = p;
    }
    
    @Override
    public String imprimir(){
        return "\n\n"+"Fecha de servicio: "+fs+"\nNombre del cliente: "+nomb+"\nDNI: "+dni+"\ncorreo: "+correo+
                "\ndireccion: "+direccion+"\ntelefono: "+telef+p.imprimir();
    }
    
    public void traslado_dto(ClienteDTO x){
        x.setDNI(dni);
        x.setNombres(nomb);
        x.setCorreo(correo);
        x.setDireccion(direccion);
        x.setTelefono(telef);
        x.setFecha(fs.toString());
        x.setProblema(p.imprimir());
    }
}
