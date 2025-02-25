package Tema5.Ejercicio2;

public class Usuario {
    protected String nombre;
    protected int edad;

    public Usuario(int edad, String nombre) throws Exception {
        setEdad(edad);
        this.nombre = nombre;
    }
    public Usuario(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad() throws Exception {
        setEdad(0);
    }

    public void setEdad(int edad) throws Exception {
        if (edad>0){
            this.edad=edad;
        }else throw new Exception("Edad negativa");
    }
    @Override
    public String toString() {
        return  "┌──────────────────────┐\n" +
                "│       USUARIO        │\n" +
                "├──────────────────────┤\n" +
  String.format("│ Nombre: %-12s │\n", nombre) +
  String.format("│ Edad:   %-12d │\n", edad) +
                "└──────────────────────┘";
    }
}
