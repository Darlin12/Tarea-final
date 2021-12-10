//Nombre del páquete
package ventanas;

//Librerías importadas
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Darlin Manuel Casado Pérez
 */
public class Login extends javax.swing.JFrame {

    //Conexion a la base de datos mediante la clase conexion
    Connection cn = Conexion.conector();

    //Constructor del login
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Login");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel_Login = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Contraseña = new javax.swing.JLabel();
        btn_Iniciar = new javax.swing.JButton();
        jTextField_Usuario = new javax.swing.JTextField();
        jPassword_Contraseña = new javax.swing.JPasswordField();
        jLabel_noTieneCuenta = new javax.swing.JLabel();
        Registrarme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 204, 255));

        Jlabel_Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_Login.setText("Login");

        jLabel_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Usuario.setText("Usuario");

        jLabel_Contraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Contraseña.setText("Contraseña");

        btn_Iniciar.setBackground(new java.awt.Color(51, 153, 255));
        btn_Iniciar.setText("Iniciar");
        btn_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarActionPerformed(evt);
            }
        });

        jLabel_noTieneCuenta.setText("¿No tienes cuenta?");

        Registrarme.setBackground(new java.awt.Color(204, 204, 204));
        Registrarme.setText("Registrarme");
        Registrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarmeActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\Login_37128.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel_Usuario)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_Contraseña)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPassword_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_noTieneCuenta)
                            .addComponent(Registrarme))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jlabel_Login)
                    .addComponent(jLabel2))
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Jlabel_Login)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Usuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Contraseña))
                .addGap(27, 27, 27)
                .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_noTieneCuenta)
                .addGap(18, 18, 18)
                .addComponent(Registrarme)
                .addGap(66, 66, 66))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Acción del botón Registrame que cierra la ventana del login
    //y abre la ventana del registro
    private void RegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarmeActionPerformed
        Registro_usuarios rg = new Registro_usuarios();
        this.dispose();
        rg.setVisible(true);
    }//GEN-LAST:event_RegistrarmeActionPerformed

    //Acción de boton iniciar que ejecuta el método validar
    private void btn_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarActionPerformed
        Validar();
    }//GEN-LAST:event_btn_IniciarActionPerformed

    //Método validar que asegura de que las credenciales de la 
    //persona esten registrados, si no está registrado, le mandará
    //a que se registre.
    public void Validar() {
        //Variables a utilizar para almacenar los datos del usuario 
        //para ser utilizados en la consulta SQL.
        String usuario = jTextField_Usuario.getText();
        String contraseña = new String(jPassword_Contraseña.getPassword());
        String query = "SELECT * FROM usuarios13.usuarios Where Usuario= '" + usuario + "' and Contraseña= '" + contraseña + "' ";

        //Variable que se utilizará como contador para garantizar que el 
        //usuario no deje ningún campo vacío.
        int Contador = 0;
        //En caso de que se deje algún campo vacío el contador pasará de 0 a 1.
        if (usuario.equals("") || contraseña.equals("")) {
            Contador++;
            JOptionPane.showMessageDialog(null, "“Debe ingresar su usuario y contraseña, si no está registrado debe registrarse");
        }

        //Si el contador está en 0 significa que todos los campos se ha llenada
        //así que es hora de validar dichos datos ingresados en los campos con la 
        //base de datos.
        if (Contador == 0) {
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(query);
                if (rs.next()) {
                    int resultado = 1;
                    if (resultado == 1) {
                        Principal principal = new Principal();
                        this.dispose();
                        principal.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error al iniciar sesión, usuario no registrado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error" + e);
            }
        }

    }

    //Metodo main de la clase Login.
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_Login;
    private javax.swing.JButton Registrarme;
    private javax.swing.JButton btn_Iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Contraseña;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JLabel jLabel_noTieneCuenta;
    private javax.swing.JPasswordField jPassword_Contraseña;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
