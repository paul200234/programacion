package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double n1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        double n2 = in.nextDouble();
        System.out.println("Introduce el tercer numero");
        double n3 = in.nextDouble();
        double mayor = 0;
        double medio = 0;
        double menor = 0;

        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
            if (n2 >= n3) {
                medio = n2;
                menor = n3;
            } else {
                medio = n3;
                menor = n2;
            }
        } else if(n2>=n3) {
            mayor=n2;
            if (n1>=n3){
                medio = n1;
                menor = n3;
            } else {
                medio = n3;
                menor = n1;
            }
        } else {
            mayor = n3;
            if (n1>=n2){
                medio = n1;
                menor = n2;
            }
        }
        System.out.println("EL orden correcto de mayor a menor es "+ mayor +" "+ medio +" "+ menor);
    }
}
