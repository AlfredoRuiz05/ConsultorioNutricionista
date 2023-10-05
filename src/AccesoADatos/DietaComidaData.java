package AccesoADatos;

import java.sql.Connection;

public class DietaComidaData {

    private Connection con = null;
    private PacienteData pacienteData;
    private ComidaData comidaData;

    public DietaComidaData() {
        con = Conexion.getconexion();
    }
}
