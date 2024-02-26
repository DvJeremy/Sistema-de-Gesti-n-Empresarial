
package Area_inventario.controlador;

import Area_inventario.vista.InvConsult;
import Area_inventario.modelo.DAOProductoImplement;
import Area_inventario.modelo.Producto;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class controladorInvConsult implements MouseListener{

    private InvConsult ivc ;

    public controladorInvConsult(InvConsult ivc) {
        this.ivc = ivc;
        this.ivc.btneliminar.addMouseListener(this);
        this.ivc.btntconsult.addMouseListener(this);
    }
    
   public void iniciar(){
        this.ivc.setVisible(true);
        this.ivc.setLocationRelativeTo(null);
        ivc.Mostrar("");
        ivc.MostrarP("");
   }
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == ivc.btneliminar) {
            DAOProductoImplement producto_dao = new DAOProductoImplement();
            Producto producto = new Producto();

            if (ivc.txteliminar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Porfavor ingrese el ID a eliminar");
            } else {
                int id = Integer.parseInt(ivc.txteliminar.getText());
                producto.setIdProducto(id);

                producto_dao.eliminar(producto);
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                ivc.txteliminar.setText("");
            }
        }
        if (me.getSource() == ivc.btntconsult) {
            this.ivc.setVisible(false);
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
