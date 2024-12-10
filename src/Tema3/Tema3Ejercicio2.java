package Tema3;

import java.util.Scanner;

import static Tema3.Tema3Ejercicio1.numberSign;

public class Tema3Ejercicio2 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserta un numero: ");
        int num;
        num = in.nextInt();
        System.out.println(numberSign(num));
        System.out.println("Introduce una edad");
        int edad = in.nextInt();
        if (isAdult(edad)){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
    }
    public static boolean isAdult(int age){
        return age >= 18;
    }
}
