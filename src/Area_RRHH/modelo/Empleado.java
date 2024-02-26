
package Area_RRHH.modelo;


public class Empleado implements InterfaceEmpleado{
    private String nom,ap,sexo,pt,Ecivil;
    private String correo, tele,direc;
    private String dia,mes,año;
    private String jornada;
    private String fn;
    private int id;

    public Empleado() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getEcivil() {
        return Ecivil;
    }

    public void setEcivil(String Ecivil) {
        this.Ecivil = Ecivil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
   /* 
    public String fnacimiento(){
        return dia+"/"+mes+"/"+año;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String informacion() {
        return "\nNombres: "+nom+"\nApellidos: "+ap+"\nSexo: "+sexo+"\nPuesto de trabajo: "+pt+"\nEstado civil: "+Ecivil+"\nCorreo: "+correo
                +"\nTelefono: "+tele+"\nDireccion: "+direc+"\nFecha de nacimiento: "+fn+"\nJornada laboral: "+jornada+"\n";
    }
}
