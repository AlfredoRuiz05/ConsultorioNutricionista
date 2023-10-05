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
            String sqlFecha = "SELECT idPaciente, fecha FROM seguimiento WHERE idPaciente=?";
            PreparedStatement psFecha = con.prepareStatement(sqlFecha);
            psFecha.setInt(1, seguimiento.getPaciente().getIdPaciente());
            ResultSet rs = psFecha.executeQuery();
            LocalDate fecha;
            if(rs.next()){
                fecha = rs.getDate("fecha").toLocalDate();
                            if (fecha.compareTo(seguimiento.getFecha()) != 0) {
                String sql = "INSERT INTO Seguimiento (idPaciente ,fecha, medidaPecho ,medidaCintura ,medidaCadera, peso) VALUES (?,?,?,?,?,?)";               
                try (PreparedStatement ps = con.prepareStatement(sql)) {
                    ps.setInt(1, seguimiento.getPaciente().getIdPaciente());
                    ps.setDate(2, Date.valueOf(seguimiento.getFecha()));
                    ps.setDouble(3, seguimiento.getMedidaPecho());
                    ps.setDouble(4, seguimiento.getMedidaCintura());
                    ps.setDouble(5, seguimiento.getMedidaCadera());
                    ps.setDouble(6, seguimiento.getPeso());
                    int listaModificada = ps.executeUpdate();
                    if (listaModificada == 1) {                       
                        JOptionPane.showMessageDialog(null, " El seguimiento ha sido añadida con exito");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pueden repetir fechas");
            }
            }
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion "+ex.getMessage());
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

    public double obtenerPesoPorFecha2(int id, LocalDate fecha) {
        double peso = 0;

        try {
            String sql = "SELECT peso FROM seguimiento WHERE fecha=? AND idPaciente=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ps.setInt(2, id);
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                peso = resultado.getDouble("peso");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SeguimientoData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return peso;
    }
}
