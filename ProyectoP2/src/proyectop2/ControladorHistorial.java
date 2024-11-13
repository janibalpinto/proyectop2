/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2;

import java.util.ArrayList;
import java.util.List;

public class ControladorHistorial {
    private HistorialExamenes historial;
    private List<Calificacion> calificaciones;

    public ControladorHistorial() {
        this.historial = new HistorialExamenes();
        this.calificaciones = new ArrayList<>();
    }

    public void agregarExamenAlHistorial(Examen examen) {
        historial.agregarExamen(examen);
    }

    public List<Examen> obtenerHistorial() {
        return historial.getExamenes();
    }

    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }

    public List<Calificacion> obtenerCalificaciones() {
        return calificaciones;
    }
}



