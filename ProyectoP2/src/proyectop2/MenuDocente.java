/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2;

import java.util.List;
import java.util.Scanner;

public class MenuDocente {
    private ControladorUsuario controladorUsuario;
    private ControladorExamen controladorExamen;
    private ControladorHistorial controladorHistorial;

    public MenuDocente(ControladorUsuario controladorUsuario, ControladorExamen controladorExamen) {
        this.controladorUsuario = controladorUsuario;
        this.controladorExamen = controladorExamen;
        this.controladorHistorial = new ControladorHistorial();
    }

    public void mostrarMenu(Docente docente) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Crear pregunta");
            System.out.println("2. Crear examen");
            System.out.println("3. Ver historial de exámenes");
            System.out.println("4. Ver calificaciones de estudiantes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    crearPregunta(scanner, docente);
                    break;
                case 2:
                    crearExamen(scanner, docente);
                    break;
                case 3:
                    verHistorialExamenes();
                    break;
                case 4:
                    verCalificacionesEstudiantes();
                    break;
                case 5:
                    System.out.println("Saliendo del menú de docente...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private void crearPregunta(Scanner scanner, Docente docente) {
        System.out.println("Seleccione el tipo de pregunta:");
        System.out.println("1. Única respuesta");
        System.out.println("2. Opción múltiple");
        System.out.println("3. Verdadero o falso");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el enunciado de la pregunta: ");
        String enunciado = scanner.nextLine();
        System.out.print("Ingrese el peso evaluativo de la pregunta: ");
        Double pesoEvaluativo = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        Pregunta pregunta = null;
        switch (tipo) {
            case 1:
                System.out.print("Ingrese la respuesta correcta: ");
                String respuestaUnica = scanner.nextLine();
                pregunta = new PreguntaUnicaRespuesta(enunciado, pesoEvaluativo, respuestaUnica);
                break;
            case 2:
                System.out.print("Ingrese las opciones separadas por comas: ");
                String opciones = scanner.nextLine();
                System.out.print("Ingrese las respuestas correctas separadas por comas: ");
                String respuestas = scanner.nextLine();
                pregunta = new PreguntaOpcionMultiple(enunciado, pesoEvaluativo, List.of(opciones.split(",")), List.of(respuestas.split(",")));
                break;
            case 3:
                System.out.print("Ingrese la respuesta correcta (true/false): ");
                boolean respuestaVF = scanner.nextBoolean();
                pregunta = new PreguntaVerdaderoFalso(enunciado, pesoEvaluativo, respuestaVF);
                break;
            default:
                System.out.println("Tipo de pregunta no válido.");
                return;
        }

        docente.crearPregunta(pregunta);
        System.out.println("Pregunta creada exitosamente.");
    }

    private void crearExamen(Scanner scanner, Docente docente) {
        Examen examen = new Examen();
        System.out.println("Seleccione las preguntas para el examen:");
        List<Pregunta> bancoPreguntas = docente.getBancoPreguntas();
        for (int i = 0; i < bancoPreguntas.size(); i++) {
            System.out.println((i + 1) + ". " + bancoPreguntas.get(i).getEnunciado());
        }
        System.out.println("Ingrese los números de las preguntas separadas por comas:");
        String seleccion = scanner.nextLine();
        String[] indices = seleccion.split(",");
        for (String indice : indices) {
            int i = Integer.parseInt(indice.trim()) - 1;
            if (i >= 0 && i < bancoPreguntas.size()) {
                examen.agregarPregunta(bancoPreguntas.get(i));
            } else {
                System.out.println("Índice de pregunta no válido: " + (i + 1));
            }
        }
        controladorExamen.crearExamen(examen);
        controladorHistorial.agregarExamenAlHistorial(examen);
        System.out.println("Examen creado exitosamente.");
    }

    private void verHistorialExamenes() {
        List<Examen> examenes = controladorHistorial.obtenerHistorial();
        if (examenes.isEmpty()) {
            System.out.println("No hay exámenes en el historial.");
            return;
        }

        System.out.println("Historial de exámenes:");
        for (int i = 0; i < examenes.size(); i++) {
            System.out.println((i + 1) + ". Examen " + (i + 1));
        }
    }

    private void verCalificacionesEstudiantes() {
        List<Calificacion> calificaciones = controladorHistorial.obtenerCalificaciones();
        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
            return;
        }

        System.out.println("Calificaciones de estudiantes:");
        for (Calificacion calificacion : calificaciones) {
            System.out.println("Estudiante: " + calificacion.getEstudiante().getCedula() +
                               ", Examen: " + calificacion.getExamen() +
                               ", Nota: " + calificacion.getNota());
        }
    }
}



