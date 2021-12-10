//Nombre del paquete
package ventanas;

//Librerías importadas
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Nombre de la clase
public class Prin_productos extends javax.swing.JFrame {

    //Conexion a la base de datos mediante la clase conexion.
    Connection cn = Conexion.conector();

    //Constructor de la clase
    public Prin_productos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro Productos");
        try {
            mostrarDatos();
        } catch (SQLException ex) {
            // Logger.getLogger(Prin_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jL_Productos_Almacen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btn_Registro = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(0, 204, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jL_Productos_Almacen.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jL_Productos_Almacen.setText("Productos Almacén");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        btn_Registro.setBackground(new java.awt.Color(153, 255, 153));
        btn_Registro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Registro.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\businesspackage_additionalpackage_box_add_insert_negoci_2335.png")); // NOI18N
        btn_Registro.setText("Nuevo");
        btn_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistroActionPerformed(evt);
            }
        });

        btn_Cerrar.setBackground(new java.awt.Color(51, 204, 255));
        btn_Cerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Cerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\darli\\Documents\\NetBeansProjects\\com.mycompany_Practica4_jar_1.0-SNAPSHOT\\src\\main\\java\\images\\ic_arrow_back_128_28226.png")); // NOI18N
        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jL_Productos_Almacen))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jL_Productos_Almacen)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Acción del botón agregar que al presionarse cierra la ventana de los registros
    //de productos(CRUD), y abre la ventana para el registro de nuevos productos.
    private void btn_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistroActionPerformed
        dispose();
        Registro_productos rp = new Registro_productos();
        rp.setVisible(true);
    }//GEN-LAST:event_btn_RegistroActionPerformed

    //Acción del botón Cerrar que cierra la ventana y regresa a la ventana principal.
    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
        Principal prin = new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_btn_CerrarActionPerformed

    //Evento mouseClicked Para obtener los datos de una fila en específico.
    //Tambien abre una ventana para actualizar o eliminar registros de productos, 
    //y almacena la información de la fila seleccionada en los campos de la ventana
    //emergente, para que así el usuario pueda modificarlo o eliminarlo facilmente.
    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        dispose();
        int filaSeleccionada = tablaProductos.rowAtPoint(evt.getPoint());
        PopUp popup = new PopUp();

        PopUp.txt_NombreProducto.setText(tablaProductos.getValueAt(filaSeleccionada, 0).toString());
        PopUp.txt_MarcaProducto.setText(tablaProductos.getValueAt(filaSeleccionada, 1).toString());
        PopUp.txt_CategoriaProducto.setText(tablaProductos.getValueAt(filaSeleccionada, 2).toString());
        PopUp.txt_PrecioProducto.setText(tablaProductos.getValueAt(filaSeleccionada, 3).toString());
        PopUp.txt_CantidadDisponible.setText(tablaProductos.getValueAt(filaSeleccionada, 4).toString());
        PopUp.txt_Codigo.setText(tablaProductos.getValueAt(filaSeleccionada, 5).toString());
        popup.setVisible(true);


    }//GEN-LAST:event_tablaProductosMouseClicked

    //Método para mostrar los datos en la tabla.
    public void mostrarDatos() throws SQLException {

        //Vectores para mostrar información en la tabla, el primero muestra los títulos, 
        //la segundo muestra los registros de productos, mediante un ciclo while y una consulta
        //SQL.
        String[] titulos = {"Nombre_Producto", "Marca", "Categoría", "Precio", "Stock_Disponible", "Codigo"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String query = "SELECT * FROM usuarios.productos";

        Statement pst = cn.createStatement();
        ResultSet rs = pst.executeQuery(query);

        while (rs.next()) {
            registros[0] = rs.getString("NombreProducto");
            registros[1] = rs.getString("MarcaProducto");
            registros[2] = rs.getString("CategoriaProducto");
            registros[3] = rs.getString("PrecioProducto");
            registros[4] = rs.getString("StockProducto");
            registros[5] = rs.getString("Codigo");

            modelo.addRow(registros);
        }

        try {
            tablaProductos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //Método Main
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
            java.util.logging.Logger.getLogger(Prin_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prin_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prin_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prin_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prin_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Registro;
    private javax.swing.JLabel jL_Productos_Almacen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
