package Tema7.EjercicioFunko;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funko implements Serializable {
    public enum Modelo {
        MARVEL,
        DISNEY,
        ANIME,
        OTROS
    }

    private final String cod;
    private String nombre;
    private Modelo modelo;
    private double precio;
    private LocalDate fechaLanzamiento;

    public Funko(String cod, String nombre, Modelo modelo, double precio, LocalDate fechaLanzamiento) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    // Constructor que recibe una línea del CSV
    public Funko(String lineaCSV) {
        String[] partes = lineaCSV.split(",");

        if (partes.length != 5) {
            throw new IllegalArgumentException("Formato de línea CSV inválido");
        }

        this.cod = validarCodigo(partes[0].trim());
        this.nombre = validarNombre(partes[1].trim());
        this.modelo = Modelo.valueOf(partes[2].trim().toUpperCase());
        this.precio = validarPrecio(Double.parseDouble(partes[3].trim()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaLanzamiento = LocalDate.parse(partes[4].trim(), formatter);
    }

    // Métodos de validación
    private String validarCodigo(String cod) {
        if (cod == null || cod.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede ser nulo o vacío");
        }

        return cod;
    }

    private String validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        if (nombre.length() > 100) {
            throw new IllegalArgumentException("El nombre no puede exceder los 100 caracteres");
        }
        return nombre;
    }

    private double validarPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        }
        if (precio > 1000) {
            throw new IllegalArgumentException("El precio no puede exceder 1000");
        }
        return precio;
    }

    // Métod para generar la línea CSV
    public String toCSV() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return String.join(",",
                cod,
                nombre,
                modelo.name(),
                String.valueOf(precio),
                fechaLanzamiento.format(formatter)
        );
    }

    // Getters
    public String getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    // Setters con validaciones
    public void setNombre(String nombre) {
        this.nombre = validarNombre(nombre);
    }

    public void setModelo(Modelo modelo) {
        if (modelo == null) {
            throw new IllegalArgumentException("El modelo no puede ser nulo");
        }
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = validarPrecio(precio);
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        if (fechaLanzamiento == null) {
            throw new IllegalArgumentException("La fecha de lanzamiento no puede ser nula");
        }
        if (fechaLanzamiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de lanzamiento no puede ser futura");
        }
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Funko{" +
                "cod='" + cod + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo=" + modelo +
                ", precio=" + precio +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}';
    }
}