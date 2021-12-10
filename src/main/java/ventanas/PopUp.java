//Nombre del paquete.
package ventanas;

//Librerías importadas.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PopUp extends javax.swing.JFrame {

    //Conexion a la base de datos mediante la clase conexion.
    Connection cn = Conexion.conector();

    
    //Constructor de la clase.
    public PopUp() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Info Producto");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jL_NombreProducto = new javax.swing.JLabel();
        txt_NombreProducto = new javax.swing.JTextField();
        jL_MarcaProducto = new javax.swing.JLabel();
        jL_CategoriaProducto = new javax.swing.JLabel();
        txt_MarcaProducto = new javax.swing.JTextField();
        txt_CategoriaProducto = new javax.swing.JTextField();
        jL_PrecioProducto = new javax.swing.JLabel();
        jL_CantidadDisponible = new javax.swing.JLabel();
        txt_PrecioProducto = new javax.swing.JTextField();
        txt_CantidadDisponible = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jL_Codigo_Producto = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        btn_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("info de producto");

        jL_NombreProducto.setText("Nombre ");

        jL_MarcaProducto.setText("Marca");

        jL_CategoriaProducto.setText("Categoría");

        jL_PrecioProducto.setText("Precio");

        jL_CantidadDisponible.setText("Cantidad Disponible");

        btn_Guardar.setBackground(new java.awt.Color(153, 255, 153));
        btn_Guardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Guardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\save_file_disk_open_searsh_loading_clipboard_1513 (1).png")); // NOI18N
        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\1486564399-close_81512.png")); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jL_Codigo_Producto.setText("Código");

        txt_Codigo.setEditable(false);

        btn_Volver.setBackground(new java.awt.Color(102, 204, 255));
        btn_Volver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Volver.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\ic_arrow_back_128_28226.png")); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_PrecioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jL_PrecioProducto))
                                .addComponent(txt_MarcaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jL_MarcaProducto)
                                .addComponent(txt_Codigo))
                            .addComponent(jL_Codigo_Producto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_CantidadDisponible)
                            .addComponent(txt_CantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_CategoriaProducto)
                            .addComponent(txt_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_NombreProducto)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_NombreProducto)
                    .addComponent(jL_Codigo_Producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_CategoriaProducto)
                    .addComponent(jL_MarcaProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_CantidadDisponible)
                    .addComponent(jL_PrecioProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método para la guardar los datos actualizados del registro seleccionado
    //en la tabla de la ventana de los productos(CRUD).
    public void guardar() {

        try {

            String codigo = new String(txt_Codigo.getText());
            String query = "UPDATE usuarios13.productos set NombreProducto=?,MarcaProducto=?,CategoriaProducto=?,PrecioProducto=?,StockProducto=?,Codigo=? WHERE NombreProducto='" + codigo + "' ";
            PreparedStatement pst = cn.prepareStatement(query);

            pst.setString(1, txt_NombreProducto.getText());
            pst.setString(2, txt_MarcaProducto.getText());
            pst.setString(3, txt_CategoriaProducto.getText());
            pst.setString(4, txt_PrecioProducto.getText());
            pst.setString(5, txt_CantidadDisponible.getText());
            pst.setString(6, txt_Codigo.getText());

            pst.executeUpdate();
            Prin_productos pp = new Prin_productos();
            pp.setVisible(true);
            JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage());
        }

    }

    //Método para eliminar el registro seleccionado por el usuario en la tabla 
    //de la ventana de los productos(CRUD).
    public void eliminar() {
        try {
            String codigo = new String(txt_Codigo.getText());
            String query = "DELETE FROM usuarios13.productos  WHERE Codigo='" + codigo + "' ";
            PreparedStatement pst = cn.prepareStatement(query);

            pst.execute();
            Prin_productos pp = new Prin_productos();
            pp.setVisible(true);
            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
        } catch (SQLException ex) {
            Logger.getLogger(PopUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//Eliminar en github
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    //Acción que se ejecuta al presionar el botón Guardar el cual ejecuta
    //el método guardar y cierra la ventana emergente.
    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        guardar();
        dispose();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    //Acción que se ejecuta al presionar el botón eliminar el cual ejecuta
    //el método eliminar y cierra la ventana emergente.
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminar();
        dispose();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    //Acción que se ejecuta al presionar el botón volver, el cual cierra la 
    //ventana emergente y vuelve a la ventana anterior.
    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        dispose();
        Prin_productos pp = new Prin_productos();
        pp.setVisible(true);
    }//GEN-LAST:event_btn_VolverActionPerformed

    //Método main.
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
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jL_CantidadDisponible;
    private javax.swing.JLabel jL_CategoriaProducto;
    private javax.swing.JLabel jL_Codigo_Producto;
    private javax.swing.JLabel jL_MarcaProducto;
    private javax.swing.JLabel jL_NombreProducto;
    private javax.swing.JLabel jL_PrecioProducto;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField txt_CantidadDisponible;
    public static javax.swing.JTextField txt_CategoriaProducto;
    public static javax.swing.JTextField txt_Codigo;
    public static javax.swing.JTextField txt_MarcaProducto;
    public static javax.swing.JTextField txt_NombreProducto;
    public static javax.swing.JTextField txt_PrecioProducto;
    // End of variables declaration//GEN-END:variables
}
