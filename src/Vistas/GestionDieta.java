package Vistas;

import AccesoADatos.DietaData;
import AccesoADatos.PacienteData;
import AccesoADatos.SeguimientoData;
import Entidades.Dieta;
import Entidades.Paciente;
import Entidades.Seguimiento;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class GestionDieta extends javax.swing.JInternalFrame {
    
    public GestionDieta() {
        initComponents();
        cargarCombo();
        // Agregar KeyListener al campo jtNombreDieta
        jtNombreDieta.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c)) {
                    e.consume(); // Evitar la entrada de caracteres no válidos
                }
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                // No es necesario implementar este método, pero se debe proporcionar una implementación
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                // No es necesario implementar este método, pero se debe proporcionar una implementación
            }
            
        });
        jtPesoInicial.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (!(Character.isDigit(c) || c == '.')) {
                    ke.consume(); // Evitar la entrada de caracteres no válidos
                }
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {
                
            }
            
            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
        });
        jtPesoFinal.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (!(Character.isDigit(c) || c == '.')) {
                    ke.consume(); // Evitar la entrada de caracteres no válidos
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
               
            }
        });
        jtMedidaPecho.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (!(Character.isDigit(c) || c == '.')) {
                    ke.consume(); // Evitar la entrada de caracteres no válidos
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
               
            }
        });
        
        jtMedidaCadera.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (!(Character.isDigit(c) || c == '.')) {
                    ke.consume(); // Evitar la entrada de caracteres no válidos
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
               
            }
        });
        jtMedidaCintura.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (!(Character.isDigit(c) || c == '.')) {
                    ke.consume(); // Evitar la entrada de caracteres no válidos
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
               
            }
        });
        jtAltura.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (!(Character.isDigit(c) || c == '.')) {
                    ke.consume(); // Evitar la entrada de caracteres no válidos
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
               
            }
        });
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtNombreDieta = new javax.swing.JTextField();
        jtPesoInicial = new javax.swing.JTextField();
        jtPesoFinal = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtMedidaPecho = new javax.swing.JTextField();
        jtMedidaCintura = new javax.swing.JTextField();
        jtMedidaCadera = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtAltura = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jdFechaInicio = new com.toedter.calendar.JDateChooser();
        jdFechaFinal = new com.toedter.calendar.JDateChooser();
        jcPacientes = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1008, 645));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Consulta Inicial");

        jLabel2.setText("Tipo de dieta");

        jLabel3.setText("Paciente");

        jLabel4.setText("Fecha de Inicio");

        jLabel5.setText("Fecha Limite");

        jLabel6.setText("Peso Inicial");

        jLabel7.setText("Peso Final Deseado");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel8.setText("Pecho");

        jLabel9.setText("Cintura");

        jLabel10.setText("Cadera");

        jLabel11.setText("Medidas:");

        jLabel12.setText("Altura");

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtMedidaCadera)
                                    .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtMedidaPecho, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtMedidaCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jLabel12)
                        .addComponent(jLabel11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(jtPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcPacientes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdFechaInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(jdFechaFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtPesoInicial, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombreDieta))))))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jbBuscar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jdFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jdFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbModificar)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jtMedidaPecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtMedidaCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtMedidaCadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbSalir)))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        agregar();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        ModificarDatos();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        EliminarDatos();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        cargarDatosDelPacienteSeleccionado();
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Paciente> jcPacientes;
    private com.toedter.calendar.JDateChooser jdFechaFinal;
    private com.toedter.calendar.JDateChooser jdFechaInicio;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtMedidaCadera;
    private javax.swing.JTextField jtMedidaCintura;
    private javax.swing.JTextField jtMedidaPecho;
    private javax.swing.JTextField jtNombreDieta;
    private javax.swing.JTextField jtPesoFinal;
    private javax.swing.JTextField jtPesoInicial;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        PacienteData pacienteData = new PacienteData();
        for (Paciente pac : pacienteData.ListarPacientes()) {
            jcPacientes.addItem(pac);
        }
    }
    
    private void cargarDatosDelPacienteSeleccionado() {
        
        Seguimiento seguimientoL = null;
        Dieta dieta = null;
        Paciente p = null;
        
        if (jcPacientes.getSelectedIndex() >= 0) {
            p = (Paciente) jcPacientes.getSelectedItem();
            
            int id = p.getIdPaciente();

            // Obtengo los datos por parte de la Lista Dieta
            DietaData dietaData = new DietaData();
            dieta = dietaData.obtenerUnaDietaPorPersona(id);
            
            if (dieta != null) {
                String nombre = dieta.getNombre();
                LocalDate fechaInicio = dieta.getFechaInicial();
                java.util.Date finicio = java.util.Date.from(fechaInicio.atStartOfDay(ZoneId.systemDefault()).toInstant());
                LocalDate fechaFinal = dieta.getFechaFinal();
                java.util.Date ffinal = java.util.Date.from(fechaFinal.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                Double pesoInicial = dieta.getPesoInicial();
                Double pesoFinal = dieta.getPesoFinal();
                Double altura = dieta.getAltura();
                
                jtNombreDieta.setText(nombre);
                jdFechaInicio.setDate(finicio);
                jdFechaFinal.setDate(ffinal);
                jtPesoInicial.setText(Double.toString(pesoInicial));
                jtPesoFinal.setText(Double.toString(pesoFinal));
                jtAltura.setText(Double.toString(altura));
                
            }
            // Obtengo los datos por parte de la lista seguimiento
            SeguimientoData seguimientod = new SeguimientoData();
            seguimientoL = seguimientod.ObtenerSeguimientoPorIDPaciente(id);
            
            System.out.println("Seguimiento" + seguimientoL);
            // Verifico si se encontraron datos de seguimiento
            if (seguimientoL != null) {
                Double pecho = seguimientoL.getMedidaPecho();
                Double cintura = seguimientoL.getMedidaCintura();
                Double cadera = seguimientoL.getMedidaCadera();
                
                jtMedidaPecho.setText(Double.toString(pecho));
                jtMedidaCintura.setText(Double.toString(cintura));
                jtMedidaCadera.setText(Double.toString(cadera));
                
            } else {
                JOptionPane.showMessageDialog(null, "Todavia no existe un seguimiento, por favor ingrese los datos faltantes");
                
            }
        }
    }
    
    private void agregar() {
        
        try {
            
            Paciente p = (Paciente) jcPacientes.getSelectedItem();
            
            String nombre = jtNombreDieta.getText();
            
            LocalDate fechaInicial = jdFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinal = jdFechaFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            Double pesoInicial = Double.parseDouble(jtPesoInicial.getText());
            Double pesoFinal = Double.parseDouble(jtPesoFinal.getText());
            Double altura = Double.parseDouble(jtAltura.getText());
            Double pecho = Double.parseDouble(jtMedidaPecho.getText());
            Double cintura = Double.parseDouble(jtMedidaCintura.getText());
            Double cadera = Double.parseDouble(jtMedidaCadera.getText());
            DietaData dietaData = new DietaData();
            Dieta dieta = new Dieta(nombre, p, fechaInicial, pesoInicial, pesoFinal, fechaFinal, altura);
            dietaData.guardarDieta(dieta);
            //Inicio el primer seguimiento
            SeguimientoData seguimientoData = new SeguimientoData();
            
            Seguimiento seguimientol = new Seguimiento(p, fechaInicial, pecho, cintura, cadera, pesoInicial);
            
            seguimientoData.AgregarSeguimiento(seguimientol);
            
        } catch (NullPointerException e) {
            
            JOptionPane.showMessageDialog(null, "Paciente no encontrado " + e.getMessage());
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Debe ingresar datos numericos " + e.getMessage());
        }
        
    }
    
    public void ModificarDatos() {
        
        try {
            Paciente p = (Paciente) jcPacientes.getSelectedItem();
            
            int idPaciente = p.getIdPaciente();
            
            String nombre = jtNombreDieta.getText();
            
            LocalDate fechaInicial = jdFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinal = jdFechaFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            Double pesoInicial = Double.parseDouble(jtPesoInicial.getText());
            Double pesoFinal = Double.parseDouble(jtPesoFinal.getText());
            Double altura = Double.parseDouble(jtAltura.getText());
            Double pecho = Double.parseDouble(jtMedidaPecho.getText());
            Double cintura = Double.parseDouble(jtMedidaCintura.getText());
            Double cadera = Double.parseDouble(jtMedidaCadera.getText());
            
            DietaData dietaData = new DietaData();
            
            Dieta dieta = new Dieta(nombre, p, fechaInicial, pesoInicial, pesoFinal, fechaFinal, altura);
            
            dietaData.modificarDieta(idPaciente, dieta);

            //Inicio el primer seguimiento
            SeguimientoData seguimientoData = new SeguimientoData();
            
            Seguimiento seguimientol = new Seguimiento(p, fechaInicial, pecho, cintura, cadera, pesoInicial);
            
            seguimientoData.modificarSeguimiento(idPaciente, seguimientol);
            
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error, Revisa los datos ingresados.");
        }
        
    }
    
    private void EliminarDatos() {
        
        Paciente p = (Paciente) jcPacientes.getSelectedItem();
        
        String nombre = jtNombreDieta.getText();
        
        LocalDate fechaInicial = jdFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFinal = jdFechaFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Double pesoInicial = Double.parseDouble(jtPesoInicial.getText());
        Double pesoFinal = Double.parseDouble(jtPesoFinal.getText());
        Double altura = Double.parseDouble(jtAltura.getText());
        
        if (p != null) {
            int idPaciente = p.getIdPaciente();
            
            DietaData dietaData = new DietaData();
            Dieta dieta = new Dieta(nombre, p, fechaInicial, pesoInicial, pesoFinal, fechaFinal, altura);
            dietaData.borrarDietaPorID(dieta.getIdDieta());
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una dieta para eliminar.");
        }
    }
}
