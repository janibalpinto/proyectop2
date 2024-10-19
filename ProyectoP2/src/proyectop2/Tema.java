
package proyectop2;

import java.util.ArrayList;

/**
 *
 * @author Beykel
 */
public class Tema {
    protected String titulo;
    private String contenido;
    private ArrayList<Actividad> actividades = new ArrayList<>();

    public Tema(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }

    public void mostrarTema() {
        System.out.println("Tema: " + titulo);
        System.out.println(contenido);
    }

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
        System.out.println("Actividad agregada al tema: " + actividad.pregunta);
    }
}
