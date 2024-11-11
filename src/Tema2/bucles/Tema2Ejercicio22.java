package Tema2.bucles;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu numero");
        long a = in.nextInt();
        long n = a;
        int i =0;
        while (n>0){
            n=n/10;
            i++;
        }
        System.out.println("tu numero tiene "+i+" cifras");
    }
}
