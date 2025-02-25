package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio4 {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);
    static int[] lista= new int[random.nextInt(100)];

    public static void main(String[] args) {
        for (int i=0 ; i<lista.length; i++) {
            lista[i] = random.nextInt(10);
        }
        int opcion=0;
        do {
            System.out.println("Introduce una posicion del vector para mostrar por pantalla");

            try {
                opcion=in.nextInt();
            }catch (InputMismatchException e){
                e.printStackTrace();
                System.out.println("Error numero incorrecto");
                in.nextLine();
                opcion=0;
            }
            try {
                System.out.println("Numero de la array de la posicion "+opcion+": "+lista[opcion]);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("Numero fuera del rango");
            }

        }while (opcion>=0);
    }
}
