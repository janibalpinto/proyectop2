/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2;

import java.util.ArrayList;
import java.util.List;

public class ControladorExamen {
    private List<Examen> examenes;

    public ControladorExamen() {
        this.examenes = new ArrayList<>();
    }

    public void crearExamen(Examen examen) {
        examenes.add(examen);
    }

    public List<Examen> obtenerExamenes() {
        return examenes;
    }
}

