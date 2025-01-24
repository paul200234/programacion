package Tema3.modulo2.JuegoDeMetodos;

public class Main {
    public static void main(String[] args) {
        int opcion;
        double[] personaje1 = new double[5];
        double[] personaje2 = new double[5];

        do {
           opcion = GameTools.menuInicial();
           switch (opcion) {
               case 1 -> {
                   opcion= GameTools.menuPvPoPvE();
                   switch (opcion){
                       case 0->{

                           personaje1 = GameTools.personajeNoJugable();
                           personaje2 = GameTools.personajeNoJugable();
                           GameTools.mostrarStats(personaje1);
                           GameTools.mostrarStats(personaje1);
                       }
                       case 1->{
                           personaje1 = GameTools.personajeJugable(personaje1);
                           personaje2 = GameTools.personajeNoJugable();
                       }
                       case 2->{
                           personaje1 = GameTools.personajeJugable(personaje1);
                           personaje2 = GameTools.personajeJugable(personaje2);
                       }
                       default -> {
                           System.out.println("Saliendo...");
                       }
                   }

                   GameTools.combate(personaje1,personaje2);
                   GameTools.enterAceptar();
               }
               case 2 ->{
                   double[] personajeLeido = GameTools.menuArchivo();
                   GameTools.mostrarStats(personajeLeido);
               }
               default -> {
                   System.out.println("Saliendo...");
                   opcion=3;
               }
           }

        } while (opcion!=3);


    }
}
