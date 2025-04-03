package Tema7.ActividadesB;

public class Alumno {
    protected String nombre;
    protected String apellido;
    protected double media;



    public Alumno(String alumno) {


        String[] datosAlumnos=new String[alumno.split(" ").length];
        /*split -> separa la string por el caracter que tu quieras*/
        datosAlumnos=alumno.split(" ");


        double notaPromedio=0;
        int cuantasNotas=0;
        for (int i =2; i<datosAlumnos.length; i++){
            notaPromedio+=Double.valueOf(datosAlumnos[i]);
            cuantasNotas++;
        }
        this.nombre=datosAlumnos[0];
        this.apellido=datosAlumnos[1];
        this.media=notaPromedio/cuantasNotas;



    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Alumnos " +
                "Nombre= " + nombre + "\n" +
                "Apellido= " + apellido + '\n' +
                "Media= " + media + '\n' +
                '\n';
    }

}