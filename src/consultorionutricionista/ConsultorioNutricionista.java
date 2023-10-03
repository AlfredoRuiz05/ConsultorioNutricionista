
package consultorionutricionista;

import AccesoADatos.ComidaData;
import AccesoADatos.PacienteData;
import Entidades.Comida;
import Entidades.Paciente;

public class ConsultorioNutricionista {

    public static void main(String[] args) {
        PacienteData pacienteData = new PacienteData();
        Paciente paciente = new Paciente("Alfredo", 43006789, "Saenz Pena", "3742577438",true);
        pacienteData.guardarPaciente(paciente);
        //pacienteData.modificarPaciente(paciente);
        //pacienteData.eliminarPaciente(1);
        //System.out.println(pacienteData.buscarPaciente(3));
        //System.out.println(pacienteData.buscarPorDni(25156789));
//        for (Paciente ListarPaciente : pacienteData.ListarPacientes()) {
//            System.out.println(ListarPaciente);
//        }
        //System.out.println(pacienteData.obtenerPacientePorId(5));
        
        ComidaData comidaData = new ComidaData();
        Comida comida = new Comida("pan", "integral", 5,3);
        //comidaData.guardarComida(comida);
        //comidaData.modificarComida(comida);
        //System.out.println(comidaData.buscarComida(1));
//        for (Comida listarComida : comidaData.listarComidas()) {
//            System.out.println(listarComida);
//        }
        //System.out.println(comidaData.obtenerComidaPorId(2));
    }
    }
    

