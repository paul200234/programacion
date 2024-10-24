package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero");
        double n1 = in.nextDouble();
        if(n1==0){
            System.out.println("Tu numero es igual a 0");
        } else if (n1>0) {
            System.out.println("Tu numero es positivo");
        }else {
            System.out.println("Tu numero es negativo");
        }
    }
}
