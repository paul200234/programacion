package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public  static void main(String[] args){
        double ladoA;
        double ladoB;
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce la longitud del lado");
        ladoA = in.nextDouble();
        System.out.println("Introduce la longitud del segundo lado");
        ladoB = in.nextDouble();
        System.out.println("La longitud del perimetro es de " + (2*ladoA + 2*ladoB));
        System.out.println("La superficie es de " + (ladoB * ladoA));

    }
}
