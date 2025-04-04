package Tema7.ActividadesC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjercicioC3 {
    /**
     * Ejercicio 3: Leer un Fichero Línea a Línea y Contar Palabras
     * Lee	un	fichero	de	texto	llamado	texto.txt	y	cuenta	cuántas	palabras	hay	en	total.	Muestra	el
     * número	de	palabras	al	final.
     * */
    public static void main(String[] args) {
        String texto;
        try {
             texto= Files.readString(Path.of("Resources/diccionario.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El numero total de palabras es: "+ texto.length());
    }

}
