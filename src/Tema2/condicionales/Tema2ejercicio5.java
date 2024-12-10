package Tema2.condicionales;

import java.util.Scanner;

public class Tema2ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double n1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        double n2 = in.nextDouble();
        System.out.println("Introduce el tercer numero");
        double n3 = in.nextDouble();
        double mediaD = (n1 + n2 + n3) / 3;
        int mediaS = ((int) n1 + (int) n2 + (int) n3) / 3;
        System.out.println("La media con decimales es " + mediaD);
        System.out.println("La media sin decimales es " + mediaS);

    }
}
