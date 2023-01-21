/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.Conexion;

/**
 *
 * @author alfre
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    Controlador control;
    public Menu(Controlador control) {
        initComponents();
        this.control = control;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGral = new javax.swing.JMenu();
        jMenuArt = new javax.swing.JMenu();
        jMenuItemAgregaArt = new javax.swing.JMenuItem();
        jMenuItemModifArt = new javax.swing.JMenuItem();
        jMenuItemListaArt = new javax.swing.JMenuItem();
        jMenuItemAsociaVend = new javax.swing.JMenuItem();
        jMenuVend = new javax.swing.JMenu();
        jMenuItemAgregaVend = new javax.swing.JMenuItem();
        jMenuItemModifVend = new javax.swing.JMenuItem();
        jMenuItemListaVend = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas");

        panel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/jugador.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuGral.setText("ADMINISTRAR");
        jMenuGral.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuArt.setText("ARTICULOS");
        jMenuArt.setAlignmentX(0.0F);
        jMenuArt.setAlignmentY(0.0F);
        jMenuArt.setFocusPainted(true);
        jMenuArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItemAgregaArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItemAgregaArt.setText("Agregar");
        jMenuItemAgregaArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregaArtActionPerformed(evt);
            }
        });
        jMenuArt.add(jMenuItemAgregaArt);

        jMenuItemModifArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItemModifArt.setText("Modificar");
        jMenuItemModifArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModifArtActionPerformed(evt);
            }
        });
        jMenuArt.add(jMenuItemModifArt);

        jMenuItemListaArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItemListaArt.setText("Listar");
        jMenuItemListaArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaArtActionPerformed(evt);
            }
        });
        jMenuArt.add(jMenuItemListaArt);

        jMenuItemAsociaVend.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItemAsociaVend.setText("Asociar Vendedor");
        jMenuItemAsociaVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAsociaVendActionPerformed(evt);
            }
        });
        jMenuArt.add(jMenuItemAsociaVend);

        jMenuGral.add(jMenuArt);

        jMenuVend.setText("VENDEDORES");
        jMenuVend.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItemAgregaVend.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItemAgregaVend.setText("Agregar");
        jMenuItemAgregaVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregaVendActionPerformed(evt);
            }
        });
        jMenuVend.add(jMenuItemAgregaVend);

        jMenuItemModifVend.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItemModifVend.setText("Modificar");
        jMenuItemModifVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModifVendActionPerformed(evt);
            }
        });
        jMenuVend.add(jMenuItemModifVend);

        jMenuItemListaVend.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItemListaVend.setText("Listar");
        jMenuItemListaVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaVendActionPerformed(evt);
            }
        });
        jMenuVend.add(jMenuItemListaVend);

        jMenuGral.add(jMenuVend);

        jMenuSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuSalir.setText("SALIR");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuGral.add(jMenuSalir);

        jMenuBar1.add(jMenuGral);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAgregaArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregaArtActionPerformed
        // TODO add your handling code here:
        new AgregarArticulo(control).setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregaArtActionPerformed

    private void jMenuItemModifArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModifArtActionPerformed
        // TODO add your handling code here:
        new ModificarArticulo(control).setVisible(true);
    }//GEN-LAST:event_jMenuItemModifArtActionPerformed

    private void jMenuItemListaArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaArtActionPerformed
        // TODO add your handling code here:
        new ListarArticulos(control).setVisible(true);
    }//GEN-LAST:event_jMenuItemListaArtActionPerformed

    private void jMenuItemAsociaVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAsociaVendActionPerformed
        // TODO add your handling code here:
        new AsignarVendedor(control).setVisible(true);
    }//GEN-LAST:event_jMenuItemAsociaVendActionPerformed

    private void jMenuItemAgregaVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregaVendActionPerformed
        // TODO add your handling code here:
        new AgregarVendedor(control).setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregaVendActionPerformed

    private void jMenuItemModifVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModifVendActionPerformed
        // TODO add your handling code here:
        new ModificarVendedor(control).setVisible(true);
    }//GEN-LAST:event_jMenuItemModifVendActionPerformed

    private void jMenuItemListaVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaVendActionPerformed
        // TODO add your handling code here:
        new ListarVendedores(control).setVisible(true);
    }//GEN-LAST:event_jMenuItemListaVendActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        // TODO add your handling code here:
        Conexion.getSessionFactory().close();
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuArt;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGral;
    private javax.swing.JMenuItem jMenuItemAgregaArt;
    private javax.swing.JMenuItem jMenuItemAgregaVend;
    private javax.swing.JMenuItem jMenuItemAsociaVend;
    private javax.swing.JMenuItem jMenuItemListaArt;
    private javax.swing.JMenuItem jMenuItemListaVend;
    private javax.swing.JMenuItem jMenuItemModifArt;
    private javax.swing.JMenuItem jMenuItemModifVend;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JMenu jMenuVend;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
