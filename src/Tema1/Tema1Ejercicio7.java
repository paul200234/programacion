package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("Que numero te ha salido?");
        Scanner in = new Scanner(System.in);
        int dado = in.nextInt();
        if (dado>6 || dado<1){
              System.out.println("El numero no es valido");}
          else{
              System.out.println("La cara opuesta es: " + (7 - dado));
          }




        }

    }
