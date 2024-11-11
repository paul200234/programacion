package Tema2.condicionales;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(){
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce el numero de dolares");
        double dolares = in.nextDouble();
        double euros = dolares * 0.93;
        System.out.println(dolares+"$ son "+euros+"€");
    }
}
