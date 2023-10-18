/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.ComidaData;
import AccesoADatos.DietaComidaData;
import AccesoADatos.DietaData;
import AccesoADatos.PacienteData;
import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import java.time.LocalDate;
import java.time.ZoneId;
/**
 *
 * @author User
 */
public class GestionDietaNew extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionDataNew
     */
    public GestionDietaNew() {
        initComponents();
        
        cargarPacienteCombo();
        
        cargarDietaCombo();
        cargarComidaCombo();
        
        cargarDietaComboEliminar();
        //cargarComidaComboEliminar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        PacienteCombo = new javax.swing.JComboBox<>();
        Inscribir = new javax.swing.JButton();
        NombreDieta = new javax.swing.JTextField();
        PesoInicial = new javax.swing.JTextField();
        jdFechaInicio = new com.toedter.calendar.JDateChooser();
        jdFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PacienteAltura = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        DietaCombo = new javax.swing.JComboBox<>();
        ComidaCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AgregarComida = new javax.swing.JButton();
        DietaComboEliminar = new javax.swing.JComboBox<>();
        ComidaComboEliminar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(996, 609));

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        Inscribir.setText("Inscribir");
        Inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirActionPerformed(evt);
            }
        });

        NombreDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreDietaActionPerformed(evt);
            }
        });

        jLabel1.setText("Peso Inicial");

        jLabel2.setText("Nombre de dieta");

        jLabel3.setText("Fecha de inicio");

        jLabel4.setText("Fecha Final");

        jLabel5.setText("Paciente");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Inscripcion a dietas");

        jLabel7.setText("Altura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6))
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jdFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PesoInicial, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreDieta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PacienteAltura)
                            .addComponent(PacienteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(Inscribir)))
                .addContainerGap(420, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jdFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PacienteAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PacienteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Inscribir)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inscripcion a Dietas", jPanel1);

        jLabel8.setText("Agregar comida a dieta");

        jLabel9.setText("Eliminar comida de dieta");

        AgregarComida.setText("Agregar");
        AgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarComidaActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel8)
                        .addGap(305, 305, 305)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(AgregarComida)
                        .addGap(365, 365, 365)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DietaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComidaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(275, 275, 275)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DietaComboEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComidaComboEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(344, 344, 344))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DietaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DietaComboEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComidaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComidaComboEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarComida)
                    .addComponent(jButton1))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar o eliminar comidas a dieta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirActionPerformed
        // TODO add your handling code here:
        DietaData DietaDataInsc=new DietaData();
        String nombreDieta=NombreDieta.getText();
        int pesoInicial=Integer.parseInt(PesoInicial.getText());
        int pacienteAltura=Integer.parseInt(PacienteAltura.getText());
        LocalDate fechaInicial= jdFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFinal= jdFechaFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Paciente pacienteSelec=(Paciente) PacienteCombo.getSelectedItem();
        
        Dieta dietaInsc=new Dieta(nombreDieta,pacienteSelec,fechaInicial,pesoInicial, 0,fechaFinal,pacienteAltura);  
        DietaDataInsc.guardarDieta(dietaInsc);
    }//GEN-LAST:event_InscribirActionPerformed

    private void NombreDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreDietaActionPerformed

    private void AgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarComidaActionPerformed
        // TODO add your handling code here:
        Comida comida=(Comida) ComidaCombo.getSelectedItem();
        Dieta dieta=(Dieta) DietaCombo.getSelectedItem();
        DietaComidaData dcd=new DietaComidaData();
        dcd.AgregarComidaDieta(comida.getIdComida(),dieta.getIdDieta());
    }//GEN-LAST:event_AgregarComidaActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDietaNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDietaNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDietaNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDietaNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDietaNew().setVisible(true);
            }
        });
    }
    private void cargarPacienteCombo() {
        PacienteData pacienteData = new PacienteData();
            for (Paciente pac : pacienteData.ListarPacientes()) {
                PacienteCombo.addItem(pac);
            }
    }
    
    private void cargarDietaCombo(){
        DietaData dietaData  = new DietaData();    
        DietaCombo.addItem(null);
        for(Dieta diet:dietaData.obtenerDietas()){
            DietaCombo.addItem(diet);
        }
    }
    
    private void cargarComidaCombo(){
        ComidaData comData  = new ComidaData ();
        ComidaCombo.addItem(null);
        for(Comida comid:comData.listarComidas()){
            ComidaCombo.addItem(comid);
        }
    }
    
    private void cargarDietaComboEliminar(){
        DietaData dd  = new DietaData();    
        Dieta DietaSeleccionada=(Dieta) ComidaComboEliminar.getSelectedItem();
        String sql = "SELECT * FROM dietacomida () VALUES (?,?,?,?,?,?,?)";
        Paciente paciente = new Paciente();
        
        DietaComboEliminar.addItem(null);
        for(Dieta diet:dd.obtenerDietas()){
            DietaComboEliminar.addItem(diet);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarComida;
    private javax.swing.JComboBox<Comida> ComidaCombo;
    private javax.swing.JComboBox<Comida> ComidaComboEliminar;
    private javax.swing.JComboBox<Dieta> DietaCombo;
    private javax.swing.JComboBox<Dieta> DietaComboEliminar;
    private javax.swing.JButton Inscribir;
    private javax.swing.JTextField NombreDieta;
    private javax.swing.JTextField PacienteAltura;
    private javax.swing.JComboBox<Paciente> PacienteCombo;
    private javax.swing.JTextField PesoInicial;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdFechaFinal;
    private com.toedter.calendar.JDateChooser jdFechaInicio;
    // End of variables declaration//GEN-END:variables
}
