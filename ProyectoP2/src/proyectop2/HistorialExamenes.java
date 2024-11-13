/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2;

import java.util.ArrayList;
import java.util.List;

public class HistorialExamenes {
    private List<Examen> examenes;

    public HistorialExamenes() {
        this.examenes = new ArrayList<>();
    }

    public void agregarExamen(Examen examen) {
        examenes.add(examen);
    }

    public List<Examen> getExamenes() {
        return examenes;
    }
}


