/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.ArrayList;
import java.util.List;
import Modelo.Examen;

public class GestionExamen {
    private List<Examen> examenes;

    public GestionExamen() {
        this.examenes = new ArrayList<>();
    }

    public void crearExamen(Examen examen) {
        examenes.add(examen);
    }

    public List<Examen> obtenerExamenes() {
        return examenes;
    }
}

