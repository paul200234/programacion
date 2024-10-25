package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce D para convertir euros en dolares");
        System.out.println("Introduce E para convertir euros en dolares");
        String opcion = in.next();
        if(opcion == "D"){
            Tema2Ejercicio8();
        }
    }
}
