package Tema7.ActividadesC;

import java.io.Serializable;

public class Persona implements Serializable {
    public int edad;
    public String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s \nEdad: %s",nombre,edad);
    }
}
