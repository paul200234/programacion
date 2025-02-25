package Tema5.Excepciones;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        setEdad(edad);
        setNombre(nombre);
    }

    public void imprimir() {
        System.out.println("Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}');
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length()>=3) {
            this.nombre = nombre;
        }else {
            throw new Exception("El nombre es demasiado corto");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad>0) {
            this.edad = edad;
        }else {
            throw new Exception("Edad negativa invalida");
        }
    }
}
