
package GUI;

import javax.swing.JOptionPane;


public class VentanaBuscarPersona extends javax.swing.JInternalFrame {
    
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String email;
    private static VentanaBuscarPersona miVentanaBuscarPersona;
    
    /**
     * Creates new form ventanaBuscarMascota
     */
    private VentanaBuscarPersona() {
        initComponents();
    }
    
    public static VentanaBuscarPersona getInstance()
    {
        if(miVentanaBuscarPersona == null)
        {
            miVentanaBuscarPersona = new VentanaBuscarPersona();
        }
        return miVentanaBuscarPersona;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldEmail = new javax.swing.JTextField();
        jFrame1 = new javax.swing.JFrame();
        panelVentanaBuscar = new javax.swing.JPanel();
        lblTituloVentana = new javax.swing.JLabel();
        lblImagenBuscar = new javax.swing.JLabel();
        lblImagenMascota = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        lblNombreMascota = new javax.swing.JLabel();
        lblEspecia = new javax.swing.JLabel();
        lblOjos = new javax.swing.JLabel();
        fieldIDPersona = new javax.swing.JTextField();
        lblidChip = new javax.swing.JLabel();
        fieldNombrePersona = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        fieldApellido1 = new javax.swing.JTextField();
        fieldApellido2 = new javax.swing.JTextField();
        lblTitulo2Ventana = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscarMascota = new javax.swing.JTable();
        btnReportarEncontrada = new javax.swing.JButton();
        lblOjos1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        fieldEmail.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setIconifiable(true);
        setTitle("Buscar Persona - Estimação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N

        panelVentanaBuscar.setBackground(new java.awt.Color(190, 160, 100));
        panelVentanaBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloVentana.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloVentana.setText("Buscar Persona");
        panelVentanaBuscar.add(lblTituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lblImagenBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, 30));

        lblImagenMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        lblCaracteristicas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCaracteristicas.setText("Datos Personales");
        panelVentanaBuscar.add(lblCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lblNombreMascota.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombreMascota.setText("Nombre");
        panelVentanaBuscar.add(lblNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        lblEspecia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEspecia.setText("2do Apellido");
        panelVentanaBuscar.add(lblEspecia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        lblOjos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblOjos.setText("Email");
        panelVentanaBuscar.add(lblOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        fieldIDPersona.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldIDPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIDPersonaActionPerformed(evt);
            }
        });
        fieldIDPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldIDPersonaKeyTyped(evt);
            }
        });
        panelVentanaBuscar.add(fieldIDPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 130, -1));

        lblidChip.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblidChip.setText("1er Apellido");
        panelVentanaBuscar.add(lblidChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        fieldNombrePersona.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldNombrePersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombrePersonaActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(fieldNombrePersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 130, -1));

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(170, 80, 0));
        btnCancelar.setText("Limpiar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 90, 40));

        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(170, 80, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, 40));

        fieldApellido1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelVentanaBuscar.add(fieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, -1));

        fieldApellido2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelVentanaBuscar.add(fieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, -1));

        lblTitulo2Ventana.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTitulo2Ventana.setText("Personas Encontradas");
        panelVentanaBuscar.add(lblTitulo2Ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        tablaBuscarMascota.setBackground(new java.awt.Color(190, 160, 100));
        tablaBuscarMascota.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        tablaBuscarMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "1er Apellido", "2do Apellido", "Cédula", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        }

        panelVentanaBuscar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 550, 280));

        btnReportarEncontrada.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnReportarEncontrada.setForeground(new java.awt.Color(170, 80, 0));
        btnReportarEncontrada.setText("Reportar Persona Encontrada");
        btnReportarEncontrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportarEncontradaMouseClicked(evt);
            }
        });
        btnReportarEncontrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportarEncontradaActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnReportarEncontrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 210, 40));

        lblOjos1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblOjos1.setText("Cédula");
        panelVentanaBuscar.add(lblOjos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, -1));

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(170, 80, 0));
        jButton2.setText("Limpiar Tabla");
        panelVentanaBuscar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportarEncontradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportarEncontradaActionPerformed
        VentanaReportarPersona.getInstance().setVisible(true);
    }//GEN-LAST:event_btnReportarEncontradaActionPerformed

    private void btnReportarEncontradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportarEncontradaMouseClicked

    }//GEN-LAST:event_btnReportarEncontradaMouseClicked

    private void tablaBuscarMascotaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tablaBuscarMascotaMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaBuscarMascotaMouseWheelMoved

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void fieldIDPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIDPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIDPersonaActionPerformed

    private void fieldNombrePersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombrePersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombrePersonaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        nombre = fieldNombrePersona.getText();
        primerApellido = fieldApellido1.getText();
        segundoApellido = fieldApellido2.getText();
        cedula = fieldIDPersona.getText();
        email = fieldEmail.getText();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        fieldNombrePersona.setText("");
        fieldApellido1.setText("");
        fieldApellido2.setText("");
        fieldIDPersona.setText("");
        fieldEmail.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void fieldIDPersonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIDPersonaKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese Solo Numeros en este espacio");
        }
    }//GEN-LAST:event_fieldIDPersonaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReportarEncontrada;
    private javax.swing.JTextField fieldApellido1;
    private javax.swing.JTextField fieldApellido2;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldIDPersona;
    private javax.swing.JTextField fieldNombrePersona;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblEspecia;
    private javax.swing.JLabel lblImagenBuscar;
    private javax.swing.JLabel lblImagenMascota;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblOjos;
    private javax.swing.JLabel lblOjos1;
    private javax.swing.JLabel lblTitulo2Ventana;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JLabel lblidChip;
    private javax.swing.JPanel panelVentanaBuscar;
    private javax.swing.JTable tablaBuscarMascota;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(javax.swing.JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public javax.swing.JButton getBtnReportarEncontrada() {
        return btnReportarEncontrada;
    }

    public void setBtnReportarEncontrada(javax.swing.JButton btnReportarEncontrada) {
        this.btnReportarEncontrada = btnReportarEncontrada;
    }

    public javax.swing.JTextField getFieldApellido1() {
        return fieldApellido1;
    }

    public void setFieldApellido1(javax.swing.JTextField fieldApellido1) {
        this.fieldApellido1 = fieldApellido1;
    }

    public javax.swing.JTextField getFieldApellido2() {
        return fieldApellido2;
    }

    public void setFieldApellido2(javax.swing.JTextField fieldApellido2) {
        this.fieldApellido2 = fieldApellido2;
    }

    public javax.swing.JTextField getFieldEmail() {
        return fieldEmail;
    }

    public void setFieldEmail(javax.swing.JTextField fieldEmail) {
        this.fieldEmail = fieldEmail;
    }

    public javax.swing.JTextField getFieldIDPersona() {
        return fieldIDPersona;
    }

    public void setFieldIDPersona(javax.swing.JTextField fieldIDPersona) {
        this.fieldIDPersona = fieldIDPersona;
    }

    public javax.swing.JTextField getFieldNombrePersona() {
        return fieldNombrePersona;
    }

    public void setFieldNombrePersona(javax.swing.JTextField fieldNombrePersona) {
        this.fieldNombrePersona = fieldNombrePersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
