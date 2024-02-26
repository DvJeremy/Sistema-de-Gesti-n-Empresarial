package menu.vista;

import java.awt.Color;
public class Principal extends javax.swing.JFrame {
  
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgprincipal = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pbtnhome = new javax.swing.JPanel();
        btnhome = new javax.swing.JLabel();
        pbtnmision = new javax.swing.JPanel();
        btnmision = new javax.swing.JLabel();
        pbtninventario = new javax.swing.JPanel();
        btninventario = new javax.swing.JLabel();
        pbtnrrhh = new javax.swing.JPanel();
        btnrrhh = new javax.swing.JLabel();
        pbtnsc = new javax.swing.JPanel();
        btnsc = new javax.swing.JLabel();
        pbtnsalir = new javax.swing.JPanel();
        btnsalir = new javax.swing.JLabel();
        btnsunat = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bgprincipal.setBackground(new java.awt.Color(204, 204, 204));
        bgprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/plaza vea.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgprincipal.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        pbtnhome.setBackground(new java.awt.Color(255, 255, 51));
        pbtnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pbtnhomeMouseEntered(evt);
            }
        });

        btnhome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/hogar.png"))); // NOI18N
        btnhome.setText("  INICIO");
        btnhome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pbtnhomeLayout = new javax.swing.GroupLayout(pbtnhome);
        pbtnhome.setLayout(pbtnhomeLayout);
        pbtnhomeLayout.setHorizontalGroup(
            pbtnhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pbtnhomeLayout.setVerticalGroup(
            pbtnhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnhome, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        pbtnmision.setBackground(new java.awt.Color(255, 255, 51));

        btnmision.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnmision.setText("  MISION/VISION");
        btnmision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnmision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmisionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmisionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmisionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pbtnmisionLayout = new javax.swing.GroupLayout(pbtnmision);
        pbtnmision.setLayout(pbtnmisionLayout);
        pbtnmisionLayout.setHorizontalGroup(
            pbtnmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pbtnmisionLayout.setVerticalGroup(
            pbtnmisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbtnmisionLayout.createSequentialGroup()
                .addComponent(btnmision, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pbtninventario.setBackground(new java.awt.Color(255, 255, 51));

        btninventario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btninventario.setText("   A. INVENTARIO");
        btninventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btninventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btninventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btninventarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pbtninventarioLayout = new javax.swing.GroupLayout(pbtninventario);
        pbtninventario.setLayout(pbtninventarioLayout);
        pbtninventarioLayout.setHorizontalGroup(
            pbtninventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btninventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pbtninventarioLayout.setVerticalGroup(
            pbtninventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbtninventarioLayout.createSequentialGroup()
                .addComponent(btninventario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pbtnrrhh.setBackground(new java.awt.Color(255, 255, 51));

        btnrrhh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnrrhh.setText("        A. RRHH");
        btnrrhh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnrrhh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnrrhh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrrhhMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnrrhhMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnrrhhMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pbtnrrhhLayout = new javax.swing.GroupLayout(pbtnrrhh);
        pbtnrrhh.setLayout(pbtnrrhhLayout);
        pbtnrrhhLayout.setHorizontalGroup(
            pbtnrrhhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnrrhh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pbtnrrhhLayout.setVerticalGroup(
            pbtnrrhhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbtnrrhhLayout.createSequentialGroup()
                .addComponent(btnrrhh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pbtnsc.setBackground(new java.awt.Color(255, 255, 51));

        btnsc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsc.setText("  A. SERV. CLIENTE");
        btnsc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnscMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnscMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnscMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pbtnscLayout = new javax.swing.GroupLayout(pbtnsc);
        pbtnsc.setLayout(pbtnscLayout);
        pbtnscLayout.setHorizontalGroup(
            pbtnscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnsc, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        pbtnscLayout.setVerticalGroup(
            pbtnscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnsc, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        pbtnsalir.setBackground(new java.awt.Color(255, 255, 51));

        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsalir.setText("            SALIR");
        btnsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(btnsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pbtnsalirLayout.setVerticalGroup(
            pbtnsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbtnsalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnsunat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsunat.setText("          SUNAT");
        btnsunat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsunat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsunat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsunatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbtnmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbtnhome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnsunat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pbtninventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pbtnrrhh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pbtnsc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pbtnsalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pbtnhome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbtnmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbtninventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbtnrrhh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbtnsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsunat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(pbtnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgprincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 560));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        bgprincipal.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 1010, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        
    }//GEN-LAST:event_btnhomeMouseClicked

    private void btnmisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmisionMouseClicked
        
    }//GEN-LAST:event_btnmisionMouseClicked

    private void pbtnhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbtnhomeMouseEntered
        
    }//GEN-LAST:event_pbtnhomeMouseEntered

    private void btnhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseExited
        pbtnhome.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_btnhomeMouseExited

    private void btnhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseEntered
        pbtnhome.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_btnhomeMouseEntered

    private void btnmisionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmisionMouseEntered
        pbtnmision.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_btnmisionMouseEntered

    private void btnmisionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmisionMouseExited
        pbtnmision.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_btnmisionMouseExited

    private void btninventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninventarioMouseEntered
        pbtninventario.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_btninventarioMouseEntered

    private void btninventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninventarioMouseExited
        pbtninventario.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_btninventarioMouseExited

    private void btninventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninventarioMouseClicked
        
    }//GEN-LAST:event_btninventarioMouseClicked

    private void btnrrhhMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrrhhMouseEntered
        pbtnrrhh.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_btnrrhhMouseEntered

    private void btnrrhhMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrrhhMouseExited
        pbtnrrhh.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_btnrrhhMouseExited

    private void btnrrhhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrrhhMouseClicked
        
    }//GEN-LAST:event_btnrrhhMouseClicked

    private void btnscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnscMouseClicked
        
    }//GEN-LAST:event_btnscMouseClicked

    private void btnscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnscMouseEntered
        pbtnsc.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_btnscMouseEntered

    private void btnscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnscMouseExited
        pbtnsc.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_btnscMouseExited

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btnsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseEntered
        pbtnsalir.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_btnsalirMouseEntered

    private void btnsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseExited
        pbtnsalir.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_btnsalirMouseExited

    private void btnsunatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsunatMouseClicked
        
    }//GEN-LAST:event_btnsunatMouseClicked

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgprincipal;
    public javax.swing.JLabel btnhome;
    public javax.swing.JLabel btninventario;
    public javax.swing.JLabel btnmision;
    public javax.swing.JLabel btnrrhh;
    public javax.swing.JLabel btnsalir;
    public javax.swing.JLabel btnsc;
    public javax.swing.JLabel btnsunat;
    public javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel pbtnhome;
    private javax.swing.JPanel pbtninventario;
    private javax.swing.JPanel pbtnmision;
    private javax.swing.JPanel pbtnrrhh;
    private javax.swing.JPanel pbtnsalir;
    private javax.swing.JPanel pbtnsc;
    // End of variables declaration//GEN-END:variables
}
