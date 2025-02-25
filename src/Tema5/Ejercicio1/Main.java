package Tema5.Ejercicio1;

import java.util.*;

public class Main {
    public static Set<Producto> listaDeLaCompra= new HashSet<>();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Menu------------------------------------------------------");
            System.out.println("Introduce 1 para añadir un producto a la lista de la compra");
            System.out.println("Introduce 2 para ver la lista de la compra");
            System.out.println("Introduce 3 para mostrar posibles productos");
            System.out.println("Introduce 0 para salir");
            System.out.println("----------------------------------------------------------");
            opcion = in.nextInt();
            in.nextLine();
            seleccion(opcion);

        }while (opcion!=0);
    }
    public static void seleccion(int opcion){
        switch (opcion){
            case 1-> aniadirProducto();
            case 2-> {
                System.out.println(listaDeLaCompra.toString());
                System.out.println("Pulsa enter para continuar");
                in.nextLine();
            }
            case 3-> {
                for (Producto producto : Producto.values()) {
                    System.out.println(producto.name());
                }
                System.out.println("Pulsa enter para continuar");
                in.nextLine();
            }
            case 0-> System.out.println("Saliendo....");
            default -> {
                System.out.println("Opcion no valida pulsa enter para continuar");
                in.nextLine();
            }

        }
    }
    public static void aniadirProducto(){
        System.out.println("Introduce el tipo de producto");
        try {
            Producto producto = Producto.valueOf( in.nextLine().toUpperCase());
            if (!listaDeLaCompra.contains(producto)){
                listaDeLaCompra.add(producto);
            }
            else {
                System.out.println(producto.name()+" ya existe en la lista.");
            }

            System.out.println("Se ha añadido "+ producto+ " a la lista, pulsa enter para continuar");
            in.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("El producto no es seleccionable");
            System.out.println("Pulsa enter para continuar");
            in.nextLine();
        }


    }

}
