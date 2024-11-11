package Tema2.condicionales;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero de huespedes");
        int huesped = in.nextInt();
        System.out.println("Introduce la duración de la estancia en dias");
        int dias = in.nextInt();
        int precio;
        if (huesped>5 || dias >7){
            precio = (huesped*dias*15*3/4);
        }else{
            precio = (huesped*dias*15);
        }
        System.out.println("El precio total será "+precio+"€");

    }
}
