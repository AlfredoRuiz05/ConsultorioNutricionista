/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.PacienteData;
import Entidades.Paciente;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class GestionPaciente extends javax.swing.JInternalFrame {
Paciente paciente = new Paciente();
    PacienteData pacienteData = new PacienteData();
    /**
     * Creates new form GestionPaciente
     */
    public GestionPaciente() {
        initComponents();
        jtNombre.addKeyListener(new KeyListener() {
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
        jtDni.addKeyListener(new KeyListener() {
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
        jtTelefono.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (!(Character.isDigit(c))) {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion de Pacientes");
        setPreferredSize(new java.awt.Dimension(1008, 645));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Gestion de Pacientes");

        jLabel2.setText("Nombre Completo");

        jLabel3.setText("Dni");

        jLabel4.setText("Domicilio");

        jLabel5.setText("Telefono de contacto");

        jbAgregar.setText("Agregar");
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

        jbBaja.setText("Eliminar");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbVolver.setText("Salir");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 229, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAgregar)
                        .addGap(37, 37, 37)
                        .addComponent(jbModificar)
                        .addGap(36, 36, 36)
                        .addComponent(jbBaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbVolver)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jbBuscar))
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jbBuscar)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbModificar)
                    .addComponent(jbBaja)
                    .addComponent(jbVolver))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        int dni;

        try {
            dni = Integer.parseInt(jtDni.getText());
            Paciente busquedaPaciente = pacienteData.buscarPacientePorDni(dni);
            if (busquedaPaciente == null) {

                String nombre = jtNombre.getText();
                String domicilio = jtDomicilio.getText();
                String telefono = jtTelefono.getText();

                if (nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
                } else {
                    if (isNumeric(telefono) == true) {
                        paciente = new Paciente(nombre, dni, domicilio, telefono);
                        pacienteData.guardarPaciente(paciente);
                    } else {
                        JOptionPane.showMessageDialog(null, "El telefono debe ser numerico sin guiones o signos");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El dni ya se encuentra registrado");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El dni debe ser numerico");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos " + e.getMessage());
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        String nombre = jtNombre.getText();
        try {
            int dni = Integer.parseInt(jtDni.getText());
            String domicilio = jtDomicilio.getText();
            String telefono = jtTelefono.getText();
            int idPaciente = pacienteData.buscarPacientePorDni(dni).getIdPaciente();
            if (nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
            } else {
                if (isNumeric(telefono) == true) {

                    paciente = new Paciente(nombre, dni, domicilio, telefono, idPaciente);
                    pacienteData.modificarPaciente(paciente);
                } else {
                    JOptionPane.showMessageDialog(null, "El telefono debe ser numerico sin guiones o signos");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El dni debe ser numerico");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(null, " ¿Seguro desea eliminar al paciente?");
        if (confirmar == JOptionPane.OK_OPTION) {

            String nombre = jtNombre.getText();
            try {
                int dni = Integer.parseInt(jtDni.getText());
                String domicilio = jtDomicilio.getText();
                String telefono = jtTelefono.getText();
                int idPaciente = pacienteData.buscarPacientePorDni(dni).getIdPaciente();
                paciente = new Paciente(nombre, dni, domicilio, telefono,idPaciente);

                pacienteData.eliminarPaciente(idPaciente);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El dni debe ser numerico");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se elimino al paciente");
        }
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {
            int dni = Integer.parseInt(jtDni.getText());

            Paciente busquedaPaciente = pacienteData.buscarPacientePorDni(dni);

            jtNombre.setText(busquedaPaciente.getNombre());
            jtDomicilio.setText(busquedaPaciente.getDomicilio());
            jtTelefono.setText(busquedaPaciente.getTelefono());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El dni debe ser numerico");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
      dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

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
            java.util.logging.Logger.getLogger(GestionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBaja;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
public boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }


}
