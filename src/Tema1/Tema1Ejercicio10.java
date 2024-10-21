package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double cancer = in.nextDouble();
        System.out.println("Introduce el segundo número");
        double piscis = in.nextDouble();
        System.out.println("La suma de los numeros da: " + (cancer + piscis));
        System.out.println("La resta de los numeros da: " + (cancer - piscis));
        System.out.println("El producto de los numeros es: " + (cancer * piscis));
        System.out.println("La división de los numeros da: " + (cancer / piscis));
        System.out.println("El resto de los numeros da: " + (cancer % piscis));
    }
}