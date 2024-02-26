package Area_inventario.vista;

import Conexion.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class InvConsult extends javax.swing.JFrame {

    Conexion conexion = Conexion.getInstance();
    Connection conectar = conexion.conectar();

    public InvConsult() {
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pbtntconsul = new javax.swing.JPanel();
        btntconsult = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_reporte = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        txtBuscaProveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txteliminar = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        txtverificar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        pbtntconsul.setBackground(new java.awt.Color(255, 255, 51));

        btntconsult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btntconsult.setText("  TERMINAR CONSULTA");
        btntconsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntconsultMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntconsultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntconsultMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pbtntconsulLayout = new javax.swing.GroupLayout(pbtntconsul);
        pbtntconsul.setLayout(pbtntconsulLayout);
        pbtntconsulLayout.setHorizontalGroup(
            pbtntconsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btntconsult, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pbtntconsulLayout.setVerticalGroup(
            pbtntconsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btntconsult, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel1.add(pbtntconsul);
        pbtntconsul.setBounds(10, 4, 180, 51);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 60));

        tb_reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Descripcion", "Stock", "PrecioU", "CostoTotal", "PrecioV", "fecha_entrega", "fecha_vencimiento", "ID_Proveedor"
            }
        ));
        jScrollPane1.setViewportView(tb_reporte);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 970, 260));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID:");

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        txtBuscaProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaProveedorKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ID Proveedor");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("BUSCAR POR PROVEEDOR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel4)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID:");

        txteliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txteliminarKeyReleased(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("ELIMINAR");
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        txtverificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtverificar.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(txtverificar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(txtverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 980, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Mostrar(String idProducto) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("idProducto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Stock");
        modelo.addColumn("PrecioU");
        modelo.addColumn("CostoTotal");
        modelo.addColumn("PrecioV");
        modelo.addColumn("Fecha_entrega");
        modelo.addColumn("fecha_vencimiento");
        modelo.addColumn("ID_Proveedor");
        tb_reporte.setModel(modelo);
        String sql = "";
        if(idProducto.equals("")){
            sql = "select * from producto";
        }
        else{
            
            sql = "select * from producto where idProducto like'%"+idProducto+"%'";
        }
        
        String Usuarios[] = new String[9];
        Statement set;
        try{
            set = conectar.createStatement();
            ResultSet resul = set.executeQuery(sql);
            while(resul.next()){
                Usuarios[0] = resul.getString(1);
                Usuarios[1] = resul.getString(2);
                Usuarios[2] = resul.getString(3);
                Usuarios[3] = resul.getString(4);
                Usuarios[4] = resul.getString(5);
                Usuarios[5] = resul.getString(6);
                Usuarios[6] = resul.getString(7);
                Usuarios[7] = resul.getString(8);
                Usuarios[8] = resul.getString(9);
                modelo.addRow(Usuarios);
            }
            tb_reporte.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btntconsultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntconsultMouseEntered
        pbtntconsul.setBackground(new Color(255, 255, 153));
    }//GEN-LAST:event_btntconsultMouseEntered

    private void btntconsultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntconsultMouseExited
        pbtntconsul.setBackground(new Color(255, 255, 51));
    }//GEN-LAST:event_btntconsultMouseExited

    private void btntconsultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntconsultMouseClicked
        
    }//GEN-LAST:event_btntconsultMouseClicked

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
       Mostrar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void txteliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txteliminarKeyReleased
       Mostrar(txteliminar.getText());
    }//GEN-LAST:event_txteliminarKeyReleased

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtBuscaProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProveedorKeyReleased
     MostrarP(txtBuscaProveedor.getText());
    }//GEN-LAST:event_txtBuscaProveedorKeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvConsult().setVisible(true);
            }
        });
    }
 public void MostrarP(String idProveedor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("idProducto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Stock");
        modelo.addColumn("PrecioU");
        modelo.addColumn("CostoTotal");
        modelo.addColumn("PrecioV");
        modelo.addColumn("Fecha_entrega");
        modelo.addColumn("fecha_vencimiento");
        modelo.addColumn("ID_Proveedor");
        tb_reporte.setModel(modelo);
        String sql = "";
        if(idProveedor.equals("")){
            sql = "select * from producto";
        }
        else{
            
            sql = "select * from producto where ID_Proveedor like'%"+idProveedor+"%'";
        }
        
        String Usuarios[] = new String[9];
        Statement set;
        try{
            set = conectar.createStatement();
            ResultSet resul = set.executeQuery(sql);
            while(resul.next()){
                Usuarios[0] = resul.getString(1);
                Usuarios[1] = resul.getString(2);
                Usuarios[2] = resul.getString(3);
                Usuarios[3] = resul.getString(4);
                Usuarios[4] = resul.getString(5);
                Usuarios[5] = resul.getString(6);
                Usuarios[6] = resul.getString(7);
                Usuarios[7] = resul.getString(8);
                Usuarios[8] = resul.getString(9);
                modelo.addRow(Usuarios);
            }
            tb_reporte.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btneliminar;
    public javax.swing.JLabel btntconsult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pbtntconsul;
    public javax.swing.JTable tb_reporte;
    public javax.swing.JTextField txtBuscaProveedor;
    public javax.swing.JTextField txtbuscar;
    public javax.swing.JTextField txteliminar;
    private javax.swing.JTextField txtverificar;
    // End of variables declaration//GEN-END:variables
}
