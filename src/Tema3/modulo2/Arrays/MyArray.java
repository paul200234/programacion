package Tema3.modulo2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la longitud de la array");
        int longitud = in.nextInt();
        int[] arai = new int[longitud];
        System.out.println("Ahora introduce los valores de la array");
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
            print(sumaVectores(arai2,arai));
            System.out.print("Resta de las arrays: ");
            print(restaVectores(arai,arai2));
            System.out.println("El producto escalar es " + productoEscalar(arai, arai2));

        }
        System.out.println("Esta es tu barajar");
        print(arai);
        System.out.println("Este es el mayor numero de tu barajar " + max(arai));
        System.out.println("Este es el menor numero de tu barajar " + min(arai));
        System.out.println("Media = "+ media(arai));
        System.out.println("La función al reves es "  );
        print(invertir(arai));


    }
    public static void add(int[] array, int addable){
        Arrays.fill(array,-1);
        int contador = 0;
        while (array[contador]!=-1){
            contador++;
        }
        array[contador]=addable;
    }
    public static void print(int[] array) {//procedimiento que imprime todos
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int max(int[] array) {//función que devuelve el máximo
        int mayor = -2147483648;
        int actual;
        for (int i = 0; i < array.length; i++) {
            actual = array[i];
            if (actual > mayor) {
                mayor = actual;
            }
        }
        return mayor;
    }

    public static int min(int[] array) {//función que devuelve el minimo
        int menor = 2147483647;
        int actual;
        for (int i = 0; i < array.length; i++) {
            actual = array[i];
            if (actual < menor) {
                menor = actual;
            }
        }
        return menor;
    }

    public static double media(int[] array){//devuelve la media
        double mediana = 0;
        for (int i = 0; i < array.length; i++) {
            mediana += array[i];
        }
        mediana /= array.length;
        return mediana;
    }

    public static boolean existEn(int existe, int[] en){//comprueba si existe existe en en
        for (int i = 0; i < en.length; i++) {
            if (existe == en[i]){
                return true;
            }
        }
        return false;
    }
    public static int[] sumaVectores(int[] array, int[] array2){
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[i]= array[i] + array2[i];
        }
        return resultado;
    }
    public static int[] restaVectores(int[] array, int[] array2){
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[i]= array[i] - array2[i];
        }
        return resultado;
    }

    public static int productoEscalar(int[] array, int[] array2){
        int resultado = 0;
        for (int i = 0; i < array.length; i++) {
            resultado += array[i]*array2[i];
        }
        return resultado;
    }

    public static int[] invertir(int[] array){
        int [] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[array.length-(i+1)] = array[i];
        }
        return resultado;
    }

    public static boolean capicua(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]!= array[array.length-(i+1)]){
                return false;
            }
        }
        return true;
    }
    public static boolean estaEntre(int esta,int min, int max){
        return (min<=esta && max>=esta);
    }
    public static int elegir(int[] array){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un valor entre 1 y "+ array.length);
        int elejido = in.nextInt()-1;
        if (elejido==1){return 0;}
        while (!MyArray.estaEntre(elejido,0,array.length-1)){
            System.out.println("Valor incorrecto, introduce un valor entre 1 y "+ array.length);
            elejido=in.nextInt()-1;
        }
        return elejido;
    }
}
