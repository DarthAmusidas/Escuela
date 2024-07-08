/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

/**
 *
 * @author Mariano
 */
import java.util.ArrayList;
import java.util.List;

public class Curso {
   private String nombre;
   private List<Estudiante> estudiantes;  // Relación con Estudiante
   private List<Nota> notas;// Relacion con notas

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
        this.notas= new ArrayList<>();
    }

    // Métodos getters y setters
    // ... (resto de los métodos)

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Nota> getNotas() {
        return notas;
    }
    

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);  // Agregar el estudiante al curso
    }
    public void agregarNota(Nota nota) {
        notas.add(nota);  // Agregar la nota al estudiante
    }
 
    public void mostrarInformacion() {
    System.out.println("Curso: " + nombre);
    System.out.println("Estudiantes inscritos:");
    for (Estudiante estudiante : estudiantes) {
    System.out.println("- " + estudiante.getNombre() + " " + estudiante.getApellido()+
           "de id "+estudiante.getId());//relacion entre curso y estudiante
        }
    }
}
