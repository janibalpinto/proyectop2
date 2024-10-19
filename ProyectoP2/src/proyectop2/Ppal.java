
package proyectop2;

import java.util.ArrayList;

/**
 *
 * @author Beykel
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", "juan@gmail.com", "12345", "Grado 10");
        Docente docente = new Docente("Prof. Ana", "ana@gmail.com", "67890", "Programacion Orientada a Objetos");

        ArrayList<String> preguntas = new ArrayList<>();
        preguntas.add("¿Qué es la abstraccion en programacion orientada a objetos?");
        preguntas.add("¿Cuol es la diferencia entre herencia y polimorfismo?");
        preguntas.add("¿Qué beneficios aporta el encapsulamiento?");
        preguntas.add("Explique el concepto de interfaz en la programacion orientada a objetos.");
        preguntas.add("¿Como se aplica el principio de responsabilidad unica en OOP?");

        Evaluacion evaluacion = docente.crearEvaluacion("Evaluacion de Programacion Orientada a Objetos", preguntas);
        estudiante.realizarEvaluacion(evaluacion);
        estudiante.verCalificaciones();

        Actividad actividad = new Actividad("Definir la palabra 'abstraccion' en el contexto de OOP", "abstraccion");
        Tema tema = new Tema("Fundamentos de POO", "Conceptos basicos de la Programacion Orientada a Objetos.");
        tema.agregarActividad(actividad);
        tema.mostrarTema();
        actividad.resolverActividad("abstraccion");

        Contenido contenido = new Contenido("Programacion Orientada a Objetos", "Curso avanzado de POO.");
        contenido.agregarTema(tema);
        contenido.mostrarContenido();

        Foro foro = new Foro();
        foro.publicarMensaje("Bienvenidos al foro de discusion sobre POO.");
    }
    
}
