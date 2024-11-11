package Tema2.bucles;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args){
    int i;

    Random random = new Random();
    int loteria = random.nextInt(99999);
    Scanner in = new Scanner(System.in);
    for(i=0;i<5;i++){
        System.out.println("Inserta tu numero");
        if(in.nextInt() == loteria){
            System.out.println("Has ganado la loteria!");
            break;
        }else{
            System.out.println("Intentos restantes: "+(5-i));
        }
    }
    System.out.println("El numero correcto era "+loteria);
}
}
