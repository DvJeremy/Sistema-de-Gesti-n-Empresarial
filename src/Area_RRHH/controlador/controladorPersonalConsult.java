
package Area_RRHH.controlador;

import Area_RRHH.vista.PersonalConsult;
import Area_RRHH.modelo.DAOEmpleadoImplement;
import Area_RRHH.modelo.Empleado;
import Conexion.Conexion;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class controladorPersonalConsult implements MouseListener{
    private PersonalConsult pc;
    private Conexion conexion = Conexion.getInstance();
    private Connection conectar = conexion.conectar();

    public controladorPersonalConsult(PersonalConsult pc) {
        this.pc = pc;
        this.pc.btneliminar.addMouseListener(this);
        this.pc.btnsalirc.addMouseListener(this);   
    }

    public void iniciar(){
        pc.setVisible(true);
        this.pc.setLocationRelativeTo(null);
        pc.Mostrar("");
    }
    
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == pc.btneliminar) {
            DAOEmpleadoImplement empleado_dao = new DAOEmpleadoImplement();
            Empleado empleado = new Empleado();
            
            if (pc.txteliminar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Porfavor ingrese el ID a eliminar");
            } else {
                int id = Integer.parseInt(pc.txteliminar.getText());
                empleado.setId(id);
                
                empleado_dao.eliminar(empleado);
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                pc.txteliminar.setText("");                
            }
        }
        if (me.getSource() == pc.btnsalirc) {
            this.pc.setVisible(false);
        }
    }

    public void mouseEntered(MouseEvent me) {
    }  
    public void mouseExited(MouseEvent me) {
    }   
    public void mousePressed(MouseEvent me) {       
    }    
    public void mouseReleased(MouseEvent me) {       
    }
    
}
