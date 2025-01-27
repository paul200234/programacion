package Tema3.modulo2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mosca {
    public static void main(String[] args) {
        int [] mesa =new int[15];
        boolean acertado=false;
        mosca(mesa);
        System.out.println(Arrays.toString(mesa));
        int golpe = escojer();
        while (!acertado) {
            switch (mesa[golpe]) {
                case 1 -> {
                    acertado = true;
                    System.out.println("Has acertado");
                }
                case 2 -> {
                    mosca(mesa);
                    System.out.println("No has acertado");
                    System.out.println(Arrays.toString(mesa));
                    golpe = escojer();
                }
                case 0 -> {
                    System.out.println("No has acertado");
                    System.out.println(Arrays.toString(mesa));
                    golpe = escojer();
                }
            }
        }

    }
    /*Posicion mosca*/
    public static void mosca(int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=0;
        }
        Random random=new Random();
        int posicion= random.nextInt(15);
        array [posicion]=1;
        if (posicion!=0){
            array[posicion-1]=2;
        }
        if (posicion != 14){
            array[posicion+1]=2;}
    }

    /*posicion usuario*/
    public static int escojer(){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime el número que quieras entre el 1 al 15");
        int posicion= in.nextInt()-1;
        while (posicion<0 || posicion>14){
            System.out.println("tu valor no es correcto, recuerda debe de ser del 1 al 15");
            posicion= (in.nextInt()-1);
        }
        return posicion;
    }

}
