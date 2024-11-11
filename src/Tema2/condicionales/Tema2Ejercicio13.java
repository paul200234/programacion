package Tema2.condicionales;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hora;
        int minutos;
        int segundos;
        do{
            System.out.println("Introduce las horas");
            hora = in.nextInt();
            System.out.println("Introduce los minutos");
            minutos = in.nextInt();
            System.out.println("Introduce los segundos");
            segundos = in.nextInt();
            if(hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59){
                System.out.println("valores incorrectos:");
                System.out.println("La hora debe estar comprendida entre 0 y 23");
                System.out.println("Los minutos deben estar comprendidos entre 0 y 59");
                System.out.println("Los segundos deben estar comprendidos entre 0 y 59");
            }
        }while (hora<0 || hora>23 || minutos<0 || minutos>59 || segundos<0 || segundos>59);
        System.out.println(hora+":"+minutos+":"+segundos);
        if (segundos == 59){
            segundos = 0;
            if (minutos == 59){
                minutos =0;
                if (hora == 23 ){
                    hora = 0;
                }else {
                    hora++;}
            }else{
                minutos++;}
        } else {
            segundos++;}
        System.out.println(hora+":"+minutos+":"+segundos);
        }
    }


