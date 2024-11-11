package Tema2.bucles;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero entero");
        int a = in.nextInt();
        int c;
        for(c=a-1;c>1;c--){
        a=a*c;
        }
        System.out.println("El factorial de su numero es: "+a);
    }
}
