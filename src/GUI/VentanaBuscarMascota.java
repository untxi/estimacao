
package GUI;

import javax.swing.JTable;

public class VentanaBuscarMascota extends javax.swing.JInternalFrame {
    private String petName = "";
    private String chipID = "";
    private String raza = ""; 
    private String especie = "";
    private String tamaño = "";
    private String colorPelaje = "";
    private String colorOjos = "";
    private String ubicacion = "";

    
       

    
    private static VentanaBuscarMascota miVentanaBuscarMascota;
    /**
     * Creates new form ventanaBuscarMascota
     */
    private VentanaBuscarMascota() {
        initComponents();
    }
    
    public static VentanaBuscarMascota getInstance()
    {
        if(miVentanaBuscarMascota == null)
        {
            miVentanaBuscarMascota = new VentanaBuscarMascota();
        }
        return miVentanaBuscarMascota;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        panelVentanaBuscar = new javax.swing.JPanel();
        lblTitulo2Ventana = new javax.swing.JLabel();
        lblImagenBuscar = new javax.swing.JLabel();
        lblImagenMascota = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        lblNombreMascota = new javax.swing.JLabel();
        fieldIdChip = new javax.swing.JTextField();
        lblEspecia = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblTamano = new javax.swing.JLabel();
        boxEspecie = new javax.swing.JComboBox();
        boxRaza = new javax.swing.JComboBox();
        lblOjos = new javax.swing.JLabel();
        fieldOjos = new javax.swing.JTextField();
        lblPelaje = new javax.swing.JLabel();
        fieldPelaje = new javax.swing.JTextField();
        lblidChip = new javax.swing.JLabel();
        fieldNombreMascota = new javax.swing.JTextField();
        lblUbicacion = new javax.swing.JLabel();
        fieldUbicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnReportarEncontrada = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscarMascota = new javax.swing.JTable();
        lblTituloVentana1 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        boxTamaño = new javax.swing.JComboBox();
        btnLimpiaTabla = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenuItem1.setText("jMenuItem1");

        setIconifiable(true);
        setResizable(true);
        setTitle("Buscar Mascota - Estimação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N

        panelVentanaBuscar.setBackground(new java.awt.Color(190, 160, 100));
        panelVentanaBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo2Ventana.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTitulo2Ventana.setText("Mascotas Encontradas");
        panelVentanaBuscar.add(lblTitulo2Ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 20));

        lblImagenBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        lblImagenMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/adoptar.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 140, 130));

        lblCaracteristicas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCaracteristicas.setText("Características de la Mascota");
        panelVentanaBuscar.add(lblCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblNombreMascota.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombreMascota.setText("Nombre");
        panelVentanaBuscar.add(lblNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        fieldIdChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIdChipActionPerformed(evt);
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
        lblTamano.setText("Tamaño");
        panelVentanaBuscar.add(lblTamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        boxEspecie.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boxEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Perro", "Gato", "Pájaro", "Tortuga", "Roedor" }));
        panelVentanaBuscar.add(boxEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, -1));

        boxRaza.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boxRaza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "zaguate" }));
        boxRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRazaActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(boxRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 130, -1));

        lblOjos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblOjos.setText("Color de Ojos");
        panelVentanaBuscar.add(lblOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        fieldOjos.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldOjos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldOjosActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(fieldOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 90, -1));

        lblPelaje.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblPelaje.setText("Color de Pelaje");
        panelVentanaBuscar.add(lblPelaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        fieldPelaje.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldPelaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPelajeActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(fieldPelaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, -1));

        lblidChip.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblidChip.setText("Chip");
        panelVentanaBuscar.add(lblidChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        fieldNombreMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreMascotaActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(fieldNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, -1));

        lblUbicacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblUbicacion.setText("Ubicación donde se vió por última vez");
        panelVentanaBuscar.add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        fieldUbicacion.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUbicacionActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(fieldUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("(Distrito, Cantón o Barrio)");
        panelVentanaBuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, -1));

        btnReportarEncontrada.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnReportarEncontrada.setForeground(new java.awt.Color(170, 80, 0));
        btnReportarEncontrada.setText("Reportar Mascota Encontrada");
        panelVentanaBuscar.add(btnReportarEncontrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 220, 40));

        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(170, 80, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 40));

        tablaBuscarMascota.setBackground(new java.awt.Color(190, 160, 100));
        tablaBuscarMascota.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        tablaBuscarMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Chip", "Especie", "Raza", "Tamaño", "Pelaje", "Ojos", "Ubicación", "Estado", "Adoptar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
            tablaBuscarMascota.getColumnModel().getColumn(6).setResizable(false);
            tablaBuscarMascota.getColumnModel().getColumn(7).setResizable(false);
        }

        panelVentanaBuscar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 660, 320));

        lblTituloVentana1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloVentana1.setText("Buscar Mascota");
        panelVentanaBuscar.add(lblTituloVentana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btnCancelar1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(170, 80, 0));
        btnCancelar1.setText("Limpiar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 90, 40));

        boxTamaño.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boxTamaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Pequeño", "Mediano", "Grande", "Gigante" }));
        boxTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTamañoActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(boxTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 130, -1));

        btnLimpiaTabla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnLimpiaTabla.setForeground(new java.awt.Color(170, 80, 0));
        btnLimpiaTabla.setText("Limpiar Tabla");
        btnLimpiaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaTablaActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(btnLimpiaTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 130, 40));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(170, 80, 0));
        jButton1.setText("Adoptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUbicacionActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_fieldUbicacionActionPerformed

    private void tablaBuscarMascotaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tablaBuscarMascotaMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaBuscarMascotaMouseWheelMoved

    private void boxRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRazaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_boxRazaActionPerformed

    private void boxTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTamañoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_boxTamañoActionPerformed

    private void fieldNombreMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreMascotaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_fieldNombreMascotaActionPerformed

    private void fieldIdChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIdChipActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_fieldIdChipActionPerformed

    private void fieldPelajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPelajeActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_fieldPelajeActionPerformed

    private void fieldOjosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldOjosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fieldOjosActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        ubicacion = fieldUbicacion.getText();
        colorOjos = fieldOjos.getText();
        petName = fieldNombreMascota.getText();
        chipID = fieldIdChip.getText();
        colorPelaje = fieldPelaje.getText();
        
        especie = (String) boxEspecie.getSelectedItem();
        raza = (String) boxRaza.getSelectedItem();
        tamaño = (String) boxTamaño.getSelectedItem();
      
        
        //Pruebas para obtener elementos. 
        System.out.println("El nombre es: " + petName);
        System.out.println("ChipId: " + chipID);
        System.out.println( "La especie es: " + especie);
        System.out.println("la raza es: " + raza);
        System.out.println( "El color de ojos es: " + colorOjos);
        System.out.println("Color del pelaje " + colorPelaje);
        System.out.println("el tamaño es: " + tamaño);
        System.out.println("el lugar es: " +ubicacion);
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
        fieldIdChip.setText("");
        fieldNombreMascota.setText("");
        fieldOjos.setText("");
        fieldPelaje.setText("");
        fieldUbicacion.setText("");
        
        boxEspecie.setSelectedIndex(0);
        boxRaza.setSelectedIndex(0);
        boxTamaño.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnLimpiaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaTablaActionPerformed
        // TODO add your handling code here:
        clearTable(tablaBuscarMascota);
    }//GEN-LAST:event_btnLimpiaTablaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //if Check == true
        //Controladores.ControladorAdopciones.getInstance().adoptarMascota(null);//En lugar de null va de donde extra la mascota
        //poner un Else
        JOptionPanel.showMessageDialog(null, "Esta mascota no puede ser adoptada");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++){
            for(int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getChipID() {
        return chipID;
    }

    public void setChipID(String chipID) {
        this.chipID = chipID;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxEspecie;
    private javax.swing.JComboBox boxRaza;
    private javax.swing.JComboBox boxTamaño;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnLimpiaTabla;
    private javax.swing.JButton btnReportarEncontrada;
    private javax.swing.JTextField fieldIdChip;
    private javax.swing.JTextField fieldNombreMascota;
    private javax.swing.JTextField fieldOjos;
    private javax.swing.JTextField fieldPelaje;
    private javax.swing.JTextField fieldUbicacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblEspecia;
    private javax.swing.JLabel lblImagenBuscar;
    private javax.swing.JLabel lblImagenMascota;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblOjos;
    private javax.swing.JLabel lblPelaje;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTamano;
    private javax.swing.JLabel lblTitulo2Ventana;
    private javax.swing.JLabel lblTituloVentana1;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblidChip;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JPanel panelVentanaBuscar;
    private javax.swing.JTable tablaBuscarMascota;
    // End of variables declaration//GEN-END:variables
}
