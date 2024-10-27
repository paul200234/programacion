package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args){
        Tema2Ejercicio1 cuadrado = new Tema2Ejercicio1();
        Tema2Ejercicio2 rectangulo = new Tema2Ejercicio2();
        Tema2Ejercicio3 triangulo = new Tema2Ejercicio3();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 0 para realizar un cuadrado");
        System.out.println("Introduce 1 para realizar un rectangulo");
        System.out.println("Introduce 2 para realizar un triangulo");
        int num = in.nextInt();
        switch (num){
            case 0:
                System.out.println("Has seleccionado cuadrado");
                cuadrado.main();
                return;
            case 1:
                System.out.println("Has seleccionado rectangulo");
                rectangulo.main();
                return;
            case 2:
                System.out.println("Has seleccionado trisngulo");
                triangulo.main();
                return;
            default:
                System.out.println("Ha habido un error");
        }
    }
}
