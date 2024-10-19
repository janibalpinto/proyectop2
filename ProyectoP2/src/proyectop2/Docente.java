
package proyectop2;

import java.util.ArrayList;

/**
 *
 * @author Beykel
 */
public class Docente extends Usuario{
    private String especialidad;

    public Docente(String nombre, String email, String contrasena, String especialidad) {
        super(nombre, email, contrasena);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public Evaluacion crearEvaluacion(String titulo, ArrayList<String> preguntas) {
        System.out.println("Creando evaluación: " + titulo);
        return new Evaluacion(titulo, preguntas);
    }

    public void agregarTema(Tema tema) {
        System.out.println("Agregando tema: " + tema.titulo);
    }

    public void calificaEvaluacion(Evaluacion evaluacion) {
        System.out.println("Calificando evaluación: " + evaluacion.titulo);
    }
    
    @Override
    public void mostrarRol() {
        System.out.println("Soy un docente especializado en " + especialidad);
    }
}
