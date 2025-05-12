package Tema7.Videojuego;

import java.io.Serializable;

public abstract class Videojuego implements Serializable {
    protected String titulo;
    protected String plataforma;
    protected int nota;

    public Videojuego() {
        this.titulo = "Mario Kart";
        this.plataforma = "Switch";
        this.nota = 9;
    }

    public Videojuego(String titulo, String plataforma, int nota) throws Exception {
        setTitulo(titulo);
        setPlataforma(plataforma);
        setNota(nota);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception {
        if (titulo==null){
            throw new Exception("No es valido, por defecto ponemos Mario Kart");
        }else {
            this.titulo = titulo;
        }
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) throws Exception {
        if (plataforma.isEmpty()){
            throw new Exception("No es valido, por defecto ponemos Switch");
        }else {
            this.plataforma = plataforma;
        }
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) throws Exception {
        if (nota<1||nota>10){
            throw new Exception("No es valido, por defecto ponemos 9");
        }else {
            this.nota = nota;
        }
    }

    public abstract String getTipo();

    public abstract String escribirCSV();
}
