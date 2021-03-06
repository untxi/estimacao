/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controladores.ControladorSesion;
import Interfaces.IConstantes;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Samantha
 */
public class VentanaCrearUsuario extends javax.swing.JInternalFrame implements  IConstantes
{

    private static VentanaCrearUsuario miVentanaCrearUsuario;
    
    /**
     * Creates new form ventanaCrearUsuario
     */
    private VentanaCrearUsuario() 
    {
        initComponents();
        boxEspecie.setModel(new DefaultComboBoxModel(Especies));
    }
    
    public static VentanaCrearUsuario getInstance()
    {
        if(miVentanaCrearUsuario == null)
        {
            miVentanaCrearUsuario = new VentanaCrearUsuario();
        }
        return miVentanaCrearUsuario;
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
        lblimagenUsuario = new javax.swing.JLabel();
        lblimagenAdoptante = new javax.swing.JLabel();
        lblCuna = new javax.swing.JLabel();
        checkAdoptante = new javax.swing.JCheckBox();
        checkCasaCuna = new javax.swing.JCheckBox();
        btnCerrar = new javax.swing.JButton();
        lblUbicacion = new javax.swing.JLabel();
        lblTipoResidencia = new javax.swing.JLabel();
        fieldUbicacion = new javax.swing.JTextField();
        fieldTipoResidencia = new javax.swing.JTextField();
        lblCantidadMascotas = new javax.swing.JLabel();
        boxEspecie = new javax.swing.JComboBox();
        boxTamaño = new javax.swing.JComboBox();
        lblTamano1 = new javax.swing.JLabel();
        checkDonacion = new javax.swing.JCheckBox();
        lblEspecie = new javax.swing.JLabel();
        boxCantidadMascotas = new javax.swing.JComboBox();
        fieldNickname = new javax.swing.JTextField();
        lblNickname = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        lblTituloUsuario = new javax.swing.JLabel();
        lblTituloAdoptar = new javax.swing.JLabel();
        lblTituloCasaCuna = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Crear Usuario Nuevo - Estimação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N

        panelCrearUsuario.setBackground(new java.awt.Color(190, 160, 100));
        panelCrearUsuario.setToolTipText("");
        panelCrearUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombre.setText("Nombre");
        panelCrearUsuario.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblApellido1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblApellido1.setText("Primer      Apellido");
        panelCrearUsuario.add(lblApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblApellido2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblApellido2.setText("Segundo Apellido");
        panelCrearUsuario.add(lblApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTelefono.setText("Teléfono");
        panelCrearUsuario.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEmail.setText("E-mail");
        panelCrearUsuario.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lblid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblid.setText("Cédula ");
        panelCrearUsuario.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        lblPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblPassword.setText("Contraseña");
        panelCrearUsuario.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btnCrear.setBackground(new java.awt.Color(255, 153, 0));
        btnCrear.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(170, 80, 0));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 110, 50));

        fieldNombre.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldNombre.setToolTipText("");
        panelCrearUsuario.add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 204, -1));

        fieldApellido2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldApellido2.setToolTipText("");
        panelCrearUsuario.add(fieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 204, -1));

        fieldTelefono.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldTelefono.setToolTipText("");
        fieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTelefonoKeyTyped(evt);
            }
        });
        panelCrearUsuario.add(fieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 205, -1));

        fieldApellido1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldApellido1.setToolTipText("");
        panelCrearUsuario.add(fieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 204, -1));

        fieldEmail.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldEmail.setToolTipText("");
        panelCrearUsuario.add(fieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 204, -1));

        field_ID.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        field_ID.setToolTipText("");
        field_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_IDKeyTyped(evt);
            }
        });
        panelCrearUsuario.add(field_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 204, -1));

        lblimagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        panelCrearUsuario.add(lblimagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 80));

        lblimagenAdoptante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/adoptar.png"))); // NOI18N
        panelCrearUsuario.add(lblimagenAdoptante, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 120, 120));

        lblCuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/casaCuna.png"))); // NOI18N
        panelCrearUsuario.add(lblCuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 140, -1));

        checkAdoptante.setBackground(new java.awt.Color(190, 160, 100));
        checkAdoptante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        checkAdoptante.setText("Adoptante");
        checkAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAdoptanteActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(checkAdoptante, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 173, -1, -1));

        checkCasaCuna.setBackground(new java.awt.Color(190, 160, 100));
        checkCasaCuna.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        checkCasaCuna.setText("Casa Cuna");
        checkCasaCuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCasaCunaActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(checkCasaCuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 153, 0));
        btnCerrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(170, 80, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.setMaximumSize(new java.awt.Dimension(63, 23));
        btnCerrar.setMinimumSize(new java.awt.Dimension(63, 23));
        btnCerrar.setPreferredSize(new java.awt.Dimension(63, 23));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 100, 50));

        lblUbicacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblUbicacion.setText("Ubicación");
        panelCrearUsuario.add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        lblTipoResidencia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTipoResidencia.setText("Tipo de Residencia");
        panelCrearUsuario.add(lblTipoResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        fieldUbicacion.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldUbicacion.setEnabled(false);
        panelCrearUsuario.add(fieldUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 160, -1));

        fieldTipoResidencia.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldTipoResidencia.setEnabled(false);
        panelCrearUsuario.add(fieldTipoResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 160, -1));

        lblCantidadMascotas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCantidadMascotas.setText("Cantidad de Mascotas");
        panelCrearUsuario.add(lblCantidadMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, -1));

        boxEspecie.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boxEspecie.setEnabled(false);
        boxEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEspecieActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(boxEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 110, -1));

        boxTamaño.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boxTamaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pequeño", "Mediano", "Grande", "Gigante" }));
        boxTamaño.setEnabled(false);
        panelCrearUsuario.add(boxTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 110, -1));

        lblTamano1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTamano1.setText("Tamaño");
        panelCrearUsuario.add(lblTamano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, -1, -1));

        checkDonacion.setBackground(new java.awt.Color(190, 160, 100));
        checkDonacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        checkDonacion.setText("Recibir Donaciones");
        checkDonacion.setEnabled(false);
        checkDonacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDonacionActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(checkDonacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        lblEspecie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEspecie.setText("Especie");
        panelCrearUsuario.add(lblEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        boxCantidadMascotas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxCantidadMascotas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        boxCantidadMascotas.setEnabled(false);
        panelCrearUsuario.add(boxCantidadMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 110, -1));

        fieldNickname.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldNickname.setToolTipText("");
        panelCrearUsuario.add(fieldNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 204, -1));

        lblNickname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNickname.setText("Nickname");
        panelCrearUsuario.add(lblNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        fieldPassword.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 210, -1));

        lblTituloUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloUsuario.setText("Crear Usuario");
        panelCrearUsuario.add(lblTituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        lblTituloAdoptar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloAdoptar.setText("Ser Adoptante");
        panelCrearUsuario.add(lblTituloAdoptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        lblTituloCasaCuna.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloCasaCuna.setText("Ser Casa Cuna");
        panelCrearUsuario.add(lblTituloCasaCuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDonacionActionPerformed

    }//GEN-LAST:event_checkDonacionActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        boolean seCreoUsuario = ControladorSesion.getInstance().agregarUsuario(fieldNickname.getText(), fieldPassword.getText(),
                Usuario, fieldNombre.getText(), fieldApellido1.getText(), fieldApellido2.getText(), fieldTelefono.getText(), 
                fieldEmail.getText(), field_ID.getText() , checkAdoptante.isSelected(), fieldUbicacion.getText(), false);
        if(seCreoUsuario)
        {
            JOptionPane.showMessageDialog(null, "Usuario agregado con éxito");
            ControladorSesion.getInstance().setearDatosAdoptante(checkAdoptante.isSelected(), fieldTipoResidencia.getText(),
                                                                 fieldUbicacion.getText());
            ControladorSesion.getInstance().setearDatosCasaCuna(checkCasaCuna.isSelected(), boxEspecie.getSelectedItem().toString(),
                                                                Integer.parseInt(boxCantidadMascotas.getSelectedItem().toString()),
                                                                boxTamaño.getSelectedItem().toString(), checkDonacion.isSelected());
            btnCerrarActionPerformed(evt);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El número de cédula o nickname ya existen");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
    checkAdoptante.setSelected(false);
    checkCasaCuna.setSelected(false);
    checkDonacion.setSelected(false);
    fieldApellido1.setText("");
    fieldApellido2.setText("");
    fieldEmail.setText("");
    fieldNickname.setText("");
    fieldNombre.setText("");
    fieldPassword.setText("");
    fieldTelefono.setText("");
    fieldTipoResidencia.setText("");
    fieldUbicacion.setText("");
    field_ID.setText("");
    this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void checkCasaCunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCasaCunaActionPerformed
        if(checkCasaCuna.isSelected())
        {
            boxCantidadMascotas.setEnabled(true);
            boxEspecie.setEnabled(true);
            boxTamaño.setEnabled(true);
            activarDonacion();
        }
        else
        {
            boxCantidadMascotas.setEnabled(false);
            boxEspecie.setEnabled(false);
            boxTamaño.setEnabled(false);
            activarDonacion();
        }
    }//GEN-LAST:event_checkCasaCunaActionPerformed

    private void checkAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAdoptanteActionPerformed
        if(checkAdoptante.isSelected())
        {
            fieldTipoResidencia.setEnabled(true);
            fieldUbicacion.setEnabled(true);
            activarDonacion();
        }
        else
        {
            fieldTipoResidencia.setEnabled(false);
            fieldUbicacion.setEnabled(false);
            activarDonacion();
        }
    }//GEN-LAST:event_checkAdoptanteActionPerformed

    private void fieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPasswordActionPerformed

    private void boxEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEspecieActionPerformed

    private void fieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTelefonoKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese Solo Numeros en este espacio");
        }
    }//GEN-LAST:event_fieldTelefonoKeyTyped

    private void field_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_IDKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese Solo Numeros en este espacio");
        }
    }//GEN-LAST:event_field_IDKeyTyped


    private void activarDonacion()
    {
        if(checkCasaCuna.isSelected())
        {
            checkDonacion.setEnabled(true);
        }
        else
        {
            checkDonacion.setEnabled(false);
            checkDonacion.setSelected(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxCantidadMascotas;
    private javax.swing.JComboBox boxEspecie;
    private javax.swing.JComboBox boxTamaño;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JCheckBox checkAdoptante;
    private javax.swing.JCheckBox checkCasaCuna;
    private javax.swing.JCheckBox checkDonacion;
    private javax.swing.JTextField fieldApellido1;
    private javax.swing.JTextField fieldApellido2;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNickname;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JTextField fieldTipoResidencia;
    private javax.swing.JTextField fieldUbicacion;
    private javax.swing.JTextField field_ID;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblCantidadMascotas;
    private javax.swing.JLabel lblCuna;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTamano1;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoResidencia;
    private javax.swing.JLabel lblTituloAdoptar;
    private javax.swing.JLabel lblTituloCasaCuna;
    private javax.swing.JLabel lblTituloUsuario;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblimagenAdoptante;
    private javax.swing.JLabel lblimagenUsuario;
    private javax.swing.JPanel panelCrearUsuario;
    // End of variables declaration//GEN-END:variables
}
