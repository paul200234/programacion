package Tema3;

import Tema2.bucles.Tema2Ejercicio26;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        Tema2Ejercicio26 primoONo = new Tema2Ejercicio26();
        int primo;

        
        do {
            System.out.println("Introduce un entero positivo");
            primo = in.nextInt();
            if(Tema3Ejercicio3.esPositivo(primo)){
            primoONo.main(primo);
            }else if (primo==0){
                System.out.println("Error tu numero no es positivo");
            }else {
                System.out.println("Tu numero es 0, saliendo...");
            }
        }while (primo !=0);
    }
}
