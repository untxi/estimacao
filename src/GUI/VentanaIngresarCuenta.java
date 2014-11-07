/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controladores.ControladorSesion;
import javax.swing.JOptionPane;

/**
 *
 * @author Samantha
 */
public class VentanaIngresarCuenta extends javax.swing.JInternalFrame {

    private static VentanaIngresarCuenta miVentanaIngresarCuenta;
    /**
     * Creates new form ventanaIngresarCuenta
     */
    private VentanaIngresarCuenta() 
    {
        initComponents();
    }
    
    public static VentanaIngresarCuenta getInstance()
    {
        if(miVentanaIngresarCuenta == null)
        {
            miVentanaIngresarCuenta = new VentanaIngresarCuenta();
        }
        return miVentanaIngresarCuenta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngresarUsuario = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblingreseID = new javax.swing.JLabel();
        lblingresePassword = new javax.swing.JLabel();
        fieldID = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JPasswordField();
        lblimagenUsuario = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Ingresar - Estimação");

        panelIngresarUsuario.setBackground(new java.awt.Color(190, 160, 100));
        panelIngresarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(170, 80, 0));
        btnIngresar.setText("Ingresar");
        btnIngresar.setToolTipText("");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panelIngresarUsuario.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(170, 80, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelIngresarUsuario.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        lblingreseID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblingreseID.setText("Usuario");
        panelIngresarUsuario.add(lblingreseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        lblingresePassword.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblingresePassword.setText("Contraseña");
        panelIngresarUsuario.add(lblingresePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        fieldID.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelIngresarUsuario.add(fieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 100, -1));
        panelIngresarUsuario.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 100, -1));

        lblimagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        panelIngresarUsuario.add(lblimagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIngresarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIngresarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        setVisible(false);
        fieldID.setText("");
        fieldPassword.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        boolean esUsuario = ControladorSesion.getInstance().ingresarCuenta(fieldID.getText(), fieldPassword.getText());
        if(esUsuario)
        {
            JOptionPane.showMessageDialog(null, "Bienvenido");
            VentanaPrincipal.getInstance().desbloquearPantalla();
            setVisible(false);
            btnCancelarActionPerformed(evt);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El nombre de usuario o contraseña es incorrecto");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JTextField fieldID;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JLabel lblimagenUsuario;
    private javax.swing.JLabel lblingreseID;
    private javax.swing.JLabel lblingresePassword;
    private javax.swing.JPanel panelIngresarUsuario;
    // End of variables declaration//GEN-END:variables
}
