
package Entrada.controlador;

import Entrada.modelo.DAOusuario;
import Entrada.modelo.Usuario;
import Entrada.vista.Login;
import Entrada.vista.OlvidoC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class controladorOlvido implements ActionListener{
 private OlvidoC oc;
 private DAOusuario du = new DAOusuario();

    public controladorOlvido(OlvidoC oc) {
        this.oc = oc;
        this.oc.btnverif.addActionListener(this);
        this.oc.btnvalidarc.addActionListener(this);
        this.oc.btnregresar.addActionListener(this);
    }
 
 public void iniciar(){
        oc.setVisible(true);
        oc.setTitle("SISTEMA DE RECUPERACION DE CUENTA");
        oc.setLocationRelativeTo(null);
    }

    Usuario u;
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==oc.btnverif){
            if(oc.txtuser.getText().compareTo("")==0 || oc.txtcdr.getText().compareTo("")==0 
                || oc.txtuser.getText().compareTo("Ingrese nombre de usuario")==0 || oc.txtcdr.getText().compareTo("Ingrese clave de recuperacion")==0){
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.");
        }else{
            u = new Usuario(oc.txtuser.getText(), Integer.parseInt(oc.txtcdr.getText()));
            if (verificarCdr(u)) {
                JOptionPane.showMessageDialog(null, "Clave valida");
                oc.txtcontra.setEditable(true);
                oc.txtrepetir.setEditable(true);
                oc.txtuser.setEditable(false);
                oc.txtcdr.setEditable(false);
                oc.btnverif.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Clave invalida");
            }
        }
        }
        if(ae.getSource()==oc.btnvalidarc){
            if(oc.txtcontra.getText().compareTo("")==0 || oc.txtrepetir.getText().compareTo("")==0 
                || oc.txtcontra.getText().compareTo("Ingrese nueva contraseña")==0 || oc.txtrepetir.getText().compareTo("Repita contraseña")==0){
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.");
        }else{
            if (oc.txtcontra.getText().compareTo(oc.txtrepetir.getText()) == 0) {
                u.setContraseña(oc.txtcontra.getText());
                du.modificar(u);
                JOptionPane.showMessageDialog(null, "Se cambio con exito la contraseña");
                Login l = new Login();
                controladorLogin cl =new controladorLogin(l);
                cl.iniciar();
                this.oc.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            }
        }
        }
        if(ae.getSource()==oc.btnregresar){
            Login l = new Login();
            controladorLogin cl =new controladorLogin(l);
            cl.iniciar();
            this.oc.dispose();
        }
    }
    public boolean verificarCdr(Usuario x){
        boolean k=false;
        for(Usuario y:du.recorrer()){
            if(y.getUsername().compareTo(x.getUsername())==0 && y.getCdr()==x.getCdr()){
                k=true;
            }
        }
        return k;
    }
}
