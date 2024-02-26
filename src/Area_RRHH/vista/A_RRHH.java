package Area_RRHH.vista;

import java.awt.Color;

public class A_RRHH extends javax.swing.JPanel {


    public A_RRHH() {
        initComponents();  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btncrrhh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtnomb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbsexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbestado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttelef = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbdia = new javax.swing.JComboBox<>();
        cbmes = new javax.swing.JComboBox<>();
        cbaño = new javax.swing.JComboBox<>();
        btnregistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        cbjornada = new javax.swing.JComboBox<>();
        cbpt = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbperso = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("SISTEMA DE RECURSOS HUMANOS");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 11, 329, 26);

        btncrrhh.setBackground(new java.awt.Color(255, 51, 51));
        btncrrhh.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btncrrhh.setForeground(new java.awt.Color(255, 255, 255));
        btncrrhh.setText("Consultar RRHH");
        btncrrhh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncrrhh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncrrhh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrrhhActionPerformed(evt);
            }
        });
        jPanel2.add(btncrrhh);
        btncrrhh.setBounds(743, 11, 227, 26);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 980, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 18))); // NOI18N
        jPanel3.setLayout(null);

        txtnomb.setBackground(new java.awt.Color(255, 255, 51));
        txtnomb.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtnomb.setForeground(java.awt.Color.gray);
        txtnomb.setText("ingrese nombres");
        txtnomb.setBorder(null);
        txtnomb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombMousePressed(evt);
            }
        });
        txtnomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombActionPerformed(evt);
            }
        });
        jPanel3.add(txtnomb);
        txtnomb.setBounds(140, 60, 250, 18);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Nombre: ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 60, 60, 21);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Apellido: ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 110, 60, 17);

        txtap.setBackground(new java.awt.Color(255, 255, 51));
        txtap.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtap.setForeground(java.awt.Color.gray);
        txtap.setText("ingrese apellidos");
        txtap.setBorder(null);
        txtap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtapMousePressed(evt);
            }
        });
        jPanel3.add(txtap);
        txtap.setBounds(140, 110, 250, 20);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("Genero:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 150, 62, 21);

        cbsexo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "masculino", "femenino" }));
        jPanel3.add(cbsexo);
        cbsexo.setBounds(140, 150, 246, 24);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel7.setText("Puesto de trabajo: ");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 190, 120, 19);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setText("Estado civil:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 230, 93, 18);

        cbestado.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "casado", "divorciado" }));
        jPanel3.add(cbestado);
        cbestado.setBounds(140, 230, 246, 24);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setText("Correo:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(410, 30, 49, 21);

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
        jPanel3.add(txtcorreo);
        txtcorreo.setBounds(540, 30, 246, 20);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setText("Teléfono: ");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(410, 80, 66, 21);

        txttelef.setBackground(new java.awt.Color(255, 255, 51));
        txttelef.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txttelef.setForeground(java.awt.Color.gray);
        txttelef.setText("ingrese n° telefono");
        txttelef.setBorder(null);
        txttelef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txttelefMousePressed(evt);
            }
        });
        jPanel3.add(txttelef);
        txttelef.setBounds(540, 80, 246, 20);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setText("Dirección: ");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(410, 130, 69, 21);

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
        jPanel3.add(txtdireccion);
        txtdireccion.setBounds(540, 130, 246, 20);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setText("Jornada de trabajo:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(410, 230, 130, 21);

        cbdia.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbdia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(cbdia);
        cbdia.setBounds(570, 180, 60, 24);

        cbmes.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel3.add(cbmes);
        cbmes.setBounds(650, 180, 60, 24);

        cbaño.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980" }));
        jPanel3.add(cbaño);
        cbaño.setBounds(730, 180, 60, 24);

        btnregistrar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnregistrar);
        btnregistrar.setBounds(820, 30, 130, 30);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(540, 50, 250, 20);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(140, 80, 250, 20);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(140, 130, 250, 20);
        jPanel3.add(jSeparator6);
        jSeparator6.setBounds(540, 100, 250, 20);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel13.setText("Fecha de nacimiento: ");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(410, 180, 139, 21);
        jPanel3.add(jSeparator7);
        jSeparator7.setBounds(540, 150, 250, 20);

        cbjornada.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbjornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Full time", "Part time", "Peak time" }));
        jPanel3.add(cbjornada);
        cbjornada.setBounds(560, 230, 130, 24);

        cbpt.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Gerente de tienda", "Supervisora de cajas", "Supervisor de tienda", "Analista", "Sub gerente", "Administrador de tienda", "Asistente de tienda", "Cajero", "Reponedor" }));
        jPanel3.add(cbpt);
        cbpt.setBounds(140, 190, 240, 24);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("ID:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(50, 30, 30, 18);

        txtid.setBackground(new java.awt.Color(255, 255, 51));
        txtid.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtid.setForeground(java.awt.Color.gray);
        txtid.setText("ingrese id de empleado");
        txtid.setBorder(null);
        txtid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtidMousePressed(evt);
            }
        });
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel3.add(txtid);
        txtid.setBounds(140, 30, 250, 18);

        btnMostrar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnMostrar);
        btnMostrar.setBounds(820, 210, 130, 30);

        btnmodificar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnmodificar);
        btnmodificar.setBounds(820, 90, 130, 30);

        btnimprimir.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnimprimir.setText("Imprimir");
        btnimprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnimprimirMouseClicked(evt);
            }
        });
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });
        jPanel3.add(btnimprimir);
        btnimprimir.setBounds(820, 150, 130, 30);
        jPanel3.add(jSeparator4);
        jSeparator4.setBounds(140, 50, 250, 10);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 960, 270));

        tbperso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_Empleado", "Nombres", "Apellidos", "Genero", "Puesto", "Estado_Civil", "Correo", "Telefono", "Direccion", "Fecha_Nacimiento", "Jornada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbperso);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 950, 210));
    }// </editor-fold>//GEN-END:initComponents


    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtnombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombActionPerformed

    }//GEN-LAST:event_txtnombActionPerformed

    private void txtnombMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombMousePressed
        if (txtid.getText().compareTo("") == 0) {
            txtid.setText("ingrese id de empleado");
            txtid.setForeground(Color.gray);
        }
        if (txtnomb.getText().compareTo("ingrese nombres") == 0) {
            txtnomb.setText("");
            txtnomb.setForeground(Color.black);
        }
        if (txtap.getText().compareTo("") == 0) {
            txtap.setText("ingrese apellidos");
            txtap.setForeground(Color.gray);
        }
        if (txtcorreo.getText().compareTo("") == 0) {
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if (txttelef.getText().compareTo("") == 0) {
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if (txtdireccion.getText().compareTo("") == 0) {
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtnombMousePressed

    private void txtapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapMousePressed
        if (txtid.getText().compareTo("") == 0) {
            txtid.setText("ingrese id de empleado");
            txtid.setForeground(Color.gray);
        }
        if (txtnomb.getText().compareTo("") == 0) {
            txtnomb.setText("ingrese nombres");
            txtnomb.setForeground(Color.gray);
        }
        if (txtap.getText().compareTo("ingrese apellidos") == 0) {
            txtap.setText("");
            txtap.setForeground(Color.black);
        }
        if (txtcorreo.getText().compareTo("") == 0) {
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if (txttelef.getText().compareTo("") == 0) {
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if (txtdireccion.getText().compareTo("") == 0) {
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtapMousePressed

    private void txtcorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorreoMousePressed
        if (txtid.getText().compareTo("") == 0) {
            txtid.setText("ingrese id de empleado");
            txtid.setForeground(Color.gray);
        }
        if (txtnomb.getText().compareTo("") == 0) {
            txtnomb.setText("ingrese nombres");
            txtnomb.setForeground(Color.gray);
        }
        if (txtap.getText().compareTo("") == 0) {
            txtap.setText("ingrese apellidos");
            txtap.setForeground(Color.gray);
        }
        if (txtcorreo.getText().compareTo("ingrese correo electronico") == 0) {
            txtcorreo.setText("");
            txtcorreo.setForeground(Color.black);
        }
        if (txttelef.getText().compareTo("") == 0) {
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if (txtdireccion.getText().compareTo("") == 0) {
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcorreoMousePressed

    private void txttelefMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttelefMousePressed
        if (txtid.getText().compareTo("") == 0) {
            txtid.setText("ingrese id de empleado");
            txtid.setForeground(Color.gray);
        }
        if (txtnomb.getText().compareTo("") == 0) {
            txtnomb.setText("ingrese nombres");
            txtnomb.setForeground(Color.gray);
        }
        if (txtap.getText().compareTo("") == 0) {
            txtap.setText("ingrese apellidos");
            txtap.setForeground(Color.gray);
        }
        if (txtcorreo.getText().compareTo("") == 0) {
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if (txttelef.getText().compareTo("ingrese n° telefono") == 0) {
            txttelef.setText("");
            txttelef.setForeground(Color.black);
        }
        if (txtdireccion.getText().compareTo("") == 0) {
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txttelefMousePressed

    private void txtdireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdireccionMousePressed
        if (txtid.getText().compareTo("") == 0) {
            txtid.setText("ingrese id de empleado");
            txtid.setForeground(Color.gray);
        }
        if (txtnomb.getText().compareTo("") == 0) {
            txtnomb.setText("ingrese nombres");
            txtnomb.setForeground(Color.gray);
        }
        if (txtap.getText().compareTo("") == 0) {
            txtap.setText("ingrese apellidos");
            txtap.setForeground(Color.gray);
        }
        if (txtcorreo.getText().compareTo("") == 0) {
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if (txttelef.getText().compareTo("") == 0) {
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if (txtdireccion.getText().compareTo("ingrese direccion") == 0) {
            txtdireccion.setText("");
            txtdireccion.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtdireccionMousePressed

    private void btncrrhhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrrhhActionPerformed
        
    }//GEN-LAST:event_btncrrhhActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void txtidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidMousePressed
        if (txtid.getText().compareTo("ingrese id de empleado") == 0) {
            txtid.setText("");
            txtid.setForeground(Color.black);
        }
        if (txtap.getText().compareTo("") == 0) {
            txtap.setText("ingrese apellidos");
            txtap.setForeground(Color.gray);
        }
        if (txtcorreo.getText().compareTo("") == 0) {
            txtcorreo.setText("ingrese correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
        if (txttelef.getText().compareTo("") == 0) {
            txttelef.setText("ingrese n° telefono");
            txttelef.setForeground(Color.gray);
        }
        if (txtdireccion.getText().compareTo("") == 0) {
            txtdireccion.setText("ingrese direccion");
            txtdireccion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtidMousePressed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void btnimprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnimprimirMouseClicked
        
    }//GEN-LAST:event_btnimprimirMouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnMostrar;
    public javax.swing.JButton btncrrhh;
    public javax.swing.JButton btnimprimir;
    public javax.swing.JButton btnmodificar;
    public javax.swing.JButton btnregistrar;
    public javax.swing.JComboBox<String> cbaño;
    public javax.swing.JComboBox<String> cbdia;
    public javax.swing.JComboBox<String> cbestado;
    public javax.swing.JComboBox<String> cbjornada;
    public javax.swing.JComboBox<String> cbmes;
    public javax.swing.JComboBox<String> cbpt;
    public javax.swing.JComboBox<String> cbsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JTable tbperso;
    public javax.swing.JTextField txtap;
    public javax.swing.JTextField txtcorreo;
    public javax.swing.JTextField txtdireccion;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtnomb;
    public javax.swing.JTextField txttelef;
    // End of variables declaration//GEN-END:variables

}
