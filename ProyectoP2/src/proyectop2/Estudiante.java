package proyectop2;


import java.util.HashMap;
import java.util.Map;

public class Estudiante {
    private String cedula;
    private Map<Examen, Calificacion> calificaciones;

    public Estudiante(String cedula) {
        this.cedula = cedula;
        this.calificaciones = new HashMap<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void agregarCalificacion(Examen examen, Calificacion calificacion) {
        calificaciones.put(examen, calificacion);
    }

    public Calificacion obtenerCalificacion(Examen examen) {
        return calificaciones.get(examen);
    }
}