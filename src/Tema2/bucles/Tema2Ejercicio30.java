package Tema2.bucles;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String num1="";
        String operador="";
        String num2="";
        double num12;
        double num22;
        System.out.println("Bienvenido a la calculadora, introduce ? para salir en cualquier momento");
        while (num1 != "?" && num2 != "?" && operador != "?"){
            System.out.println("Inserta el primer numero");
            num1= in.next();
            if (num1.equals("?")){
                break;
            }
            System.out.println("Inserta el operador ");
            operador= in.next();
            if (operador.equals("?")){
                break;
            }
            System.out.println("Inserta el segundo numero");
            num2= in.next();
            if (num2.equals("?")){
                break;
            }
            num12=Double.valueOf(num1);
            num22=Double.valueOf(num2);
            switch (operador){
                case "+":
                    System.out.println("La suma de "+num1+" y "+num2+" es: "+(num12 + num22));
                    break;
                case ".","x","*","·":
                    System.out.println("La multiplicación de "+num1+" y "+num2+" da :" + ( num12 * num22));
                    break;
                case ":","/":
                    if (num22 != 0) {
                        System.out.println("La división de " + num1 + " entre " + num2 + " da: " + (num12 / num22));
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case "-":
                    System.out.println("La resta de "+num2+" a "+num1+" da :" + ( num12 - num22));
                    break;
                case "%","MOD":
                    if (num22 != 0) {
                        System.out.println("El resto de la división de " + num1 + " entre " + num2 + " da: " + (num12 % num22));
                    } else {
                        System.out.println("Error: No se puede calcular el módulo con divisor cero.");
                    }
                    break;
            }


        }
    }
}
