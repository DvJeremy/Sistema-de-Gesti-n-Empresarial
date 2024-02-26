
package Area_inventario.controlador;

import Area_inventario.vista.Area_Inv;
import Area_inventario.vista.InvConsult;
import Area_inventario.vista.NuevoProveedor;
import Area_inventario.modelo.DAOProductoImplement;
import Area_inventario.modelo.Producto;
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


public class controladorArea_Inv implements MouseListener{

    private Area_Inv ai ;
    private Conexion conexion = Conexion.getInstance();
    private Connection conectar = conexion.conectar();
    
    public controladorArea_Inv(Area_Inv ai) {
        this.ai = ai;
        ai.setSize(1010, 560);
        this.ai.btnconsultinv.addMouseListener(this);
        this.ai.btnmodificar.addMouseListener(this);
        this.ai.btnmostrar.addMouseListener(this);
        this.ai.btnregistrar.addMouseListener(this);
        this.ai.btnreporte.addMouseListener(this);
        this.ai.btnNuevoProveedor.addMouseListener(this);
    }
   
    
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == ai.btnconsultinv) {
            InvConsult ci = new InvConsult();
            controladorInvConsult ivc = new controladorInvConsult(ci);
            ivc.iniciar();
        }
        if (me.getSource() == ai.btnmodificar) {
            DAOProductoImplement producto_dao = new DAOProductoImplement();
            Producto producto = new Producto();

            if (ai.txtid.getText().equals("") || ai.txtdesc.getText().equals("") || ai.txtpu.getText().equals("") || ai.txtpv.getText().equals("") || ai.txtstock.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingresa los Campos a Modificar");
            } else {
                int id = Integer.parseInt(ai.txtid.getText());
                String des = ai.txtdesc.getText();
                int cant = Integer.parseInt(ai.txtstock.getText());
                double pu = Double.parseDouble(ai.txtpu.getText());
                double pv = Double.parseDouble(ai.txtpv.getText());
                // String fe = txtfe.getText();
                // String fv = txtfe.getText();
                String d = ai.cbDia.getSelectedItem().toString();
                String m = ai.cbMes.getSelectedItem().toString();
                String a = ai.cbAño.getSelectedItem().toString();
                String d2 = ai.cbDia2.getSelectedItem().toString();
                String m2 = ai.cbMes2.getSelectedItem().toString();
                String a2 = ai.cbAño2.getSelectedItem().toString();
                String fe = d + "/ " + m + "/ " + a;
                String fv = d2 + "/ " + m2 + "/ " + a2;
                // int idProveedor=Integer.parseInt(txtIdProve.getText());

                producto.setIdProducto(id);
                producto.setDescripcion(des);
                producto.setStock(cant);
                producto.setPrecioU(pu);
                producto.setPrecioV(pv);
                producto.setFecha_entrega(fe);
                producto.setFecha_vencimiento(fv);
                producto.precioTotal();
                //producto.setIdProveedor(idProveedor);
                producto_dao.modificar(producto);
                limpiar();
                JOptionPane.showMessageDialog(null, "Registro modificado con exito");
            }
        }
        if (me.getSource() == ai.btnmostrar) {
            try {
                DefaultTableModel modelo = new DefaultTableModel();
                ai.tb_inventario.setModel(modelo);

                Connection conexionMysql = conexion.conectar();
                PreparedStatement seleccion = conexionMysql.prepareStatement("select * from producto");

                ResultSet consulta = seleccion.executeQuery();
                ResultSetMetaData datos = consulta.getMetaData();
                int cantidadColumnas = datos.getColumnCount();

                modelo.addColumn("idProducto");
                modelo.addColumn("Descripcion");
                modelo.addColumn("Stock");
                modelo.addColumn("PrecioU");
                modelo.addColumn("CostoTotal");
                modelo.addColumn("PrecioV");
                modelo.addColumn("Fecha_entrega");
                modelo.addColumn("fecha_vencimiento");
                modelo.addColumn("ID_Proveedor");

                int anchos[] = {90, 90, 90, 90, 90, 90, 90, 90, 90};

                //recorremos la cantidad de columnas y le asignamos anchos 
                for (int i = 0; i < cantidadColumnas; i++) {
                    ai.tb_inventario.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
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
        if (me.getSource() == ai.btnregistrar) {
            DAOProductoImplement producto_dao = new DAOProductoImplement();
            Producto producto = new Producto();

            if (ai.txtid.getText().equals("") || ai.txtdesc.getText().equals("") || ai.txtstock.getText().equals("") || ai.txtpu.getText().equals("")
                    || ai.txtpv.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campos Vacios");
            } else {
                int id = Integer.parseInt(ai.txtid.getText());
                String des = ai.txtdesc.getText();
                int cant = Integer.parseInt(ai.txtstock.getText());
                double pu = Double.parseDouble(ai.txtpu.getText());
                double pv = Double.parseDouble(ai.txtpv.getText());
                // String fe = txtfe.getText();
                // String fv = txtfe.getText();
                String d = ai.cbDia.getSelectedItem().toString();
                String m = ai.cbMes.getSelectedItem().toString();
                String a = ai.cbAño.getSelectedItem().toString();
                String d2 = ai.cbDia2.getSelectedItem().toString();
                String m2 = ai.cbMes2.getSelectedItem().toString();
                String a2 = ai.cbAño2.getSelectedItem().toString();
                String fe = d + "/ " + m + "/ " + a;
                String fv = d2 + "/ " + m2 + "/ " + a2;
                int idProveedor = Integer.parseInt(ai.txtIdProve.getText());

                producto.setIdProducto(id);
                producto.setDescripcion(des);
                producto.setStock(cant);
                producto.setPrecioU(pu);
                producto.setPrecioV(pv);
                producto.setFecha_entrega(fe);
                producto.setFecha_vencimiento(fv);
                producto.precioTotal();
                producto.setIdProveedor(idProveedor);
                producto_dao.registrar(producto);

                JOptionPane.showMessageDialog(null, "Registro exitoso");
                limpiar();
            }
        }
        if (me.getSource() == ai.btnreporte) {
            Document documento = new Document();

            try {
                String ruta = System.getProperty("user.home");
                PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/ReporteProducto.pdf"));
                documento.open();

                Image header = Image.getInstance("src/Imagen/plazaveapdfff.png");
                header.scaleToFit(600, 700);
                header.setAlignment(Chunk.ALIGN_CENTER);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.add("Registro creado por La Empresa Plaza Vea © \n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
                parrafo.add("Productos Registrados \n\n");

                documento.open();
                documento.add(header);
                documento.add(parrafo);

                PdfPTable tabla = new PdfPTable(5);
                tabla.addCell("IdProducto");
                tabla.addCell("Descripcion");
                tabla.addCell("Stock");
                tabla.addCell("F_entrega");
                tabla.addCell("F_vencimiento");

                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/plazavea", "root", "12345678");
                    PreparedStatement pst = cn.prepareStatement("select idProducto , Descripcion , Stock , Fecha_entrega , Fecha_vencimiento from producto");

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
        if (me.getSource() == ai.btnNuevoProveedor) {
            NuevoProveedor nvp = new NuevoProveedor();
            controladorNuevoProveedor cnp = new controladorNuevoProveedor(nvp);
            cnp.iniciar();
        }
    }

    public void limpiar() {
        ai.txtid.setText("");
        ai.txtdesc.setText("");
        ai.txtstock.setText("");
        ai.txtpu.setText("");
        ai.txtpv.setText("");
        ai.txtIdProve.setText("");
        ai.cbDia.setSelectedIndex(0);
        ai.cbMes.setSelectedIndex(0);
        ai.cbAño.setSelectedIndex(0);
        ai.cbDia2.setSelectedIndex(0);
        ai.cbMes2.setSelectedIndex(0);
        ai.cbAño2.setSelectedIndex(0);
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
