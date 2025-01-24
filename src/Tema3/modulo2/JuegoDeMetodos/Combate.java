package Tema3.modulo2.JuegoDeMetodos;

import java.util.Random;
import java.util.Scanner;

public class Combate {
   public static int turnoDe(double vel1, double vel2, int turno){
       if (turno % vel1 == 0){
           return 1;
       } else if (turno % vel2 == 0) {
           return 2;
       }else {return 0;
       }
   }
   public static int menuJugadorEnCombate(){
        Scanner in = new Scanner(System.in);
        int opcion;
       System.out.println("############################################################");
       System.out.println();
       System.out.println("Seleccione una opción:");
       System.out.println("->(0)Beber pocion🥫");
       System.out.println("->(1)Atacar⚔️");
       System.out.println("->(2)Analizar🧙‍♂️");
       System.out.println("->(3)Huir🏃‍♀️‍➡️");
       System.out.println();
       System.out.println("############################################################");
       opcion = in.nextInt();
       while (opcion>3 || opcion<0){
           System.out.println("Error, selecciona una opción valida");
           System.out.println("->(0)Beber pocion🥫");
           System.out.println("->(1)Atacar⚔️");
           System.out.println("->(2)Analizar🧙‍♂️");
           System.out.println("->(3)Huir🏃‍♀️‍➡️");
           System.out.println();
           System.out.println("############################################################");
           opcion = in.nextInt();
       }
       return opcion;

   }
   public static  void tomarLaPocion(){
       Random random = new Random(System.nanoTime());
       System.out.println("############################################################");
       System.out.println("Has tomado la poción...");
       switch (random.nextInt(4)){
           case 1->{
               System.out.println("Sabe a caldo de pollo, parece que te han timado...");
           }
           case 2->{
               System.out.println("Sabe a tomate frito, parece que te han timado...");
           }
           case 3->{
               System.out.println("Sabe a jagger con redbull...");
           }

       }
       System.out.println("############################################################");

       GameTools.enterAceptar();
       GameTools.limpiarPantalla();

   }
   public static double[] violencia(double[] paco, double[] pedro){
       double  vel2,def2,pv2,atq1,danyo_realizado=0;
       vel2 = pedro[0];
       def2 = pedro[1];
       pv2 = pedro[2];
       atq1= paco[3];
       Random random = new Random();
       if (random.nextInt(100)<vel2/8){
           System.out.println("Ataque esquivado");
       } else if (random.nextInt(100)<def2/5) {
           System.out.println("Ataque bloqueado");
       }else {
           if (random.nextInt(100)<atq1/8){
               System.out.println("¡ATAQUE CRÍTICO!");
               danyo_realizado = random.nextInt(2)+2*(0.1*atq1*(1-(def2*0.00375)));
               pv2 = pv2 - danyo_realizado;

           }else {
               danyo_realizado = random.nextInt(2)+0.1*atq1*(1-(def2*0.00375));
               pv2 = pv2 - danyo_realizado;
           }

       }
       if(pv2>=0) {
           System.out.println("Daño realizado: " + danyo_realizado);
           System.out.print("Vida restante del Jugador1: ");
           GameTools.numeroEnPalos(paco[2]);
           System.out.print("Vida restante del Jugador2: ");
           GameTools.numeroEnPalos(pv2);
       }else {
           System.out.println("Daño realizado: " + danyo_realizado);
           System.out.println("HA GANADO EL JUGADOR1");
       }
       pedro[2]=pv2;
       return pedro;
   }
}
