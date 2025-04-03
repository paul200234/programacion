package Tema7.ActividadesB;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class EjercicioB5 {
    public static void main(String[] args) {
        File diccionario = new File("Diccionario");

        if (diccionario.mkdir()) {
            System.out.println("Se ha creado carpeta");
        } else {
            System.out.println("No se ha podido crear");
        }

        List<String> palabras;
        try {
            palabras = Files.readAllLines(Paths.get("resources/diccionario.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        palabras.forEach(palabra -> {

            char primeraLetra = palabra.toUpperCase().charAt(0);
            Path path = Paths.get("Diccionario/" + primeraLetra + ".txt");
            try {
                Files.writeString(path, palabra + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
