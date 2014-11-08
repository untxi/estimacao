/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import Controladores.ControladorDonaciones;
import Estructuras.Donacion;

/**
 *
 * @author Samantha
 */
public class VentanaDonar extends javax.swing.JInternalFrame{
    private static VentanaDonar miVentanaDonar;
    private VentanaDonar() {
        initComponents();
    }
    
    public static VentanaDonar getInstance(){
        if(miVentanaDonar == null)
        {
            miVentanaDonar = new VentanaDonar();
        }
        return miVentanaDonar;
    }
    
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblCantidadDonacion = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnDonar = new javax.swing.JButton();
        fieldCantidadDonacion = new javax.swing.JTextField();
        lblidDonante = new javax.swing.JLabel();
        fieldidDonante = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        fechaDonacion = new com.toedter.calendar.JDateChooser();

        setIconifiable(true);
        setTitle("Donar - Estimação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(190, 160, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTítulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/donar.png"))); // NOI18N
        lblTítulo.setText("     Donar");
        jPanel1.add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lblCantidadDonacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCantidadDonacion.setText("Monto de la Donación");
        jPanel1.add(lblCantidadDonacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(170, 80, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, 40));

        btnDonar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnDonar.setForeground(new java.awt.Color(170, 80, 0));
        btnDonar.setText("Donar");
        btnDonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 90, 40));

        fieldCantidadDonacion.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldCantidadDonacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCantidadDonacionActionPerformed(evt);
            }
        });
        jPanel1.add(fieldCantidadDonacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 130, -1));

        lblidDonante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblidDonante.setText("Cédula Donante");
        jPanel1.add(lblidDonante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        fieldidDonante.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jPanel1.add(fieldidDonante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 130, -1));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblFecha.setText("Fecha");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        fechaDonacion.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jPanel1.add(fechaDonacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonarActionPerformed
       
    }//GEN-LAST:event_btnDonarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane.showMessageDialog(null, "Donación Cancelada");
        fieldidDonante.setText("");
        fieldCantidadDonacion.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void fieldCantidadDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCantidadDonacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCantidadDonacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDonar;
    private com.toedter.calendar.JDateChooser fechaDonacion;
    private javax.swing.JTextField fieldCantidadDonacion;
    private javax.swing.JTextField fieldidDonante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidadDonacion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblidDonante;
    // End of variables declaration//GEN-END:variables
}
