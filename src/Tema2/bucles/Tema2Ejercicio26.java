package Tema2.bucles;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero entero");
        int a = in.nextInt();
        boolean primo=true;
        int i;
        for (i=a-1;i>1;i--){
            if (a%i==0){
                primo=false;
            }
        }
        if (primo){
            System.out.println("Tu numero "+a+" es primo");
        }else {
            System.out.println("Tu numero "+a+" no es primo");
        }
    }
}
