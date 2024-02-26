package Area_ServiceC.modelo;


import java.util.Calendar;


public class Fecha {
    private int dia,mes,año;

    public Fecha() {
        this.dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        this.mes = Calendar.getInstance().get(Calendar.MONTH)+1;
        this.año = Calendar.getInstance().get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+año;
    }
    
}
