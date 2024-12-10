package Tema3.modulo2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selección de funciones");
        System.out.println("####################################################");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Perímetro y área de un cuadrado");
        System.out.println("2. Perímetro y área de un rectángulo");
        System.out.println("3. Perímetro y área de un círculo");
        System.out.println("4. Comprobar si un número es primo");
        System.out.println("5. Número de dígitos de un número");
        System.out.println("6. Número de dígitos pares e impares");
        System.out.println("7. Factorial de un número (iterativo y recursivo)");
        System.out.println("8. Soluciones de una ecuación de segundo grado");
        System.out.println("9. Suma de los dígitos de un número");
        System.out.println("10. Salir");
        System.out.println("#####################################################");
        System.out.println("\n");

        int choice = in.nextInt();
        switch (choice){
            case 1->{
                System.out.println("############################################################");
                System.out.println("Perimetro y area de un cuadrado");
                System.out.println("Introduce la longitud del lado");
                double lado = in.nextDouble();
                System.out.println("La longitud del perimetro es: " + MyMath.squareArea(lado));
                System.out.println("El tamaño del area es de: " + MyMath.squareArea(lado));
                System.out.println("############################################################");
            }
            case 2->{
                System.out.println("############################################################");
                System.out.println("Perimetro y area de un rectangulo: ");
                System.out.println("Introduce la longitud de la base");
                double ladoa = in.nextDouble();
                System.out.println("Introduce la altura del rectangulo");
                double ladob = in.nextDouble();
                System.out.println("La longitud del perimetro es de "+ MyMath.rectanglePerimeter(ladoa,ladob));
                System.out.println("y el area es de " + MyMath.rectangleArea(ladoa, ladob));
                System.out.println("############################################################");
            }
            case 3->{
                System.out.println("############################################################");
                System.out.println("Perimetro y area de un circulo");
                System.out.println("Introduce la longitud del radio");
                double radio = in.nextInt();

                System.out.println("El area del circulo es de " + MyMath.circleArea(radio));
                System.out.println("y la longitud de su circumferencia es de " + MyMath.circlePerimeter(radio));
                System.out.println("############################################################");
            }
            case 4->{
                System.out.println("############################################################");
                System.out.println("Comprobador de primos, introduce un numero entero");
                int primo = in.nextInt();

                System.out.println("Quieres saber si el numero es primo (1) o si no es primo? (2)");
                int primoONoPrimo = in.nextInt();

                switch (primoONoPrimo){
                    case 1->{
                        if (MyMath.esPrimo(primo)){
                            System.out.println("Tu numero es primo");
                        }else {
                            System.out.println("Tu numero no es primo");
                        }
                    }
                    case 2->{
                        if(MyMath.noEsPrimo(primo)){
                            System.out.println("Tu numero no es primo");
                        }else {
                            System.out.println("Tu numero es primo");
                        }
                    }
                    default -> {
                        System.out.println("Error de selección");
                    }
                }
                System.out.println("############################################################");
            }
            case 5->{
                System.out.println("############################################################");
                System.out.println("Contador de digitos, introduce una cifra");
                int cifra = in.nextInt();
                System.out.println("Tu cifra tiene "+ MyMath.digitosDe(cifra)+" digitos");
                System.out.println("############################################################");
            }
            case 6->{
                System.out.println("############################################################");
                System.out.println("Contador de digitos pares o impares, introduce tu numero");
                int num = in.nextInt();
                System.out.println("Selecciona contar pares(1) o impares(2) ");
                int paresOimpares = in.nextInt();

                switch (paresOimpares){
                    case 1->{
                        System.out.println("Tu numero tiene" + MyMath.numDePares(num) + " digitos pares" );
                    }
                    case 2->{
                        System.out.println("Tu numero tiene" + MyMath.numDeImpares(num) + " digitos impares");
                    }
                }
                System.out.println("############################################################");

            }
            case 7->{
                System.out.println("############################################################");
                System.out.println("Calculadora de factorial, introduce tu numero");
                int numero = in.nextInt();
                System.out.println("Quieres calcularlo de forma iterariva(1) o recursiva(2)?");
                int opcion = in.nextInt();
                switch (opcion){
                    case 1->{
                        System.out.println("El factorial es " + MyMath.factorial(numero));
                    }
                    case 2->{
                        System.out.println("El factorial es " + MyMath.facKtorial(numero));
                    }
                    default -> {
                        System.out.println("Error de selecion");
                    }
                }
                System.out.println("############################################################");

            }
            case 8->{
                System.out.println("############################################################");
                System.out.println("Cuantas soluciones tiene tu ecuacion de segundo grado?");
                System.out.println("Introduce los valores de a, b y c en ese orden");
                double a = in.nextDouble();
                double b = in.nextDouble();
                double c = in.nextDouble();
                System.out.println("Tu ecuacion tiene " + MyMath.disciminante(a,b,c)+ "Soluciones");
                System.out.println("############################################################");

            }
            case 9->{
                System.out.println("############################################################");
                System.out.println("Suma de los digitos de  una cifra, introduce tu numero entero");
                int entero = in.nextInt();
                System.out.println("La suma de los digitos de tu numero da "+ MyMath.sumaDigito(entero));
                System.out.println("############################################################");

            }

            }
        System.out.println("Saliendo del programa...");
        }
    }




























