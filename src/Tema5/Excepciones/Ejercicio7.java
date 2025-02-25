package Tema5.Excepciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        ArrayList<Gato> gatos= new ArrayList<>();

        while (gatos.size()<5){
            try {
                System.out.println("Introduce el nombre de un gato con almenos 3 letras");
                String nombre= in.nextLine();
                System.out.println("Introduce la edad del gato");
                int edad = in.nextInt();

                Gato gato = new Gato(nombre,edad);
                gatos.add(gato);
            } catch (Exception e) {
                System.out.println("Error "+ e.getMessage());
            }
        }
        gatos.forEach(gato -> gato.imprimir());
    }
}
