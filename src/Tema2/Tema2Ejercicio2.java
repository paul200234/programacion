package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args){
    double lado1;
    double lado2;
    Scanner in =new Scanner(System.in);
        System.out.println("Introduce la longitud del lado");
    lado1 = in.nextDouble();
        System.out.println("Introduce la longitud del segundo lado");
    lado2 = in.nextDouble();
        System.out.println("La longitud del perimetro es de " + (2*lado1 + 2*lado2));
        System.out.println("La superficie es de " + (lado2 * lado1));

    }
}
