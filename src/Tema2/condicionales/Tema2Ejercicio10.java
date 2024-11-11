package Tema2.condicionales;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double n1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        double n2 = in.nextDouble();
        System.out.println("Introduce el tercer numero");
        double n3 = in.nextDouble();
        if(n1<n2 && n1<n3 && n2<n3){
            System.out.println("Estan ordenados de menor a mayor");
        }else {
            System.out.println("No estan ordenados de menor a mayor");
        }

    }
}
