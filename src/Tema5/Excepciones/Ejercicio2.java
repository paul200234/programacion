package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1;
        int num2;
        int resultado;
        try {
            num1 = in.nextInt();
        } catch (InputMismatchException e) {
            in.nextLine();

            e.printStackTrace();
            num1 = 1;
            System.out.println("Error, tienes que meter un numero entero");
            System.out.println("Numero asociado 1");
            System.out.println(num1);
        }
        System.out.println("Introduce el segundo numero");
        try {
            num2 = in.nextInt();
        } catch (InputMismatchException e) {
            in.nextLine();
            num2 = 1;
            System.out.println("Error, tienes que meter un numero entero");
            System.out.println("Numero asociado 1");
            System.out.println(num2);
            e.printStackTrace();
        }
        try{
             resultado =num1/num2;
        }catch (ArithmeticException e){
            System.out.println("Error, el numero 1: "+num1+"\n No se puede dividir por el numero 2: "+num2);
             resultado =0;
             in.nextLine();
             e.printStackTrace();
        }
        System.out.println("Resultado= "+resultado);


    }
}
