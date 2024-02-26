
package Entrada.vista;

import java.awt.Color;


public class RegistrarU extends javax.swing.JFrame {

    
    public RegistrarU() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgregistrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcontra = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcdr = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnregresar = new javax.swing.JButton();
        btncrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bgregistrar.setBackground(new java.awt.Color(255, 255, 255));
        bgregistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("USERNAME:");
        bgregistrar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");
        bgregistrar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        txtcontra.setForeground(java.awt.Color.gray);
        txtcontra.setText("Ingrese contraseña");
        txtcontra.setToolTipText("");
        txtcontra.setBorder(null);
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });
        bgregistrar.add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 180, -1));

        txtuser.setForeground(java.awt.Color.gray);
        txtuser.setText("Ingrese nombre de usuario");
        txtuser.setBorder(null);
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserMousePressed(evt);
            }
        });
        bgregistrar.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 180, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CLAVE DE ");
        bgregistrar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("RECUPERACIÓN:");
        bgregistrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        txtcdr.setForeground(java.awt.Color.gray);
        txtcdr.setText("Ingrese clave de recuperacion");
        txtcdr.setBorder(null);
        txtcdr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcdrMousePressed(evt);
            }
        });
        bgregistrar.add(txtcdr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 180, -1));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/plaza vea.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel3)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgregistrar.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/user.png"))); // NOI18N
        bgregistrar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 100));
        bgregistrar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 180, 10));
        bgregistrar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 180, 10));
        bgregistrar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 180, 10));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        btnregresar.setBackground(new java.awt.Color(255, 255, 51));
        btnregresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregresar.setText("REGRESAR");
        btnregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnregresar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgregistrar.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 500, 60));

        btncrear.setBackground(new java.awt.Color(255, 255, 51));
        btncrear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncrear.setText("CREAR CUENTA");
        btncrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgregistrar.add(btncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMousePressed
        if(txtcontra.getText().compareTo("")==0){
            txtcontra.setText("Ingrese contraseña");
            txtcontra.setForeground(Color.gray);
        }
        if(txtcdr.getText().compareTo("")==0){
            txtcdr.setText("Ingrese clave de recuperacion");
            txtcdr.setForeground(Color.gray);
        }
        if(txtuser.getText().compareTo("Ingrese nombre de usuario")==0){
            txtuser.setText("");
            txtuser.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtuserMousePressed

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
        if(txtuser.getText().compareTo("")==0){
            txtuser.setText("Ingrese nombre de usuario");
            txtuser.setForeground(Color.gray);
        }
        if(txtcdr.getText().compareTo("")==0){
            txtcdr.setText("Ingrese clave de recuperacion");
            txtcdr.setForeground(Color.gray);
        }
        if(txtcontra.getText().compareTo("Ingrese contraseña")==0){
            txtcontra.setText("");
            txtcontra.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcontraMousePressed

    private void txtcdrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcdrMousePressed
        if(txtuser.getText().compareTo("")==0){
            txtuser.setText("Ingrese nombre de usuario");
            txtuser.setForeground(Color.gray);
        }
        if(txtcontra.getText().compareTo("")==0){
            txtcontra.setText("Ingrese contraseña");
            txtcontra.setForeground(Color.gray);
        }
        if(txtcdr.getText().compareTo("Ingrese clave de recuperacion")==0){
            txtcdr.setText("");
            txtcdr.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcdrMousePressed

    public static void main(String args[]) {
        /*
        RegistrarU ru = new RegistrarU();
        controladorRegistro cr =new controladorRegistro(ru);
        cr.iniciar();
        */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgregistrar;
    public javax.swing.JButton btncrear;
    public javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTextField txtcdr;
    public javax.swing.JTextField txtcontra;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
