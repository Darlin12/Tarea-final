//Nombre del paquete
package ventanas;

//Librerías importadas
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Nombre de la clase
public class Registro_usuarios extends javax.swing.JFrame {

    //Constructor de la clase
    public Registro_usuarios() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro Usuarios");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel_registro = new javax.swing.JLabel();
        Jlabe_nombre = new javax.swing.JLabel();
        jlabel_Apellido = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_Correo = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Contraseña = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_Confirma = new javax.swing.JPasswordField();
        txt_Contraseña = new javax.swing.JPasswordField();
        btnRegistras = new javax.swing.JButton();
        labelNombreObligatorio = new javax.swing.JLabel();
        labelApellidoObligatorio = new javax.swing.JLabel();
        labelTelefonoObligatorio = new javax.swing.JLabel();
        labelCorreoObligatorio = new javax.swing.JLabel();
        labelUsuarioObligatorio = new javax.swing.JLabel();
        labelContraseñaObligatorio = new javax.swing.JLabel();
        labelConfirmaObligatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setBackground(new java.awt.Color(0, 204, 255));
        setSize(new java.awt.Dimension(425, 480));

        jlabel_registro.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlabel_registro.setText("Registro");

        Jlabe_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jlabe_nombre.setText("Nombre ");

        jlabel_Apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Apellido.setText("Apellido");

        txt_Nombre.setPreferredSize(new java.awt.Dimension(130, 25));

        txt_Apellido.setName(""); // NOI18N

        jLabel_Telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Telefono.setText("Numero Telefónico");

        jLabel_Correo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Correo.setText("Correo Electrónico");

        jLabel_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Usuario.setText("Usuario");

        jLabel_Contraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Contraseña.setText("Contraseña");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Confirmar Contraseña");

        btnRegistras.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistras.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\business_application_addmale_useradd_insert_add_user_client_2312.png")); // NOI18N
        btnRegistras.setText("Registrarme");
        btnRegistras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrasActionPerformed(evt);
            }
        });

        labelNombreObligatorio.setVisible(false);
        labelNombreObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        labelNombreObligatorio.setText("Campo obligatorio");
        labelNombreObligatorio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                labelNombreObligatorioPropertyChange(evt);
            }
        });

        labelApellidoObligatorio.setVisible(false);
        labelApellidoObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        labelApellidoObligatorio.setText("Campo obligatorio");

        labelTelefonoObligatorio.setVisible(false);
        labelTelefonoObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        labelTelefonoObligatorio.setText("Campo Obligatorio");

        labelCorreoObligatorio.setVisible(false);
        labelCorreoObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        labelCorreoObligatorio.setText("Campo Obligatorio");

        labelUsuarioObligatorio.setVisible(false);
        labelUsuarioObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        labelUsuarioObligatorio.setText("Campo Obligatorio");

        labelContraseñaObligatorio.setVisible(false);
        labelContraseñaObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        labelContraseñaObligatorio.setText("Campo Obligatorio");

        labelConfirmaObligatorio.setVisible(false);
        labelConfirmaObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        labelConfirmaObligatorio.setText("Campo Obligatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jlabel_registro)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelContraseñaObligatorio)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelConfirmaObligatorio)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel_Usuario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Usuario)
                                    .addComponent(txt_Telefono)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(Jlabe_nombre))
                                    .addComponent(jLabel_Telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelNombreObligatorio))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelTelefonoObligatorio)))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelUsuarioObligatorio)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelCorreoObligatorio)
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(jlabel_Apellido)))
                                    .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel_Contraseña))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelApellidoObligatorio)
                                        .addComponent(jLabel_Correo)))
                                .addGap(42, 42, 42))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlabel_registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabe_nombre)
                    .addComponent(jlabel_Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreObligatorio)
                    .addComponent(labelApellidoObligatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Correo)
                    .addComponent(jLabel_Telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(labelTelefonoObligatorio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCorreoObligatorio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_Usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_Contraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelContraseñaObligatorio)
                    .addComponent(labelUsuarioObligatorio))
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelConfirmaObligatorio)
                .addGap(30, 30, 30)
                .addComponent(btnRegistras)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrasActionPerformed

        //Variables para almacenar la información que 
        //se guarde en los JTextField del formulario
        //registro, para así almacenarla en la base de datos.
        final String nombre = txt_Nombre.getText();
        final String apellido = txt_Apellido.getText();
        final String telefono = txt_Telefono.getText();
        final String correo = txt_Correo.getText();
        final String usuario = txt_Usuario.getText();
        final String contraseña = new String(txt_Contraseña.getPassword());
        final String confirmar = new String(txt_Confirma.getPassword());
        

        //Muestra mensaje al usuario en caso de
        //que deje un campo vacío, para que así, este
        //lo llene, y pueda hacer el registro correctamente.
        int Contador = 0;
        if (txt_Nombre.getText().equals("")) {
            Contador++;
            labelNombreObligatorio.setVisible(true);
        }
        if (txt_Apellido.getText().equals("")) {
            Contador++;
            labelApellidoObligatorio.setVisible(true);
        }
        if (txt_Telefono.getText().equals("")) {
            Contador++;
            labelTelefonoObligatorio.setVisible(true);
        }
        if (txt_Correo.getText().equals("")) {
            Contador++;
            labelCorreoObligatorio.setVisible(true);
        }
        if (txt_Usuario.getText().equals("")) {
            Contador++;
            labelUsuarioObligatorio.setVisible(true);
        }
        if (contraseña.equals("")) {
            Contador++;
            labelContraseñaObligatorio.setVisible(true);
        }
        if (confirmar.equals("")) {
            Contador++;
            labelConfirmaObligatorio.setVisible(true);
        }

        //Condicional que se asegura que el usuario llenó todos los campos necesarios.
        if (Contador == 0) {
            //Condicional para asegurar de que el usuario confirmó su contraseña de forma correcta.
            if (contraseña.equals(confirmar)) {
                try {
                    Connection cn = Conexion.conector();
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO usuarios (`Nombre`, `Apellido`, `Telefono`, `Correo`, `Usuario`, `Contraseña` ) VALUES('" + nombre + "', '" + apellido + "','" + telefono + "','" + correo + "','" + usuario + "','" + contraseña + "')");

                    pst.executeUpdate();
                    dispose();
                    JOptionPane.showMessageDialog(null, "Registro añadido!");
                    Login login = new Login();
                    login.setVisible(true);

                } catch (SQLException e1) {
                    System.out.print("Hubo un problema, info: " + e1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }//GEN-LAST:event_btnRegistrasActionPerformed

    private void labelNombreObligatorioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_labelNombreObligatorioPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_labelNombreObligatorioPropertyChange

    //Método main
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
            java.util.logging.Logger.getLogger(Registro_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_usuarios().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabe_nombre;
    private javax.swing.JButton btnRegistras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Contraseña;
    private javax.swing.JLabel jLabel_Correo;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JLabel jlabel_Apellido;
    private javax.swing.JLabel jlabel_registro;
    private javax.swing.JLabel labelApellidoObligatorio;
    private javax.swing.JLabel labelConfirmaObligatorio;
    private javax.swing.JLabel labelContraseñaObligatorio;
    private javax.swing.JLabel labelCorreoObligatorio;
    private javax.swing.JLabel labelNombreObligatorio;
    private javax.swing.JLabel labelTelefonoObligatorio;
    private javax.swing.JLabel labelUsuarioObligatorio;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JPasswordField txt_Confirma;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
