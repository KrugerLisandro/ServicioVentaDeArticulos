/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.CiudadVO;
import Modelo.VendedorVO;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alfre
 */
public class ModificarVendedor extends javax.swing.JFrame {

    Controlador control;
    
    public ModificarVendedor(Controlador control) {
        this.control = control;
        initComponents();
        rellenarComboCiudad(listaCiudad);
        listaCiudad.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCuit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtComision = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        listaCiudad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendedores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnCargar = new javax.swing.JButton();

        setTitle("Modificar Vendedores");
        setPreferredSize(new java.awt.Dimension(730, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Aceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aceptar.setText("Actualizar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 54, 112, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 128, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 93, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Dirección:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 113, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.setToolTipText("Ingrese Apellido del Vendedor");
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 122, 160, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setToolTipText("Ingrese nombre del vendedor");
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 93, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("%");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 263, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDireccion.setToolTipText("Ingrese dirección");
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 161, 265, 42));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("CUIT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 224, 77, -1));

        txtCuit.setEditable(false);
        txtCuit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCuit.setToolTipText("Ingrese CUIT");
        getContentPane().add(txtCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 221, 122, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Comisión:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 263, 110, -1));

        txtComision.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtComision.setToolTipText("Ingrese porcentaje de comisión");
        getContentPane().add(txtComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 39, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Ciudad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 299, 90, -1));

        jToolBar1.setRollover(true);
        jToolBar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 54, 413, -1));

        listaCiudad.setEditable(true);
        listaCiudad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaCiudad.setToolTipText("Seleccione una Ciudad");
        getContentPane().add(listaCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 299, 142, -1));

        jTableVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Dirección", "CUIT", "Comision %", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVendedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 349, 670, 111));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Pre-Visualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 299, -1, 32));

        jLabel9.setText("ID:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 65, -1, -1));

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 62, 73, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setText("Modificar datos de vendedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 180, -1));

        jBtnCargar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnCargar.setText("Cargar");
        jBtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 299, 83, 32));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        int id = Integer.parseInt(txtId.getText());
        String nombre = (txtNombre.getText());
        String apellido = (txtApellido.getText());
        String direccion = txtDireccion.getText();
        String cuit = txtCuit.getText();
        double comision = Double.parseDouble(txtComision.getText());
        if (listaCiudad.getSelectedIndex() == -1) {
            control.modificarVendedor2(id, nombre, apellido, direccion, cuit, comision);
        } else {
            CiudadVO ciudad = (CiudadVO) listaCiudad.getSelectedItem();
            control.modificarVendedor(id, nombre, apellido, direccion, cuit, comision, ciudad);}

        //luego de guardar, se limpian los campos automaticamente
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtCuit.setText("");
        txtComision.setText("");
        listaCiudad.setSelectedItem(null);        
        
        
        
    }//GEN-LAST:event_AceptarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         List<VendedorVO> vendedores = control.listarVendedores();

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Dirección");
        model.addColumn("Cuit");
        model.addColumn("Comsión");
        model.addColumn("Ciudad");

        for (VendedorVO vendedor : vendedores) {
            model.addRow(new Object[]{vendedor.getIdPersona(), vendedor.getNombre(), vendedor.getApellido(), vendedor.getDireccion(), vendedor.getCuit(), vendedor.getComision(), vendedor.getCiudad().getNombre()});
        }

        jTableVendedores.setModel(model);

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jBtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCargarActionPerformed
        // TODO add your handling code here:
        int filaseleccionada;
        try {
            filaseleccionada = jTableVendedores.getSelectedRow();
            if (filaseleccionada == -1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");
            } else {
                
                txtId.setText(String.valueOf(jTableVendedores.getValueAt(filaseleccionada, 0)));
                txtNombre.setText(String.valueOf(jTableVendedores.getValueAt(filaseleccionada, 1)));
                txtApellido.setText(String.valueOf(jTableVendedores.getValueAt(filaseleccionada, 2)));
                txtDireccion.setText(String.valueOf(jTableVendedores.getValueAt(filaseleccionada, 3)));
                txtCuit.setText(String.valueOf(jTableVendedores.getValueAt(filaseleccionada, 4)));
                txtComision.setText(String.valueOf(jTableVendedores.getValueAt(filaseleccionada, 5)));
                listaCiudad.setSelectedItem(String.valueOf(jTableVendedores.getValueAt(filaseleccionada,6)));
            }
        }catch (HeadlessException e){
            JOptionPane.showMessageDialog(null, "Error: "+e+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_jBtnCargarActionPerformed

    /**
     * @param args the command line arguments
     */
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton jBtnCargar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVendedores;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> listaCiudad;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void rellenarComboCiudad(JComboBox<String> listaCiudad) {
        List<CiudadVO> ciudades = control.listarCiudad();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();

        //try por si fallara al momento de rellenar
        try {
            //Se recorre con un for la lista de ciudades
            for (CiudadVO ciudad : ciudades) {

                modelo.addElement(ciudad);

            }
        } catch (Exception e) { //capta el error y lo muestra
            JOptionPane.showMessageDialog(null, "Error al cargar ComboBox" + e);
        }

        listaCiudad.setModel(modelo);}
}