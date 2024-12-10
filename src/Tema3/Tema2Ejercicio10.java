package Tema3;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ejercicios tema 3");
        System.out.println("************************************************************+");
        System.out.println("a) Muestra el signo de un número introducido por el usuario.");
        System.out.println("b) Indica si el usuario es mayor de edad o no");
        System.out.println("c) Calcula el área y perímetro de un círculo");
        System.out.println("d) Conversor de euros a dólares y de dólares a euros");
        System.out.println("e) Mostrar tabla de multiplicar de un número");
        System.out.println("f) Mostrar tablas de multiplicar del 1 al 10");
        System.out.println("g) Comprobador de números primos");
        System.out.println("h) Comprobador de fechas");
        System.out.println("i) Dibujar triángulos");
        System.out.println("************************************************************+");
        System.out.println("Introduce una opción para seleccionarla o cualquier otra cosa para salir");
        char opcion = in.next().charAt(0);
        switch (opcion){
            case 'a','A'->{Tema3Ejercicio1.main();}
            case 'b','B'->{Tema3Ejercicio2.main();}
            case 'c','C'->{Tema3Ejercicio3.main();}
            case 'd','D'->{Tema3Ejercicio4.main();}
            case 'e','E'->{Tema3Ejercicio5.main();}
            case 'f','F'->{Tema3Ejercicio6.main();}
            case 'g','G'->{Tema3Ejercicio7.main();}
            case 'h','H'->{Tema3Ejercicio8.main();}
            case 'i','I'->{Tema3Ejercicio9.main();}
            default -> {
                System.out.println("Saliendo del programa...");
            }

        }
        System.out.println("Saliendo del programa...");
    }
}
