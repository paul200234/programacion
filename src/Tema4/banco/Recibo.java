package Tema4.banco;

import java.util.Date;

public class Recibo {
    private Cuenta cuentaQuePaga;
    private Cuenta cuentaQueRecibe;
    private int importe;
    private Date fechaPagado;
    private boolean pagado;



    public Recibo(Cuenta cuentaQuePaga, Cuenta cuentaQueRecibe, int importe) {
        this.cuentaQuePaga = cuentaQuePaga;
        this.cuentaQueRecibe = cuentaQueRecibe;
        this.importe = importe;
    }

    public Recibo() {
    }

    public Date getFechaPagado() {
        return fechaPagado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void setFechaPagado(Date fechaPagado) {
        this.fechaPagado = fechaPagado;
    }

    public Cuenta getCuentaQuePaga() {
        return cuentaQuePaga;
    }

    public void setCuentaQuePaga(Cuenta cuentaQuePaga) {
        this.cuentaQuePaga = cuentaQuePaga;
    }

    public Cuenta getCuentaQueRecibe() {
        return cuentaQueRecibe;
    }

    public void setCuentaQueRecibe(Cuenta cuentaQueRecibe) {
        this.cuentaQueRecibe = cuentaQueRecibe;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Recibo {" +
                "\n  Cuenta que Paga: " + cuentaQuePaga.getnDeCuenta() +
                "\n  Cuenta que Recibe: " + cuentaQueRecibe.getnDeCuenta() +
                "\n  Importe: " + String.format("%.2f€", (double) importe / 100) +
                "\n  Fecha de Pago: " + (fechaPagado != null ? fechaPagado.toString() : "No pagado") +
                "\n  Pagado: " + (pagado ? "Sí" : "No") +
                "\n}";
    }
}
