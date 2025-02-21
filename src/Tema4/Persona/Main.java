package Tema4.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce los datos de la primera persona:");
        System.out.print("DNI: ");
        String dni1 = in.nextLine();
        System.out.print("Nombre: ");
        String nombre1 = in.nextLine();
        System.out.print("Apellidos: ");
        String apellidos1 = in.nextLine();
        System.out.print("Edad: ");
        int edad1 = in.nextInt();
        in.nextLine();
        Persona persona1 = new Persona(dni1, nombre1, apellidos1, edad1);

        System.out.println("\nIntroduce los datos de la segunda persona:");
        System.out.print("DNI: ");
        String dni2 = in.nextLine();
        System.out.print("Nombre: ");
        String nombre2 = in.nextLine();
        System.out.print("Apellidos: ");
        String apellidos2 = in.nextLine();
        System.out.print("Edad: ");
        int edad2 = in.nextInt();
        in.nextLine();

        Persona persona2 = new Persona(dni2, nombre2, apellidos2, edad2);

        System.out.println("\nDatos de la primera persona:");
        persona1.print();
        System.out.println("\nDatos de la segunda persona:");
        persona2.print();

        System.out.println("\n¿Es la primera persona adulta? " + persona1.isAdult());
        System.out.println("¿Es la segunda persona adulta? " + persona2.isAdult());

        System.out.println("\n¿Está la primera persona jubilada? " + persona1.isRetired());
        System.out.println("¿Está la segunda persona jubilada? " + persona2.isRetired());


        System.out.println("\nDiferencia de edad entre las dos personas: " + persona1.agrDifference(persona2) + " años");

        in.close();
    }
}