package Tema7.Videojuego;

public class VideojuegoDigital extends Videojuego {
    protected String tiendaOnline;
    protected double tamanoGB;

    public VideojuegoDigital() {
        this.tiendaOnline="GAME";
        this.tamanoGB=50.0;
    }

    public VideojuegoDigital(String titulo, String plataforma, int nota, String tiendaOnline, double tamanoGB) throws Exception {
        super(titulo, plataforma, nota);
        setTiendaOnline(tiendaOnline);
        setTamanoGB(tamanoGB);
    }

    public String getTiendaOnline() {
        return tiendaOnline;
    }

    public void setTiendaOnline(String tiendaOnline) throws Exception {
        if (tiendaOnline==null){
            throw new Exception("Tu tienda no es valida. Por defecto ponemos GAME");
        }else {
            this.tiendaOnline = tiendaOnline;
        }

    }

    public double getTamanoGB() {
        return tamanoGB;
    }

    public void setTamanoGB(double tamanoGB) throws Exception {
        if (this.tamanoGB <0){
            throw new Exception("TU valor no es valido, por defecto ponemos 50");
        }else {
            this.tamanoGB=tamanoGB;
        }
    }

    @Override
    public String getTipo() {
        return "Digital";
    }

    @Override
    public String toString() {
        return "VideojuegoDigital\n" +
                "Tienda Online Compra= " + tiendaOnline + '\n' +
                "Tamaño GB= " + tamanoGB + '\n' +
                "Título= " + titulo + '\n' +
                "Plataforma= " + plataforma + '\n' +
                "Nota= " + nota;
    }

    @Override
    public String escribirCSV() {
        return titulo +","+ plataforma +","+ nota+","+tiendaOnline+","+tamanoGB +'\n';
    }

}
