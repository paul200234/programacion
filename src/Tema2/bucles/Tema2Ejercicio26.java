package Tema2.bucles;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(int args) {
        Scanner in = new Scanner(System.in);
        boolean primo=true;
        int i;
        for (i= args -1; i>1; i--){
            if (args %i==0){
                primo=false;
            }
        }
        if (primo){
            System.out.println("Tu numero "+ args +" es primo");
        }else {
            System.out.println("Tu numero "+ args +" no es primo");
        }
    }
}
