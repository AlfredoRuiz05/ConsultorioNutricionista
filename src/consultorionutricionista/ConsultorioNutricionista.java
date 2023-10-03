
package consultorionutricionista;

import AccesoADatos.ComidaData;
import AccesoADatos.PacienteData;
import Entidades.Comida;
import Entidades.Paciente;
import Entidades.Dieta;
import AccesoADatos.DietaData;
import java.time.LocalDate;
public class ConsultorioNutricionista {

    public static void main(String[] args) {
      // PacienteData pacienteData = new PacienteData();
      Paciente paciente = new Paciente("Martina", 23006789, "San Juan", "3777438",3,true);
      // pacienteData.guardarPaciente(paciente);
        //pacienteData.modificarPaciente(paciente);
        //pacienteData.eliminarPaciente(1);
        //System.out.println(pacienteData.buscarPaciente(3));
        //System.out.println(pacienteData.buscarPorDni(25156789));
//        for (Paciente ListarPaciente : pacienteData.ListarPacientes()) {
//            System.out.println(ListarPaciente);
//        }
        //System.out.println(pacienteData.obtenerPacientePorId(5));
        
        //ComidaData comidaData = new ComidaData();
        //Comida comida = new Comida("pan", "integral", 5,3);
        //comidaData.guardarComida(comida);
        //comidaData.modificarComida(comida);
        //System.out.println(comidaData.buscarComida(1));
//        for (Comida listarComida : comidaData.listarComidas()) {
//            System.out.println(listarComida);
//        }
        //System.out.println(comidaData.obtenerComidaPorId(2));
        
        
        Dieta dieta = new Dieta("Vegetariana", paciente ,LocalDate.of(2013, 3, 12) , 78.60,86.50,LocalDate.of(2014, 3, 12) );
        DietaData dietaData= new DietaData();
        //dietaData.guardarDieta(dieta);
        //System.out.println(dietaData.obtenerDietas(3));
       
        
       // System.out.println(dietaData.obtenerDietaPorPersona(3));
            
       
       dietaData.borrarDietaPorPaciente(2);
            
       
        
        
        
        
    }
    
    
    }
    

