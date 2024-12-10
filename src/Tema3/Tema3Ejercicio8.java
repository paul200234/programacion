package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio8 {
    public static int diasDelMes(int mes, int year){
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return   31;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    return   29;
                } else {
                    return   28;
                }
            default:
                return 30;
        }
    }
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Programa de validación de fechas");
        System.out.println("Escribe el dia");
        int dia = in.nextInt();
        System.out.println("Introduce el mes");
        int mes = in.nextInt();
        System.out.println("Introduce el año");
        int year = in.nextInt();
        boolean valido = true;
        int dias = diasDelMes(mes,year);

        if(!Tema3Ejercicio5.entre(1,12,mes) || !Tema3Ejercicio5.entre(1,dias,dia)){
            valido = false;
        }
            if (valido){
                System.out.println("Tu fecha es valida");
            }else {
                System.out.println("Tu fecha no es valida");
            }

    }
}
