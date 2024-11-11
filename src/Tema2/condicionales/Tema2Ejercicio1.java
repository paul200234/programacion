package Tema2.condicionales;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public  static void main(){
        double ladoA;
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce la longitud del lado");
        ladoA = in.nextDouble();
        System.out.println("La longitud del perimetro es de " + (4*ladoA));
        System.out.println("La superficie es de " + (ladoA*ladoA));

    }
}
