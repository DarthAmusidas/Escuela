/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mariano
 */
public class Estudiante {

   private String nombre;
    private String apellido;
    private int edad;
    private int id;
    private List<Nota> notas;//relacion e notas y estudiantes

//constructores
    public Estudiante(String nombre, String apellido, int edad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.notas = new ArrayList<>();
    }
    //metodos setters y getters
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getApellido() {
        return apellido;
    }
    
    public String setApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

      public List<Nota> getNotas() {
        return notas;
    }
  public List<Nota> setNotas() {
        return notas;
    }
    public void agregarNota(Nota nota) {
        notas.add(nota);  // Agregar la nota al estudiante
    }
}
    

