package Tema7.ActividadesB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EjercicioB4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random=new Random();
        System.out.println("Cuantos nombres con apellidos quieres generar");
        int contador=in.nextInt();
        in.nextLine();

        System.out.println("Dime el nombre del archivo donde quieras guardarlos");
        String archivoNuevo= in.nextLine();

        Path rutaNuevoNombre= Paths.get("Resources/"+archivoNuevo+".txt");

        String nombreRandom=null;
        String apellidoRandom=null;

        try {
            for (int i = 0; i < contador; i++) {
                List<String> nombre1 = Files.readAllLines(Path.of("Resources/usa_nombres.txt"));

                List<String> apellido1 = Files.readAllLines(Path.of("Resources/usa_apellidos.txt"));

                nombreRandom = nombre1.get(random.nextInt(nombre1.size()));
                System.out.print(nombreRandom + " ");
                apellidoRandom = apellido1.get(random.nextInt(apellido1.size()));
                System.out.println(apellidoRandom);

                String nombreAleatorio = nombreRandom + " " + apellidoRandom;

                Files.writeString(rutaNuevoNombre, nombreRandom + " " + apellidoRandom + "\n", StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

