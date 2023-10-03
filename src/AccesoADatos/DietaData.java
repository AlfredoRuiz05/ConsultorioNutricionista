//
//package AccesoADatos;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//
//
//
//public class DietaData {
//
//    private Connection con = null;
//
//
//    public DietaDataData() {
//        con = Conexion.getconexion();
//    }
//
//    public void guardarInscripcion(Inscripcion insc) {
//        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?,?,?)";
//        Alumno alumno = new Alumno();
//
//        try {
//
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.setDouble(1, insc.getNota());
//            ps.setInt(2, insc.getAlumno().getIdAlumno());
//            ps.setInt(3, insc.getMateria().getIdMateria());
//
//            int listaModificada = ps.executeUpdate();
//
//            if (listaModificada == 1) {
//
//                JOptionPane.showMessageDialog(null, " La Inscripcion ha sido añadida con exito");
//            }
//
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion");
//        }
//    }
//
//    public List<Inscripcion> obtenerInscripciones(int idInscripcion) {
//        String sql = "SELECT IDinscripcion, nota, idAlumno, idMateria FROM inscripcion WHERE idInscripcion = ?";
//        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
//
//        try {
//
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idInscripcion);
//
//            ResultSet resultado = ps.executeQuery();
//
//            while (resultado.next()) {
//                Inscripcion inscripcion = new Inscripcion();
//                inscripcion.setIdInscripcion(resultado.getInt("IDinscripcion"));
//                inscripcion.setNota(resultado.getInt("nota"));
//
//                int idAlumno = resultado.getInt("idAlumno");
//                AlumnoData alumnoData = new AlumnoData();
//
//                inscripcion.setAlumno(alumnoData.obtenerAlumnoPorId(idAlumno));
//
//                int idMateria = resultado.getInt("idMateria");
//                MateriaData materiaData = new MateriaData();
//                inscripcion.setMateria(materiaData.obtenerMateriaPorId(idMateria));
//
//                inscripciones.add(inscripcion);
//            }
//
//            con.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la tabla inscripcion");
//        }
//
//        return inscripciones;
//    }
//
//    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
//        
//        List<Inscripcion> alumnos = new ArrayList<>();
//
//        try {
//            String sql = "SELECT idInscripcion, nota, idAlumno, idMateria FROM inscripcion WHERE idAlumno=?";
//
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet resultado = ps.executeQuery();
//            Inscripcion insc;
//
//            while (resultado.next()) {
//                insc = new Inscripcion();
//                insc.setIdInscripcion(resultado.getInt("idInscripcion"));
//                insc.setNota(resultado.getInt("nota"));
//
//                AlumnoData alumnoData = new AlumnoData();
//                int idAlumno = resultado.getInt("idAlumno");
//                insc.setAlumno(alumnoData.obtenerAlumnoPorId(idAlumno));
//
//                MateriaData materiaData = new MateriaData();
//                int idMateria = resultado.getInt("idMateria");
//                insc.setMateria(materiaData.obtenerMateriaPorId(idMateria));
//
//                alumnos.add(insc);
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la tabla inscripcion" + ex);
//        } catch (NullPointerException ex) {
//            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos" + ex.getMessage());
//        }
//        return alumnos;
//    }
//
//    public boolean actualizarNota(double nota, int idAlumno, int idMateria) {
//        boolean actual=false;
//        try {
//            String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? and idMateria=?";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setDouble(1, nota);
//            ps.setInt(2, idAlumno);
//            ps.setInt(3, idMateria);
//            int exito = ps.executeUpdate();
//
//            if(exito==1){
//                actual=true;
//            }
//            else{
//                actual=false;
//            }
////            if (exito >= 1) {
////                JOptionPane.showMessageDialog(null, "La nota se actualizo correctamente");
////            } else {
////
////                JOptionPane.showMessageDialog(null, "La nota no se pudo actualizar");
////            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla inscripcion " + ex.getMessage());
//        }
//return actual;
//    }
//
//    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
//        try {
//            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idAlumno);
//            ps.setInt(2, idMateria);
//            int exito = ps.executeUpdate();
//            if (exito > 0) {
//                JOptionPane.showMessageDialog(null, "la inscripcion se elimino correctamente");
//            } else {
//                JOptionPane.showMessageDialog(null, "no se pudo eliminar la inscripcion");
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla inscripcion " + ex.getMessage());
//        }
//    }
//
//    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
//
//        ArrayList<Materia> materias = new ArrayList<>();
//        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia "
//                + "WHERE inscripcion.idMateria = materia.idMateria "
//                + "AND inscripcion.idAlumno = ?";
//
////        String sql="SELECT inscripcion.idMateria,nombre,año FROM inscripcion,"
////                + "materia WHERE inscripcion.idMateria=materia.idMateria"
////                + "AND inscripcion.idAlumno=?";
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
//
//    public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
//
//        ArrayList<Materia> materias = new ArrayList<>();
//        String sql = "SELECT * FROM materia "
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
//
//    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
//        ArrayList<Alumno> alumnosMateria = new ArrayList<>();
//        String sql = "SELECT alumno.idAlumno,dni,nombre,apellido,fechaNacimiento,estado\n"
//                + "FROM alumno JOIN inscripcion ON (inscripcion.idAlumno=alumno.idAlumno) WHERE inscripcion.idMateria=? AND alumno.estado=1";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idMateria);
//            ResultSet resultado = ps.executeQuery();
//            while (resultado.next()) {
//                Alumno alumno = new Alumno();
//                alumno.setIdAlumno(resultado.getInt("idAlumno"));
//                alumno.setDni(resultado.getInt("dni"));
//                alumno.setApellido(resultado.getString("apellido"));
//                alumno.setNombre(resultado.getString("nombre"));
//                alumno.setFechaNacimiento(resultado.getDate("fechaNacimiento").toLocalDate());
//                alumno.setActivo(resultado.getBoolean("estado"));
//                alumnosMateria.add(alumno);
//            }
//
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la tabla " + ex);
//        }
//
//        return alumnosMateria;
//
//    }
