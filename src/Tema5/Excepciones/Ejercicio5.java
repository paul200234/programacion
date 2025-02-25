package Tema5.Excepciones;

import Tema5.Ejercicio3.Main;

import java.util.Scanner;

public class Ejercicio5 {
    static void imprimePositivo(int p) throws Exception {

        if (p>0) {
            System.out.println("p="+p);
        }else {
            throw new Exception("Valor menor que 0");
        }
    }
    static void imprimeNegativo(int n) throws Exception{
        if (n<0){
            System.out.println("n= "+n);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor de p (tiene que ser posivo)");
        int p = in.nextInt();
        System.out.println("Introduce el valor de n (tiene que ser negativo)");
        int n = in.nextInt();

        try {
            imprimePositivo(p);
            imprimeNegativo(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
