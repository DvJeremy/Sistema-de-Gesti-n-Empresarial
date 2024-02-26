
package menu.controlador;

import Area_RRHH.vista.A_RRHH;
import Area_RRHH.controlador.controladorA_RHH;
import Area_ServiceC.controlador.controladorArea_sc;
import Area_ServiceC.vista.Area_sc;
import Area_inventario.vista.Area_Inv;
import Area_inventario.controlador.controladorArea_Inv;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import menu.vista.Inicio;
import menu.vista.Principal;
import menu.vista.Sunat;
import menu.vista.Vision_Mision;


public class controladorMenu implements MouseListener{

    private Principal p;

    public void iniciar(){
        this.p.setVisible(true);
        this.p.setLocationRelativeTo(null);
        Inicio p1 = new Inicio();
        p1.setSize(1010,560);
        p.contenedor.removeAll();
        p.contenedor.add(p1);
        p.contenedor.revalidate();
        p.contenedor.repaint();
    }
    public controladorMenu(Principal p) {
        this.p = p;
        this.p.btnhome.addMouseListener(this);
        this.p.btninventario.addMouseListener(this);
        this.p.btnmision.addMouseListener(this);
        this.p.btnsalir.addMouseListener(this);
        this.p.btnsc.addMouseListener(this);
        this.p.btnrrhh.addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == p.btnhome) {
            Inicio p1 = new Inicio();
            p1.setSize(1010, 560);
            p.contenedor.removeAll();
            p.contenedor.add(p1);
            p.contenedor.revalidate();
            p.contenedor.repaint();
        }
        if (me.getSource() == p.btnmision) {
            Vision_Mision p2 = new Vision_Mision();
            p2.setSize(1010, 560);
            p.contenedor.removeAll();
            p.contenedor.add(p2);
            p.contenedor.revalidate();
            p.contenedor.repaint();
        }
        if (me.getSource() == p.btninventario) {
            Area_Inv ai = new Area_Inv();
            controladorArea_Inv cai = new controladorArea_Inv(ai);
            p.contenedor.removeAll();
            p.contenedor.add(ai);
            p.contenedor.revalidate();
            p.contenedor.repaint();
        }
        if (me.getSource() == p.btnrrhh) {
            A_RRHH rh = new A_RRHH();
            controladorA_RHH carh = new controladorA_RHH(rh);
            p.contenedor.removeAll();
            p.contenedor.add(rh);
            p.contenedor.revalidate();
            p.contenedor.repaint();
        }
        if (me.getSource() == p.btnsc) {
            Area_sc sc = new Area_sc();
            controladorArea_sc casc = new controladorArea_sc(sc);
            p.contenedor.removeAll();
            p.contenedor.add(sc);
            p.contenedor.revalidate();
            p.contenedor.repaint();
        }
        if (me.getSource() == p.btnsalir) {
            System.exit(0);
        }
        if(me.getSource()==p.btnsunat){
            Sunat su = new Sunat();
            controladorSunat csn = new controladorSunat(su);
            p.contenedor.removeAll();
            p.contenedor.add(su);
            p.contenedor.revalidate();
            p.contenedor.repaint();
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
