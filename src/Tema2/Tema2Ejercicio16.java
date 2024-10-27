package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tema2Ejercicio8 dola = new Tema2Ejercicio8();
        Tema2Ejercicio9 euro = new Tema2Ejercicio9();
        System.out.println("Introduce D para convertir euros en dolares");
        System.out.println("Introduce E para convertir euros en dolares");
        String opcion = in.next();
        switch (opcion){
            case "D":
                dola.main();
                break;
            case "E":
                euro.main();
            default:
                System.out.println("Error");
        }
    }
}
