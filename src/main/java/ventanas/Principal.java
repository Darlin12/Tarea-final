package ventanas;

import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {

    //Constructor.
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Principal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Usuarios = new javax.swing.JButton();
        btn_Productos = new javax.swing.JButton();
        tbn_Cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        btn_Usuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\businessapplication_accept_ok_male_man_you_negocio_2311.png")); // NOI18N
        btn_Usuarios.setText("Usuarios");
        btn_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsuariosActionPerformed(evt);
            }
        });

        btn_Productos.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\business_package_box_products_2343.png")); // NOI18N
        btn_Productos.setText("Productos");
        btn_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosActionPerformed(evt);
            }
        });

        tbn_Cerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbn_Cerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\4115235-exit-logout-sign-out_114030.png")); // NOI18N
        tbn_Cerrar.setText("Cerrar Sesión");
        tbn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_CerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido/a");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btn_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(tbn_Cerrar)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Acción que se ejecuta al presionar el botón Usuarios, la cual cierra la 
    //ventana principal, y pasa a la ventana de registro de los usuarios(CRUD).
    private void btn_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsuariosActionPerformed
        dispose();
        Prin_usuario pu = new Prin_usuario();
        pu.setVisible(true);
    }//GEN-LAST:event_btn_UsuariosActionPerformed

    //Acción que se ejecuta al presionar el botón Productos, la cual cierra la 
    //ventana principal, y pasa a la ventana de registro de los productos(CRUD).
    private void btn_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosActionPerformed
        dispose();
        Prin_productos pp = new Prin_productos();
        pp.setVisible(true);
    }//GEN-LAST:event_btn_ProductosActionPerformed

    //Acción que se ejecuta al presionar el botón Cerrar, la cual cierra la 
    //ventana principal, y pasa a la ventana del Login.
    private void tbn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_CerrarActionPerformed
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_tbn_CerrarActionPerformed

    //Método Main
    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Productos;
    private javax.swing.JButton btn_Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tbn_Cerrar;
    // End of variables declaration//GEN-END:variables
}
