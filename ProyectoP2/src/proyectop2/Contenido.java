
package proyectop2;

import java.util.ArrayList;

/**
 *
 * @author Beykel
 */
public class Contenido {
    private String titulo;
    private String descripcion;
    private ArrayList<Tema> temas = new ArrayList<>();

    public Contenido(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }

    public void mostrarContenido() {
        System.out.println("Contenido: " + titulo);
        System.out.println(descripcion);
    }

    public void agregarTema(Tema tema) {
        temas.add(tema);
        System.out.println("Tema agregado: " + tema.titulo);
    }
}
