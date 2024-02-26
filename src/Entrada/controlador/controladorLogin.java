
package Entrada.controlador;

import Entrada.modelo.DAOusuario;
import Entrada.modelo.Usuario;
import Entrada.vista.Login;
import Entrada.vista.OlvidoC;
import Entrada.vista.RegistrarU;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import menu.controlador.controladorMenu;
import menu.vista.Principal;


public class controladorLogin implements MouseListener{
    private Login l ;
    private DAOusuario du = new DAOusuario();

    public controladorLogin(Login l) {
        this.l = l;
        this.l.btnentrar.addMouseListener(this);
        this.l.btnregistro.addMouseListener(this);
        this.l.btnolvido.addMouseListener(this);
        this.l.btnsalir.addMouseListener(this);
    }

    public void iniciar(){
        l.setVisible(true);
        l.setTitle("SISTEMA DE LOGGEO");
        l.setLocationRelativeTo(null);
    }
    int cont=0;
    
    public boolean verificar(Usuario x){
        boolean k=false;
        for(Usuario y:du.recorrer()){
            if(y.getUsername().compareTo(x.getUsername())==0 && y.getContraseña().compareTo(x.getContraseña())==0){
                k=true;
            }
        }
        return k;
    }

    
    public void mouseClicked(MouseEvent me) {
        if(me.getSource()==l.btnentrar){
            String Pass = new String(l.txtcontra.getPassword());
        if(l.txtuser.getText().compareTo("")==0 || Pass.compareTo("")==0 
                || l.txtuser.getText().compareTo("Ingrese nombre de usuario")==0 || Pass.compareTo("Ingrese contraseña")==0){
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.");
        }else{
            Usuario user = new Usuario(l.txtuser.getText(), Pass);
            if (verificar(user)) {
                JOptionPane.showMessageDialog(null, "Entrando a menu principal");
                Principal princ = new Principal();
                controladorMenu cm = new controladorMenu(princ);
                cm.iniciar();
                this.l.dispose();
            } else {
                cont++;
                if (cont == 3) {
                    JOptionPane.showMessageDialog(null, "FIN DE INTENTOS.....CERRANDO EL PROGRAMA.");
                    System.exit(0);
                }
                JOptionPane.showMessageDialog(null, "Usuario o contraseña no valido");
                l.txtuser.setText("Ingrese nombre de usuario");
                l.txtuser.setForeground(Color.gray);
                l.txtcontra.setText("**********");
                l.txtcontra.setForeground(Color.gray);
            }
        }
        }
        if(me.getSource()==l.btnregistro){
            RegistrarU ru = new RegistrarU();
            controladorRegistro cr =new controladorRegistro(ru);
            cr.iniciar();
            this.l.dispose();
        }
        if(me.getSource()==l.btnolvido){
            OlvidoC oc = new OlvidoC();
            controladorOlvido coc = new controladorOlvido(oc);
            coc.iniciar();
            this.l.dispose();
        }
        if(me.getSource()==l.btnsalir){
            System.exit(0);
        }
    }

    
    public void mousePressed(MouseEvent me) {
        
    }

    
    public void mouseReleased(MouseEvent me) {
        
    }

    
    public void mouseEntered(MouseEvent me) {
        
    }

    
    public void mouseExited(MouseEvent me) {
        
    }
}
