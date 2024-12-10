package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {
    public static void piramide(char caracter, int nDLineas){
        for (int i = 0; i < nDLineas; i++) {
            for (int j = 0; j<= nDLineas-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print(caracter);
            }

            System.out.println();
        }
    }
    public static void main() {
        System.out.println("Introduce el caracter");
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        System.out.println("Introduce el numero de lineas");
        int linea = in.nextInt();
        piramide(ch,linea);


    }
}

