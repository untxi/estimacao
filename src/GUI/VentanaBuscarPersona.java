
package GUI;

import Controladores.ControladorConsultas;
import Estructuras.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class VentanaBuscarPersona extends javax.swing.JInternalFrame {
    
    ControladorConsultas miConsulta;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String email;
    private static VentanaBuscarPersona miVentanaBuscarPersona;
    
    /**
     * Creates new form ventanaBuscarMascota
     */
    public VentanaBuscarPersona() {
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
    public void llenarTablaPersonas(ArrayList<Usuario> lista)
    {
        int i = 0;
        for(Usuario persona : lista){
            tablaUsuario.setValueAt(persona.getNombre(), i, 0);
            tablaUsuario.setValueAt(persona.getPrimerApellido(), i, 1);
            tablaUsuario.setValueAt(persona.getSegundoApellido(), i, 2);
            tablaUsuario.setValueAt(persona.getCedula(), i, 3);
            tablaUsuario.setValueAt(persona.getEmail(), i, 4);
            i++;
        }
    }
    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++){
            for(int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }
    

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
        lblApellido2 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        fieldIDPersona = new javax.swing.JTextField();
        lblApellido1 = new javax.swing.JLabel();
        fieldNombrePersona = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        fieldApellido1 = new javax.swing.JTextField();
        fieldApellido2 = new javax.swing.JTextField();
        lblTitulo2Ventana = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        btnReportarEncontrada = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        fieldCorreo = new javax.swing.JTextField();
        limpiarTable = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

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

        lblApellido2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblApellido2.setText("2do Apellido");
        panelVentanaBuscar.add(lblApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEmail.setText("Email");
        panelVentanaBuscar.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

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

        lblApellido1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblApellido1.setText("1er Apellido");
        panelVentanaBuscar.add(lblApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        fieldNombrePersona.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldNombrePersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombrePersonaActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(fieldNombrePersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 130, -1));

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(170, 80, 0));
        btnCancelar.setText("Cerrar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 90, 40));

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

        tablaUsuario.setBackground(new java.awt.Color(190, 160, 100));
        tablaUsuario.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaUsuario.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tablaUsuarioMouseWheelMoved(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuario);
        if (tablaUsuario.getColumnModel().getColumnCount() > 0) {
            tablaUsuario.getColumnModel().getColumn(0).setResizable(false);
            tablaUsuario.getColumnModel().getColumn(1).setResizable(false);
            tablaUsuario.getColumnModel().getColumn(2).setResizable(false);
            tablaUsuario.getColumnModel().getColumn(3).setResizable(false);
            tablaUsuario.getColumnModel().getColumn(4).setResizable(false);
        }

        panelVentanaBuscar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 550, 280));

        btnReportarEncontrada.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
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

        lblCedula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCedula.setText("Cédula");
        panelVentanaBuscar.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        fieldCorreo.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCorreoActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(fieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, -1));

        limpiarTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        limpiarTable.setForeground(new java.awt.Color(170, 80, 0));
        limpiarTable.setText("Limpiar Tabla");
        limpiarTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarTableActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(limpiarTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(170, 80, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 90, 40));

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

    private void tablaUsuarioMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaUsuarioMouseWheelMoved

    private void fieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCorreoActionPerformed

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
        email = fieldCorreo.getText();
        //llenarTablaPersonas(Administradores.AdministradorAplicacion.getInstance().getMiListaUsuarios());
        llenarTablaPersonas(Controladores.ControladorConsultas.getInstance().matchPersona(nombre, primerApellido, segundoApellido, cedula, email));
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        fieldNombrePersona.setText("");
        fieldApellido1.setText("");
        fieldApellido2.setText("");
        fieldIDPersona.setText("");
        fieldCorreo.setText("");
        clearTable(tablaUsuario);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void fieldIDPersonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIDPersonaKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese Solo Numeros en este espacio");
        }
    }//GEN-LAST:event_fieldIDPersonaKeyTyped

    private void limpiarTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarTableActionPerformed
        clearTable(tablaUsuario);
    }//GEN-LAST:event_limpiarTableActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReportarEncontrada;
    private javax.swing.JTextField fieldApellido1;
    private javax.swing.JTextField fieldApellido2;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldIDPersona;
    private javax.swing.JTextField fieldNombrePersona;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblImagenBuscar;
    private javax.swing.JLabel lblImagenMascota;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblTitulo2Ventana;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JButton limpiarTable;
    private javax.swing.JPanel panelVentanaBuscar;
    private javax.swing.JTable tablaUsuario;
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
