package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {
    public static boolean esPositivo(double num){
        return num > 0;
    }
    public static double calculateCirclePerimeter(double radius){
        return radius * Math.PI * 2;
    }
    public static double calculateCircleArea(double radius){
        return radius * radius * Math.PI;
    }

    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo");
        double radio = in.nextDouble();
        while (!esPositivo(radio)){
            System.out.println("Valor ilegal introduce el radio del circulo");
            radio = in.nextDouble();
        }
        System.out.println("El perimetro de la circumferencia es: "+calculateCirclePerimeter(radio));
        System.out.println("El area del circulo es: "+calculateCircleArea(radio));

    }
}
