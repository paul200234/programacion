package Tema2.Combate;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // declaración de stats
        int velocidad1 =1;
        int velocidad2 =1;
        int ataque1 =1;
        int ataque2 =1;
        int defensa1 =1;
        int defensa2 =1;
        //puntos de vida
        int pv1 = 0;
        int pv2 = 0;
        int seleccion=3;
        while (seleccion!=1&&seleccion!=2){
            System.out.println("Seleccione crear personaje(1) o usar personaje predefinido(2)");
            seleccion = in.nextInt();
            System.out.flush();
        }
        switch (seleccion){
            case 1:{
                while(
                        (pv1+velocidad1+ataque1+defensa1)>500 ||
                        pv1<1 || velocidad1<1 || defensa1<1 || ataque1 <1||
                        pv1>200 || velocidad1>200 || defensa1>200 || ataque1 >200
                ){
            }
        }


        }

    }
}
