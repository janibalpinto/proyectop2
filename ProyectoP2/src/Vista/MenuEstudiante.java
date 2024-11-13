/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Persistencia.GestionExamen;
import Persistencia.GestionHistorial;
import java.util.List;
import java.util.Scanner;
import Modelo.Calificacion;
import Modelo.Estudiante;
import Modelo.Examen;
import Modelo.PreguntaInterface;

public class MenuEstudiante {
    private GestionExamen controladorExamen;
    private GestionHistorial controladorHistorial;

    public MenuEstudiante(GestionExamen controladorExamen) {
        this.controladorExamen = controladorExamen;
        this.controladorHistorial = new GestionHistorial();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Realizar examen");
            System.out.println("2. Ver mis calificaciones");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de linea

            switch (opcion) {
                case 1:
                    realizarExamen(scanner);
                    break;
                case 2:
                    verMisCalificaciones(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del menu de estudiante...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    private void realizarExamen(Scanner scanner) {
        List<Examen> examenes = controladorExamen.obtenerExamenes();
        if (examenes.isEmpty()) {
            System.out.println("No hay examenes disponibles.");
            return;
        }

        System.out.println("Seleccione un examen:");
        for (int i = 0; i < examenes.size(); i++) {
            System.out.println((i + 1) + ". Examen " + (i + 1));
        }
        int seleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de linea

        if (seleccion < 1 || seleccion > examenes.size()) {
            System.out.println("Seleccion no valida.");
            return;
        }

        Examen examen = examenes.get(seleccion - 1);
        int nota = 0;

        for (PreguntaInterface pregunta : examen.getPreguntas()) {
            System.out.println(pregunta.getEnunciado());

            System.out.print("Ingrese su respuesta: ");
            String respuesta = scanner.nextLine();
            if (pregunta.esCorrecta(respuesta)) {
                nota += pregunta.getPesoEvaluativo();
            }
        }

        System.out.print("Ingrese su cedula: ");
        String cedula = scanner.nextLine();
        Estudiante estudiante = new Estudiante(cedula);
        Calificacion calificacion = new Calificacion(estudiante, examen, nota);
        controladorHistorial.agregarCalificacion(calificacion);

        System.out.println("Examen completado. Nota: " + nota);
    }

    private void verMisCalificaciones(Scanner scanner) {
        System.out.print("Ingrese su cedula: ");
        String cedula = scanner.nextLine();
        List<Calificacion> calificaciones = controladorHistorial.obtenerCalificaciones();
        boolean encontrado = false;

        System.out.println("Mis calificaciones:");
        for (Calificacion calificacion : calificaciones) {
            if (calificacion.getEstudiante().getCedula().equals(cedula)) {
                System.out.println("Examen: " + calificacion.getExamen() +
                                   ", Nota: " + calificacion.getNota());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron calificaciones para la cedula ingresada.");
        }
    }
}




