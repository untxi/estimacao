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
public class VentanaBuscarCasaCuna extends javax.swing.JInternalFrame {

    /**
     * Creates new form ventanaCrearUsuario
     */
    public VentanaBuscarCasaCuna() {
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
        lblTitulo = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        lblApellido2 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        fieldNombre = new javax.swing.JTextField();
        fieldApellido2 = new javax.swing.JTextField();
        fieldApellido1 = new javax.swing.JTextField();
        field_ID = new javax.swing.JTextField();
        lblimagenAdoptante = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblCantidadMascotas = new javax.swing.JLabel();
        boxEspecie = new javax.swing.JComboBox();
        boxTamaño = new javax.swing.JComboBox();
        lblTamano1 = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        boxCantidadMascotas = new javax.swing.JComboBox();
        lblNombre1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscarMascota = new javax.swing.JTable();
        lblTitulo2Ventana = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Buscar Casa Cuna - Estimação");

        panelCrearUsuario.setBackground(new java.awt.Color(190, 160, 100));
        panelCrearUsuario.setToolTipText("");
        panelCrearUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo.setText("Datos del Colaborador");
        panelCrearUsuario.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        lblApellido1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblApellido1.setText("Primer      Apellido");
        panelCrearUsuario.add(lblApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblApellido2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblApellido2.setText("Segundo Apellido");
        panelCrearUsuario.add(lblApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblid.setText("ID ");
        panelCrearUsuario.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(170, 80, 0));
        btnBuscar.setText("Buscar");
        panelCrearUsuario.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 50));

        fieldNombre.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldNombre.setToolTipText("");
        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 204, -1));

        fieldApellido2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldApellido2.setToolTipText("");
        panelCrearUsuario.add(fieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 204, -1));

        fieldApellido1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldApellido1.setToolTipText("");
        panelCrearUsuario.add(fieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 204, -1));

        field_ID.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        field_ID.setToolTipText("");
        field_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_IDActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(field_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 204, -1));

        lblimagenAdoptante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        panelCrearUsuario.add(lblimagenAdoptante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(170, 80, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(63, 23));
        btnCancelar.setMinimumSize(new java.awt.Dimension(63, 23));
        btnCancelar.setPreferredSize(new java.awt.Dimension(63, 23));
        panelCrearUsuario.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 100, 50));

        lblCantidadMascotas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCantidadMascotas.setText("Cantidad de Mascotas");
        panelCrearUsuario.add(lblCantidadMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        boxEspecie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perro", "Gato", "Pájaro", "Tortuga", "Roedor Pequeño", "Conejo" }));
        panelCrearUsuario.add(boxEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, -1));

        boxTamaño.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxTamaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menor a 20cm", "De 20cm a 50cm", "De 50cm a 80cm", "Mayor a 1m" }));
        panelCrearUsuario.add(boxTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 110, -1));

        lblTamano1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTamano1.setText("Tamaño");
        panelCrearUsuario.add(lblTamano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lblEspecie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEspecie.setText("Especie");
        panelCrearUsuario.add(lblEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        boxCantidadMascotas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxCantidadMascotas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        panelCrearUsuario.add(boxCantidadMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 40, -1));

        lblNombre1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombre1.setText("Nombre");
        panelCrearUsuario.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        tablaBuscarMascota.setBackground(new java.awt.Color(190, 160, 100));
        tablaBuscarMascota.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        tablaBuscarMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "1er Apellido", "2do Apellido", "ID", "Especie", "Mascotas", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBuscarMascota.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tablaBuscarMascotaMouseWheelMoved(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBuscarMascota);
        if (tablaBuscarMascota.getColumnModel().getColumnCount() > 0) {
            tablaBuscarMascota.getColumnModel().getColumn(0).setResizable(false);
            tablaBuscarMascota.getColumnModel().getColumn(1).setResizable(false);
            tablaBuscarMascota.getColumnModel().getColumn(2).setResizable(false);
            tablaBuscarMascota.getColumnModel().getColumn(3).setResizable(false);
            tablaBuscarMascota.getColumnModel().getColumn(4).setResizable(false);
            tablaBuscarMascota.getColumnModel().getColumn(5).setResizable(false);
            tablaBuscarMascota.getColumnModel().getColumn(5).setPreferredWidth(100);
            tablaBuscarMascota.getColumnModel().getColumn(6).setResizable(false);
        }

        panelCrearUsuario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 550, 280));

        lblTitulo2Ventana.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTitulo2Ventana.setText("CasasCuna Encontradas");
        panelCrearUsuario.add(lblTitulo2Ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void field_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_IDActionPerformed

    private void tablaBuscarMascotaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tablaBuscarMascotaMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaBuscarMascotaMouseWheelMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxCantidadMascotas;
    private javax.swing.JComboBox boxEspecie;
    private javax.swing.JComboBox boxTamaño;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField fieldApellido1;
    private javax.swing.JTextField fieldApellido2;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField field_ID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblCantidadMascotas;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblTamano1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2Ventana;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblimagenAdoptante;
    private javax.swing.JPanel panelCrearUsuario;
    private javax.swing.JTable tablaBuscarMascota;
    // End of variables declaration//GEN-END:variables
}
