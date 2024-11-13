package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Usuario {
    private List<Pregunta> bancoPreguntas;

    public Docente(String nombre, String username, String password) {
        super(nombre, username, password);
        this.bancoPreguntas = new ArrayList<>();
    }

    public void crearPregunta(Pregunta pregunta) {
        bancoPreguntas.add(pregunta);
    }

    public List<Pregunta> getBancoPreguntas() {
        return bancoPreguntas;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nombre='" + nombre + '\'' +
                ", username='" + username + '\'' +
                ", bancoPreguntas=" + bancoPreguntas +
                '}';
    }
}


