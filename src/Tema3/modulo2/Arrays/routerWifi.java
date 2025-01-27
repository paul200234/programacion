package Tema3.modulo2.Arrays;

import java.util.Scanner;

public class routerWifi {
    public static void main(String[] args) {
       int[] planta = new int[21];
       int router = tamanioRouter();
       int habitacion = MyArray.elegir(planta);
       colocarRouter(planta,router,habitacion);
       MyArray.print(planta);
    }
    public static int tamanioRouter(){
        Scanner in = new Scanner(System.in);
        System.out.println("Selecciona el tamaño del router (1-6)");
        int router = in.nextInt();
        while (!MyArray.estaEntre(router,1,6)){
            System.out.println("El router debe tener un tamaño entre 1 y 6 ");
            router = in.nextInt();
        }
        return router;
    }

    public static void colocarRouter(int[] hotel, int tamanioRouter, int habitacion){
        int ruter =tamanioRouter;
        for (int i = habitacion; tamanioRouter >=0 && i < hotel.length; i++) {
            hotel[i]=tamanioRouter;
            tamanioRouter--;
        }
        for (int ii = habitacion; ii>0 && ruter > 0; ii--) {
            hotel[ii]=ruter;
            ruter--;
        }

    }
}
