package Tema2.bucles;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args){
        Random random = new Random();
        int loteria = random.nextInt(99);
        loteria++;
        Scanner in = new Scanner(System.in);
        System.out.println("Intenta adivinar el numero entre el 1 y el 100");
        int i;
        do{
            System.out.println("Dime un numero");
            i = in.nextInt();
            if(i>loteria){
                System.out.println("El numero a adivinar es mas pequeño");
            }else if(i<loteria){
                System.out.println("El numero a adivinar es mas grande prueba con un numero mas alto");
            }else{
                System.out.println("Has acertado!");
            }
        }
        while (i!=loteria);
    }

}
