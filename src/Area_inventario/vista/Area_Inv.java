package Area_inventario.vista;

import Conexion.Conexion;
import java.awt.Color;
import java.sql.Connection;

public class Area_Inv extends javax.swing.JPanel {

    Conexion conexion = Conexion.getInstance();
    Connection conectar = conexion.conectar();
    
    public Area_Inv() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnconsultinv = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        txtpu = new javax.swing.JTextField();
        txtpv = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbAño = new javax.swing.JComboBox<>();
        cbDia2 = new javax.swing.JComboBox<>();
        cbMes2 = new javax.swing.JComboBox<>();
        cbAño2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnNuevoProveedor = new javax.swing.JButton();
        txtIdProve = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_inventario = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btnreporte = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 680));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("SISTEMA REGISTRO DE INVENTARIO");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 11, 356, 26);

        btnconsultinv.setBackground(new java.awt.Color(255, 51, 51));
        btnconsultinv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnconsultinv.setForeground(new java.awt.Color(255, 255, 255));
        btnconsultinv.setText("Consultar Inventario");
        btnconsultinv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnconsultinv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconsultinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultinvActionPerformed(evt);
            }
        });
        jPanel2.add(btnconsultinv);
        btnconsultinv.setBounds(677, 11, 293, 28);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 980, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 18))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(540, 250));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel1.setText("ID:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 40, 30, 23);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel2.setText("DESCRIPCION:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 90, 121, 23);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel3.setText("STOCK:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 140, 60, 23);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel4.setText("PRECIO UNITARIO:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 190, 161, 23);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel6.setText("F. ENTREGA:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(470, 100, 102, 23);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel7.setText("PRECIO DE VENTA:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(470, 40, 154, 23);

        txtid.setBackground(new java.awt.Color(255, 255, 51));
        txtid.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtid.setForeground(java.awt.Color.gray);
        txtid.setText("ingresar solo valores numericos");
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
        txtid.setBounds(200, 40, 204, 30);

        txtdesc.setBackground(new java.awt.Color(255, 255, 51));
        txtdesc.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtdesc.setForeground(java.awt.Color.gray);
        txtdesc.setText("ingrese descripcion");
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
        jPanel3.add(txtdesc);
        txtdesc.setBounds(200, 90, 204, 30);

        txtstock.setBackground(new java.awt.Color(255, 255, 51));
        txtstock.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtstock.setForeground(java.awt.Color.gray);
        txtstock.setText("ingrese stock");
        txtstock.setBorder(null);
        txtstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtstockMousePressed(evt);
            }
        });
        jPanel3.add(txtstock);
        txtstock.setBounds(200, 140, 204, 30);

        txtpu.setBackground(new java.awt.Color(255, 255, 51));
        txtpu.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtpu.setForeground(java.awt.Color.gray);
        txtpu.setText("ingrese precio unitario");
        txtpu.setBorder(null);
        txtpu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpuMousePressed(evt);
            }
        });
        jPanel3.add(txtpu);
        txtpu.setBounds(200, 190, 204, 30);

        txtpv.setBackground(new java.awt.Color(255, 255, 51));
        txtpv.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtpv.setForeground(java.awt.Color.gray);
        txtpv.setText("ingrese precio de venta");
        txtpv.setBorder(null);
        txtpv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpvMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpvMousePressed(evt);
            }
        });
        txtpv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpvActionPerformed(evt);
            }
        });
        jPanel3.add(txtpv);
        txtpv.setBounds(640, 40, 204, 30);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(200, 70, 210, 10);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(200, 120, 210, 10);
        jPanel3.add(jSeparator4);
        jSeparator4.setBounds(200, 170, 210, 10);
        jPanel3.add(jSeparator5);
        jSeparator5.setBounds(200, 220, 210, 10);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel8.setText("PROVEEDOR:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(470, 200, 120, 23);
        jPanel3.add(jSeparator6);
        jSeparator6.setBounds(630, 70, 210, 10);

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Día", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(cbDia);
        cbDia.setBounds(630, 100, 60, 30);

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel3.add(cbMes);
        cbMes.setBounds(730, 100, 60, 30);

        cbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jPanel3.add(cbAño);
        cbAño.setBounds(820, 100, 60, 30);

        cbDia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Día", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(cbDia2);
        cbDia2.setBounds(630, 150, 60, 30);

        cbMes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel3.add(cbMes2);
        cbMes2.setBounds(730, 150, 60, 30);

        cbAño2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jPanel3.add(cbAño2);
        cbAño2.setBounds(820, 150, 60, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel9.setText("F. VENCIMIENTO:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(470, 150, 160, 23);

        btnNuevoProveedor.setText("Nuevo Proveedor");
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoProveedor);
        btnNuevoProveedor.setBounds(800, 200, 120, 30);
        jPanel3.add(txtIdProve);
        txtIdProve.setBounds(630, 200, 160, 20);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 960, 250));

        btnregistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnregistrar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 130, 30));

        btnmostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnmostrar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnmostrar.setText("Mostrar");
        btnmostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });
        add(btnmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 130, 30));

        tb_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Descripcion", "Stock", "PrecioU", "CostoTotal", "PrecioV", "fecha_entrega", "fecha_vencimiento", "ID_Proveedor"
            }
        ));
        jScrollPane1.setViewportView(tb_inventario);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 940, 150));

        btnmodificar.setBackground(new java.awt.Color(255, 255, 255));
        btnmodificar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 130, 30));

        btnreporte.setBackground(new java.awt.Color(255, 255, 255));
        btnreporte.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnreporte.setText("Imprimir");
        btnreporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnreporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreporteMouseClicked(evt);
            }
        });
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });
        add(btnreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 130, 30));
    }// </editor-fold>//GEN-END:initComponents


    private void txtdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescActionPerformed

    }//GEN-LAST:event_txtdescActionPerformed

    private void txtidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidMousePressed
        if (txtid.getText().compareTo("ingresar solo valores numericos") == 0) {
            txtid.setText("");
            txtid.setForeground(Color.black);
        }
        if (txtdesc.getText().compareTo("") == 0) {
            txtdesc.setText("ingrese descripcion");
            txtdesc.setForeground(Color.gray);
        }
        if (txtstock.getText().compareTo("") == 0) {
            txtstock.setText("ingrese stock");
            txtstock.setForeground(Color.gray);
        }
        if (txtpu.getText().compareTo("") == 0) {
            txtpu.setText("ingrese precio unitario");
            txtpu.setForeground(Color.gray);
        }
        if (txtpv.getText().compareTo("") == 0) {
            txtpv.setText("ingrese precio de venta");
            txtpv.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtidMousePressed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed

    }//GEN-LAST:event_txtidActionPerformed

    private void txtdescMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdescMousePressed
        if (txtid.getText().compareTo("") == 0) {
            txtid.setText("ingresar solo valores numericos");
            txtid.setForeground(Color.gray);
        }
        if (txtdesc.getText().compareTo("ingrese descripcion") == 0) {
            txtdesc.setText("");
            txtdesc.setForeground(Color.black);
        }
        if (txtstock.getText().compareTo("") == 0) {
            txtstock.setText("ingrese stock");
            txtstock.setForeground(Color.gray);
        }
        if (txtpu.getText().compareTo("") == 0) {
            txtpu.setText("ingrese precio unitario");
            txtpu.setForeground(Color.gray);
        }
        if (txtpv.getText().compareTo("") == 0) {
            txtpv.setText("ingrese precio de venta");
            txtpv.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtdescMousePressed

    private void txtstockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtstockMousePressed
        if (txtid.getText().compareTo("") == 0) {
            txtid.setText("ingresar solo valores numericos");
            txtid.setForeground(Color.gray);
        }
        if (txtdesc.getText().compareTo("") == 0) {
            txtdesc.setText("ingrese descripcion");
            txtdesc.setForeground(Color.gray);
        }
        if (txtstock.getText().compareTo("ingrese stock") == 0) {
            txtstock.setText("");
            txtstock.setForeground(Color.black);
        }
        if (txtpu.getText().compareTo("") == 0) {
            txtpu.setText("ingrese precio unitario");
            txtpu.setForeground(Color.gray);
        }
        if (txtpv.getText().compareTo("") == 0) {
            txtpv.setText("ingrese precio de venta");
            txtpv.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtstockMousePressed

    private void txtpuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpuMousePressed
        if (txtid.getText().compareTo("") == 0) {
            txtid.setText("ingresar solo valores numericos");
            txtid.setForeground(Color.gray);
        }
        if (txtdesc.getText().compareTo("") == 0) {
            txtdesc.setText("ingrese descripcion");
            txtdesc.setForeground(Color.gray);
        }
        if (txtstock.getText().compareTo("") == 0) {
            txtstock.setText("ingrese stock");
            txtstock.setForeground(Color.gray);
        }
        if (txtpu.getText().compareTo("ingrese precio unitario") == 0) {
            txtpu.setText("");
            txtpu.setForeground(Color.black);
        }
        if (txtpv.getText().compareTo("") == 0) {
            txtpv.setText("ingrese precio de venta");
            txtpv.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtpuMousePressed

    private void txtpvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpvMousePressed
        if (txtid.getText().compareTo("") == 0) {
            txtid.setText("ingresar solo valores numericos");
            txtid.setForeground(Color.gray);
        }
        if (txtdesc.getText().compareTo("") == 0) {
            txtdesc.setText("ingrese descripcion");
            txtdesc.setForeground(Color.gray);
        }
        if (txtstock.getText().compareTo("") == 0) {
            txtstock.setText("ingrese stock");
            txtstock.setForeground(Color.gray);
        }
        if (txtpu.getText().compareTo("") == 0) {
            txtpu.setText("ingrese precio unitario");
            txtpu.setForeground(Color.gray);
        }
        if (txtpv.getText().compareTo("ingrese precio de venta") == 0) {
            txtpv.setText("");
            txtpv.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtpvMousePressed

    private void btnconsultinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultinvActionPerformed
        
    }//GEN-LAST:event_btnconsultinvActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtpvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpvActionPerformed

    }//GEN-LAST:event_txtpvActionPerformed

    private void txtpvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpvMouseClicked

    }//GEN-LAST:event_txtpvMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
              
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreporteActionPerformed

    private void btnreporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreporteMouseClicked
       
    }//GEN-LAST:event_btnreporteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnNuevoProveedor;
    public javax.swing.JButton btnconsultinv;
    public javax.swing.JButton btnmodificar;
    public javax.swing.JButton btnmostrar;
    public javax.swing.JButton btnregistrar;
    public javax.swing.JButton btnreporte;
    public javax.swing.JComboBox<String> cbAño;
    public javax.swing.JComboBox<String> cbAño2;
    public javax.swing.JComboBox<String> cbDia;
    public javax.swing.JComboBox<String> cbDia2;
    public javax.swing.JComboBox<String> cbMes;
    public javax.swing.JComboBox<String> cbMes2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JTable tb_inventario;
    public javax.swing.JTextField txtIdProve;
    public javax.swing.JTextField txtdesc;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtpu;
    public javax.swing.JTextField txtpv;
    public javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
