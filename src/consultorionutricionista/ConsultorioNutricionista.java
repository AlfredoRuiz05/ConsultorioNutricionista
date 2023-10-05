package consultorionutricionista;

import AccesoADatos.ComidaData;
import AccesoADatos.PacienteData;
import Entidades.Comida;
import Entidades.Paciente;
import Entidades.Dieta;
import AccesoADatos.DietaData;
import java.time.LocalDate;
import java.time.Month;
import Entidades.Seguimiento;
import AccesoADatos.SeguimientoData;

public class ConsultorioNutricionista {

    public static void main(String[] args) {
        PacienteData pacienteData = new PacienteData();
        Paciente paciente = new Paciente("Carlos", 12, "Cosquin", "13", 2);
        //pacienteData.guardarPaciente(paciente);
        // pacienteData.modificarPaciente(paciente);
        //pacienteData.eliminarPaciente(3);
        //System.out.println(pacienteData.buscarPacientePorID(3));
        //System.out.println(pacienteData.buscarPacientePorDni(1));
        //for (Paciente ListarPaciente : pacienteData.ListarPacientes()) {
        //   System.out.println(ListarPaciente);
        //}
        //System.out.println(pacienteData.obtenerPacientePorId(2));

        // ComidaData comidaData = new ComidaData();
        // Comida comida = new Comida(" Frutos secos ", "Vitamina D","Cena", 600,4);
        //comidaData.guardarComida(comida);
        // comidaData.modificarComida(comida);
        // System.out.println(comidaData.buscarComida(1));
        // for (Comida listarComida : comidaData.listarComidas()) {
        //      System.out.println(listarComida);
        //  }
        //  System.out.println(comidaData.obtenerComidaPorId(2));
        //Dieta dieta = new Dieta("Ayuno intermitente",   paciente ,LocalDate.of(2013, 3, 12) , 78.60,86.50,LocalDate.of(2014, 3, 12) , 1.70 );
        // DietaData dietaData= new DietaData();
        //dietaData.guardarDieta(dieta);
        // for(Dieta ListaDieta:dietaData.obtenerDietas()){
        // System.out.println(ListaDieta);
        // }
        //System.out.println(dietaData.obtenerDietaPorPersona(4));
        //dietaData.borrarDietaPorPaciente(4);
        Seguimiento seguimiento = new Seguimiento(paciente, LocalDate.of(2022, 10, 14), 43.1, 42.2, 32.0, 51);

        SeguimientoData seguimientoData = new SeguimientoData();

        seguimientoData.AgregarSeguimiento(seguimiento);
        //System.out.println(seguimientoData.ObtenerSeguimientoPorID(8));
        // seguimientoData.eliminarSeguimiento(8);
        //System.out.println( seguimientoData.obtenerSeguimientoPorPersona(1));
        //System.out.println(seguimientoData.encontrarFechaMasReciente(2));
        //System.out.println(seguimientoData.obtenerPesoPorFecha(2));
        //System.out.println(seguimientoData.obtenerPesoPorFecha2(2, LocalDate.of(2019, 05, 14)));
    }

}
