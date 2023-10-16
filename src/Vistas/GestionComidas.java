/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ComidaData;
import Entidades.Comida;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class GestionComidas extends javax.swing.JInternalFrame {
private DefaultTableModel tablaModelo = new DefaultTableModel();
    public boolean isCellEditable(int f, int c){
        return false;
    }
    /**
     * Creates new form GestionComidas2
     */
    public GestionComidas() {
        initComponents();
        armarCabecera();
        cargarCombo();
        cargarComboEliminar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDetalle = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboComidas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaComida = new javax.swing.JTable();
        verDescripcion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jtCalorias = new javax.swing.JTextField();
        jbAgregar5 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jbTipoComida = new javax.swing.JComboBox<>();
        jtNombre = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jbEliminar1 = new javax.swing.JButton();
        comboComidas1 = new javax.swing.JComboBox<>();
        jtEliminar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion de Comidas");

        jPanel1.setPreferredSize(new java.awt.Dimension(970, 625));
        jPanel1.setRequestFocusEnabled(false);

        jbAgregar.setText("Agregar o Eliminar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbVolver.setText("Volver al Menu");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jtaDetalle.setColumns(20);
        jtaDetalle.setRows(5);
        jScrollPane2.setViewportView(jtaDetalle);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Gestion de Comidas");

        jLabel2.setText("Comidas");

        comboComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboComidasActionPerformed(evt);
            }
        });

        TablaComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaComida);

        verDescripcion.setText("Ver Descripcion");
        verDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbVolver)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jbModificar)
                                        .addGap(231, 231, 231)
                                        .addComponent(jbAgregar))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(43, 43, 43)
                                            .addComponent(comboComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(verDescripcion)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel1)))
                .addGap(0, 208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboComidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(verDescripcion)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbModificar)
                    .addComponent(jbVolver))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestion", jPanel2);

        jLabel29.setText("Calorias del plato");

        jbAgregar5.setText("Agregar");
        jbAgregar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregar5ActionPerformed(evt);
            }
        });

        jLabel30.setText("Tipo de Comida");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel26.setText("Agregar  Comidas");

        jbTipoComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desayuno", "Almuerzo", "Merienda", "Cena", "Colacion" }));

        jLabel27.setText("Nombre del plato");

        jLabel28.setText("Descripcion");

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jScrollPane6.setViewportView(jtaDescripcion);

        jbEliminar1.setText("Eliminar");
        jbEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminar1ActionPerformed(evt);
            }
        });

        comboComidas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboComidas1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Eliminar Comida");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel26))
                    .addComponent(jLabel28)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbAgregar5)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(2, 2, 2))
                                    .addComponent(jLabel29))
                                .addComponent(jLabel30))
                            .addGap(44, 44, 44)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtCalorias, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbTipoComida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboComidas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jbEliminar1)
                                .addGap(54, 54, 54)))
                        .addGap(290, 290, 290))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel3))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jbTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(comboComidas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jbEliminar1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jbAgregar5)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar o Eliminar", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboComidasActionPerformed
          
        Comida comidas;
        
         String nombre;
        if(comboComidas.getSelectedIndex()>0){

          limpiarTabla();
            
        comidas= (Comida) comboComidas.getSelectedItem();
        
        //Obtengo el id del combobox seleccionado
       nombre=comidas.getNombre();
       
     cargarTabla(nombre+"");
       
        }else {
           
            limpiarTabla();
        }
    }//GEN-LAST:event_comboComidasActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
       jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        Principal principal= new Principal();
        this.setVisible(false);
        principal.show(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void verDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDescripcionActionPerformed
       int fila=TablaComida.getSelectedRow();
        String detalle=this.tablaModelo.getValueAt(fila, 1).toString();
       
        
        jtaDetalle.setText(detalle);
    }//GEN-LAST:event_verDescripcionActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int cont = 0;

        ComidaData comidaData = new ComidaData();
        Comida comida;
        for (int i = 0; i < this.TablaComida.getRowCount(); i++) {
            String nombre = this.tablaModelo.getValueAt(i, 0).toString();
            String detalle = this.tablaModelo.getValueAt(i, 1).toString();
            String tipoComida = this.tablaModelo.getValueAt(i, 2).toString();
            int calorias = Integer.parseInt(this.tablaModelo.getValueAt(i, 3).toString());
            int idComida = Integer.parseInt(this.tablaModelo.getValueAt(i, 4).toString()); // Supongamos que la columna 4 contiene el idComida
            comida = new Comida(nombre, detalle, tipoComida, calorias, idComida);

            if (comidaData.modificarComida(comida)) {
                cont++;
            }
        }

        if (cont >= 1) {
            JOptionPane.showMessageDialog(null, "La Comida se modificó correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "La comida no se pudo modificar");
        }
    }//GEN-LAST:event_jbModificarActionPerformed
    private final Map<String, List<Comida>> comidasPorHorario = new HashMap<>();
    private void jbAgregar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregar5ActionPerformed
        String nombreComida = jtNombre.getText();
        String detalle = jtaDescripcion.getText();
        String tipoComida = jbTipoComida.getSelectedItem().toString();
        String horario = jbTipoComida.getSelectedItem().toString(); // Suponiendo que tengas un JComboBox para seleccionar el horario.

        if (nombreComida.isEmpty() || detalle.isEmpty() || tipoComida.isEmpty() || horario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
        } else {
            try {
                int calorias = Integer.parseInt(jtCalorias.getText());
                Comida comida = new Comida(nombreComida, detalle, tipoComida, calorias);

                if (!comidasPorHorario.containsKey(horario)) {
                    comidasPorHorario.put(horario, new ArrayList<>());
                }

                List<Comida> comidasEnHorario = comidasPorHorario.get(horario);

                // Verificar si la comida ya se ha agregado para este horario
                boolean comidaRepetida = comidasEnHorario.stream()
                .anyMatch(c -> c.getNombre().equals(nombreComida));

                if (comidaRepetida) {
                    JOptionPane.showMessageDialog(null, "Ya se ha agregado la misma comida para este horario.");
                } else {
                    comidasEnHorario.add(comida);
                    ComidaData comidaData = new ComidaData();
                    comidaData.guardarComida(comida);
                    JOptionPane.showMessageDialog(null, "Comida guardada exitosamente para el horario: " + horario);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Las calorías deben ser un número entero");
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
            }
        }
    }//GEN-LAST:event_jbAgregar5ActionPerformed

    private void jbEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminar1ActionPerformed
        ComidaData comidaData= new ComidaData();
        comidaData.eliminarComida(jtEliminar.getText());
    }//GEN-LAST:event_jbEliminar1ActionPerformed

    private void comboComidas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboComidas1ActionPerformed
        Comida comida=(Comida) comboComidas1.getSelectedItem();
        jtEliminar.setText(comida.getNombre()+"");

    }//GEN-LAST:event_comboComidas1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionComidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaComida;
    private javax.swing.JComboBox<Comida> comboComidas;
    private javax.swing.JComboBox<Comida> comboComidas1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAgregar5;
    private javax.swing.JButton jbEliminar1;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jbTipoComida;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtCalorias;
    private javax.swing.JTextField jtEliminar;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextArea jtaDetalle;
    private javax.swing.JButton verDescripcion;
    // End of variables declaration//GEN-END:variables
  private void armarCabecera(){
        tablaModelo.addColumn("Comida");
        tablaModelo.addColumn("Descripcion");
        tablaModelo.addColumn("Tipo de Comida");
        tablaModelo.addColumn("Calorias");
        tablaModelo.addColumn("idComida");
        
        TablaComida.setModel(tablaModelo);
    }
    
    private void cargarCombo(){
        
        ComidaData comidaData  = new ComidaData ();
        comboComidas.addItem(null);
        for(Comida com:comidaData.listarComidas()){
            comboComidas.addItem(com);
        }
    }
    
    
    private void cargarComboEliminar(){
        
        ComidaData comidaData  = new ComidaData ();    
        comboComidas1.addItem(null);
        for(Comida com:comidaData.listarComidas()){
            comboComidas1.addItem(com);
        }
    }
     private void cargarTabla(String nombre1){
        ComidaData comidaData = new ComidaData();
       
        
        
        List <Comida> ListaComidas = new ArrayList<>(comidaData.obtenerComidaPorNombre(nombre1));
    
     for (Comida com : ListaComidas) {

      String nombre= com.getNombre();
      String detalle=com.getDetalle();
      String tipoComida= com.getTipoComida();
      int calorias=com.getCantidadCalorias();
      int idComida=com.getIdComida();
         
         tablaModelo.addRow( new Object [] {nombre,detalle,tipoComida,calorias,idComida});
         
         
     }
       
         tablaModelo.fireTableDataChanged();
       
        
     }
     
     private void limpiarTabla() {
         
    DefaultTableModel modelo = (DefaultTableModel) TablaComida.getModel();
    modelo.setRowCount(0); // Limpia todas las filas de la tabla
    tablaModelo.fireTableDataChanged();
}










}
