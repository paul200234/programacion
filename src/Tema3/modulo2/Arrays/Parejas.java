package Tema3.modulo2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Parejas {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] noVisible = new int[20];
        array(noVisible);
        noVisible=array(noVisible);
        int [] visiable=new int[20];
        int posicion1;
        int posicion2;
        int contador=0;
        System.out.println(Arrays.toString(noVisible));

        do {
            /*comprobar valor del 1-20*/
            do {
                System.out.println();
                System.out.println("Dime la posición que quieras del 1 al 20");
                posicion1=in.nextInt();
                /*comprobar valor correcto*/
            }while (!entre1_20(posicion1));

            /*valor 2 no coincide con valor 1*/

            do {
                do {
                    System.out.println("Dime otra posición distinta del 1 al 20");
                    posicion2= in.nextInt();
                }while (!entre1_20(posicion2));
                /*comprobar que no se el mismo número*/
            }while (!requisito(posicion1, posicion2));


            System.out.println("Tus posiciones son " + posicion1 + " y " + posicion2);

            /*Para que coincidan con los números con las posiciones de las arrays*/
            posicion1=posicion1-1;
            posicion2=posicion2-1;

            /*Mostrar animales*/
            System.out.printf(mostrar(noVisible[posicion1])+ " " + mostrar(noVisible[posicion2]) + " \n" );
            System.out.println("Pulsa enter para continuar");
            in.nextLine();
            in.nextLine();
            if (noVisible[posicion1]==noVisible[posicion2] ){
                visiable[posicion1]=noVisible[posicion1];
                visiable[posicion2]=noVisible[posicion2];
            }

            /*intro largo en blanco*/
            for (int i = 1; i < 10; i++) {
                System.out.println("\n\n\n");
            }

            /*mostrar animales iguales (cartas)*/
            for (int i = 0; i < visiable.length; i++) {
                System.out.printf(mostrar(visiable[i]));
            }
            contador++;

            /*bucle hasta conseguir las 10 parejas*/
        } while (contador<10);

        System.out.println("Lo has conseguido");


    }

    public static int[] array(int[] noVisible) {

        int[] posicionesOcupadas = new int[20];
        System.out.println(Arrays.toString(posicionesOcupadas));
        Random random = new Random();
        int posicion;
        int posicion2;
        for (int animal = 1; animal < 11; animal++) {
            do {
                posicion = random.nextInt(0, 21);
                do {
                    posicion2 = random.nextInt(0,21);
                } while (posicion2==posicion);

            } while (esta(posicionesOcupadas, posicion) || esta(posicionesOcupadas,posicion2));
            posicionesOcupadas[2*animal-1]=posicion;
            posicionesOcupadas[2*animal-2]=posicion2;
            noVisible[posicion-1]=animal;
            noVisible[posicion2-1]=animal;
        }
        return noVisible;
    }
    public static boolean esta(int[] num, int posicion) {
        for (int i = 0; i < num.length; i++) {
            if (posicion==num[i]){
                return true;
            }
        }
        return false;
    }
    public static String mostrar(int animal){
        switch (animal){
            case 0 ->{
                return " ? ";
            }
            case 1->{
                return " León ";
            }
            case 2->{
                return " Tigre ";
            }
            case 3->{
                return " Zebra ";
            }
            case 4->{
                return " Elefante ";
            }case 5->{
                return " Perro ";
            }case 6->{
                return " Gato ";
            }case 7->{
                return " Pingüino ";
            }
            case 8->{
                return " Foca ";
            }
            case 9->{
                return " Hormiga ";
            }
            case 10->{
                return " Rata ";
            }
            default -> {
                return " Valor incorrecto ";
            }
        }
    }
    public static boolean requisito(int posicion1, int posicion2) {
        if (posicion1 == posicion2) {
            System.out.println("Los valores no pueden ser iguales");
            return false;
        }
        return true;
    }
    public static boolean entre1_20(int posicion1){
        if (posicion1>20 || posicion1<1){
            System.out.println("Los valores deben de estar comprendidos entre el 1 y el 20");
            return false;
        }
        return true;
    }

}
