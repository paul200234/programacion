package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio1 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserta un numero: ");
        int num;
        num = in.nextInt();
        System.out.println(numberSign(num));
    }
    public static int numberSign(int numero){
        if(numero == 0){
            return 0;
        } else if (numero < 0) {
            return -1;
        }else {
            return 1;
        }
    }
}
