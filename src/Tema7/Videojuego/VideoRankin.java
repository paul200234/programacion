package Tema7.Videojuego;

import Tema7.EjercicioFunko.Funko;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class VideoRankin {
    public static final String ruta = "Resources/juego.dat";
    private static ArrayList<Videojuego> videojuegos = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            mostrarMenu();
            opcion = in.nextInt();
            in.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    aniadirVideojuego();
                    break;
                case 2:
                    mostrarRanking();
                    break;
                case 3:
                    guardarRanking();
                    break;
                case 4:
                    cargarRanking();
                    break;
                case 5:
                    eliminarVideojuego();
                    break;
                case 6:
                    exportarATexto();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void exportarATexto(){
        StringBuilder funkoAtexto= new StringBuilder("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO\n");
        for (Videojuego funko : videojuegos) {
            funkoAtexto.append(funko.escribirCSV());
        }
        try {
            Files.writeString(Path.of("Resources/Videojuegos.csv"),funkoAtexto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void eliminarVideojuego() throws Exception {
        String nombre;
        System.out.println("Introduce el videojuego que quieras borrar");
        nombre = in.nextLine();
        videojuegos.removeIf(videojuego -> videojuego.getTitulo().equals(nombre));
    }

    private static void guardarRanking() {
        SerializaJuegos.serializaVideoJuegos(videojuegos, ruta);
    }

    private static void cargarRanking() {
        videojuegos = SerializaJuegos.deserializaJuegos(ruta);
    }

    private static void mostrarRanking() {
        for (int i = 10; i > 0; i--) {
            for (Videojuego videojuego : videojuegos) {
                if (videojuego.getNota()==i) System.out.println(videojuego);
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("--- Ranking de Videojuegos ---");
        System.out.println("1. Añadir videojuego");
        System.out.println("2. Mostrar ranking");
        System.out.println("3. Guardar ranking");
        System.out.println("4. Cargar ranking");
        System.out.println("5. Eliminar videojuego");
        System.out.println("6. Exportar a texto");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void aniadirVideojuego() {
        try {
            System.out.println("¿Qué tipo de videojuego quieres añadir?");
            System.out.println("1. Digital");
            System.out.println("2. Físico");
            System.out.print("Elige una opción: ");
            int tipo = in.nextInt();
            in.nextLine(); // Limpiar el buffer

            System.out.print("Título: ");
            String titulo = in.nextLine();

            System.out.print("Plataforma: ");
            String plataforma = in.nextLine();

            System.out.print("Nota (1-10): ");
            int nota = in.nextInt();
            in.nextLine(); // Limpiar el buffer

            if (tipo == 1) {
                System.out.print("Tienda online: ");
                String tiendaOnline = in.nextLine();

                System.out.print("Tamaño en GB: ");
                double tamanoGB = in.nextDouble();
                in.nextLine(); // Limpiar el buffer

                videojuegos.add(new VideojuegoDigital(titulo, plataforma, nota, tiendaOnline, tamanoGB));
            } else if (tipo == 2) {
                System.out.print("Tienda de compra: ");
                String tiendaCompra = in.nextLine();

                System.out.print("Estado (NUEVO/USADO): ");
                String estado = in.nextLine();

                videojuegos.add(new VideojuegoFisico(titulo, plataforma, nota, tiendaCompra, estado));
            } else {
                System.out.println("Opción no válida.");
            }

            System.out.println("Videojuego añadido correctamente.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
