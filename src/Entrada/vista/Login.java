
package Entrada.vista;

import Entrada.controlador.controladorLogin;
import Entrada.controlador.controladorOlvido;
import java.awt.Color;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pbtnsalir = new javax.swing.JPanel();
        btnsalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnregistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        btnolvido = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnentrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/plaza vea.png"))); // NOI18N

        pbtnsalir.setBackground(new java.awt.Color(255, 255, 255));

        btnsalir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnsalir.setText("    X");
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pbtnsalirLayout = new javax.swing.GroupLayout(pbtnsalir);
        pbtnsalir.setLayout(pbtnsalirLayout);
        pbtnsalirLayout.setHorizontalGroup(
            pbtnsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbtnsalirLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        );
        pbtnsalirLayout.setVerticalGroup(
            pbtnsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(pbtnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pbtnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 110));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 710, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NO TIENES CUENTA PLAZA VEA?");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(25, 45, 234, 17);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("REGISTRESE");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(25, 101, 91, 17);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cu3-04.gif"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(140, 90, 177, 248);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("AHORA");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(28, 151, 52, 17);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("AQUI");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(28, 210, 38, 17);

        btnregistro.setBackground(java.awt.Color.red);
        btnregistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregistro.setForeground(new java.awt.Color(255, 255, 255));
        btnregistro.setText("REGISTRAR");
        btnregistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnregistro);
        btnregistro.setBounds(20, 340, 140, 50);

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 85, 340, 410));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("USERNAME:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txtuser.setForeground(java.awt.Color.gray);
        txtuser.setText("Ingrese nombre de usuario");
        txtuser.setBorder(null);
        txtuser.setName(""); // NOI18N
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtuserMouseReleased(evt);
            }
        });
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        bg.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 210, 20));

        btnolvido.setForeground(new java.awt.Color(0, 153, 255));
        btnolvido.setText("¿ Olvidaste tu contraseña ? pulsa aqui.");
        btnolvido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnolvido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnolvidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnolvidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnolvidoMouseExited(evt);
            }
        });
        bg.add(btnolvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        txtcontra.setForeground(java.awt.Color.gray);
        txtcontra.setText("**********");
        txtcontra.setBorder(null);
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });
        bg.add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 190, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/user.png"))); // NOI18N
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 110, 100));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 190, 20));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 210, 20));

        btnentrar.setBackground(new java.awt.Color(255, 255, 51));
        btnentrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnentrar.setText("INGRESAR");
        btnentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnolvidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnolvidoMouseClicked
        
    }//GEN-LAST:event_btnolvidoMouseClicked

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed

    }//GEN-LAST:event_txtcontraActionPerformed

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btnsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseExited
        pbtnsalir.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnsalirMouseExited

    private void btnsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseEntered
        pbtnsalir.setBackground(new Color(255,204,204));
    }//GEN-LAST:event_btnsalirMouseEntered

    private void txtuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMousePressed
        if(String.valueOf(txtcontra.getPassword()).compareTo("")==0){
            txtcontra.setText("**********");
            txtcontra.setForeground(Color.gray);
        }
        if(txtuser.getText().compareTo("Ingrese nombre de usuario")==0){
            txtuser.setText("");
            txtuser.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtuserMousePressed

    private void txtuserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMouseReleased
        
    }//GEN-LAST:event_txtuserMouseReleased

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
       if(txtuser.getText().compareTo("")==0){
           txtuser.setText("Ingrese nombre de usuario");
           txtuser.setForeground(Color.gray);
       }
       if(String.valueOf(txtcontra.getPassword()).compareTo("**********")==0){
           txtcontra.setText("");
           txtcontra.setForeground(Color.black);
       }
    }//GEN-LAST:event_txtcontraMousePressed

    private void btnolvidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnolvidoMouseEntered
        btnolvido.setForeground(new Color(0,102,255));
    }//GEN-LAST:event_btnolvidoMouseEntered

    private void btnolvidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnolvidoMouseExited
        btnolvido.setForeground(new Color(0,153,255));
    }//GEN-LAST:event_btnolvidoMouseExited

    
    public static void main(String args[]) {
       Login l = new Login();
       controladorLogin cl =new controladorLogin(l);
       cl.iniciar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton btnentrar;
    public javax.swing.JLabel btnolvido;
    public javax.swing.JButton btnregistro;
    public javax.swing.JLabel btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pbtnsalir;
    public javax.swing.JPasswordField txtcontra;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
