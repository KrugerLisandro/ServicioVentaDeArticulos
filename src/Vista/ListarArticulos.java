
package Vista;

import Controlador.Controlador;
import Modelo.ArticuloVO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListarArticulos extends javax.swing.JFrame {

    Controlador control;
        /**
     * Creates new form AgregaArticulo
     */
    public ListarArticulos(Controlador control) {
        this.control = control;
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbArticulos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();

        setTitle("Listado de Artículos");

        tbArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbArticulos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cantidad de Registros");

        txtcant.setEditable(false);
        txtcant.setBackground(new java.awt.Color(255, 255, 255));
        txtcant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcant.setEnabled(false);

        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuscar.setText("Listar Artículos");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnbuscar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        
        List<ArticuloVO> articulos = control.listarArticulos();
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Id");
        model.addColumn("Código");
        model.addColumn("Nombre");
        model.addColumn("Descripción");
        model.addColumn("Precio Compra");
        model.addColumn("Precio Venta");
        model.addColumn("Marca");
        int cantidad = articulos.size();
        
                
        for (ArticuloVO articulo : articulos) {
            model.addRow(new Object[]{articulo.getIdArticulo(), articulo.getCodigo(), articulo.getNombre(), articulo.getDescripcion(), articulo.getPrecioCosto(), articulo.getPrecioVenta(), articulo.getMarca().getNombre()});
        }
       
        tbArticulos.setModel(model);
        
        txtcant.setText(String.valueOf(cantidad));
            
        
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbArticulos;
    private javax.swing.JTextField txtcant;
    // End of variables declaration//GEN-END:variables



}
