package Tema3.modulo2.Strings;

import java.util.Scanner;

public class MyString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime una cadena");
        String cadena = in.nextLine();
        System.out.println(invertirEnMayusculas(cadena));
        System.out.println(cadena + " tiene " + vocales(cadena) + " vocales.");
        System.out.println("La palabra más masLarga es " + masLarga(cadena));
        histograma(cadena);
        System.out.println("Dime otra cadena");
        String cadena1 = in.nextLine();
        int repeticion = cuantasVeces(cadena, cadena1);
        System.out.println("Se repite " + repeticion);
        int cuantasVeces = 0;
        cuantasVeces = cuantasPalabra(cadena);

        System.out.println("tu cadena tiene " + cuantasVeces + " palabras.");
        System.out.println("Dime tu telefono con los digitos del pais, como por ejemplo 34610312241");
        String telefono = in.nextLine();
        telefono = numero(telefono);
        System.out.println(telefono);

    }

    public static String invertirEnMayusculas(String cadena) {

        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        invertida = invertida.toUpperCase();
        return invertida;
    }

    public static int vocales(String cadena) {
        cadena = cadena.toLowerCase();
        int vocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                vocales++;
            }
        }
        return vocales;
    }

    public static String masLarga(String palabra) {
        String[] posible;
        posible = palabra.split(" ");
        String masLarga = posible[0];
        for (int i = 0; i < posible.length; i++) {

            if (posible[i].length() > masLarga.length()) {
                masLarga = posible[i];
            }
        }
        return masLarga;
    }

    public static int cuantasVeces(String cadena, String cadena2) {
        int contador = 0;
        int indice = 0;
        while (indice < cadena.length() && (cadena2.length() + indice) < cadena.length()) {

            if (cadena.startsWith(cadena2, indice)) {
                contador++;
            }
            indice++;
        }
        return contador;
    }

    public static int cuantasPalabra(String cadena) {
        String[] contador = cadena.split(" ");
        int contador_palabras = 0;

        for (int i = 0; i < contador.length; i++) {
            contador_palabras++;
        }
        return contador_palabras;
    }

    public static String numero(String telefono) {
        Scanner in = new Scanner(System.in);
        while (telefono.length() != 11) {
            System.out.println("Tu número de telefono no es valido");
            telefono = in.nextLine();
        }
        String codigoPais = telefono.substring(0, 2);
        String codigoArea = telefono.substring(2, 5);
        String numero = telefono.substring(5);
        return "(+" + codigoPais + ")-" + codigoArea + "-" + numero;
    }

    public static void histograma(String cadena) {
        System.out.println(cadena);
        cadena = cadena.toUpperCase();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        String estrella = "*";
        for (int j = 0; j < cadena.length(); j++) {
            switch (cadena.charAt(j)) {
                case 'A' -> a++;
                case 'E' -> e++;
                case 'I' -> i++;
                case 'O' -> o++;
                case 'U' -> u++;

            }

        }
        String cuantasA = estrella.repeat(a);
        String cuantasE = estrella.repeat(e);
        String cuantasI = estrella.repeat(i);
        String cuantasO = estrella.repeat(o);
        String cuantasU = estrella.repeat(u);

        System.out.println(
                "A " + a + " " + cuantasA + "\n" +
                "E " + e + " " + cuantasE + "\n" +
                "I " + i + " " + cuantasI + "\n" +
                "O " + o + " " + cuantasO + "\n" +
                "U " + u + " " + cuantasU + "\n"
        );
    }
}
