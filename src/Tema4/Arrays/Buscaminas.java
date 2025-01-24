package Tema4.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] array = new char[20];
        char[] arrayno= new char[20];

        bombas(array);

        ayuda(array);
        System.out.println(Arrays.toString(array));

        int posicion;
        int contador=0;
        do {
            System.out.println("Dime la posición que quieras del 1 al 20");
            posicion= in.nextInt();

            posicion=comprabacionNum(posicion);

            posicion=posicion-1;


            if (array[posicion]==arrayno[posicion]) {
                while (arrayno[posicion] == '0' || arrayno[posicion] == '1' || arrayno[posicion] == '2') {
                    System.out.println("Esta posicion ya la has dicho.\nDime otra");
                    posicion = in.nextInt();
                    posicion=comprabacionNum(posicion);

                    posicion=posicion-1;
                }
            }



            mostrar(array, posicion);
            arrayno[posicion]=array[posicion];
            System.out.println(Arrays.toString(arrayno));

            contador++;


        } while (contador<14 && arrayno[posicion]!='*');

        if (arrayno[posicion]=='*'){
            System.out.println("Lo siento has perdido");
        }else {
            System.out.println("¡¡LO HAS CONSEGUIDO!! \n¡¡HAS GANADO!!");
        }




    }
    public static void bombas(char[] array){
        Random random= new Random();
        int bomba;
        Arrays.fill(array, '0');
        for (int i = 0; i <6; i++) {
            do {
                bomba=random.nextInt(20);
            }while (array[bomba]=='*');

            array[bomba]='*';
        }
    }
    public static void ayuda(char[] array){
        if (array[1]=='*'){array[0]='1';}
        if (array[18]=='*'){array[19]='1';}

        for (int i = 2; i < array.length-2; i++) {
            if (array[i-1]=='*' && array[i+1]=='*' && array[i]!='*'){
                if (array[i]=='*'){
                    array[i]='*';
                }else {
                    array[i]='2';
                }
            }
        }

        for (int j = 1; j <array.length-1 ; j++) {
            if (array[j-1]=='*' || array[j+1]=='*' && array[j]!='*'){
                if (array[j]=='*'){
                    array[j]='*';
                }else if (array[j]=='2') {
                    array[j]='2';
                }else {
                    array[j]='1';
                }
            }
        }
    }
    public static void mostrar(char [] array, int posicion){
        switch (array[posicion]){
            case '1'-> System.out.println("¡Cuidado! \n Tienes una bomba cerca.");
            case '2'-> System.out.println("¡¡Mucho cuidado!! \n Tienes dos minas cerca.");
        }
    }
    public static int comprabacionNum(int posicion){
        Scanner in=new Scanner(System.in);
        while (posicion<=1 || posicion>=20){
            System.out.println("Tu posición es incorrecta.\nRecuerda es del 1 al 20");
            posicion= in.nextInt();
        }
        return posicion;
    }
}
