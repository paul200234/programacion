package Tema7.Videojuego;

public class VideojuegoFisico extends Videojuego {
    protected String tiendaCompra;
    protected String estado;

    public VideojuegoFisico() {
        this.tiendaCompra="MediaMarkt";
        this.estado="Nuevo";
    }

    public VideojuegoFisico(String titulo, String plataforma, int nota, String tiendaCompra, String estado) throws Exception {
        super(titulo, plataforma, nota);
        setTiendaCompra(tiendaCompra);
        setEstado(estado);
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public void setTiendaCompra(String tiendaCompra) throws Exception {
        if (tiendaCompra==null){
            throw new Exception("Tu tienda no es valida. Por defecto ponemos MediaMark");
        }else {
            this.tiendaCompra = tiendaCompra;
        }

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws Exception {
        if (!estado.equals("NUEVO") && !estado.equals("USADO")){
            throw new Exception("Tu estado no es valido. Por defecto te ponemos nuevo");
        }else {
            this.estado = estado;
        }
    }

    @Override
    public String getTipo() {
        return "Físico";
    }

    @Override
    public String toString() {
        return "Videojuego Físico\n" +
                "TiendaCompra= " + tiendaCompra + '\n' +
                "Estado= " + estado + '\n' +
                "Título= " + titulo + '\n' +
                "Plataforma= " + plataforma + '\n' +
                "Nota= " + nota;
    }

    @Override
    public String escribirCSV() {
        return titulo+","+plataforma+","+nota+","+tiendaCompra+","+estado +"/n";
    }



}
