package Tema7.ActividadesC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjercicioC2 {
    /**
     * Ejercicio 2: Leer y Mostrar el Contenido de un Fichero de Texto
     * Lee	el	contenido	del	fichero	usuario.txt	(del	ejercicio	anterior)	y	muestra	las	líneas	en
     * consola.
     * */
    public static void main(String[] args) {
        try {
            System.out.println(Files.readString(Path.of("Resources/usuario.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
