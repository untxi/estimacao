/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Interfaces.IConstantes;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samantha
 */
public class VentanaAsignarAdministradores extends javax.swing.JInternalFrame implements IConstantes
{
    
    private static VentanaAsignarAdministradores miVentanaAsignarAdministradores;

    /**
     * Creates new form ventanaAsignarAdministradores
     */
    private VentanaAsignarAdministradores() {
        initComponents();
    }
    public static VentanaAsignarAdministradores getInstance()
    {
        if(miVentanaAsignarAdministradores == null)
        {
            miVentanaAsignarAdministradores = new VentanaAsignarAdministradores();
        }
        return miVentanaAsignarAdministradores;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVentanaAsignarAdministradores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        lblTituloAsignarAdministradores = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("Asignar Administradores - Estimação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N

        panelVentanaAsignarAdministradores.setBackground(new java.awt.Color(190, 160, 100));
        panelVentanaAsignarAdministradores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPersonas.setBackground(new java.awt.Color(190, 160, 100));
        tablaPersonas.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Persona", "Administrador", "Administrador Máster"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaPersonas.setGridColor(new java.awt.Color(0, 0, 0));
        tablaPersonas.setName(""); // NOI18N
        tablaPersonas.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tablaPersonasMouseWheelMoved(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        panelVentanaAsignarAdministradores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 580, 200));

        lblTituloAsignarAdministradores.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloAsignarAdministradores.setText("Asignar Administradores");
        panelVentanaAsignarAdministradores.add(lblTituloAsignarAdministradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/reporte.png"))); // NOI18N
        panelVentanaAsignarAdministradores.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));

        btnCerrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(170, 80, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelVentanaAsignarAdministradores.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 80, 40));

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(170, 80, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelVentanaAsignarAdministradores.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaAsignarAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaAsignarAdministradores, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPersonasMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tablaPersonasMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaPersonasMouseWheelMoved

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
        limpiarTabla();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        for(int i = 0; i < Administradores.AdministradorAplicacion.getInstance().getMiListaUsuarios().size();i++)
        {
            if((Boolean)tablaPersonas.getValueAt(i, 1))
            {
                Administradores.AdministradorAplicacion.getInstance().getMiListaUsuarios().get(i).setTipo(Administrador);
            }
            if((Boolean)tablaPersonas.getValueAt(i, 2))
            {
                Administradores.AdministradorAplicacion.getInstance().getMiListaUsuarios().get(i).setTipo(AdministradorMaster);
            }
        }
        setVisible(false);
        limpiarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void llenarTabla()
    {
        for(int i = 0; i < Administradores.AdministradorAplicacion.getInstance().getMiListaUsuarios().size();i++)
        {
            ((DefaultTableModel)tablaPersonas.getModel()).addRow(new Object[3]);
            tablaPersonas.setValueAt(Administradores.AdministradorAplicacion.getInstance().getMiListaUsuarios().get(i).getNombre(), i, 0);
            if(Administradores.AdministradorAplicacion.getInstance().getMiListaUsuarios().get(i).getTipo() == AdministradorMaster)
            {
                tablaPersonas.setValueAt(false, i, 1);
                tablaPersonas.setValueAt(true, i, 2);
            }
            else
            {
                tablaPersonas.setValueAt(true, i, 1);
                tablaPersonas.setValueAt(false, i, 2);
            }
        }
    }
    
    private void limpiarTabla()
    {
        for(int i = 0; i < tablaPersonas.getRowCount();i++)
        {
            ((DefaultTableModel)tablaPersonas.getModel()).removeRow(i);   
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloAsignarAdministradores;
    private javax.swing.JPanel panelVentanaAsignarAdministradores;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
