package Tema7.EjercicioFunko;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Funkoser {

    public static final String rutaArchivo = "Resources/funko.ser";
    public static List<Funko> inventario = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        inventario =SerializaFunkos.deserializaListasdeFunkos(rutaArchivo);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n=== MENÚ DE GESTIÓN DE FUNKOS ===");
            System.out.println("1. Añadir nuevo Funko");
            System.out.println("2. Borrar Funko");
            System.out.println("3. Mostrar todos los Funkos");
            System.out.println("4. Mostrar Funko más caro");
            System.out.println("5. Mostrar media de precios");
            System.out.println("6. Mostrar Funkos agrupados por modelo");
            System.out.println("7. Mostrar Funkos de 2023");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = Integer.parseInt(in.nextLine());
                System.out.println();

                switch (opcion) {
                    case 1 -> aniadirFunko();
                    case 2 -> borrarFunko();
                    case 3 -> leerInventario();
                    case 4 -> mostrarFunkoMasCaro();
                    case 5 -> mostrarMediaPrecios();
                    case 6 -> mostrarFunkosPorModelo();
                    case 7 -> mostrarFunkos2023();
                    case 8 -> {
                        System.out.println("Saliendo...");
                        salir = true;
                    }

                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            }
        }
        SerializaFunkos.serializaListaDeFunkos(inventario, rutaArchivo);

    }

    private static void mostrarFunkos2023() {
        for (Funko funko : inventario) {
            if (funko.getFechaLanzamiento().getYear() == 2023) System.out.println(funko);
        }
    }

    private static void mostrarFunkosPorModelo() {
        Funko.Modelo modelo = solicitarModelo();
        for (Funko funko : inventario) {
            if (funko.getModelo().equals(modelo)) System.out.println(funko);
        }
    }

    private static void mostrarMediaPrecios() {
        double precio = 0;
        for (Funko funko : inventario) {
            precio = precio + funko.getPrecio();
        }
        precio = precio / inventario.size();

        System.out.println("La media de precios es: " + precio);
    }

    private static void mostrarFunkoMasCaro() {
        System.out.println("Calculando precio mas caro");
        Funko funkoMasCaro = inventario.stream().max(Comparator.comparingDouble(Funko::getPrecio)).orElse(null);
        System.out.println("El funko mas caro es: " + funkoMasCaro);
    }



    public static void leerInventario() {
        for (Funko funko : inventario) {
            System.out.println(funko);
        }
    }

    public static void aniadirFunko() {
        // 1. Preguntar código
        System.out.print("Codigo del Funko: ");
        String cod = in.nextLine();

        // 2. Preguntar nombre
        System.out.print("Nombre del Funko: ");
        String nombre = in.nextLine();

        Funko.Modelo modelo = solicitarModelo();

        // 4. Preguntar precio
        System.out.print("Precio (ej: 15.99): ");
        double precio = Double.parseDouble(in.nextLine());

        // 5. Preguntar fecha
        System.out.print("Fecha lanzamiento (AAAA-MM-DD): ");
        LocalDate fechaLanzamiento = LocalDate.parse(in.nextLine());

        System.out.println("Añadiendo funko...");
        inventario.add(new Funko(cod, nombre, modelo, precio, fechaLanzamiento));
        System.out.println("Funko añadido con exito");
        esperar();
    }

    private static Funko.Modelo solicitarModelo() {
        while (true) {
            System.out.println("\nModelos disponibles:");
            System.out.println("1. MARVEL\n2. DISNEY\n3. ANIME\n4. OTROS");
            System.out.print("Seleccione el modelo (1-4): ");
            String opcion = in.nextLine().trim();

            switch (opcion) {
                case "1":
                    return Funko.Modelo.MARVEL;
                case "2":
                    return Funko.Modelo.DISNEY;
                case "3":
                    return Funko.Modelo.ANIME;
                case "4":
                    return Funko.Modelo.OTROS;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void borrarFunko() {
        System.out.print("Codigo del Funko: ");
        String cod = in.nextLine();

        System.err.println("Estas a punto de borrar un funko introduce enter para continuar");
        System.err.println("o introduce cualquier cosa para cancelar");
        if (in.nextLine().isEmpty()) {
            inventario.removeIf(funko -> funko.getCod().equals(cod));
            System.err.println("Funko borrado con exito");
        } else System.out.println("Operacion cancelada");
        esperar();
    }

    private static void esperar() {
        System.out.println("Pulsa enter para continuar");
        in.nextLine();
    }


}
