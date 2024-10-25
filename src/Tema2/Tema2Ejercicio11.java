package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double n1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        double n2 = in.nextDouble();
        System.out.println("Introduce el tercer numero");
        double n3 = in.nextDouble();
        if (n2==n1+1 && n3==n2+1) {
            System.out.println("Los numeros son consecutivos");
        } else {
            System.out.println("Los numeros no son consecutivos");
        }

    }
}
