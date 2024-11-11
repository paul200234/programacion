package Tema2.bucles;
/*Escribe un programa que calcula la suma de todos los números pares
entre 1 y 1000 y la muestra por consola.*/
public class Tema2Ejercicio21 {
    public static void main(String[] args){

        int n = 0;
        int n1;
        for (n1=2;n1<=1000;n1+=2){
            n=n+n1;
         //   System.out.println(n);
        }
        System.out.println("La suma de los números pares del 1 al 1000 es: " + n);
    }
}
