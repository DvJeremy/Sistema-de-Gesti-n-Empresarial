
package Area_ServiceC.modelo;


public class PcPersonal extends Problema implements Interface{
    private String area;

    public PcPersonal(String area, String descrip, String soluc) {
        super(descrip, soluc);
        this.area = area;
    }


    @Override
    public String imprimir() {
        return "\nProblema con el personal: "+getDescrip()+"\narea de incidente: "+area+"\nSolucion al problema:"+getSoluc()+"\n\n";
    }
    
}
