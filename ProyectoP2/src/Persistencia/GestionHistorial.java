/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.ArrayList;
import java.util.List;
import Modelo.Calificacion;
import Modelo.Examen;

public class GestionHistorial {
    private HistorialExamenes historial;
    private List<Calificacion> calificaciones;

    public GestionHistorial() {
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



