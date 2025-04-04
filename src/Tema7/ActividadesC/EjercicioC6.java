package Tema7.ActividadesC;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioC6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Persona> array=new ArrayList<>();
        Persona persona=null;
        //objeto escribir
        PersonaEscribir escribirPersonas = new PersonaEscribir();
        //objeto leer
        LectorPersonas leerPersonas=new LectorPersonas();
        int opcion=0;
        do {
            opcion=menu(opcion,in);

            if (opcion==1) {
                persona=crearPersona(persona,in);
                //añadimos la persona a la lista
                array.add(persona);
            }


        }while (opcion==1);
        try {

            //escribir
            escribirPersonas.abrir();

            //recorremos el array y vamos escribiendo uno a uno
            for (Persona persona1:array){
                escribirPersonas.escribir(persona1);
                //probar a pasarle el array directamente a escriirDocumento
            }
            escribirPersonas.cerrar();


            //leer
            leerPersonas.abrir();

            do {
                persona=leerPersonas.leer();
                if (persona!=null){

                    System.out.println(persona);
                }
            }while (persona!=null);


            leerPersonas.cerrar();



        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
    public static int menu(int opcion, Scanner in){
        System.out.println("Quieres añadir un persona\n" +
                "1.Sí\n" +
                "2.No");
        opcion=in.nextInt();
        in.nextLine();
        while (opcion>2 || opcion<1){
            System.out.println("Opción no valida");
            menu(opcion,in);
        }

        return opcion;
    }
    public static <Int> Persona crearPersona(Persona persona, Scanner in){
        System.out.println("Dime el nombre");
        String nombre=in.nextLine();
        System.out.println("Dime la edad");
        int edad =in.nextInt();

        //crear objeto
        persona=new Persona(edad,nombre);
        return persona;
    }
}
