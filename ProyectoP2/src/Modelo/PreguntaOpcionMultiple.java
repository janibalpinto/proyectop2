/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

public class PreguntaOpcionMultiple extends Pregunta {
    private List<String> opciones;
    private List<String> respuestasCorrectas;

    public PreguntaOpcionMultiple(String enunciado, double pesoEvaluativo, List<String> opciones, List<String> respuestasCorrectas) {
        super(enunciado, pesoEvaluativo);
        this.opciones = opciones;
        this.respuestasCorrectas = respuestasCorrectas;
    }

    @Override
    public boolean esCorrecta(String respuesta) {
        List<String> respuestas = List.of(respuesta.split(","));
        return respuestas.containsAll(respuestasCorrectas) && respuestasCorrectas.containsAll(respuestas);
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public List<String> getRespuestasCorrectas() {
        return respuestasCorrectas;
    }

    public void setRespuestasCorrectas(List<String> respuestasCorrectas) {
        this.respuestasCorrectas = respuestasCorrectas;
    }
}
