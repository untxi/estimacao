/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Administradores.AdministradorAplicacion;
import javax.swing.JOptionPane;
import Controladores.ControladorDonaciones;
import static Interfaces.IConstantes.AdministradorMaster;
import static Interfaces.IConstantes.Especies;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samantha
 */
public class VentanaAdministrarDonaciones extends javax.swing.JInternalFrame{
    private static VentanaAdministrarDonaciones miVentanaDonar;
    
    
    private VentanaAdministrarDonaciones() {
        initComponents();
    }
    
    public static VentanaAdministrarDonaciones getInstance(){
        if(miVentanaDonar == null)
        {
            miVentanaDonar = new VentanaAdministrarDonaciones();
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
        btnCerrar = new javax.swing.JButton();
        btnEntregarDonaciones = new javax.swing.JButton();
        btnVerDonaciones = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDonaciones = new javax.swing.JTable();

        setIconifiable(true);
        setTitle("Administrar Donaciones - Estimação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(190, 160, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTítulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/donar.png"))); // NOI18N
        lblTítulo.setText("Admistrar Donaciones Recibidas");
        jPanel1.add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnCerrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(170, 80, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 40));

        btnEntregarDonaciones.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnEntregarDonaciones.setForeground(new java.awt.Color(170, 80, 0));
        btnEntregarDonaciones.setText("Entregar Donación");
        btnEntregarDonaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarDonacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntregarDonaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        btnVerDonaciones.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnVerDonaciones.setForeground(new java.awt.Color(170, 80, 0));
        btnVerDonaciones.setText("Ver Donaciones");
        btnVerDonaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDonacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerDonaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 40));

        tablaDonaciones.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        tablaDonaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Cédula Donador", "Cantidad", "Entregar a"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDonaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVerDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDonacionesActionPerformed
        JComboBox prueba = new JComboBox();
        prueba.setModel(new DefaultComboBoxModel(AdministradorAplicacion.getInstance().demeUsuariosQueAceptanDonacion()));
        tablaDonaciones.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(prueba));
        for(int i = 0; i < tablaDonaciones.getRowCount();i++)
        {
            ((DefaultTableModel)tablaDonaciones.getModel()).removeRow(i);   
        }
        for(int i = 0; i < Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().size();i++)
        {
            ((DefaultTableModel)tablaDonaciones.getModel()).addRow(new Object[3]);
            
            tablaDonaciones.setValueAt(Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().get(i).getFechaRecibido().toString(), i, 0);
            tablaDonaciones.setValueAt(Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().get(i).getIdDonante(), i, 1);
            tablaDonaciones.setValueAt(Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().get(i).getMonto(), i, 2);
            //tablaDonaciones.setValueAt(prueba, i, 3);
        }
    }//GEN-LAST:event_btnVerDonacionesActionPerformed

    private void btnEntregarDonaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarDonaciones1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntregarDonaciones1ActionPerformed

    private void btnInformeDonacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformeDonacionesMouseClicked
        // TODO add your handling code here:
        //int totalDonacion = ControladorDonaciones.getInstance().informeDonaciones();
        //JOptionPane.showMessageDialog(null, "Monto Total de Donaciones:" + totalDonacion);
    }//GEN-LAST:event_btnInformeDonacionesMouseClicked

    private void btnEntregarDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarDonacionesActionPerformed
        for(int i = 0;i < tablaDonaciones.getRowCount();i++)
        {
            if(!tablaDonaciones.getValueAt(i, 3).toString().isEmpty())
            {
                System.out.println(tablaDonaciones.getValueAt(i, 3).toString());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntregarDonacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEntregarDonaciones;
    private javax.swing.JButton btnVerDonaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTable tablaDonaciones;
    // End of variables declaration//GEN-END:variables
}
