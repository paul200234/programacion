package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static boolean entre(int min, int max, int num){
        if (num>=min && num<=max){
            return true;
        }else {
            return false;
        }
    }
    public static void tablas(int multiplicador, int multiplicando){
        System.out.println("**********************************");
        for (int i  = 1; i <= multiplicando; i++) {

            System.out.println(multiplicador+" x "+i+" = "+(multiplicador*i));
        }
        System.out.println("**********************************");

    }

    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 10:");
        int numero = in.nextInt();

        if(entre(1,10,numero)){
            tablas(numero,10);

        }else {
            System.out.println("Error");
        }

    }
}
