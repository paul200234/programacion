package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Introduce un valor");
        try {
            int valor = in.nextInt();
        }catch (InputMismatchException e){
        System.out.println("Valor introducido incorrecto");
        e.printStackTrace();
        }


    }
}
