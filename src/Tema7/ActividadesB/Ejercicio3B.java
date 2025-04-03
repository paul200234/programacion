package Tema7.ActividadesB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3B {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dime el nombre del archivo que deseas copiar");
        String archivo=in.nextLine();
        System.out.println("Dime el nombre del archivo donde quieras copiarlo");
        String archivoCopiado= in.nextLine();

        String documento="resources/"+archivo+".txt";
        Path ruta= Paths.get(documento);
        String documentoCopiado="resources/"+archivoCopiado+".txt";
        Path ruta2= Paths.get(documentoCopiado);

        try{
            /*Leer linea a linea*/
            List<String> personas= Files.readAllLines(ruta);
            /*Ordena alfabeticamente*/
            Collections.sort(personas);

            /*recorre cada linea*/
            personas.forEach(linea -> {
                try {
                    /*cogiendo cada linea lo copia en el documento dandole la ruta*/
                    Files.writeString(Paths.get(documentoCopiado), linea + "\n", StandardOpenOption.APPEND, StandardOpenOption.CREATE);
                    System.out.println(linea);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
