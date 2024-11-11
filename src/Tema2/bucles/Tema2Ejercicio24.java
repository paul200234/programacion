package Tema2.bucles;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos");
        int a = in.nextInt();
        int i;
        double nalum;
        int aprobados = 0;
        int suspendidos = 0;
        for(i=a;i>0;i--){
            System.out.println("Introduce la nota del alumno numero: "+i);
            nalum = in.nextDouble();
            if (nalum>=5){
                aprobados++;}
            else {
                suspendidos++;}
        }
        System.out.println("De tus "+a+" alumnos, han aprovado "+aprobados+" y han suspendido "+suspendidos);
    }
}
