package Tema7.ActividadesB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjercicioB6 {
    public class ejerciciob6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Dime el numero que quieras");
            String numero= in.next();

            Path ruta= Paths.get("resources/pi-million.txt");

            String pi;

            try {
                pi= Files.readString(ruta);
                System.out.println(pi.contains(numero) ? "Tu número si existe en el primer millón de pi":"Tu número no esta en el primer millón de pi");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
