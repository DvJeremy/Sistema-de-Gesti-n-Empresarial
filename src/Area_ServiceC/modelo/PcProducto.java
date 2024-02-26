
package Area_ServiceC.modelo;


public class PcProducto extends Problema implements Interface {
    private int idp;

    public PcProducto(int idp, String descrip, String soluc) {
        super(descrip, soluc);
        this.idp = idp;
    }

    @Override
    public String imprimir() {
        return "\nProblema con el producto: "+getDescrip()+"\nid del producto: "+idp+"\nSolucion al problema:"+getSoluc()+"\n\n";
    }
    
}
