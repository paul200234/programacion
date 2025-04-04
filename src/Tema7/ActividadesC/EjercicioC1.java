package Tema7.ActividadesC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.Security;
import java.util.Scanner;

public class EjercicioC1 {
    /**
     * Ejercicio 1: Crear y Escribir en un Fichero de Texto
     * Crea	un	programa	que	pida	al	usuario	su	nombre	y	edad	y	los	guarde	en	un	fichero	llamado
     * usuario.txt,	con	el	siguiente	formato:
     * Nombre:	Ximo
     * Edad:	25
     * */
    public static void main(String[] args) {
        System.out.println("Introduce tu nombre:");
        Scanner in = new Scanner(System.in);
        String nombre = in.next();
        System.out.println("Introduce tu edad:");
        int edad = in.nextInt();
        String textoGuardar = "Nomre: "+nombre+"\nEdad: "+edad;
        try {
            Files.writeString(Path.of("Resources/usuario.txt"),textoGuardar, StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
