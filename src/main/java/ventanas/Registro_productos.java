/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author darli
 */
public class Registro_productos extends javax.swing.JFrame {

    /**
     * Creates new form Registro_productos
     */
    public Registro_productos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro Productos");
    }

    public void Registrar() {

        //Variables para almacenar la información que 
        //se guarde en los JTextField del formulario
        //registro_productos, para así almacenarla en la base de datos.
        final String codigoProducto = txt_Codigo_Producto.getText();
        final String nombreProducto = txt_Nombre_Producto.getText();
        final String marcaProducto = txt_Marca_Producto.getText();
        final String categoriaProducto = txt_Categoría_Producto.getText();
        final String precioProducto = txt_Precio_Producto.getText();
        final String stockProducto = txt_Stock_Producto.getText();

        //Muestra mensaje al usuario en caso de
        //que deje un campo vacío, para que así, este
        //lo llene, y pueda hacer el registro correctamente.
        int Contador = 0;
        if (txt_Codigo_Producto.getText().equals("")) {
            Contador++;
            jL_CodigoObligatorio.setVisible(true);
        }
        if (txt_Nombre_Producto.getText().equals("")) {
            Contador++;
            jL_NombreObligatorio.setVisible(true);
        }
        if (txt_Marca_Producto.getText().equals("")) {
            Contador++;
            jL_MarcaObligatorio.setVisible(true);
        }
        if (txt_Categoría_Producto.getText().equals("")) {
            Contador++;
            jL_CategoriaObligatorio.setVisible(true);
        }
        if (txt_Precio_Producto.getText().equals("")) {
            Contador++;
            jL_PrecioObligatorio.setVisible(true);
        }
        if (txt_Stock_Producto.getText().equals("")) {
            Contador++;
            jL_StockObligatorio.setVisible(true);
        }

        //Condicional que se asegura que el usuario llenó todos los campos necesarios.
        if (Contador == 0) {
            //Lógica para añadir los datos en la base de datos.
            try {
                Connection cn = Conexion.conector();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO productos (`NombreProducto`, `MarcaProducto`, `CategoriaProducto`, `PrecioProducto`,`StockProducto`,`Codigo`  ) VALUES( '" + nombreProducto + "','" + marcaProducto + "','" + categoriaProducto + "','" + precioProducto + "','" + stockProducto + "','" + codigoProducto + "')");

                pst.executeUpdate();
                dispose();
                JOptionPane.showMessageDialog(null, "Registro añadido!");
                Prin_productos pp = new Prin_productos();
                pp.setVisible(true);

            } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, "Hubo un error! " + e1);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jL_Registro_producto = new javax.swing.JLabel();
        jL_Nombre_Producto = new javax.swing.JLabel();
        txt_Nombre_Producto = new javax.swing.JTextField();
        jL_Marca_Producto = new javax.swing.JLabel();
        txt_Marca_Producto = new javax.swing.JTextField();
        jL_Categoría_Producto = new javax.swing.JLabel();
        txt_Categoría_Producto = new javax.swing.JTextField();
        jL_Precio_Producto = new javax.swing.JLabel();
        txt_Precio_Producto = new javax.swing.JTextField();
        jL_Stock_Producto = new javax.swing.JLabel();
        txt_Stock_Producto = new javax.swing.JTextField();
        btn_Registrar = new javax.swing.JButton();
        jL_NombreObligatorio = new javax.swing.JLabel();
        jL_MarcaObligatorio = new javax.swing.JLabel();
        jL_CategoriaObligatorio = new javax.swing.JLabel();
        jL_PrecioObligatorio = new javax.swing.JLabel();
        jL_StockObligatorio = new javax.swing.JLabel();
        jL_CodigoProducto = new javax.swing.JLabel();
        txt_Codigo_Producto = new javax.swing.JTextField();
        jL_CodigoObligatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jL_Registro_producto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jL_Registro_producto.setText("Registro Producto");

        jL_Nombre_Producto.setText("Nombre Producto");

        jL_Marca_Producto.setText("Marca Producto");

        jL_Categoría_Producto.setText("Categoría Producto");

        jL_Precio_Producto.setText("Precio Producto");

        jL_Stock_Producto.setText("Stock Producto");

        btn_Registrar.setBackground(new java.awt.Color(204, 255, 204));
        btn_Registrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\business_package_box_accept_productorpackagetoaccept_negocio_paquet_2334.png")); // NOI18N
        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        jL_NombreObligatorio.setVisible(false);
        jL_NombreObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jL_NombreObligatorio.setText("Campo Obligatorio");

        jL_MarcaObligatorio.setVisible(false);
        jL_MarcaObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jL_MarcaObligatorio.setText("Campo Obligatorio");

        jL_CategoriaObligatorio.setVisible(false);
        jL_CategoriaObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jL_CategoriaObligatorio.setText("Campo Obligatorio");

        jL_PrecioObligatorio.setVisible(false);
        jL_PrecioObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jL_PrecioObligatorio.setText("Campo Obligatorio");

        jL_StockObligatorio.setVisible(false);
        jL_StockObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jL_StockObligatorio.setText("Campo Obligatorio");

        jL_CodigoProducto.setText("Código");

        jL_CodigoObligatorio.setVisible(false);
        jL_CodigoObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jL_CodigoObligatorio.setText("Campo Obligatorio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jL_Precio_Producto)
                                .addGap(99, 99, 99)
                                .addComponent(jL_Stock_Producto)
                                .addGap(50, 50, 50))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL_PrecioObligatorio)
                                    .addComponent(txt_Precio_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL_StockObligatorio)
                                    .addComponent(txt_Stock_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jL_MarcaObligatorio)
                                                .addComponent(jL_Marca_Producto)))
                                        .addComponent(txt_Marca_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                        .addComponent(txt_Codigo_Producto))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jL_CodigoProducto))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jL_CodigoObligatorio)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Categoría_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_CategoriaObligatorio)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jL_NombreObligatorio)
                                        .addComponent(jL_Categoría_Producto))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jL_Nombre_Producto)
                                            .addComponent(txt_Nombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jL_Registro_producto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jL_Registro_producto)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Nombre_Producto)
                    .addComponent(jL_CodigoProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Codigo_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_NombreObligatorio)
                    .addComponent(jL_CodigoObligatorio))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Categoría_Producto)
                    .addComponent(jL_Marca_Producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Categoría_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Marca_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jL_CategoriaObligatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jL_Stock_Producto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jL_MarcaObligatorio)
                        .addGap(18, 18, 18)
                        .addComponent(jL_Precio_Producto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Stock_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Precio_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_StockObligatorio)
                    .addComponent(jL_PrecioObligatorio))
                .addGap(18, 18, 18)
                .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Accion del botón registrar el cual ejecuta el método registrar.
    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        Registrar();
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JLabel jL_CategoriaObligatorio;
    private javax.swing.JLabel jL_Categoría_Producto;
    private javax.swing.JLabel jL_CodigoObligatorio;
    private javax.swing.JLabel jL_CodigoProducto;
    private javax.swing.JLabel jL_MarcaObligatorio;
    private javax.swing.JLabel jL_Marca_Producto;
    private javax.swing.JLabel jL_NombreObligatorio;
    private javax.swing.JLabel jL_Nombre_Producto;
    private javax.swing.JLabel jL_PrecioObligatorio;
    private javax.swing.JLabel jL_Precio_Producto;
    private javax.swing.JLabel jL_Registro_producto;
    private javax.swing.JLabel jL_StockObligatorio;
    private javax.swing.JLabel jL_Stock_Producto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Categoría_Producto;
    private javax.swing.JTextField txt_Codigo_Producto;
    private javax.swing.JTextField txt_Marca_Producto;
    private javax.swing.JTextField txt_Nombre_Producto;
    private javax.swing.JTextField txt_Precio_Producto;
    private javax.swing.JTextField txt_Stock_Producto;
    // End of variables declaration//GEN-END:variables
}
