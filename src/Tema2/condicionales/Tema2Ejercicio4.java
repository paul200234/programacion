package Tema2.condicionales;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double n1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        double n2 = in.nextDouble();
        System.out.println("Introduce el tercer numero");
        double n3 = in.nextDouble();
        if (n1 > n2 && n1 > n3) {
            System.out.println("el mayor numero es " + n1);
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("el mayor numero es " + n2);
        }
        if (n3 > n2 && n1 < n3) {
            System.out.println("el mayor numero es " + n3);

        }
    }
}
