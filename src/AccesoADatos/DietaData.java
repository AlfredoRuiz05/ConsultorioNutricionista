package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Dieta;
import Entidades.Paciente;
import java.sql.Date;
import AccesoADatos.PacienteData;

public class DietaData {

    private Connection con = null;


    public DietaData() {
        con = Conexion.getconexion();
    }
    public void guardarDieta(Dieta dieta) {
    String sql = "INSERT INTO Dieta (nombre, idPaciente,fechaInicial,pesoInicial,pesoFinal,fechaFinal,altura) VALUES (?,?,?,?,?,?,?)";
    Paciente paciente = new Paciente();

    try {
        // Verificar si el paciente ya tiene una dieta en el mismo período
        String verificaSql = "SELECT COUNT(*) FROM Dieta WHERE idPaciente = ? AND (fechaInicial BETWEEN ? AND ? OR fechaFinal BETWEEN ? AND ?)";
        PreparedStatement verificaPs = con.prepareStatement(verificaSql);
        verificaPs.setInt(1, dieta.getPaciente().getIdPaciente());
        verificaPs.setDate(2, Date.valueOf(dieta.getFechaInicial()));
        verificaPs.setDate(3, Date.valueOf(dieta.getFechaFinal()));
        verificaPs.setDate(4, Date.valueOf(dieta.getFechaInicial()));
        verificaPs.setDate(5, Date.valueOf(dieta.getFechaFinal()));

        ResultSet verificaResult = verificaPs.executeQuery();
        verificaResult.next();
        int cantidadDietas = verificaResult.getInt(1);

        if (cantidadDietas > 0) {
            JOptionPane.showMessageDialog(null, "El paciente ya tiene una dieta en este período de tiempo");
        } else {
            // Si no hay dietas en el mismo período, procede con la inserción
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(7, dieta.getAltura());
            int listaModificada = ps.executeUpdate();

            if (listaModificada == 1) {
                JOptionPane.showMessageDialog(null, "La Dieta ha sido añadida con éxito");
            }

            ps.close();
        }

        verificaPs.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión");
    }
}

//    public void guardarDieta(Dieta dieta) {
//        String sql = "INSERT INTO Dieta (nombre, idPaciente,fechaInicial,pesoInicial,pesoFinal,fechaFinal,altura) VALUES (?,?,?,?,?,?,?)";
//        Paciente paciente = new Paciente();
//
//        try {
//
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.setString(1, dieta.getNombre() );
//            ps.setInt(2, dieta.getPaciente().getIdPaciente());
//            ps.setDate(3, Date.valueOf( dieta.getFechaInicial()));
//            ps.setDouble(4, dieta.getPesoInicial());
//            ps.setDouble(5, dieta.getPesoFinal());
//            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
//            ps.setDouble(7, dieta.getAltura());
//            int listaModificada = ps.executeUpdate();
//
//            if (listaModificada == 1) {
//
//                JOptionPane.showMessageDialog(null, " La Dieta ha sido añadida con exito");
//            }
//
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion");
//        }
//    }

    public List<Dieta> obtenerDietas() {
        
        String sql = "SELECT idDieta, nombre, idPaciente, fechaInicial,pesoInicial,pesoFinal,fechaFinal,altura FROM dieta";
        
        ArrayList<Dieta> dietas = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet resultado = ps.executeQuery();

            while (resultado.next()) {
                Dieta dieta = new Dieta();
                dieta.setIdDieta(resultado.getInt("idDieta"));
                dieta.setNombre(resultado.getString("nombre"));
                dieta.setFechaInicial(resultado.getDate("fechaInicial").toLocalDate());
                dieta.setPesoInicial(resultado.getDouble("pesoInicial"));
                dieta.setPesoFinal(resultado.getDouble("pesoFinal"));
                dieta.setAltura(resultado.getDouble("altura"));

                int paciente = resultado.getInt("idPaciente");
                PacienteData pacienteData = new PacienteData();

                dieta.setPaciente( pacienteData.obtenerPacientePorId( paciente  ));
                
            
                

               
                dietas.add(dieta);
            }

            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la tabla inscripcion");
        }

        return dietas;
    }


    public List<Dieta> obtenerDietaPorPersona(int id) {
        
        List<Dieta> pacientes = new ArrayList<>();

        try {
            String sql = "SELECT idDieta, nombre, idPaciente , fechaInicial, pesoInicial,pesoFinal,fechaFinal,altura FROM dieta WHERE idPaciente=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            Dieta dieta;

            while (resultado.next()) {
                dieta = new Dieta();
                
                dieta.setIdDieta(resultado.getInt("idDieta"));
                dieta.setNombre(resultado.getString("nombre"));
                
                PacienteData pacienteData = new PacienteData();
                int idPaciente = resultado.getInt("idPaciente");
                dieta.setPaciente(pacienteData.obtenerPacientePorId(idPaciente));
                
                dieta.setFechaInicial(resultado.getDate("fechaInicial").toLocalDate());
               
                dieta.setPesoInicial(resultado.getDouble("pesoInicial"));
                dieta.setPesoFinal(resultado.getDouble("pesoFinal"));
                 dieta.setFechaFinal(resultado.getDate("fechaFinal").toLocalDate());
                dieta.setAltura(resultado.getDouble("altura"));
                
                
               

                pacientes.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la tabla inscripcion" + ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos" + ex.getMessage());
        }
        return pacientes ;
    }

  

    
    public boolean modificarDieta (int idPaciente,Dieta dieta) {
        
        boolean actual=false;
        
        try {
                String sql = "UPDATE dieta SET fechaInicial=?, pesoInicial=?, pesoFinal=?, fechaFinal=? WHERE idPaciente=?";

            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1,Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(2, dieta.getPesoInicial() );
            ps.setDouble(3, dieta.getPesoFinal());
             ps.setDate(4,Date.valueOf(dieta.getFechaFinal()));
            ps.setInt(5, idPaciente);
            int exito = ps.executeUpdate();

           
            
            if(exito==1){
                actual=true;
            }
            else{
                actual=false;
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla inscripcion " + ex.getMessage());
        }
return actual;
    }


   
    public void borrarDietaPorPaciente( int idPaciente) {
        try {
            String sql = "DELETE FROM dieta WHERE idPaciente = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            int exito = ps.executeUpdate();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "La Dieta se elimino correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la dieta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla Dieta " + ex.getMessage());
        }
    }
    
    
public Dieta obtenerUnaDietaPorPersona(int id) {
    Dieta dieta = null; // Cambio el tipo de retorno y creo una variable para almacenar la dieta
    
    try {
        String sql = "SELECT idDieta, nombre, idPaciente, fechaInicial, pesoInicial, pesoFinal, fechaFinal, altura FROM dieta WHERE idPaciente=?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet resultado = ps.executeQuery();

        if (resultado.next()) { // Cambio el while a un if, ya que solo necesitas una dieta
            dieta = new Dieta();

            dieta.setIdDieta(resultado.getInt("idDieta"));
            dieta.setNombre(resultado.getString("nombre"));

            PacienteData pacienteData = new PacienteData();
            int idPaciente = resultado.getInt("idPaciente");
            dieta.setPaciente(pacienteData.obtenerPacientePorId(idPaciente));

            dieta.setFechaInicial(resultado.getDate("fechaInicial").toLocalDate());

            dieta.setPesoInicial(resultado.getDouble("pesoInicial"));
            dieta.setPesoFinal(resultado.getDouble("pesoFinal"));
            dieta.setFechaFinal(resultado.getDate("fechaFinal").toLocalDate());
            dieta.setAltura(resultado.getDouble("altura"));
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la tabla inscripcion" + ex);
    } catch (NullPointerException ex) {
        JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos" + ex.getMessage());
    }
    
    return dieta; // Devuelve la dieta encontrada o null si no se encuentra ninguna
}

    
    
    
    
}


    

