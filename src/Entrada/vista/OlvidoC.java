
package Entrada.vista;

import java.awt.Color;


public class OlvidoC extends javax.swing.JFrame {

    
    public OlvidoC() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        bgolvido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcdr = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtcontra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtrepetir = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnvalidarc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnregresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnverif = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bgolvido.setBackground(new java.awt.Color(255, 255, 255));
        bgolvido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("USERNAME:");
        bgolvido.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CLAVE DE ");
        bgolvido.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("RECUPERACIÓN:");
        bgolvido.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtcdr.setForeground(java.awt.Color.gray);
        txtcdr.setText("Ingrese clave de recuperacion");
        txtcdr.setBorder(null);
        txtcdr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcdrMousePressed(evt);
            }
        });
        bgolvido.add(txtcdr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 220, -1));

        txtuser.setForeground(java.awt.Color.gray);
        txtuser.setText("Ingrese nombre de usuario");
        txtuser.setBorder(null);
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserMousePressed(evt);
            }
        });
        bgolvido.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 220, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("NUEVA CONTRASEÑA:");

        txtcontra.setEditable(false);
        txtcontra.setForeground(java.awt.Color.gray);
        txtcontra.setText("Ingrese nueva contraseña");
        txtcontra.setBorder(null);
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("REPETIR CONTRASEÑA:");

        txtrepetir.setEditable(false);
        txtrepetir.setForeground(java.awt.Color.gray);
        txtrepetir.setText("Repita contraseña");
        txtrepetir.setBorder(null);
        txtrepetir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtrepetirMousePressed(evt);
            }
        });

        btnvalidarc.setBackground(java.awt.Color.red);
        btnvalidarc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnvalidarc.setForeground(new java.awt.Color(255, 255, 255));
        btnvalidarc.setText("VALIDAR CAMBIO");
        btnvalidarc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontra)
                            .addComponent(txtrepetir)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 166, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnvalidarc, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtrepetir, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvalidarc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgolvido.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/plaza vea.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgolvido.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 110));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        btnregresar.setBackground(new java.awt.Color(255, 255, 51));
        btnregresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnregresar.setText("REGRESAR");
        btnregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnregresar)
                .addContainerGap(529, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnregresar)
                .addGap(11, 11, 11))
        );

        bgolvido.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 630, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/olvido.png"))); // NOI18N
        bgolvido.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 210, 220));
        bgolvido.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 220, 10));
        bgolvido.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 220, 10));

        btnverif.setBackground(java.awt.Color.yellow);
        btnverif.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnverif.setText("VERIFICAR");
        btnverif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgolvido.add(btnverif, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgolvido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgolvido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void txtuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMousePressed
        if(txtcdr.getText().compareTo("")==0){
           txtcdr.setText("Ingrese clave de recuperacion");
           txtcdr.setForeground(Color.gray);
       }
       if(txtuser.getText().compareTo("Ingrese nombre de usuario")==0){
           txtuser.setText("");
           txtuser.setForeground(Color.black);
       }
    }//GEN-LAST:event_txtuserMousePressed

    private void txtcdrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcdrMousePressed
        if(txtuser.getText().compareTo("")==0){
           txtuser.setText("Ingrese nombre de usuario");
           txtuser.setForeground(Color.gray);
       }
       if(txtcdr.getText().compareTo("Ingrese clave de recuperacion")==0){
           txtcdr.setText("");
           txtcdr.setForeground(Color.black);
       }
    }//GEN-LAST:event_txtcdrMousePressed

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
        if(txtrepetir.getText().compareTo("")==0){
           txtrepetir.setText("Repita contraseña");
           txtrepetir.setForeground(Color.gray);
       }
       if(txtcontra.getText().compareTo("Ingrese nueva contraseña")==0){
           txtcontra.setText("");
           txtcontra.setForeground(Color.black);
       }
    }//GEN-LAST:event_txtcontraMousePressed

    private void txtrepetirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrepetirMousePressed
        if(txtcontra.getText().compareTo("")==0){
           txtcontra.setText("Ingrese nueva contraseña");
           txtcontra.setForeground(Color.gray);
       }
       if(txtrepetir.getText().compareTo("Repita contraseña")==0){
           txtrepetir.setText("");
           txtrepetir.setForeground(Color.black);
       }
    }//GEN-LAST:event_txtrepetirMousePressed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed

    }//GEN-LAST:event_btnregresarActionPerformed


    public static void main(String args[]) {
       /*
       OlvidoC oc = new OlvidoC();
       controladorOlvido coc =new controladorOlvido(oc);
       coc.iniciar();
      */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgolvido;
    public javax.swing.JButton btnregresar;
    public javax.swing.JButton btnvalidarc;
    public javax.swing.JButton btnverif;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField txtcdr;
    public javax.swing.JTextField txtcontra;
    public javax.swing.JTextField txtrepetir;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
