/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.PacienteData;
import AccesoADatos.SeguimientoData;
import Entidades.Paciente;
import Entidades.Seguimiento;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 *
 * @author ACER
 */
public class SeguimientoVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaAtencion
     */
    public SeguimientoVista() {
       
        initComponents();
        
        cargarCombo();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jcPacientes = new javax.swing.JComboBox<>();
        jtPeso = new javax.swing.JTextField();
        jtCintura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtCadera = new javax.swing.JTextField();
        jtPecho = new javax.swing.JTextField();
        jdFechaSeguimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();

        jLabel1.setText("Seguimiento de consulta");

        jLabel2.setText("Paciente");

        jLabel3.setText("Peso");

        jLabel4.setText("Medidas");

        jLabel5.setText("Fecha");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesoActionPerformed(evt);
            }
        });

        jLabel6.setText("Cintura");

        jLabel7.setText("Cadera");

        jLabel8.setText("pecho");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jcPacientes, 0, 202, Short.MAX_VALUE)
                        .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtPecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtCadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jdFechaSeguimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(jbModificar)
                .addGap(45, 45, 45)
                .addComponent(jbBorrar)
                .addGap(52, 52, 52)
                .addComponent(jButton2)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtCadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtPecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jdFechaSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jbModificar)
                    .addComponent(jbBorrar))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPesoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        guardarDatos();
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
      
        modificarSeguimiento();
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
   
        BorrarSeguimiento();
        
    }//GEN-LAST:event_jbBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<Paciente> jcPacientes;
    private com.toedter.calendar.JDateChooser jdFechaSeguimiento;
    private javax.swing.JTextField jtCadera;
    private javax.swing.JTextField jtCintura;
    private javax.swing.JTextField jtPecho;
    private javax.swing.JTextField jtPeso;
    // End of variables declaration//GEN-END:variables


 private void cargarCombo(){
        
        PacienteData pacienteData  = new PacienteData ();
        
        
           
           jcPacientes.addItem(null);
        for(Paciente pac:pacienteData.ListarPacientes()){
            jcPacientes.addItem(pac);
        }


 }
 
 
 
 private void guardarDatos(){
     
     if(jcPacientes.getSelectedIndex()>=0){
         
         Paciente p = (Paciente) jcPacientes.getSelectedItem();
         
         Double Peso= Double.parseDouble(jtPeso.getText());
         Double Cintura= Double.parseDouble(jtCintura.getText());
         Double pecho= Double.parseDouble(jtPecho.getText());
         Double cadera= Double.parseDouble(jtCadera.getText());
         LocalDate fecha= jdFechaSeguimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         
         
         Seguimiento seguimiento = new Seguimiento(p,fecha,pecho,Cintura,cadera,Peso);
         
         SeguimientoData seguimientoData= new SeguimientoData();
         
         seguimientoData.AgregarSeguimiento(seguimiento);
         
     }
     
     
 }
 
 
 private void modificarSeguimiento(){
     
      if(jcPacientes.getSelectedIndex()>=0){
         
         Paciente p = (Paciente) jcPacientes.getSelectedItem();
         
         int idPaciente= p.getIdPaciente();
         
         Double Peso= Double.parseDouble(jtPeso.getText());
         Double Cintura= Double.parseDouble(jtCintura.getText());
         Double pecho= Double.parseDouble(jtPecho.getText());
         Double cadera= Double.parseDouble(jtCadera.getText());
         LocalDate fecha= jdFechaSeguimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
      
      
       Seguimiento seguimiento = new Seguimiento(p,fecha,pecho,Cintura,cadera,Peso);
         
         SeguimientoData seguimientoData= new SeguimientoData();
         
         seguimientoData.modificarSeguimiento( idPaciente , seguimiento);
      
      
      }
     
     
 }
 
 private void BorrarSeguimiento(){
     
     if(jcPacientes.getSelectedIndex()>=0){
         
         Paciente p = (Paciente) jcPacientes.getSelectedItem();
     
         
         int idPaciente= p.getIdPaciente();
         
         
         
         Double Peso= Double.parseDouble(jtPeso.getText());
         Double Cintura= Double.parseDouble(jtCintura.getText());
         Double pecho= Double.parseDouble(jtPecho.getText());
         Double cadera= Double.parseDouble(jtCadera.getText());
         LocalDate fecha= jdFechaSeguimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
      
      
       Seguimiento seguimiento = new Seguimiento(p,fecha,pecho,Cintura,cadera,Peso);
         
       int IdSeguimiento= seguimiento.getIdSeguimiento();
       
         
       SeguimientoData seguimientoData= new SeguimientoData();
         
         
         
         seguimientoData.eliminarSeguimientoPorId(IdSeguimiento);
     
     }
 }
 
}
