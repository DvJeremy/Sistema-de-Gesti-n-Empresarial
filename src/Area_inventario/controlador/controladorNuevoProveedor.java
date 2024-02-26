
package Area_inventario.controlador;

import Area_inventario.vista.NuevoProveedor;
import Area_inventario.modelo.DAOProveedorImplement;
import Area_inventario.modelo.Proveedor;
import Conexion.Conexion;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class controladorNuevoProveedor implements MouseListener{

    private NuevoProveedor nvp;

    public controladorNuevoProveedor(NuevoProveedor nvp) {
        this.nvp = nvp;
        this.nvp.btnActualizar.addMouseListener(this);
        this.nvp.btnBuscar.addMouseListener(this);
        this.nvp.btnEliminar.addMouseListener(this);
        this.nvp.btnMostrar.addMouseListener(this);
        this.nvp.btnRegistrar.addMouseListener(this);
        this.nvp.btnVolver.addMouseListener(this);
    }
    
    public void iniciar(){
        this.nvp.setVisible(true);
        this.nvp.setLocationRelativeTo(null);
    }
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == nvp.btnActualizar) {
            DAOProveedorImplement dao = new DAOProveedorImplement();
            Proveedor p = new Proveedor();

            if (nvp.txtCod.getText().equals("") || nvp.txtRuc.getText().equals("") || nvp.txtEmpresa.getText().equals("") || nvp.txtTelef.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "...¡Existen campoas vacios!...");
            } else {

                String cod, ruc, empresa;
                String telf;

                cod = nvp.txtCod.getText();
                ruc = nvp.txtRuc.getText();
                empresa = nvp.txtEmpresa.getText();
                telf = nvp.txtTelef.getText();

                p.setCod(cod);
                p.setRuc(ruc);
                p.setEmpresa(empresa);
                p.setTelf(telf);

                dao.modificar(p);

                limpiar();
                JOptionPane.showMessageDialog(null, "...Actualizado correctamente...");
            }
        }
        if (me.getSource() == nvp.btnBuscar) {
            DAOProveedorImplement dao = new DAOProveedorImplement();
            Proveedor p = new Proveedor();

            if (nvp.txtCod.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "...Ingrese codigo a buscar...");
            } else {

                String cod;

                cod = nvp.txtCod.getText();
                p.setCod(cod);
                dao.buscar(p);

                nvp.txtCod.setText(p.getCod());
                nvp.txtRuc.setText(p.getRuc());
                nvp.txtEmpresa.setText(p.getEmpresa());
                nvp.txtTelef.setText(p.getTelf());
                JOptionPane.showMessageDialog(null, "...Proveedor encontrado...");
            }
        }
        if (me.getSource() == nvp.btnEliminar) {
            DAOProveedorImplement dao = new DAOProveedorImplement();
            Proveedor p = new Proveedor();

            if (nvp.txtCod.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "...Ingrese codigo a eliminar...");
            } else {

                String cod;

                cod = nvp.txtCod.getText();
                p.setCod(cod);
                dao.eliminar(p);
                limpiar();
                JOptionPane.showMessageDialog(null, "...Eliminado con exito...");
            }
        }
        if (me.getSource() == nvp.btnMostrar) {
            try {
                DefaultTableModel modelo = new DefaultTableModel();
                nvp.tblRegistro.setModel(modelo);
                Conexion conectar = new Conexion();
                PreparedStatement ps;
                String sql = "select * from proveedor";
                Connection con;
                con = conectar.conectar();
                ps = con.prepareStatement(sql);

                ResultSet consulta = ps.executeQuery();
                ResultSetMetaData datos = consulta.getMetaData();
                int cantidadColumnas = datos.getColumnCount();

                modelo.addColumn("ID_Proveedor");
                modelo.addColumn("RUC");
                modelo.addColumn("Empresa");
                modelo.addColumn("Telefono");

                int anchos[] = {90, 90, 90, 90};

                //recorremos la cantidad de columnas y le asignamos anchos 
                for (int i = 0; i < cantidadColumnas; i++) {
                    nvp.tblRegistro.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                }

                //Cargamos los datos
                while (consulta.next()) {
                    Object arreglo[] = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        arreglo[i] = consulta.getObject(i + 1);
                    }
                    modelo.addRow(arreglo);
                }

            } catch (Exception error) {
                System.out.println(error);
            }
        }
        if (me.getSource() == nvp.btnRegistrar) {
            DAOProveedorImplement dao = new DAOProveedorImplement();
            Proveedor p = new Proveedor();
            String cod, ruc, empresa;
            String telf;
            if (nvp.txtCod.getText().equals("") || nvp.txtRuc.getText().equals("") || nvp.txtEmpresa.getText().equals("") || nvp.txtTelef.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "...¡Existen campoas vacios!...");
            } else {

                cod = nvp.txtCod.getText();
                ruc = nvp.txtRuc.getText();
                empresa = nvp.txtEmpresa.getText();
                telf = nvp.txtTelef.getText();

                p.setCod(cod);
                p.setRuc(ruc);
                p.setEmpresa(empresa);
                p.setTelf(telf);

                dao.Agregar(p);
                limpiar();
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }
        }
        if (me.getSource() == nvp.btnVolver) {
            this.nvp.setVisible(false);
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
    
    public void limpiar() {
        nvp.txtCod.setText("");
        nvp.txtRuc.setText("");
        nvp.txtEmpresa.setText("");
        nvp.txtTelef.setText("");
    }
}
