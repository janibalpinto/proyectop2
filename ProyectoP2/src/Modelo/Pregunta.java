/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public abstract class Pregunta implements PreguntaInterface {
    protected String enunciado;
    protected double pesoEvaluativo;

    public Pregunta(String enunciado, double pesoEvaluativo) {
        this.enunciado = enunciado;
        this.pesoEvaluativo = pesoEvaluativo;
    }

    @Override
    public String getEnunciado() {
        return enunciado;
    }

    @Override
    public double getPesoEvaluativo() {
        return pesoEvaluativo;
    }

    @Override
    public abstract boolean esCorrecta(String respuesta);
}
