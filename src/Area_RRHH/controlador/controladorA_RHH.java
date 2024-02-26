
package Area_RRHH.controlador;

import Area_RRHH.vista.A_RRHH;
import Area_RRHH.vista.PersonalConsult;
import Area_RRHH.modelo.DAOEmpleadoImplement;
import Area_RRHH.modelo.Empleado;
import Conexion.Conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class controladorA_RHH implements MouseListener{
    private A_RRHH rh;
    private Conexion conexion = Conexion.getInstance();
    private Connection conectar = conexion.conectar();

    public controladorA_RHH(A_RRHH rh) {
        this.rh = rh;
        this.rh.setSize(1010, 560);  
        this.rh.btnMostrar.addMouseListener(this);
        this.rh.btnimprimir.addMouseListener(this);
        this.rh.btnmodificar.addMouseListener(this);
        this.rh.btnregistrar.addMouseListener(this);
        this.rh.btncrrhh.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        if(me.getSource()==rh.btnregistrar){
            DAOEmpleadoImplement empleado_dao = new DAOEmpleadoImplement();
            Empleado empleado = new Empleado();

            if (rh.txtid.getText().compareTo("") == 0||rh.txtnomb.getText().compareTo("") == 0 || rh.txtap.getText().compareTo("") == 0 || rh.txtcorreo.getText().compareTo("") == 0 || rh.txtdireccion.getText().compareTo("") == 0
                    || rh.cbsexo.getSelectedIndex() == 0 || rh.cbdia.getSelectedIndex() == 0 || rh.cbmes.getSelectedIndex() == 0 || rh.cbaño.getSelectedIndex() == 0 || rh.cbestado.getSelectedIndex() == 0
                    || rh.txtnomb.getText().compareTo("ingrese nombres") == 0 || rh.txtap.getText().compareTo("ingrese apellidos") == 0 || rh.cbpt.getSelectedIndex() == 0 || rh.cbjornada.getSelectedIndex() == 0
                    || rh.txtcorreo.getText().compareTo("ingrese correo electronico") == 0 || rh.txttelef.getText().compareTo("ingrese n° telefono") == 0 || rh.txtdireccion.getText().compareTo("ingrese direccion") == 0
                    || rh.txtid.getText().compareTo("ingrese id de empleado") == 0) {
                JOptionPane.showMessageDialog(null, "Campos Vacios");
            } else {

                int id = Integer.parseInt(rh.txtid.getText());
                String nom = rh.txtnomb.getText();
                String ape = rh.txtap.getText();
                String sexo = rh.cbsexo.getSelectedItem().toString();
                String pt = rh.cbpt.getSelectedItem().toString();
                String Ecivil = rh.cbestado.getSelectedItem().toString();
                String correo = rh.txtcorreo.getText();
                String telefono = rh.txttelef.getText();
                String direccion = rh.txtdireccion.getText();
                String jornada = rh.cbjornada.getSelectedItem().toString();
                String d = rh.cbdia.getSelectedItem().toString();
                String m = rh.cbmes.getSelectedItem().toString();
                String a = rh.cbaño.getSelectedItem().toString();

                String fn = d + "/ " + m + "/ " + a;

                empleado.setId(id);
                empleado.setNom(nom);
                empleado.setAp(ape);
                empleado.setSexo(sexo);
                empleado.setPt(pt);
                empleado.setEcivil(Ecivil);
                empleado.setCorreo(correo);
                empleado.setTele(telefono);
                empleado.setDirec(direccion);
                empleado.setFn(fn);
                empleado.setJornada(jornada);

                empleado_dao.registrar(empleado);

                JOptionPane.showMessageDialog(null, "Registro exitoso");
                limpiar();
            }
        }
        if(me.getSource()==rh.btnmodificar){
            DAOEmpleadoImplement empleado_dao = new DAOEmpleadoImplement();
        Empleado empleado = new Empleado();
        
        if (rh.txtid.getText().compareTo("") == 0||rh.txtnomb.getText().compareTo("") == 0 || rh.txtap.getText().compareTo("") == 0 || rh.txtcorreo.getText().compareTo("") == 0 || rh.txtdireccion.getText().compareTo("") == 0
                || rh.cbsexo.getSelectedIndex() == 0 || rh.cbdia.getSelectedIndex() == 0 || rh.cbmes.getSelectedIndex() == 0 || rh.cbaño.getSelectedIndex() == 0 || rh.cbestado.getSelectedIndex() == 0
                || rh.txtnomb.getText().compareTo("ingrese nombres") == 0 || rh.txtap.getText().compareTo("ingrese apellidos") == 0 || rh.cbpt.getSelectedIndex() == 0 || rh.cbjornada.getSelectedIndex() == 0
                || rh.txtcorreo.getText().compareTo("ingrese correo electronico") == 0 || rh.txttelef.getText().compareTo("ingrese n° telefono") == 0 || rh.txtdireccion.getText().compareTo("ingrese direccion") == 0
                || rh.txtid.getText().compareTo("ingrese id de empleado") == 0) {
            JOptionPane.showMessageDialog(null, "Campos Vacios");
        }else{
            int id = Integer.parseInt(rh.txtid.getText());
            String nom = rh.txtnomb.getText();
            String ape = rh.txtap.getText();
            String sexo = rh.cbsexo.getSelectedItem().toString();
            String pt = rh.cbpt.getSelectedItem().toString();
            String Ecivil = rh.cbestado.getSelectedItem().toString();
            String correo = rh.txtcorreo.getText();
            String telefono = rh.txttelef.getText();
            String direccion = rh.txtdireccion.getText();
            String jornada = rh.cbjornada.getSelectedItem().toString();
            String d = rh.cbdia.getSelectedItem().toString();
            String m = rh.cbmes.getSelectedItem().toString();
            String a = rh.cbaño.getSelectedItem().toString();

            String fn = d + "/ " + m + "/ " + a;
            
            empleado.setId(id);
            empleado.setNom(nom);
            empleado.setAp(ape);
            empleado.setSexo(sexo);
            empleado.setPt(pt);
            empleado.setEcivil(Ecivil);
            empleado.setCorreo(correo);
            empleado.setTele(telefono);
            empleado.setDirec(direccion);
            empleado.setFn(fn);
            empleado.setJornada(jornada);

            empleado_dao.modificar(empleado);

            JOptionPane.showMessageDialog(null, "Modificacion exitoso");
            limpiar();
        }
        }
        if(me.getSource()==rh.btnimprimir){
            Document documento = new Document();

            try {
                String ruta = System.getProperty("user.home");
                PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/ReporteEmpleados.pdf"));
                documento.open();

                Image header = Image.getInstance("src/Imagen/plazaveapdfff.png");
                header.scaleToFit(600, 700);
                header.setAlignment(Chunk.ALIGN_CENTER);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.add("Registro creado por La Empresa Plaza Vea © \n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
                parrafo.add("Empleados Registrados \n\n");

                documento.open();
                documento.add(header);
                documento.add(parrafo);

                PdfPTable tabla = new PdfPTable(5);
                tabla.addCell("IdEmpleado");
                tabla.addCell("Apellido");
                tabla.addCell("Genero");
                tabla.addCell("P_Trabajo");
                tabla.addCell("J_Trabajo");

                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/plazavea", "root", "12345678");
                    PreparedStatement pst = cn.prepareStatement("select id_Empleado , Apellido , Genero , Puesto_Trabajo , Jornada_Trabajo from empleados");

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        do {
                            tabla.addCell(rs.getString(1));
                            tabla.addCell(rs.getString(2));
                            tabla.addCell(rs.getString(3));
                            tabla.addCell(rs.getString(4));
                            tabla.addCell(rs.getString(5));
                        } while (rs.next());
                        documento.add(tabla);
                    }

                } catch (DocumentException | SQLException e) {
                }

                documento.close();
                JOptionPane.showMessageDialog(null, "Reporte creado con exito");

            } catch (Exception e) {
            }
        }
        if(me.getSource()==rh.btnMostrar){
            try {
                DefaultTableModel modelo = new DefaultTableModel();
                rh.tbperso.setModel(modelo);

                Connection conexionMysql = conexion.conectar();
                PreparedStatement seleccion = conexionMysql.prepareStatement("select * from empleados");

                ResultSet consulta = seleccion.executeQuery();
                ResultSetMetaData datos = consulta.getMetaData();
                int cantidadColumnas = datos.getColumnCount();

                modelo.addColumn("id_Empleado");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido");
                modelo.addColumn("Genero");
                modelo.addColumn("Puesto_Trabajo");
                modelo.addColumn("Estado_Civil");
                modelo.addColumn("Correo");
                modelo.addColumn("Telefono");
                modelo.addColumn("Direccion");
                modelo.addColumn("Fecha_Nacimiento");
                modelo.addColumn("Jornada");

                int anchos[] = {90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90};

                //recorremos la cantidad de columnas y le asignamos anchos 
                for (int i = 0; i < cantidadColumnas; i++) {
                    rh.tbperso.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
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
        if(me.getSource()==rh.btncrrhh){
            PersonalConsult pc = new PersonalConsult();
            controladorPersonalConsult cpc = new controladorPersonalConsult(pc);
            cpc.iniciar();
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
        rh.txtid.setText("ingrese id de empleado");
        rh.txtid.setForeground(Color.gray);
        rh.txtnomb.setText("ingrese nombres");
        rh.txtnomb.setForeground(Color.gray);
        rh.txtap.setText("ingrese apellidos");
        rh.txtap.setForeground(Color.gray);
        rh.txtcorreo.setText("ingrese correo electronico");
        rh.txtcorreo.setForeground(Color.gray);
        rh.txttelef.setText("ingrese n° telefono");
        rh.txttelef.setForeground(Color.gray);
        rh.txtdireccion.setText("ingrese direccion");
        rh.txtdireccion.setForeground(Color.gray);
        rh.cbsexo.setSelectedIndex(0);
        rh.cbestado.setSelectedIndex(0);
        rh.cbdia.setSelectedIndex(0);
        rh.cbmes.setSelectedIndex(0);
        rh.cbaño.setSelectedIndex(0);
        rh.cbpt.setSelectedIndex(0);
        rh.cbjornada.setSelectedIndex(0);
    }
    
}
