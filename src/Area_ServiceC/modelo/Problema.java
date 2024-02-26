
package Area_ServiceC.modelo;


public class Problema implements Interface{
    String descrip,soluc;

    public Problema(String descrip, String soluc) {
        this.descrip = descrip;
        this.soluc = soluc;
    }


    public String getDescrip() {
        return descrip;
    }

    public String getSoluc() {
        return soluc;
    }
    
    @Override
    public String imprimir() {
        return "hola mundo";
    }
    
}
