package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Paciente;
import java.sql.Date;
import AccesoADatos.PacienteData;
import Entidades.Dieta;

import Entidades.Seguimiento;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeguimientoData {

    private Connection con = null;

    public SeguimientoData() {
        con = Conexion.getconexion();

    }

    public void AgregarSeguimiento(Seguimiento seguimiento) {
    try {
     
        if (seguimiento == null || seguimiento.getPaciente() == null) {
            JOptionPane.showMessageDialog(null, "Datos de seguimiento incorrectos.");
            return;
        }
        
        String fdieta= "SELECT fechaFinal, fechaInicial FROM dieta WHERE idPaciente = ?";
       try( PreparedStatement psfechaF= con.prepareStatement(fdieta)){
        psfechaF.setInt(1, seguimiento.getPaciente().getIdPaciente());
        ResultSet rsf= psfechaF.executeQuery();
        
        if(rsf.next()){
            LocalDate fechaFinal= rsf.getDate("fechafinal").toLocalDate();
            LocalDate fechaInicial= rsf.getDate("fechaInicial").toLocalDate();
                
                String sqlVerificarFecha = "SELECT COUNT(*) FROM Seguimiento WHERE idPaciente = ? AND fecha = ?";
                
                try (PreparedStatement psVerificarFecha = con.prepareStatement(sqlVerificarFecha)) {
                    psVerificarFecha.setInt(1, seguimiento.getPaciente().getIdPaciente());
                    psVerificarFecha.setDate(2, Date.valueOf(seguimiento.getFecha()));

                    ResultSet rs = psVerificarFecha.executeQuery();
                    if (rs.next()) {
                        
                        int registrosExisten = rs.getInt(1);

                        if (registrosExisten == 0 && seguimiento.getFecha().compareTo(fechaFinal)<=0 && seguimiento.getFecha().compareTo(fechaInicial)>0 ) {
                            String sqlInsertar = "INSERT INTO Seguimiento (idPaciente, fecha, medidaPecho, medidaCintura, medidaCadera, peso) VALUES (?,?,?,?,?,?)";
                            try (PreparedStatement psInsertar = con.prepareStatement(sqlInsertar)) {
                                psInsertar.setInt(1, seguimiento.getPaciente().getIdPaciente());
                                psInsertar.setDate(2, Date.valueOf(seguimiento.getFecha()));
                                psInsertar.setDouble(3, seguimiento.getMedidaPecho());
                                psInsertar.setDouble(4, seguimiento.getMedidaCintura());
                                psInsertar.setDouble(5, seguimiento.getMedidaCadera());
                                psInsertar.setDouble(6, seguimiento.getPeso());

                                int filasModificadas = psInsertar.executeUpdate();
                                if (filasModificadas == 1) {
                                    JOptionPane.showMessageDialog(null, "El seguimiento ha sido añadido con éxito");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al agregar el seguimiento");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pueden repetir fechas, ni la fecha puede ser inferior o superior a las previstas");
                            }
                    }
        }
            }
       }
       
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al establecer la conexión o ejecutar la consulta: " + ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage());
    }
    
}
    




    public Seguimiento ObtenerSeguimientoPorID(int id) {

        Seguimiento seguimiento = null;

        try {
            String sql = "SELECT idSeguimiento, idPaciente ,	fecha	, medidaPecho ,	medidaCintura ,	medidaCadera FROM seguimiento WHERE idSeguimiento = ? ";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {

                seguimiento = new Seguimiento();
                PacienteData pacientedata = new PacienteData();

                seguimiento.setIdSeguimiento(id);
                int idPaciente = resultado.getInt("idPaciente");
                seguimiento.setPaciente(pacientedata.obtenerPacientePorId(idPaciente));
                seguimiento.setFecha(resultado.getDate("fecha").toLocalDate());
                seguimiento.setMedidaPecho(resultado.getDouble("medidaPecho"));
                seguimiento.setMedidaCintura(resultado.getDouble("medidaCintura"));
                seguimiento.setMedidaCadera(resultado.getDouble("medidaCadera"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la conexion" + ex);

        }

        return seguimiento;

    }

    public void eliminarSeguimiento(int id) {
        try {
            String sql = "DELETE FROM seguimiento WHERE idSeguimiento=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Seguimiento dado de baja");
            } else {
                JOptionPane.showMessageDialog(null, "El Segumiento no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Conectar con la tabla Segumiento" + ex.getMessage());
        }
    }

    public List<Seguimiento> obtenerSeguimientoPorPersona(int id) {

        List<Seguimiento> pacientes = new ArrayList<>();

        PacienteData pacientedata = null;

        try {
            String sql = "SELECT idSeguimiento,idPaciente,fecha, medidaPecho ,medidaCintura ,medidaCadera FROM seguimiento WHERE idPaciente=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            Seguimiento seguimiento;

            while (resultado.next()) {
                seguimiento = new Seguimiento();
                pacientedata = new PacienteData();

                seguimiento.setIdSeguimiento(resultado.getInt("idSeguimiento"));
                seguimiento.setIdSeguimiento(id);
                int idPaciente = resultado.getInt("idPaciente");
                seguimiento.setPaciente(pacientedata.obtenerPacientePorId(idPaciente));
                seguimiento.setFecha(resultado.getDate("fecha").toLocalDate());
                seguimiento.setMedidaPecho(resultado.getDouble("medidaPecho"));
                seguimiento.setMedidaCintura(resultado.getDouble("medidaCintura"));
                seguimiento.setMedidaCadera(resultado.getDouble("medidaCadera"));

                pacientes.add(seguimiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la tabla Seguimiento" + ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos" + ex.getMessage());
        }
        return pacientes;
    }

    public LocalDate encontrarFechaMasReciente(int id) {
        LocalDate mayorFecha = null;

        for (Seguimiento ListaSeguimientos : obtenerSeguimientoPorPersona(id)) {
            LocalDate fecha = ListaSeguimientos.getFecha();

            if (mayorFecha == null || fecha.compareTo(mayorFecha) > 0) {
                mayorFecha = fecha;
            }
        }

        return mayorFecha;
    }

    
    public double  CalcularIMCFinal(int id){
        
        
   
       double   IMCFinal=0;
       
        
     String sql= "Select altura , pesoFinal FROM DIETA  WHERE idPaciente = ? ";
     
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet resultado= ps.executeQuery();
            
            resultado.next();
            
            double  alturaFinal= resultado.getDouble("altura");
           double pesoFinal = resultado.getDouble("pesoFinal");
            
            IMCFinal= pesoFinal / (alturaFinal*alturaFinal);
            
        } catch (SQLException ex) {
            Logger.getLogger(SeguimientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return IMCFinal;
     
     
     
    }
    
    
    
    
    public double  CalcularIMCInicial(int id){
        
        
        
       double IMCInicial=0;
      
       
        
     String sql= "Select altura , pesoInicial FROM DIETA  WHERE idPaciente = ? ";
     
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet resultado= ps.executeQuery();
            
            resultado.next();
            
            double  altura= resultado.getDouble("altura");
           double peso = resultado.getDouble("pesoInicial");
            
            IMCInicial= peso / (altura*altura);
            
        } catch (SQLException ex) {
            Logger.getLogger(SeguimientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return IMCInicial;
     
     
     
    }
    
    
    
    public List <Paciente> ObjetivoNoCumplido(Dieta dieta){
        
        Paciente paciente = new Paciente();
        ArrayList<Paciente> pacientes = new ArrayList<>();
       if(objetivoCumplido( dieta)==false){
        
           pacientes.add(paciente);
          
           
    }
       return pacientes; 
    }
    
    public List <Paciente> ObjetivoCumplido(Dieta dieta){
        
        Paciente paciente = new Paciente();
        ArrayList<Paciente> pacientes = new ArrayList<>();
       if(objetivoCumplido( dieta)==true){
        
           pacientes.add(paciente);
          
           
    }
       return pacientes; 
    }
    
    public double obtenerPesoPorFecha(int id) {
        double peso = 0;

        LocalDate fecha = encontrarFechaMasReciente(id);
        try {
            String sql = "SELECT peso FROM seguimiento WHERE fecha=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                peso = resultado.getDouble("peso");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SeguimientoData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return peso;
    }

    public boolean objetivoCumplido(Dieta dieta) {
        
        boolean VoF=false;
        if ((dieta.getFechaFinal().equals(encontrarFechaMasReciente(dieta.getPaciente().getIdPaciente()))) && (dieta.getPesoFinal() == obtenerPesoPorFecha(dieta.getPaciente().getIdPaciente()))) {

          VoF=true;
        } 
        return VoF;
    }
}
