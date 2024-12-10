package Tema3;

import Tema2.condicionales.Tema2Ejercicio8;
import Tema2.condicionales.Tema2Ejercicio9;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void showMenu(){
        System.out.println("Introduce D para convertir euros en dolares");
        System.out.println("Introduce E para convertir euros en dolares");
    }

    public static void main() {
        Tema2Ejercicio8 dollar2euro = new Tema2Ejercicio8();
        Tema2Ejercicio9 euro2dollar = new Tema2Ejercicio9();
        Scanner in = new Scanner(System.in);
        String opcion = in.next();
        showMenu();
        switch (opcion){
            case "D":
                Tema2.condicionales.Tema2Ejercicio8.main();
                dollar2euro.main();
                break;
            case "E":
                euro2dollar.main();
                break;
            default:
                System.out.println("Error");
        }
    }



}
