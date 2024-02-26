
package Area_ServiceC.vista;

import java.awt.Color;

public class Area_sc extends javax.swing.JPanel {

    
    
    public Area_sc() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnomb = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelef = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbproblem = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtidp = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cbpt = new javax.swing.JComboBox<>();
        txtdesc = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btncinv = new javax.swing.JButton();
        btnenviar = new javax.swing.JButton();
        btncrh = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtsolu = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("SERVICIO AL CLIENTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(758, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 980, 50));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 560));

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 18))); // NOI18N
        jPanel4.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel6.setText("N° de teléfono:");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 260, 108, 21);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel7.setText("Nombre:");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(30, 40, 70, 21);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel8.setText("Dni:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 100, 40, 21);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel9.setText("Correo:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(31, 142, 108, 21);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel10.setText("Direccion:");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(31, 192, 108, 21);

        txtnomb.setBackground(new java.awt.Color(255, 255, 51));
        txtnomb.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtnomb.setForeground(java.awt.Color.gray);
        txtnomb.setText("ingresar nombre");
        txtnomb.setBorder(null);
        txtnomb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombMousePressed(evt);
            }
        });
        jPanel4.add(txtnomb);
        txtnomb.setBounds(140, 40, 230, 30);

        txtdni.setBackground(new java.awt.Color(255, 255, 51));
        txtdni.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtdni.setForeground(java.awt.Color.gray);
        txtdni.setText("ingrese numero de dni");
        txtdni.setBorder(null);
        txtdni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtdniMousePressed(evt);
            }
        });
        jPanel4.add(txtdni);
        txtdni.setBounds(140, 90, 230, 30);

        txtcorreo.setBackground(new java.awt.Color(255, 255, 51));
        txtcorreo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtcorreo.setForeground(java.awt.Color.gray);
        txtcorreo.setText("ingrese correo electronico");
        txtcorreo.setBorder(null);
        txtcorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcorreoMousePressed(evt);
            }
        });
        jPanel4.add(txtcorreo);
        txtcorreo.setBounds(140, 140, 230, 30);

        txtdireccion.setBackground(new java.awt.Color(255, 255, 51));
        txtdireccion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtdireccion.setForeground(java.awt.Color.gray);
        txtdireccion.setText("ingrese direccion");
        txtdireccion.setBorder(null);
        txtdireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtdireccionMousePressed(evt);
            }
        });
        jPanel4.add(txtdireccion);
        txtdireccion.setBounds(140, 190, 230, 30);

        txttelef.setBackground(new java.awt.Color(255, 255, 51));
        txttelef.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txttelef.setForeground(java.awt.Color.gray);
        txttelef.setText("ingrese n° de telefono");
        txttelef.setBorder(null);
        txttelef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txttelefMousePressed(evt);
            }
        });
        jPanel4.add(txttelef);
        txttelef.setBounds(143, 247, 230, 30);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(140, 70, 230, 10);
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(140, 280, 240, 10);
        jPanel4.add(jSeparator3);
        jSeparator3.setBounds(140, 220, 230, 10);
        jPanel4.add(jSeparator4);
        jSeparator4.setBounds(140, 170, 230, 10);
        jPanel4.add(jSeparator5);
        jSeparator5.setBounds(140, 120, 230, 10);

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 420, 310));

        jPanel6.setBackground(new java.awt.Color(255, 255, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setText("Problema con:");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(10, 30, 88, 21);

        cbproblem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Producto", "Personal" }));
        cbproblem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbproblemItemStateChanged(evt);
            }
        });
        jPanel6.add(cbproblem);
        cbproblem.setBounds(120, 30, 400, 30);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setText("Descripción:");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(10, 90, 88, 21);

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N
        jPanel7.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel14.setText("id:");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(16, 25, 16, 21);

        txtidp.setEditable(false);
        txtidp.setBackground(new java.awt.Color(204, 255, 255));
        txtidp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtidp.setForeground(java.awt.Color.gray);
        txtidp.setText("ingrese id del producto");
        txtidp.setBorder(null);
        txtidp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtidpMousePressed(evt);
            }
        });
        jPanel7.add(txtidp);
        txtidp.setBounds(42, 20, 448, 32);
        jPanel7.add(jSeparator7);
        jSeparator7.setBounds(53, 41, 400, 10);
        jPanel7.add(jSeparator6);
        jSeparator6.setBounds(42, 58, 448, 4);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(10, 140, 510, 80);

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N
        jPanel8.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel16.setText("Puesto:");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(16, 24, 47, 21);

        cbpt.setBackground(new java.awt.Color(255, 51, 51));
        cbpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " Gerente de tienda", " Supervisor de cajas", " Supervisor de tienda", " Analista", " Sub gerente", " Administrador de tienda", " Asistente de tienda", " Cajero", " Reponedor" }));
        cbpt.setEnabled(false);
        jPanel8.add(cbpt);
        cbpt.setBounds(70, 20, 410, 30);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(10, 230, 510, 70);

        txtdesc.setBackground(new java.awt.Color(255, 255, 51));
        txtdesc.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtdesc.setForeground(java.awt.Color.gray);
        txtdesc.setText("ingrese problema del cliente");
        txtdesc.setBorder(null);
        txtdesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtdescMousePressed(evt);
            }
        });
        txtdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescActionPerformed(evt);
            }
        });
        jPanel6.add(txtdesc);
        txtdesc.setBounds(120, 90, 400, 30);
        jPanel6.add(jSeparator9);
        jSeparator9.setBounds(120, 120, 400, 10);

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 530, 310));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setLayout(null);

        btncinv.setBackground(new java.awt.Color(255, 51, 51));
        btncinv.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btncinv.setForeground(new java.awt.Color(255, 255, 255));
        btncinv.setText("Consultar Inventario");
        btncinv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncinv.setEnabled(false);
        btncinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncinvActionPerformed(evt);
            }
        });
        jPanel3.add(btncinv);
        btncinv.setBounds(10, 15, 200, 60);

        btnenviar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnenviar.setText("ENVIAR REPORTE");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });
        jPanel3.add(btnenviar);
        btnenviar.setBounds(715, 15, 235, 144);

        btncrh.setBackground(new java.awt.Color(255, 51, 51));
        btncrh.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btncrh.setForeground(new java.awt.Color(255, 255, 255));
        btncrh.setText("Consultar RRHH");
        btncrh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncrh.setEnabled(false);
        btncrh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrhActionPerformed(evt);
            }
        });
        jPanel3.add(btncrh);
        btncrh.setBounds(10, 93, 201, 60);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solución", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtsolu.setColumns(20);
        txtsolu.setRows(5);
        jScrollPane1.setViewportView(txtsolu);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel5);
        jPanel5.setBounds(220, 10, 490, 150);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 960, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void cbproblemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbproblemItemStateChanged
            if(this.cbproblem.getSelectedIndex()==1){
                txtidp.setEditable(true);
                txtidp.setBackground(new Color(204,255,255));
                btncinv.setEnabled(true);
            }
            else{
                if(this.cbproblem.getSelectedIndex()!=1){
                    txtidp.setEditable(false);
                    txtidp.setBackground(Color.red);
                    txtidp.setText("ingrese id del producto");
                    btncinv.setEnabled(false);
                }
            }
            if(this.cbproblem.getSelectedIndex()==2){
                cbpt.setEnabled(true);
                cbpt.setBackground(Color.yellow);
                btncrh.setEnabled(true);
            }
            else{
                if(this.cbproblem.getSelectedIndex()!=2){
                    cbpt.setEnabled(false);
                    btncrh.setEnabled(false);
                }
            }
    }//GEN-LAST:event_cbproblemItemStateChanged

    private void btncinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncinvActionPerformed

    }//GEN-LAST:event_btncinvActionPerformed

    private void txtdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescActionPerformed

    private void txtnombMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombMousePressed
        if(txtnomb.getText().compareTo("ingresar nombre")==0){
            txtnomb.setText("");
            txtnomb.setForeground(Color.black);
        }
        if(txtdni.getText().compareTo("")==0){
            txtdni.setText("ingrese numero de dni");
            txtdni.setForeground(Color.gray);
        }
        if(txtcorreo.getText().compareTo("")==0){
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if(txtdireccion.getText().compareTo("")==0){
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
        if(txttelef.getText().compareTo("")==0){
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if(txtdesc.getText().compareTo("")==0){
            txtdesc.setText("ingrese problema del cliente");
            txtdesc.setForeground(Color.gray);
        }
        if(txtidp.getText().compareTo("")==0){
            txtidp.setText("ingrese id del producto");
            txtidp.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtnombMousePressed

    private void txtdniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdniMousePressed
        if(txtnomb.getText().compareTo("")==0){
            txtnomb.setText("ingresar nombre");
            txtnomb.setForeground(Color.gray);
        }
        if(txtdni.getText().compareTo("ingrese numero de dni")==0){
            txtdni.setText("");
            txtdni.setForeground(Color.black);
        }
        if(txtcorreo.getText().compareTo("")==0){
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if(txtdireccion.getText().compareTo("")==0){
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
        if(txttelef.getText().compareTo("")==0){
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if(txtdesc.getText().compareTo("")==0){
            txtdesc.setText("ingrese problema del cliente");
            txtdesc.setForeground(Color.gray);
        }
        if(txtidp.getText().compareTo("")==0){
            txtidp.setText("ingrese id del producto");
            txtidp.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtdniMousePressed

    private void txtcorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorreoMousePressed
        if(txtnomb.getText().compareTo("")==0){
            txtnomb.setText("ingresar nombre");
            txtnomb.setForeground(Color.gray);
        }
        if(txtdni.getText().compareTo("")==0){
            txtdni.setText("ingrese numero de dni");
            txtdni.setForeground(Color.gray);
        }
        if(txtcorreo.getText().compareTo("ingrese correo electronico")==0){
            txtcorreo.setText("");
            txtcorreo.setForeground(Color.black);
        }
        if(txtdireccion.getText().compareTo("")==0){
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
        if(txttelef.getText().compareTo("")==0){
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if(txtdesc.getText().compareTo("")==0){
            txtdesc.setText("ingrese problema del cliente");
            txtdesc.setForeground(Color.gray);
        }
        if(txtidp.getText().compareTo("")==0){
            txtidp.setText("ingrese id del producto");
            txtidp.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcorreoMousePressed

    private void txtdireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdireccionMousePressed
        if(txtnomb.getText().compareTo("")==0){
            txtnomb.setText("ingresar nombre");
            txtnomb.setForeground(Color.gray);
        }
        if(txtdni.getText().compareTo("")==0){
            txtdni.setText("ingrese numero de dni");
            txtdni.setForeground(Color.gray);
        }
        if(txtcorreo.getText().compareTo("")==0){
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if(txtdireccion.getText().compareTo("ingrese direccion")==0){
            txtdireccion.setText("");
            txtdireccion.setForeground(Color.black);
        }
        if(txttelef.getText().compareTo("")==0){
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if(txtdesc.getText().compareTo("")==0){
            txtdesc.setText("ingrese problema del cliente");
            txtdesc.setForeground(Color.gray);
        }
        if(txtidp.getText().compareTo("")==0){
            txtidp.setText("ingrese id del producto");
            txtidp.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtdireccionMousePressed

    private void txttelefMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttelefMousePressed
        if(txtnomb.getText().compareTo("")==0){
            txtnomb.setText("ingresar nombre");
            txtnomb.setForeground(Color.gray);
        }
        if(txtdni.getText().compareTo("")==0){
            txtdni.setText("ingrese numero de dni");
            txtdni.setForeground(Color.gray);
        }
        if(txtcorreo.getText().compareTo("")==0){
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if(txtdireccion.getText().compareTo("")==0){
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
        if(txttelef.getText().compareTo("ingrese n° de telefono")==0){
            txttelef.setText("");
            txttelef.setForeground(Color.black);
        }
        if(txtdesc.getText().compareTo("")==0){
            txtdesc.setText("ingrese problema del cliente");
            txtdesc.setForeground(Color.gray);
        }
        if(txtidp.getText().compareTo("")==0){
            txtidp.setText("ingrese id del producto");
            txtidp.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txttelefMousePressed

    private void txtdescMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdescMousePressed
        if(txtnomb.getText().compareTo("")==0){
            txtnomb.setText("ingresar nombre");
            txtnomb.setForeground(Color.gray);
        }
        if(txtdni.getText().compareTo("")==0){
            txtdni.setText("ingrese numero de dni");
            txtdni.setForeground(Color.gray);
        }
        if(txtcorreo.getText().compareTo("")==0){
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if(txtdireccion.getText().compareTo("")==0){
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
        if(txttelef.getText().compareTo("")==0){
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if(txtdesc.getText().compareTo("ingrese problema del cliente")==0){
            txtdesc.setText("");
            txtdesc.setForeground(Color.black);
        }
        if(txtidp.getText().compareTo("")==0){
            txtidp.setText("ingrese id del producto");
            txtidp.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtdescMousePressed

    private void txtidpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidpMousePressed
        if(txtnomb.getText().compareTo("")==0){
            txtnomb.setText("ingresar nombre");
            txtnomb.setForeground(Color.gray);
        }
        if(txtdni.getText().compareTo("")==0){
            txtdni.setText("ingrese numero de dni");
            txtdni.setForeground(Color.gray);
        }
        if(txtcorreo.getText().compareTo("")==0){
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if(txtdireccion.getText().compareTo("")==0){
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
        if(txttelef.getText().compareTo("")==0){
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if(txtdesc.getText().compareTo("")==0){
            txtdesc.setText("ingrese problema del cliente");
            txtdesc.setForeground(Color.gray);
        }
        if(txtidp.getText().compareTo("ingrese id del producto")==0){
            txtidp.setText("");
            txtidp.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtidpMousePressed

    private void btncrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrhActionPerformed

    }//GEN-LAST:event_btncrhActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        
    }//GEN-LAST:event_btnenviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btncinv;
    public javax.swing.JButton btncrh;
    public javax.swing.JButton btnenviar;
    public javax.swing.JComboBox<String> cbproblem;
    public javax.swing.JComboBox<String> cbpt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTextField txtcorreo;
    public javax.swing.JTextField txtdesc;
    public javax.swing.JTextField txtdireccion;
    public javax.swing.JTextField txtdni;
    public javax.swing.JTextField txtidp;
    public javax.swing.JTextField txtnomb;
    public javax.swing.JTextArea txtsolu;
    public javax.swing.JTextField txttelef;
    // End of variables declaration//GEN-END:variables
}
