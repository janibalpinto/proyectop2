
package proyectop2;

/**
 *
 * @author Beykel
 */
public class Actividad {
    String pregunta;
    String respuestaCorrecta;

    public Actividad(String pregunta, String respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public boolean resolverActividad(String respuesta) {
        boolean resultado = respuesta.equals(respuestaCorrecta);
        System.out.println("La respuesta es " + (resultado ? "correcta" : "incorrecta"));
        return resultado;
    }
}
