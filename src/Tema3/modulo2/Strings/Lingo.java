package Tema3.modulo2.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Lingo {
    public static void main(String[] args) {
        char[] palabraSecreta = {'Q', 'U', 'E', 'S', 'O'};
        char[] palabraMostrada = {'_', '_', '_', '_', '_'};
        int intentos = 0;

        while (intentos < 5) {
            System.out.println(Arrays.toString(palabraMostrada));
            comprobarIntentoJugador(palabraSecreta, palabraMostrada);
            if (esJuegoGanado(palabraSecreta, palabraMostrada)) {
                intentos = 6;
                System.out.println("¡Has ganado!");
            }
            intentos++;
        }
        if (intentos != 6) {
            System.out.println("¡Has perdido!");
        }
    }

    public static void comprobarIntentoJugador(char[] palabraSecreta, char[] palabraMostrada) {
        Scanner scanner = new Scanner(System.in);
        String intentoJugador;

        do {
            System.out.println("Introduce una palabra de 5 letras:");
            intentoJugador = scanner.nextLine().toUpperCase();
        } while (intentoJugador.length() != 5);

        for (int i = 0; i < palabraSecreta.length; i++) {
            for (int j = 0; j < palabraSecreta.length; j++) {
                if (intentoJugador.charAt(i) == palabraSecreta[j]) {
                    if (i == j) {
                        palabraMostrada[j] = palabraSecreta[j];
                    } else {
                        palabraMostrada[j] = '*';
                    }
                }
            }
        }
    }

    public static boolean esJuegoGanado(char[] palabraSecreta, char[] palabraMostrada) {
        for (int i = 0; i < palabraSecreta.length; i++) {
            if (palabraSecreta[i] != palabraMostrada[i]) {
                return false;
            }
        }
        return true;
    }
}