
package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Paciente;

public class PacienteData {

    private Connection con = null;

    public PacienteData() {
        con = Conexion.getconexion();
    }

    public void guardarPaciente(Paciente paciente) {
        try {
            String sql = "INSERT INTO paciente (nombre, dni, domicilio, telefono, estado) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setString(4, paciente.getTelefono());
            ps.setBoolean(5, paciente.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agrego exitosamente un paciente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Conectar con la tabla paciente" + ex.getMessage());
        }
    }

    public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET  nombre=?,dni=?, domicilio=?,telefono=?  WHERE idPaciente=?";
        try {
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());           
            ps.setString(4, paciente.getTelefono());
            ps.setInt(5, paciente.getIdPaciente());
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito >0) {
                JOptionPane.showMessageDialog(null, "Paciente Modificado");
            } else {
                JOptionPane.showMessageDialog(null, "El Paciente no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Conectar con la tabla paciente" + ex.getMessage());
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "el dni debe ser numerico" + e.getMessage());
        }
    }

    public void eliminarPaciente(int id) {
        try {
            String sql = "UPDATE paciente SET estado = 0  WHERE idPaciente=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente dado de baja");
            } else {
                JOptionPane.showMessageDialog(null, "El Paciente no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Conectar con la tabla paciente" + ex.getMessage());
        }
    }

    public Paciente buscarPaciente(int id) {

        Paciente paciente = null;

        try {
            String sql = "SELECT nombre, dni, domicilio, telefono FROM paciente WHERE idPaciente = ? AND estado = 1";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {

                paciente = new Paciente();
                paciente.setIdPaciente(id);
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setDni(resultado.getInt("dni"));
                paciente.setDomicilio(resultado.getString("domicilio"));
                paciente.setTelefono(resultado.getString("telefono"));

                paciente.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese paciente");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la conexion" + ex);
        }

        return paciente;

    }

    public Paciente buscarPorDni(int dni) {

        Paciente paciente = null;

        try {
            String sql = "SELECT nombre, dni, domicilio, telefono, idPaciente FROM paciente WHERE dni = ? AND estado = 1";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, dni);

            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {

                paciente = new Paciente();

                paciente.setIdPaciente(resultado.getInt("idPaciente"));
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setDni(resultado.getInt("dni"));
                paciente.setDomicilio(resultado.getString("domicilio"));
                paciente.setTelefono(resultado.getString("telefono"));

                paciente.setEstado(true);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la conexion" + ex);
        }

        return paciente;

    }

    public List<Paciente> ListarPacientes() {

        Paciente paciente = null;

        String sql = "SELECT nombre, dni, domicilio, telefono, idPaciente FROM paciente WHERE  estado = 1";

        ArrayList<Paciente> pacientes = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet resultado = ps.executeQuery();

            while (resultado.next()) {

                paciente = new Paciente();

                paciente.setIdPaciente(resultado.getInt("idPaciente"));
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setDni(resultado.getInt("dni"));
                paciente.setDomicilio(resultado.getString("domicilio"));
                paciente.setTelefono(resultado.getString("telefono"));

                pacientes.add(paciente);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la conexion" + ex);
        }

        return pacientes;

    }
    public Paciente obtenerPacientePorId(int idPaciente) {
    
    for (Paciente paciente : ListarPacientes()) {
        if (paciente.getIdPaciente()== idPaciente) {
            return paciente;
        }
    }
    return null; 
}
}

