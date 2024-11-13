/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class PreguntaUnicaRespuesta extends Pregunta {
    private String respuestaCorrecta;

    public PreguntaUnicaRespuesta(String enunciado, double pesoEvaluativo, String respuestaCorrecta) {
        super(enunciado, pesoEvaluativo);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public boolean esCorrecta(String respuesta) {
        return respuesta.equals(respuestaCorrecta);
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
}

