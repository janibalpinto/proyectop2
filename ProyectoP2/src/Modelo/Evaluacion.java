
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Beykel
 */
public class Evaluacion {
    protected String titulo;
    protected ArrayList<String> preguntas = new ArrayList<>();

    public Evaluacion(String titulo, ArrayList<String> preguntas) {
        this.titulo = titulo;
        this.preguntas = preguntas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public void mostrarEvaluacion() {
        System.out.println("Evaluacion: " + titulo);
        for (String pregunta : preguntas) {
            System.out.println("Pregunta: " + pregunta);
        }
    }

    public double calificarEvaluacion(ArrayList<String> respuestas) {
        System.out.println("Calificando evaluacion: " + titulo);
        return Math.random() * 10; 
    }
}
