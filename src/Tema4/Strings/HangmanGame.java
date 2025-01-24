package Tema4.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failedAttempts = 1;

        System.out.println("Jugador 1, introduce la palabra secreta:");
        String secretWord = scanner.nextLine().toUpperCase();
        char[] guessedWord = new char[secretWord.length()];
        Arrays.fill(guessedWord, '_');

        clearConsole();

        while (failedAttempts < 7) {
            if (promptSolveAttempt()) {
                if (attemptToSolve(secretWord)) {
                    System.out.println("¡Has ganado!");
                } else {
                    System.out.println("¡Has perdido!");
                }
                failedAttempts = 7;
            } else {
                if (attemptLetterGuess(secretWord, failedAttempts, guessedWord)) {
                    System.out.println(Arrays.toString(guessedWord));
                } else {
                    failedAttempts++;
                }
            }
        }
    }

    public static boolean promptSolveAttempt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ¿Deseas intentar resolver la palabra?
                Sí -> (1)\s
                No -> (2)""");
        int choice = scanner.nextInt();
        return choice == 1;
    }

    public static boolean attemptToSolve(String secretWord) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la palabra completa:");
        String guessedWord = scanner.nextLine().toUpperCase();
        return guessedWord.equals(secretWord);
    }

    public static boolean attemptLetterGuess(String secretWord, int attempt, char[] guessedWord) {
        Scanner scanner = new Scanner(System.in);
        boolean letterFound = false;
        System.out.println("Introduce una letra:");
        char guessedLetter = scanner.nextLine().toUpperCase().charAt(0);

        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guessedLetter) {
                System.out.println("¡La letra está en la palabra!");
                guessedWord[i] = guessedLetter;
                letterFound = true;
            }
        }

        if (!letterFound) {
            drawHangman(attempt);
        }
        return letterFound;
    }

    public static void drawHangman(int attempt) {
        switch (attempt) {
            case 1 -> System.out.println("  o");
            case 2 -> System.out.println("  o\n |");
            case 3 -> System.out.println("  o\n/|");
            case 4 -> System.out.println("  o\n/|\\");
            case 5 -> System.out.println("  o\n/|\\\n/");
            case 6 -> {
                System.out.println("  o\n/|\\\n/ \\");
                System.out.println("¡Has perdido!");
            }
        }
    }

    public static void clearConsole() {
        for (int i = 0; i < 11; i++) {
            System.out.println("\n");
        }
    }
}