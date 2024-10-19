
package proyectop2;

import java.util.ArrayList;

/**
 *
 * @author Beykel
 */
public class Estudiante extends Usuario{
    private String grado;
    private ArrayList<Evaluacion> calificaciones = new ArrayList<>();

    public Estudiante(String nombre, String email, String contrasena, String grado) {
        super(nombre, email, contrasena);
        this.grado = grado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public ArrayList<Evaluacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Evaluacion> calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public void realizarEvaluacion(Evaluacion evaluacion) {
        System.out.println("Realizando evaluacion: " + evaluacion.titulo);
        ArrayList<String> respuestas = new ArrayList<>();
        for (String pregunta : evaluacion.preguntas) {
            System.out.println(pregunta);
            respuestas.add("respuesta" + Math.random());
        }
        double calificacion = evaluacion.calificarEvaluacion(respuestas);
        calificaciones.add(evaluacion);
        System.out.println("Calificacion obtenida: " + calificacion);
    }

    public void verCalificaciones() {
        System.out.println("Calificaciones de " + nombre + ":");
        for (Evaluacion e : calificaciones) {
            System.out.println("Evaluacion: " + e.titulo);
        }
          
    }
    
    @Override
    public void mostrarRol() {
        System.out.println("Soy un estudiante de grado " + grado);
    }
    
}
