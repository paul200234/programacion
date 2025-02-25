package Tema5.Excepciones;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {

        try {
            Gato gato1 = new Gato("Michi",3);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
