/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

/**
 *
 * @author Mariano
 */
public class Pregunta {
//atributos
    private String enunciado;
    private String respuesta;
    private String correcta;
//contructores
    public Pregunta(String enunciado, String respuesta, String correcta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.correcta = correcta;
    }
//metodos
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public String getCorrecta() {
        return correcta;
    }
}
  

