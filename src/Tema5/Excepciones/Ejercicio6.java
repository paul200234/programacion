package Tema5.Excepciones;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {

        try {
            Gato gato1 = new Gato("hi",2);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        Gato gato2= new Gato("Michi",2);
        gato2.imprimir();

        try {
            gato2.setNombre("Mi");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        try {
            gato2.setEdad(-2);
        }catch (Exception e){
            System.out.println("Error "+ e.getMessage());
        }
        gato2.imprimir();

    }
}

