
package Entrada.controlador;

import Entrada.modelo.DAOusuario;
import Entrada.modelo.Usuario;
import Entrada.vista.Login;
import Entrada.vista.RegistrarU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class controladorRegistro implements ActionListener{

    private RegistrarU ru ;
    private DAOusuario du = new DAOusuario();

    public controladorRegistro(RegistrarU ru) {
        this.ru = ru;
        this.ru.btncrear.addActionListener(this);
        this.ru.btnregresar.addActionListener(this);
    }
    public void iniciar(){
        ru.setVisible(true);
        ru.setTitle("SISTEMA DE REGISTRO DE CUENTAS");
        ru.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==ru.btncrear){
            if(ru.txtuser.getText().compareTo("")==0 || ru.txtcontra.getText().compareTo("")==0 || ru.txtcdr.getText().compareTo("")==0 ||
                ru.txtuser.getText().compareTo("Ingrese nombre de usuario")==0 || ru.txtcontra.getText().compareTo("Ingrese contraseña")==0
                || ru.txtcdr.getText().compareTo("Ingrese clave de recuperacion")==0 ){
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.");
        }else{
            Usuario user = new Usuario(ru.txtuser.getText(), ru.txtcontra.getText(), Integer.parseInt(ru.txtcdr.getText()));
            if (existeU(user)) {
                JOptionPane.showMessageDialog(null, "Esta cuenta ya existe");
                ru.txtuser.setText("");
                ru.txtcontra.setText("");
                ru.txtcdr.setText("");
            } else {
                du.registrar(user);
                ru.txtuser.setEditable(false);
                ru.txtcontra.setEditable(false);
                ru.txtcdr.setEditable(false);
            }
        }
        }
        if(ae.getSource()==ru.btnregresar){
            Login l = new Login();
            controladorLogin cl =new controladorLogin(l);
            cl.iniciar();
            ru.dispose();
        }
    }
    
    public boolean existeU(Usuario x){
        boolean k=false;
        for(Usuario y:du.recorrer()){
            if(y.getUsername().compareTo(x.getUsername())==0){
                k=true;
            }
        }
        return k;
    }
}
