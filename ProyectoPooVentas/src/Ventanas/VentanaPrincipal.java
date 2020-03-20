package Ventanas;
/**
 * Proyecto Bimestral Programación Orientada a Objetos
 * @author davisalex22
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);// Control de ubicacion 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSupermercado = new javax.swing.JLabel();
        btnCerrarSistema = new javax.swing.JButton();
        btnIrLogin = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnIrVentas = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(12, 0, 99));

        lblSupermercado.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        lblSupermercado.setForeground(new java.awt.Color(255, 255, 255));
        lblSupermercado.setText("Supermarket");

        btnCerrarSistema.setText("SALIR");
        btnCerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistemaActionPerformed(evt);
            }
        });

        btnIrLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        btnIrLogin.setText("Regreasar a Login");
        btnIrLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrLoginActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/supermercado.png"))); // NOI18N

        btnIrVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        btnIrVentas.setText("Ir a Ventas");
        btnIrVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrVentasActionPerformed(evt);
            }
        });

        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stock.png"))); // NOI18N
        btnStock.setText("Ir a Stock");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSistema))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIrLogin)
                        .addGap(68, 68, 68)
                        .addComponent(btnStock))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSupermercado)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnIrVentas)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSupermercado))
                    .addComponent(btnCerrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIrLogin)
                    .addComponent(btnStock)
                    .addComponent(btnIrVentas))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo de boton Salir
     * @param evt 
     */
    private void btnCerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistemaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarSistemaActionPerformed
    /**
     * Metodo de boton ir a Ventana Login
     * @param evt 
     */
    private void btnIrLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrLoginActionPerformed
        VentanaLogin vl = new VentanaLogin();
        vl.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIrLoginActionPerformed
    /**
     * Metodo de boton ir a Ventana Sistema Ventas
     * @param evt 
     */
    private void btnIrVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrVentasActionPerformed
        VentanaSistemaVentas vp = new VentanaSistemaVentas();
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIrVentasActionPerformed
    /**
     * Metodo btn ir a Ventana Sistema Ventas
     * @param evt 
     */
    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        VentanaSistemaVentas vp = new VentanaSistemaVentas();
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnStockActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSistema;
    private javax.swing.JButton btnIrLogin;
    private javax.swing.JButton btnIrVentas;
    private javax.swing.JButton btnStock;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSupermercado;
    // End of variables declaration//GEN-END:variables
}
