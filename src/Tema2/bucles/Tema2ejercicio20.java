package Tema2.bucles;

import java.util.Scanner;

public class Tema2ejercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor entero de A");
        int a = in.nextInt();
        System.out.println("Introduce el valor entero de B");
        int b = in.nextInt();
        int i;
        if (b>a){
            if (a % 2 == 0){
                a++;
            }

            for(i=a;i<b;i+=2){
            System.out.print(i+" ");
            }
        }

    }
}
