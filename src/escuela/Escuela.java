/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escuela;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Escuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      Curso curso = new Curso("Programacion orientada a objetos");

        int opcion;
        do {
            System.out.println("==== Menu Principal ====");
            System.out.println("1. Agregar Estudiantes");
            System.out.println("2. Cursos");
            System.out.println("3. Simulacro de examen");
            System.out.println("4. Agregar nota al alumno");
            System.out.println("5. Ver nota");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = scanner.nextInt();
//menu
            switch (opcion) {
                case 1:
               System.out.println("Agregar Estudiante:");

                    System.out.print("Ingrese el nombre del estudiante: ");
                    scanner.nextLine();  // Consumir la línea en blanco
                    String nombreEstudiante = scanner.nextLine();
                    System.out.print("Ingrese el apellido del estudiante: ");
                    String apellidoEstudiante = scanner.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edadEstudiante = scanner.nextInt();
                    System.out.print("Ingrese el id del estudiante: ");
                    int idEstudiante = scanner.nextInt();

                    Estudiante nuevoEstudiante = new Estudiante(nombreEstudiante, 
                            apellidoEstudiante, edadEstudiante, 
                            idEstudiante);
                 
                    curso.agregarEstudiante(nuevoEstudiante);
                    break;
                case 2:
                    System.out.println("Administrar Cursos:");
                    curso.mostrarInformacion();
                    break;
                case 3:
                    System.out.println("Administrar Examenes:");
                    Examen examen = new Examen(); 
                    Pregunta pregunta1 = new Pregunta("¿Cuál es la capital de Francia?", "Paris", "La respusta es correcta");
                    Pregunta pregunta2 = new Pregunta("¿En qué año se fundó Google?", "1999", "La respusta es correcta");
                    Pregunta pregunta3 = new Pregunta("¿Quién escribió Romeo y Julieta?", "", "La respusta es correcta");

                    examen.agregarPregunta(pregunta1);
                    examen.agregarPregunta(pregunta2);
                    examen.agregarPregunta(pregunta3);

                    System.out.println("Bienvenido al examen. Por favor, responde las siguientes preguntas:");
                    examen.presentarExamen();

                    System.out.println("\nResumen de tus respuestas:");
                    for (int i = 0; i < examen.getPreguntas().size(); i++) {
                        Pregunta pregunta = examen.getPreguntas().get(i);
                        System.out.println("Pregunta " + (i + 1) + ": " + pregunta.getEnunciado());
                        System.out.println("Tu respuesta: " + pregunta.getRespuesta());
                        System.out.println("respuesta  " + (i + 1) + ": " + pregunta.getCorrecta());
                        System.out.println();
                        //scanner.close();
                    }
                    break;
                         case 4:
                    System.out.println("Agregar Nota al Alumno:");
    System.out.print("Ingrese el id del estudiante: ");
    int idEstudianteb = scanner.nextInt();
    Estudiante estudianteAgregarNota = null;
    // Buscar el estudiante por su ID
    for (Estudiante estudiante : curso.getEstudiantes()) {
        if (estudiante.getId() == idEstudianteb) {
            estudianteAgregarNota = estudiante;
            break;
        }
    }
    if (estudianteAgregarNota != null) {
        System.out.print("Ingrese el valor de la nota: ");
        double valorNota = scanner.nextDouble();
        scanner.nextLine(); // Consumir la línea en blanco
        System.out.print("Ingrese la fecha de la nota: ");
        String fechaNota = scanner.nextLine();

        Nota nuevaNota = new Nota(valorNota, fechaNota);
        estudianteAgregarNota.agregarNota(nuevaNota);
        System.out.println("Nota agregada al alumno " + estudianteAgregarNota.getNombre() + " " + estudianteAgregarNota.getApellido());
    } else {
        System.out.println("No se encontró un alumno con ese ID.");
    }
    break;
                case 5:
                   System.out.println("Ver Nota del Alumno:");
    System.out.print("Ingrese el ID del estudiante: ");
    int idBusqueda = scanner.nextInt();
    Estudiante estudianteEncontrado = null;
    
    for (Estudiante estudiante : curso.getEstudiantes()) {
        if (estudiante.getId() == idBusqueda) {
            estudianteEncontrado = estudiante;
            break;
        }
    }
        if (estudianteEncontrado != null) {
        List<Nota> notasEstudiante = estudianteEncontrado.getNotas();
        System.out.println("Notas de " + estudianteEncontrado.getNombre() + " " + estudianteEncontrado.getApellido() + ":");
        
        for (Nota nota : notasEstudiante) {
            System.out.println("Fecha: " + nota.getFecha() + " - Valor: " + nota.getValor());
        }
    } else {
        System.out.println("Estudiante no encontrado.");
    }
    break;
    case 6:
    System.out.println("Saliendo del programa...");
    break;
           
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        //scanner.close();
    }
}
