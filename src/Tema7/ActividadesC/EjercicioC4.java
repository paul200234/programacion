package Tema7.ActividadesC;

import java.io.IOException;

public class EjercicioC4 {
/**
 * Ejercicio 4: Serializar un Objeto Persona
 * Crea	una	clase	Persona	con	nombre	y	edad.	Crea	un	objeto	y	guárdalo	en	un	fichero	binario
 * llamado	persona.dat	mediante	serialización.
 * */
    public static void main(String[] args) {
        Persona Martin = new Persona(18, "Martin");
        PersonaEscribir escribir = new PersonaEscribir();
        try {
            escribir.abrir();
            escribir.escribir(Martin);
            escribir.cerrar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
