/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2;

public class Calificacion {
    private Estudiante estudiante;
    private Examen examen;
    private int nota;

    public Calificacion(Estudiante estudiante, Examen examen, int nota) {
        this.estudiante = estudiante;
        this.examen = examen;
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Calificacion{" +
                "estudiante=" + estudiante.getCedula() +
                ", examen=" + examen +
                ", nota=" + nota +
                '}';
    }
}

