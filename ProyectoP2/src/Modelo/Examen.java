/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Examen {
    private List<PreguntaInterface> preguntas;
    private Map<Estudiante, Integer> resultados;

    public Examen() {
        this.preguntas = new ArrayList<>();
        this.resultados = new HashMap<>();
    }

    public void agregarPregunta(PreguntaInterface pregunta) {
        preguntas.add(pregunta);
    }

    public void registrarResultado(Estudiante estudiante, int nota) {
        resultados.put(estudiante, nota);
    }

    public List<PreguntaInterface> getPreguntas() {
        return preguntas;
    }

    public Map<Estudiante, Integer> getResultados() {
        return resultados;
    }
}



