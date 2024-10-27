package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(){
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce el numero de euros");
        double euro = in.nextDouble();
        double dolar = euro * 1.8;
        System.out.println(euro+"€ son "+ dolar +"$");
    }
}
