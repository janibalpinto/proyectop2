
package proyectop2;

import java.util.ArrayList;

/**
 *
 * @author Beykel
 */
public class Foro {
    private ArrayList<Usuario> participantes = new ArrayList<>();
    private ArrayList<String> mensajes = new ArrayList<>();

    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Usuario> participantes) {
        this.participantes = participantes;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    }
    
    public void publicarMensaje(String mensaje) {
        mensajes.add(mensaje);
        System.out.println("Nuevo mensaje en el foro: " + mensaje);
    }

    public void verCalificaciones() {
        System.out.println("Mostrando calificaciones en el foro...");
    }
}
