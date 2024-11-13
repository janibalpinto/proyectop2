/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2;

import java.util.Scanner;

public class MenuPrincipal {
    private ControladorUsuario controladorUsuario;
    private ControladorExamen controladorExamen;
    private MenuDocente menuDocente;
    private MenuEstudiante menuEstudiante;

    public MenuPrincipal() {
        this.controladorUsuario = new ControladorUsuario();
        this.controladorExamen = new ControladorExamen();
        this.menuDocente = new MenuDocente(controladorUsuario, controladorExamen);
        this.menuEstudiante = new MenuEstudiante(controladorExamen);
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Registrar como docente");
            System.out.println("2. Iniciar sesión como docente");
            System.out.println("3. Acceder como estudiante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarDocente(scanner);
                    break;
                case 2:
                    iniciarSesionDocente(scanner);
                    break;
                case 3:
                    menuEstudiante.mostrarMenu();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    private void registrarDocente(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();
        Docente docente = new Docente(nombre, username, password);
        controladorUsuario.registrarUsuario(docente);
        System.out.println("Docente registrado exitosamente.");
    }

    private void iniciarSesionDocente(Scanner scanner) {
        System.out.print("Ingrese su nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();
        Usuario usuario = controladorUsuario.iniciarSesion(username, password);
        if (usuario instanceof Docente) {
            menuDocente.mostrarMenu((Docente) usuario);
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
    }
}


