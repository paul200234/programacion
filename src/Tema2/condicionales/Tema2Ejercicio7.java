package Tema2.condicionales;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int n1 = in.nextInt();
            System.out.println("Introduce el segundo número");
        int n2 = in.nextInt();
        if(n1 > n2){
            System.out.println("La resta de los numeros da: " + (n1 - n2));
        }
        else{
            System.out.println("La resta de los numeros da: " + (n2 - n1));

        }

    }
}
