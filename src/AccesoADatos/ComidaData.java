
package AccesoADatos;

import Entidades.Comida;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class ComidaData {

    private Connection con = null;

    public ComidaData() {

        con = Conexion.getconexion();

    }

    public void guardarComida(Comida comida) {

        String sql = "INSERT INTO comida (nombre, detalle,tipoComida, cantidadCalorias) VALUES (?,?,?,?) ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setString(3, comida.getTipoComida());
            ps.setInt(4, comida.getCantidadCalorias());

            int listaModificada = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                comida.setIdComida(rs.getInt(1));
            }
            if (listaModificada > 0) {

                JOptionPane.showMessageDialog(null, " La Comida ha sido añadida con exito");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion");
        }

    }

    public Comida buscarComida(int id) {
        Comida comida = null;

        try {
            String sql = "SELECT nombre,detalle, tipoComida ,cantidadCalorias FROM comida WHERE idComida = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {

                comida = new Comida();

                comida.setIdComida(id);
                comida.setNombre(resultado.getString("nombre"));
                comida.setDetalle(resultado.getString("detalle"));
                comida.setTipoComida(resultado.getString("tipoComida"));
                comida.setCantidadCalorias(resultado.getInt("cantidadCalorias"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa Comida");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la conexion" + ex);
        }

        return comida;
    }

    public void modificarComida(Comida comida) {
        
        try {
        String sql = "UPDATE comida SET nombre=?, detalle=?, tipoComida=?, cantidadCalorias=? WHERE idComida=?";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, comida.getNombre());
        ps.setString(2, comida.getDetalle());
        ps.setString(3, comida.getTipoComida());
        ps.setInt(4, comida.getCantidadCalorias());
        ps.setInt(5, comida.getIdComida()); 
        
        int exito = ps.executeUpdate();
        
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Comida Modificada");
        } else {
            JOptionPane.showMessageDialog(null, "La Comida no existe");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al Conectar con la tabla comida: " + ex.getMessage());
    }
    }


    public List<Comida> listarComidas() {
        Comida comida = null;

        String sql = "SELECT nombre,detalle,tipoComida,cantidadCalorias,idComida FROM comida";

        ArrayList<Comida> comidas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet resultado = ps.executeQuery();

            while (resultado.next()) {

                comida = new Comida();
                comida.setNombre(resultado.getString("nombre"));
                comida.setDetalle(resultado.getString("detalle"));
                comida.setTipoComida(resultado.getString("tipoComida"));
                comida.setCantidadCalorias(resultado.getInt("cantidadCalorias"));
                comida.setIdComida(resultado.getInt("idComida"));
                comidas.add(comida);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la conexion" + ex);
        }

        return comidas;
    }
    public Comida obtenerComidaPorId(int idComida) {
    
    for (Comida comida : listarComidas()) {
        if (comida.getIdComida()== idComida) {
            return comida;
        }
    }
    return null; 
}
}
