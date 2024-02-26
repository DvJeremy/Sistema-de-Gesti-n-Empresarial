
package Area_ServiceC.controlador;

import Area_RRHH.controlador.controladorPersonalConsult;
import Area_RRHH.vista.PersonalConsult;
import Area_ServiceC.modelo.Cliente;
import Area_ServiceC.modelo.ClienteDTO;
import Area_ServiceC.modelo.PcPersonal;
import Area_ServiceC.modelo.PcProducto;
import Area_ServiceC.modelo.Problema;
import Area_ServiceC.vista.Area_sc;
import Area_inventario.controlador.controladorInvConsult;
import Area_inventario.vista.InvConsult;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;


public class controladorArea_sc implements ActionListener{
    private Area_sc asc;
    private File f = new File("Servicio cliente.xml");

    public controladorArea_sc(Area_sc asc) {
        this.asc = asc;
        this.asc.setSize(1010, 560);
        this.asc.btncinv.addActionListener(this);
        this.asc.btncrh.addActionListener(this);
        this.asc.btnenviar.addActionListener(this);
    }

    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==asc.btncinv){
            InvConsult ci = new InvConsult();
            controladorInvConsult ivc = new controladorInvConsult(ci);
            ivc.iniciar();
        }
        if(ae.getSource()==asc.btncrh){
            PersonalConsult pc = new PersonalConsult();
            controladorPersonalConsult cpc = new controladorPersonalConsult(pc);
            cpc.iniciar();
        }
        if(ae.getSource()==asc.btnenviar){
            if(asc.txtnomb.getText().compareTo("")==0 || asc.txtdni.getText().compareTo("")==0 || asc.txtcorreo.getText().compareTo("")==0 || asc.txtdireccion.getText().compareTo("")==0 || asc.txttelef.getText().compareTo("")==0 || asc.txtdesc.getText().compareTo("")==0 || asc.cbproblem.getSelectedIndex()==0
                || asc.txtsolu.getText().compareTo("")==0 || asc.txtnomb.getText().compareTo("ingresar nombre")==0 || asc.txtdni.getText().compareTo("ingrese numero de dni")==0
                || asc.txtcorreo.getText().compareTo("ingrese correo electronico")==0 || asc.txtdireccion.getText().compareTo("ingrese direccion")==0
                || asc.txtdesc.getText().compareTo("ingrese problema del cliente")==0){
            JOptionPane.showMessageDialog(null,"Existen campos vacios.");
        }else{
            Cliente c = new Cliente(asc.txtnomb.getText(),asc.txtcorreo.getText(),asc.txtdireccion.getText(),Integer.parseInt(asc.txtdni.getText()),Integer.parseInt(asc.txttelef.getText()));
            ClienteDTO cdto = new ClienteDTO();
            if(asc.cbproblem.getSelectedIndex()==1){
                Problema pp = new PcProducto(Integer.parseInt(asc.txtidp.getText()),asc.txtdesc.getText(),asc.txtsolu.getText());
                c.setP(pp);
                c.traslado_dto(cdto);
                EnviarReporte(cdto);
            }else{
                Problema pper = new PcPersonal(asc.cbpt.getSelectedItem().toString(),asc.txtdesc.getText(),asc.txtsolu.getText());
                c.setP(pper);
                EnviarReporte(cdto);
            }
            limpiar();
        }
        }
    }
    public void limpiar(){
            asc.txtnomb.setText("ingresar nombre");
            asc.txtnomb.setForeground(Color.gray);
            asc.txtdni.setText("ingrese numero de dni");
            asc.txtdni.setForeground(Color.gray);
            asc.txtcorreo.setText("ingrese correo electronico");
            asc.txtcorreo.setForeground(Color.gray);
            asc.txtdireccion.setText("ingrese direccion");
            asc.txtdireccion.setForeground(Color.gray);
            asc.txttelef.setText("ingrese n° telefono");
            asc.txttelef.setForeground(Color.gray);
            asc.txtdesc.setText("ingrese problema del cliente");
            asc.txtdesc.setForeground(Color.gray);
            asc.txtidp.setText("ingrese id del producto");
            asc.txtidp.setForeground(Color.gray);
            asc.txtsolu.setText("");
    }
    public void EnviarReporte(ClienteDTO x){
        try{
            if(!f.exists()){
                f.createNewFile();
            }
                XMLEncoder xml = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Servicio cliente.xml")));
                xml.writeObject(x);
                xml.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
