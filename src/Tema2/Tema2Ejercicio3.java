package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
    public  static void main(String[] args){
        double lado1;
        double altura;
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce la longitud del lado");
        lado1 = in.nextDouble();
        System.out.println("Introduce la longitud del segundo lado");
        altura = in.nextDouble();
        System.out.println("La Superficie del triangulo es de " + lado1 * altura /2);
    }
}
