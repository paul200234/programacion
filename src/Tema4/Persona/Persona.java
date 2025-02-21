package Tema4.Persona;

public class Persona {
    private final  int adultAge = 18;
    private final  int retiredAge = 65;
    private  String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        dni = "00000000a";
        nombre="Paul";
        apellidos="Adam";
        edad=10;
    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public int getRetiredAge() {
        return retiredAge;
    }
    public void setDni(String dni){
        if (checkDNI(dni)){
            this.dni = dni;
        }

    }

    public int getAdultAge() {
        return adultAge;
    }
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>0){
        this.edad = edad;}
    }


    public void print() {
        System.out.println(
                "dni='" + dni + '\n' +
                "nombre=" + nombre + '\n' +
                "apellidos=" + apellidos + '\n' +
                "edad=" + edad );
    }
    public boolean isAdult(){
        return edad>=adultAge;
    }
    public boolean isRetired(){
        return edad>retiredAge;
    }
    public int agrDifference(Persona personaAComparar){
        return this.edad - personaAComparar.edad;
    }
    public static boolean checkDNI(String dni) {
        return dni.length() == 9 && Character.isLetter(dni.charAt(8));
    }
}
