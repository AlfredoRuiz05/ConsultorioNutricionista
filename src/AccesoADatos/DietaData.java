
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

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dieta.getNombre() );
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDate(3, Date.valueOf( dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(7, dieta.getAltura());
            int listaModificada = ps.executeUpdate();

            if (listaModificada == 1) {

                JOptionPane.showMessageDialog(null, " La Dieta ha sido añadida con exito");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion");
        }
    }

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
            String sql = "UPDATE dieta SET fechaInicial=?,pesoInicial,pesoFinal,fechaFinal WHERE idPaciente=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1,Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(2, dieta.getPesoInicial() );
            ps.setDouble(3, dieta.getPesoFinal());
             ps.setDate(4,Date.valueOf(dieta.getFechaFinal()));
            
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


    
    
    public void Objetivo (){
        
        
        
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
    
    
//    
//     public List<Paciente> ObjetivosNoCumplidos ( int idDieta ) {
//
//        ArrayList<Paciente> pacientes = new ArrayList<>();
//        String sql = "SELECT * FROM paciente "
//                + "WHERE estado = 1 AND idMateria NOT IN "
//                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
//
////        String sql="SELECT *FROM materia"
////                + "WHERE estado=1 AND idMateria not in"
////                + "(SELECT idMateria FROM inscripcion WHERE idAlumno=?)";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idAlumno);
//            ResultSet resultado = ps.executeQuery();
//            while (resultado.next()) {
//                Materia materia = new Materia();
//                materia.setIdMateria(resultado.getInt("idMateria"));
//                materia.setNombre(resultado.getString("nombre"));
//                materia.setAnioMateria(resultado.getInt("año"));
//                materias.add(materia);
//
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la tabla " + ex);
//        }
//        return materias;
//    }

    
    
    
    
    
    
}


    

