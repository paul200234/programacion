package Tema7.ActividadesB;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EjercicioB1 {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            List <String> lineas= Files.readAllLines(Path.of("Resources/numeros.txt"));
            int[] numeros= new int[lineas.size()];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Integer.valueOf(lineas.get(i));
            }
            int maximo= numeros[0];
            int minimo= numeros[0];
            for (int numero : numeros){
                if (numero > maximo){
                    maximo = numero;
                }
                if (numero < minimo){
                    minimo = numero;
                }
            }
            System.out.println("Maximo: " + maximo +"\n"+ "Minimo: " + minimo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
