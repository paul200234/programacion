package Tema4.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la longitud de la barajar");
        int longitud = in.nextInt();
        int[] arai = new int[longitud];
        System.out.println("Ahora introduce los valores de la barajar");
        for (int i = 0; i <= longitud - 1; i++) {
            System.out.println("Introduce el valor de la posicion " + i);
            arai[i] = in.nextInt();
        }
        System.out.println("Introducir otra barajar? (s/n)");
        if (in.next().equals("s")){
            int[] arai2 = new int[longitud];
            System.out.println("Ahora introduce los valores de la barajar");
            for (int i = 0; i <= longitud - 1; i++) {
                System.out.println("Introduce el valor de la posicion " + i);
                arai2[i] = in.nextInt();
            }
            System.out.print("Suma de las arrays: ");
            MyArray.print(MyArray.sumaVectores(arai2,arai));
            System.out.print("Resta de las arrays: ");
            MyArray.print(MyArray.restaVectores(arai,arai2));
            System.out.println("El producto escalar es " + MyArray.productoEscalar(arai, arai2));

        }
        System.out.println("Esta es tu barajar");
        MyArray.print(arai);
        System.out.println("Este es el mayor numero de tu barajar " + MyArray.max(arai));
        System.out.println("Este es el menor numero de tu barajar " + MyArray.min(arai));
        System.out.println("Media = "+ MyArray.media(arai));
        System.out.println("La cadena al reves es "  );
        MyArray.print(MyArray.invertir(arai));
        System.out.println("La cadena es capicua es " + MyArray.capicua(arai));
    }
}
