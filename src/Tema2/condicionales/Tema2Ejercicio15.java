package Tema2.condicionales;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el año");
        int year = in.nextInt();
        System.out.println("Introduce el numero de mes");
        int mes = in.nextInt();
        int dias;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                dias=30;
        }
        System.out.println("Tu mes " + mes + " tiene " + dias + " dias.");

    }
}
