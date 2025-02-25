package Tema5.Ejercicio3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Usuario> colaBanco = new LinkedList<>();
        int opcion;

        do {
            // Menú simple y limpio
            System.out.println("\n=== GESTIÓN DE COLA DEL BANCO ===");
            System.out.println("1. Añadir persona a la cola");
            System.out.println("2. Atender al primero de la cola");
            System.out.println("3. Quitar a una persona de la cola");
            System.out.println("4. Mostrar la cola actual");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Añadir persona a la cola ---");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("DNI: ");
                    int dni = scanner.nextInt();
                    // Lógica para añadir a la cola
                    colaBanco.add(new Usuario(edad,nombre,dni));
                    System.out.println("Persona añadida correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- Atender al primero de la cola ---");
                    colaBanco.poll();
                    System.out.println("Primera persona atendida y eliminada de la cola.");
                    break;

                case 3:
                    System.out.println("\n--- Quitar a una persona de la cola ---");
                    System.out.print("DNI de la persona a quitar: ");
                    int dniQuitar = scanner.nextInt();
                    colaBanco.removeIf(usuario -> usuario.getDni() == dniQuitar);
                    System.out.println("Persona eliminada correctamente.");
                    break;

                case 4:
                    System.out.println("\n--- Mostrar la cola actual ---");
                    colaBanco.forEach(usuario -> System.out.println(usuario.getNombre()));
                    System.out.println("Cola actual: [Mostrar lista de personas aquí]");
                    break;

                case 5:
                    System.out.println("\nSaliendo del programa... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
                    break;
            }


            if (opcion != 5) {
                System.out.println("\nPresione ENTER para continuar...");
                scanner.nextLine();
            }
        } while (opcion != 5);

        scanner.close();
    }
}
