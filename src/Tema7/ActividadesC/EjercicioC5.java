package Tema7.ActividadesC;

public class EjercicioC5 {
    /**
     * Ejercicio 5: Leer Objeto Serializado
     * Lee	el	objeto	Persona	del	fichero	persona.dat	y	muestra	sus	datos	en	consola
     * */
    public static void main(String[] args) {
        LectorPersonas leer = new LectorPersonas();

        Persona Eleno = null;

        try {
            leer.abrir();
            Eleno= leer.leer();
            leer.cerrar();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(Eleno);
    }
}
