package Tema3.modulo2.Strings;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto a codificar:");
        String textoOriginal = scanner.nextLine();
        String textoCifrado = encrypt(textoOriginal);
        System.out.println("Texto codificado: " + textoCifrado);

        String textoDescifrado = decrypt(textoCifrado);
        System.out.println("Texto descodificado: " + textoDescifrado);
    }

    public static String encrypt(String texto) {
        String textoEnMayusculas = texto.toUpperCase();
        char caracterModificado;
        String textoCifrado = "";

        for (int i = 0; i < textoEnMayusculas.length(); i++) {
            caracterModificado = textoEnMayusculas.charAt(i);
            switch (caracterModificado) {
                case 'Z' -> caracterModificado = 'A';
                case '9' -> caracterModificado = '0';
                default -> caracterModificado++;
            }
            textoCifrado += caracterModificado;
        }
        return textoCifrado;
    }

    public static String decrypt(String texto) {
        String textoEnMayusculas = texto.toUpperCase();
        char caracterModificado;
        String textoDescifrado = "";

        for (int i = 0; i < textoEnMayusculas.length(); i++) {
            caracterModificado = textoEnMayusculas.charAt(i);
            switch (caracterModificado) {
                case 'A' -> caracterModificado = 'Z';
                case '0' -> caracterModificado = '9';
                default -> caracterModificado--;
            }
            textoDescifrado += caracterModificado;
        }
        return textoDescifrado;
    }
}
