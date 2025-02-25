package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        try {
            int num1 = in.nextInt();
        } catch (InputMismatchException e) {

            e.printStackTrace();
            int num1 = 1;
            System.out.println("Error, tienes que meter un numero entero");
            System.out.println("Numero asociado 1");
            System.out.println(num1);
        } catch (Exception e){}

    }
}
