
package Entrada.modelo;


public class Usuario {
    private String username, contraseña;
    private int cdr;

    public Usuario(String username, String contraseña, int cdr) {
        this.username = username;
        this.contraseña = contraseña;
        this.cdr = cdr;
    }
    

    public Usuario(String username, String contraseña) {
        this.username = username;
        this.contraseña = contraseña;
    }

    public Usuario(String username, int cdr) {
        this.username = username;
        this.cdr = cdr;
    }


    public String getUsername() {
        return username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getCdr() {
        return cdr;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
