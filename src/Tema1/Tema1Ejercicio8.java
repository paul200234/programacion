package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double macarron = in.nextDouble();
        System.out.println("Introduce el segundo número");
        double bolonyesa = in.nextDouble();
        if (macarron > bolonyesa)
            System.out.println(macarron + " es mayor que " + bolonyesa);
        else if
            (bolonyesa > macarron) System.out.println(macarron + " es menor que " + bolonyesa);
        else
            System.out.println(macarron + " y " + bolonyesa + " Son iguales ");
        }

    }

