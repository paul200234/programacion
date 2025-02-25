package Tema5.Ejercicio3;


public class Usuario {
    protected String nombre;
    protected int edad;
    protected int dni;

    public Usuario(int edad, String nombre, int dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }

    public Usuario() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new Exception("Edad negativa");
        }
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "┌───────────────────────┐\n" +
               "│       USUARIO         │\n" +
               "├───────────────────────┤\n" +
 String.format("│ Nombre: %-12s │\n", nombre) +
 String.format("│ Edad:   %-12d │\n", edad) +
 String.format("│ DNI:    %-12s │\n", dni) +
               "└───────────────────────┘";
    }
}
