/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Samantha
 */
public class ventanaCrearUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ventanaCrearUsuario
     */
    public ventanaCrearUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCrearUsuario = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        lblApellido2 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        fieldNombre = new javax.swing.JTextField();
        fieldApellido2 = new javax.swing.JTextField();
        fieldTelefono = new javax.swing.JTextField();
        fieldApellido1 = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        field_ID = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JTextField();
        lblimagenUsuario = new javax.swing.JLabel();
        lblimagenAdoptante = new javax.swing.JLabel();
        lblCuna = new javax.swing.JLabel();
        checkAdoptante = new javax.swing.JCheckBox();
        checkCasaCuna = new javax.swing.JCheckBox();

        setClosable(true);
        setTitle("Crear Usuario Nuevo - Estimacao");

        panelCrearUsuario.setBackground(new java.awt.Color(190, 160, 100));
        panelCrearUsuario.setToolTipText("");
        panelCrearUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(170, 80, 0));
        lblNombre.setText("Nombre");
        panelCrearUsuario.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 205, -1, -1));

        lblApellido1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblApellido1.setForeground(new java.awt.Color(170, 80, 0));
        lblApellido1.setText("Primer      Apellido");
        panelCrearUsuario.add(lblApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 237, -1, -1));

        lblApellido2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblApellido2.setForeground(new java.awt.Color(170, 80, 0));
        lblApellido2.setText("Segundo Apellido");
        panelCrearUsuario.add(lblApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 261, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(170, 80, 0));
        lblTelefono.setText("Teléfono");
        panelCrearUsuario.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 291, -1, -1));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(170, 80, 0));
        lblEmail.setText("E-mail");
        panelCrearUsuario.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 318, -1, -1));

        lblid.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblid.setForeground(new java.awt.Color(170, 80, 0));
        lblid.setText("ID (Sólo números)");
        panelCrearUsuario.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 345, -1, -1));

        lblPassword.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(170, 80, 0));
        lblPassword.setText("Password");
        panelCrearUsuario.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 372, -1, -1));

        btnCrear.setBackground(new java.awt.Color(255, 153, 0));
        btnCrear.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(170, 80, 0));
        btnCrear.setText("Crear");
        panelCrearUsuario.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 408, -1, -1));

        fieldNombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldNombre.setToolTipText("");
        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 202, 204, -1));

        fieldApellido2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldApellido2.setToolTipText("");
        panelCrearUsuario.add(fieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 261, 204, -1));

        fieldTelefono.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldTelefono.setToolTipText("");
        panelCrearUsuario.add(fieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 288, 205, -1));

        fieldApellido1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldApellido1.setToolTipText("");
        panelCrearUsuario.add(fieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 234, 204, -1));

        fieldEmail.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldEmail.setToolTipText("");
        panelCrearUsuario.add(fieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 315, 204, -1));

        field_ID.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        field_ID.setToolTipText("");
        field_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_IDActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(field_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 342, 204, -1));

        fieldPassword.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldPassword.setToolTipText("");
        panelCrearUsuario.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 369, 204, -1));

        lblimagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        panelCrearUsuario.add(lblimagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 11, 142, 185));

        lblimagenAdoptante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/adoptar.png"))); // NOI18N
        panelCrearUsuario.add(lblimagenAdoptante, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 11, -1, -1));

        lblCuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/casaCuna.png"))); // NOI18N
        panelCrearUsuario.add(lblCuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 20, -1, -1));

        checkAdoptante.setBackground(new java.awt.Color(190, 160, 100));
        checkAdoptante.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        checkAdoptante.setForeground(new java.awt.Color(170, 80, 0));
        checkAdoptante.setText("Adoptante");
        panelCrearUsuario.add(checkAdoptante, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 173, -1, -1));

        checkCasaCuna.setBackground(new java.awt.Color(190, 160, 100));
        checkCasaCuna.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        checkCasaCuna.setForeground(new java.awt.Color(170, 80, 0));
        checkCasaCuna.setText("Casa Cuna");
        panelCrearUsuario.add(checkCasaCuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void field_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_IDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JCheckBox checkAdoptante;
    private javax.swing.JCheckBox checkCasaCuna;
    private javax.swing.JTextField fieldApellido1;
    private javax.swing.JTextField fieldApellido2;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JTextField field_ID;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblCuna;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblimagenAdoptante;
    private javax.swing.JLabel lblimagenUsuario;
    private javax.swing.JPanel panelCrearUsuario;
    // End of variables declaration//GEN-END:variables
}