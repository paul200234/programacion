package Tema2.bucles;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {
        double num;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu numero");
        num = in.nextDouble();
        int i=1;
        int contador =-1;
        while(i>0){
            System.out.println("Escribe tu numero");
            i = in.nextInt();
            if (num>0){
                num=num+i;
                contador++;
            }

        }
        num = num/contador;
        System.out.println("La media de tus "+contador+" numeros es "+num);
    }
}
