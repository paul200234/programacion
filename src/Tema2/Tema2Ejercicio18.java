package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args){
        double num;
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce tu numero");
        num = in.nextDouble();
        if (num > 0) {
            num = Math.sqrt(num);
        }else {
            System.out.println("Error, introduce un numero positivo");
        }
    }
}
