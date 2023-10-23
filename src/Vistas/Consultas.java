
package Vistas;

import AccesoADatos.DietaData;
import AccesoADatos.SeguimientoData;
import Entidades.Dieta;
import Entidades.Paciente;
import Entidades.Seguimiento;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Consultas extends javax.swing.JInternalFrame {

    
    private DefaultTableModel tablaModelo = new DefaultTableModel();
    
    public boolean isCellEditable(int f, int c) {
        return true;
    }
    
    
    public Consultas() {
        initComponents();
        armarCabecera();
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaPacientes = new javax.swing.JTable();
        jRCumplido = new javax.swing.JRadioButton();
        jRNoCumplido = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jTablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablaPacientes);

        jRCumplido.setText("Obetivo Cumplido");
        jRCumplido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRCumplidoActionPerformed(evt);
            }
        });

        jRNoCumplido.setText("Objetivo no cumplido");
        jRNoCumplido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNoCumplidoActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jRCumplido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(jRNoCumplido)
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRCumplido)
                    .addComponent(jRNoCumplido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Historial de objetivos", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRCumplidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRCumplidoActionPerformed
   
        limpiarTabla();
        
        CargarCumplidos();
    }//GEN-LAST:event_jRCumplidoActionPerformed

    private void jRNoCumplidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNoCumplidoActionPerformed
      limpiarTabla();
      
      CargarNoCumplidos();
    }//GEN-LAST:event_jRNoCumplidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRCumplido;
    private javax.swing.JRadioButton jRNoCumplido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablaPacientes;
    // End of variables declaration//GEN-END:variables

 private void armarCabecera(){
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Dni");
        tablaModelo.addColumn("Peso Inicial");
        tablaModelo.addColumn("Peso Final");
        tablaModelo.addColumn("Tipo de dieta");
        tablaModelo.addColumn("Inicio de tratamiento");
        tablaModelo.addColumn(" Fin de tratamiento");
        
        jTablaPacientes.setModel(tablaModelo);
    }


 private void limpiarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) jTablaPacientes.getModel();
        modelo.setRowCount(0); // Limpia todas las filas de la tabla
        tablaModelo.fireTableDataChanged();

    }
 

     
     
   private void CargarCumplidos (){
      
    if (jRCumplido.isSelected()) {
    DietaData dietaData = new DietaData();
    Dieta dieta = new Dieta();
    SeguimientoData seguimientoData = new SeguimientoData();
    Seguimiento seguimiento;

    List<Dieta> ListaDietas = new ArrayList<>(dietaData.obtenerDietas());

    for (Dieta diet : ListaDietas) {
        List<Paciente> pacientesCumplidos = new ArrayList<>();

        List<Paciente> ListaPacientes = new ArrayList<>(seguimientoData.ObjetivoCumplido(diet));

        for (Paciente Listap : ListaPacientes) {
            int idPaciente = Listap.getIdPaciente();

            if (idPaciente == diet.getPaciente().getIdPaciente()) {
                seguimiento = seguimientoData.ObtenerSeguimientoPorIDPaciente(idPaciente);

                int idSeguimiento = seguimiento.getIdSeguimiento();
                LocalDate fechaUltima = seguimientoData.encontrarFechaMasReciente(idSeguimiento);

                java.util.Date fechaUltimaDato = java.util.Date.from(fechaUltima.atStartOfDay(ZoneId.systemDefault()).toInstant());

                String Nombre = Listap.getNombre();
                
                int DNI = Listap.getDni();
                
                LocalDate fFinal = diet.getFechaFinal();
                
                java.util.Date FfinalDato = java.util.Date.from(fFinal.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                LocalDate fInicial = diet.getFechaInicial();
                
                java.util.Date FinicialDato = java.util.Date.from(fInicial.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                double pesoInicial = diet.getPesoInicial();
                
                double pesoFinal = diet.getPesoFinal();
                
                String nombreDieta = diet.getNombre();


                tablaModelo.addRow(new Object[]{Nombre, DNI, pesoInicial, pesoFinal, nombreDieta, FfinalDato, FinicialDato, fechaUltima}); 
            }
        }
    }
}

     } 
        
    
 
 
 
 
 
 
 
 
 
 
private void CargarNoCumplidos() {
    
    if (jRNoCumplido.isSelected()) {
        
        DietaData dietaData = new DietaData();
        
        SeguimientoData seguimientoData = new SeguimientoData();
        

        List<Dieta> ListaDietas = new ArrayList<>(dietaData.obtenerDietas());
        

        for (Dieta diet : ListaDietas) {
            
            
            List<Paciente> ListaPacientes = new ArrayList<>(seguimientoData.ObjetivoNoCumplido(diet));

            for (Paciente Listap : ListaPacientes) {
                
                if (Listap.getIdPaciente() == diet.getPaciente().getIdPaciente()) {
                    
                    String Nombre = Listap.getNombre();
                    
                    int DNI = Listap.getDni();
                    
                    LocalDate fFinal = diet.getFechaFinal();
                    
                    java.util.Date FfinalDato = java.util.Date.from(fFinal.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    
                    LocalDate fInicial = diet.getFechaInicial();
                    
                    java.util.Date FinicialDato = java.util.Date.from(fInicial.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    
                    double pesoInicial = diet.getPesoInicial();
                    
                    double pesoFinal = diet.getPesoFinal();
                    
                    String nombreDieta = diet.getNombre();
                    
                    
                    tablaModelo.addRow(new Object[]{Nombre, DNI, pesoInicial, pesoFinal, nombreDieta, FfinalDato, FinicialDato});
                    
                }
            }
        }
    }
}

}
 
