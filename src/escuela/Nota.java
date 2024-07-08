/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;



/**
 *
 * @author Mariano
 */
public class Nota {   
   private double valor;
   private String fecha;

    public Nota() {
    }

    public Nota(double valor, String fecha) {
        this.valor = valor;
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
}
    

