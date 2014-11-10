/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controladores.ControladorReportes;
import Estructuras.stringNumerico;
import Interfaces.IConstantes;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Samantha
 */
public class VentanaReportarMascota extends javax.swing.JInternalFrame implements  IConstantes{

    private static VentanaReportarMascota miVentanaReportarMascota;
    /**
     * Creates new form ventanaBuscarMascota
     */
    private VentanaReportarMascota() {
        initComponents();
        boxEspecie.setModel(new DefaultComboBoxModel(Especies));
    }
    
    public static VentanaReportarMascota getInstance()
    {
        if(miVentanaReportarMascota == null)
        {
            miVentanaReportarMascota = new VentanaReportarMascota();
        }
        return miVentanaReportarMascota;
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
        lblCaracteristicasLugar = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        lbidReportante = new javax.swing.JLabel();
        fieldIdChip = new javax.swing.JTextField();
        lblEspecia = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblTamano = new javax.swing.JLabel();
        boxTamaño = new javax.swing.JComboBox();
        boxEspecie = new javax.swing.JComboBox();
        boxRaza = new javax.swing.JComboBox();
        lblOjos = new javax.swing.JLabel();
        fieldOjos = new javax.swing.JTextField();
        lblPelaje = new javax.swing.JLabel();
        fieldPelaje = new javax.swing.JTextField();
        lblidChip = new javax.swing.JLabel();
        fieldNombreReportante = new javax.swing.JTextField();
        lblUbicacion = new javax.swing.JLabel();
        fieldUbicacion = new javax.swing.JTextField();
        lblEjemplodireccion = new javax.swing.JLabel();
        lblNotas = new javax.swing.JLabel();
        fieldNotas = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblNombreMascota = new javax.swing.JLabel();
        fieldNombreMascota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscarFecha = new com.toedter.calendar.JDateChooser();
        boxTamaño1 = new javax.swing.JComboBox();
        lblTamano1 = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Reportar Mascota - Estimação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N

        panelVentanaBuscar.setBackground(new java.awt.Color(190, 160, 100));
        panelVentanaBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloVentana.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloVentana.setText("Reportar Mascota");
        panelVentanaBuscar.add(lblTituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        lblImagenBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alerta.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        lblImagenMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/adoptar.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        lblCaracteristicasLugar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCaracteristicasLugar.setText("Características del lugar");
        panelVentanaBuscar.add(lblCaracteristicasLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        lblCaracteristicas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCaracteristicas.setText("Características de la Mascota");
        panelVentanaBuscar.add(lblCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lbidReportante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbidReportante.setText("Cédula del Reportante");
        panelVentanaBuscar.add(lbidReportante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        fieldIdChip.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldIdChip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldIdChipKeyTyped(evt);
            }
        });
        panelVentanaBuscar.add(fieldIdChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 130, -1));

        lblEspecia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEspecia.setText("Especie");
        panelVentanaBuscar.add(lblEspecia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblRaza.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblRaza.setText("Raza");
        panelVentanaBuscar.add(lblRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        lblTamano.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTamano.setText("Estado");
        panelVentanaBuscar.add(lblTamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        boxTamaño.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxTamaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perdido", "Encontrado" }));
        panelVentanaBuscar.add(boxTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 130, -1));

        boxEspecie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEspecieActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(boxEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, -1));

        boxRaza.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRazaActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(boxRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 130, -1));

        lblOjos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblOjos.setText("Color de Ojos");
        panelVentanaBuscar.add(lblOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        fieldOjos.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelVentanaBuscar.add(fieldOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 100, -1));

        lblPelaje.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblPelaje.setText("Color de Pelaje");
        panelVentanaBuscar.add(lblPelaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        fieldPelaje.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelVentanaBuscar.add(fieldPelaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 100, -1));

        lblidChip.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblidChip.setText("Chip");
        panelVentanaBuscar.add(lblidChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        fieldNombreReportante.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelVentanaBuscar.add(fieldNombreReportante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 240, -1));

        lblUbicacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblUbicacion.setText("Ubicación donde se encontró la mascota");
        panelVentanaBuscar.add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        fieldUbicacion.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        fieldUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUbicacionActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(fieldUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 200, -1));

        lblEjemplodireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEjemplodireccion.setText("(Distrito, Cantón o Barrio)");
        panelVentanaBuscar.add(lblEjemplodireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 160, -1));

        lblNotas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNotas.setText("Notas");
        panelVentanaBuscar.add(lblNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        fieldNotas.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelVentanaBuscar.add(fieldNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 240, 60));

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(170, 80, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 90, 40));

        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(170, 80, 0));
        btnBuscar.setText("Reportar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 90, 40));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblFecha.setText("Fecha de encontrado o perdido");
        panelVentanaBuscar.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 200, -1));

        lblNombreMascota.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombreMascota.setText("Nombre");
        panelVentanaBuscar.add(lblNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        fieldNombreMascota.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelVentanaBuscar.add(fieldNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Subir Foto de la mascota");
        panelVentanaBuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscarImagen.png"))); // NOI18N
        panelVentanaBuscar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        buscarFecha.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelVentanaBuscar.add(buscarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 340, 120, -1));

        boxTamaño1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxTamaño1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pequeño", "Mediano", "Grande", "Gigante" }));
        panelVentanaBuscar.add(boxTamaño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 130, -1));

        lblTamano1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTamano1.setText("Tamaño");
        panelVentanaBuscar.add(lblTamano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUbicacionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(fieldIdChip.getText().isEmpty() || fieldNombreMascota.getText().isEmpty() ||
           fieldNombreReportante.getText().isEmpty() || fieldNotas.getText().isEmpty() ||
           fieldOjos.getText().isEmpty() || fieldPelaje.getText().isEmpty() ||
           fieldUbicacion.getText().isEmpty() || boxEspecie.getSelectedIndex() == -1   ||
           boxRaza.getSelectedIndex() == -1 || boxTamaño.getSelectedIndex() == -1 ||
           boxTamaño1.getSelectedIndex() == -1 )
        {
           JOptionPane.showMessageDialog(null, "Debe llenar todos los campos \n"+
                                         "Si no conoce el dato ingrese '--' \n"+
                                         "El espacio para el chip debe tener 00 si la mascota no tiene chip" ); 
        }
        else
        {
            ControladorReportes.getInstance().reportarMascota(fieldNombreMascota.getText(),
            boxRaza.getSelectedItem().toString(), boxEspecie.getSelectedItem().toString(), boxTamaño1.getSelectedItem().toString(),
            fieldPelaje.getText(), fieldOjos.getText(),fieldUbicacion.getText(), boxTamaño.getSelectedItem().toString(),
            fieldNotas.getText(), " ", Integer.parseInt(fieldIdChip.getText()), false, buscarFecha.getCalendar());

            JOptionPane.showMessageDialog(null, "Reporte realizado con éxito");
            btnCancelarActionPerformed(evt);

//        if(stringNumerico.isNumeric(fieldIdChip.getText()))
//        {
//        ControladorReportes.getInstance().reportarMascota(fieldNombreMascota.getText(),
//        boxRaza.getSelectedItem().toString(), boxEspecie.getSelectedItem().toString(), boxTamaño1.getSelectedItem().toString(),
//        fieldPelaje.getText(), fieldOjos.getText(),fieldUbicacion.getText(), boxTamaño.getSelectedItem().toString(),
//        fieldNotas.getText(), " ", Integer.parseInt(fieldIdChip.getText()), false, buscarFecha.getCalendar());
//        JOptionPane.showMessageDialog(null, "Reporte realizado con éxito");
//        btnCancelarActionPerformed(evt);
//        }else
//        {
//        JOptionPane.showMessageDialog(null, "El espacio para el chip debe tener 00 si la mascota no tiene chip"); 
//
//        }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fieldIdChip.setText("");
        fieldNombreMascota.setText("");
        fieldNombreReportante.setText("");
        fieldNotas.setText("");
        fieldOjos.setText("");
        fieldPelaje.setText("");
        fieldUbicacion.setText("");
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void boxEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEspecieActionPerformed
        boxRaza.setModel(new DefaultComboBoxModel(Razas[boxEspecie.getSelectedIndex()]));
    }//GEN-LAST:event_boxEspecieActionPerformed

    private void boxRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRazaActionPerformed

    private void fieldIdChipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIdChipKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese Solo Numeros en este espacio");
        }
    }//GEN-LAST:event_fieldIdChipKeyTyped


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxEspecie;
    private javax.swing.JComboBox boxRaza;
    private javax.swing.JComboBox boxTamaño;
    private javax.swing.JComboBox boxTamaño1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private com.toedter.calendar.JDateChooser buscarFecha;
    private javax.swing.JTextField fieldIdChip;
    private javax.swing.JTextField fieldNombreMascota;
    private javax.swing.JTextField fieldNombreReportante;
    private javax.swing.JTextField fieldNotas;
    private javax.swing.JTextField fieldOjos;
    private javax.swing.JTextField fieldPelaje;
    private javax.swing.JTextField fieldUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbidReportante;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblCaracteristicasLugar;
    private javax.swing.JLabel lblEjemplodireccion;
    private javax.swing.JLabel lblEspecia;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblImagenBuscar;
    private javax.swing.JLabel lblImagenMascota;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblOjos;
    private javax.swing.JLabel lblPelaje;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTamano;
    private javax.swing.JLabel lblTamano1;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblidChip;
    private javax.swing.JPanel panelVentanaBuscar;
    // End of variables declaration//GEN-END:variables
}
