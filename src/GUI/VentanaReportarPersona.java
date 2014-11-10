/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Samantha
 */
public class VentanaReportarPersona extends javax.swing.JInternalFrame {

    private static VentanaReportarPersona miVentanaReportarPersona;
    /**
     * Creates new form ventanaBuscarMascota
     */
    private VentanaReportarPersona() {
        initComponents();
    }

    public static VentanaReportarPersona getInstance()
    {
        if(miVentanaReportarPersona == null)
        {
            miVentanaReportarPersona = new VentanaReportarPersona();
        }
        return miVentanaReportarPersona;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVentanaBuscar = new javax.swing.JPanel();
        lblTituloVentana = new javax.swing.JLabel();
        lblImagenBuscar = new javax.swing.JLabel();
        lblImagenMascota = new javax.swing.JLabel();
        lblidPersona = new javax.swing.JLabel();
        fieldComentarios = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblCalificacion = new javax.swing.JLabel();
        fieldIDPersona = new javax.swing.JTextField();
        boxCalificacion = new javax.swing.JComboBox();
        lblComentarios1 = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Reportar Persona - Estimação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N

        panelVentanaBuscar.setBackground(new java.awt.Color(190, 160, 100));
        panelVentanaBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloVentana.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloVentana.setText("Reportar Persona");
        panelVentanaBuscar.add(lblTituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        lblImagenBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 30, 30));

        lblImagenMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        lblidPersona.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblidPersona.setText("Cédula de la persona para reportar");
        panelVentanaBuscar.add(lblidPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        fieldComentarios.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldComentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldComentariosKeyTyped(evt);
            }
        });
        panelVentanaBuscar.add(fieldComentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, 50));

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(170, 80, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 90, 40));

        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(170, 80, 0));
        btnBuscar.setText("Reportar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 90, 40));

        lblCalificacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCalificacion.setText("Calificación");
        panelVentanaBuscar.add(lblCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        fieldIDPersona.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldIDPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldIDPersonaKeyTyped(evt);
            }
        });
        panelVentanaBuscar.add(fieldIDPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 130, -1));

        boxCalificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        panelVentanaBuscar.add(boxCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 40, -1));

        lblComentarios1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblComentarios1.setText("Comentarios");
        panelVentanaBuscar.add(lblComentarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //if(stringNumerico.isNumeric(fieldIDPersona.getText())){
        Controladores.ControladorReportes.getInstance().ReportarPersonaListaNegra(fieldIDPersona.getText(),fieldComentarios.getText(), boxCalificacion.getSelectedIndex());
        JOptionPane.showMessageDialog(null, "Reporte realizado con éxito");
        //}else{
        //JOptionPane.showMessageDialog(null, "El espacio para la Cédula sólo recibe números");
        //}
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fieldComentarios.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void fieldComentariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldComentariosKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese Solo Numeros en este espacio");
        }
    }//GEN-LAST:event_fieldComentariosKeyTyped

    private void fieldIDPersonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIDPersonaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIDPersonaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxCalificacion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField fieldComentarios;
    private javax.swing.JTextField fieldIDPersona;
    private javax.swing.JLabel lblCalificacion;
    private javax.swing.JLabel lblComentarios1;
    private javax.swing.JLabel lblImagenBuscar;
    private javax.swing.JLabel lblImagenMascota;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JLabel lblidPersona;
    private javax.swing.JPanel panelVentanaBuscar;
    // End of variables declaration//GEN-END:variables
}