package Tema5.Excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Double[] vector = new Double[5];

        try {
            for (int i = 0; i < 6; i++) {
                try {
                    System.out.println("Introduce el numero "+(i+1)+"º");
                    vector[i]=in.nextDouble();
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                    vector[i]=1.0;
                    System.out.println("Valor Incorrecto");
                    System.out.println("Valor añadido en su lugar: 1");
                    in.nextLine();
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error se ha salido de la array");
            e.printStackTrace();
        }
        System.out.println("Tu array:");
        System.out.println(Arrays.toString(vector));
    }
}
