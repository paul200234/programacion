package Tema5.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Map<String, Usuario> usuarios = new HashMap<>();
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Usuarios ---");
            System.out.println("1. Dar de alta un usuario");
            System.out.println("2. Dar de baja un usuario");
            System.out.println("3. Mostrar datos de un usuario");
            System.out.println("4. Modificar un usuario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("\n--- Dar de alta un usuario ---");
                    System.out.print("Ingrese el DNI: ");
                    String dniAlta = in.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    String nombreAlta = in.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edadAlta = in.nextInt();
                    in.nextLine();
                    /*                 ################
                    #################### Alta Usuario ########################
                                       ################
                    */
                    usuarios.put(dniAlta, new Usuario(edadAlta,nombreAlta));
                    break;

                case 2:
                    System.out.println("\n--- Dar de baja un usuario ---");
                    System.out.print("Ingrese el DNI del usuario a dar de baja: ");
                    String dniBaja = in.nextLine();
                    /*                 ################
                    #################### Baja Usuario ########################
                                       ################
                    */
                    usuarios.remove(dniBaja);
                    break;

                case 3:
                    System.out.println("\n--- Mostrar datos de un usuario ---");
                    System.out.print("Ingrese el DNI del usuario a mostrar: ");
                    String dniMostrar = in.nextLine();
                    /*                 ################
                    #################### Datos Usuario ########################
                                       ################
                    */

                    try {
                        System.out.println(usuarios.get(dniMostrar).toString());
                    } catch (NullPointerException e) {
                        System.out.println("La cuenta no existe");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Modificar un usuario ---");
                    System.out.print("Ingrese el DNI del usuario a modificar: ");
                    String dniModificar = in.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = in.nextLine();
                    System.out.print("Ingrese la nueva edad: ");
                    int nuevaEdad = in.nextInt();
                    in.nextLine();
                    try {
                        usuarios.replace(dniModificar, new Usuario(nuevaEdad,nuevoNombre));
                    } catch (NullPointerException e){
                        System.out.println("El usuario no existe");
                    }

                    break;

                case 5:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        in.close();
    }
}