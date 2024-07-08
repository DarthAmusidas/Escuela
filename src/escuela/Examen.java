/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Examen {
    //atributos 
    private ArrayList<Pregunta> preguntas = new ArrayList<>();

 //metodos

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void presentarExamen() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < preguntas.size(); i++) {
            Pregunta pregunta = preguntas.get(i);
            System.out.println("Pregunta " + (i + 1) + ": " + pregunta.getEnunciado());
            System.out.print("Tu respuesta: ");
            String respuesta = scanner.nextLine();
            pregunta.setRespuesta(respuesta);
        }
        scanner.close();
    }
}
