package Tema4.banco;

import java.time.LocalDate;
import java.util.Date;

public class Cuenta {
    private int nDeCuenta;
    private int saldoCentimos;

    public Cuenta() {
        nDeCuenta = 0;
        saldoCentimos = 0;
    }

    public Cuenta(int nDeCuenta, int saldoCentimos) {
        this.nDeCuenta = nDeCuenta;
        this.saldoCentimos = saldoCentimos;
    }

    public String mostrarSaldo(){
        double saldoEuros = (double) saldoCentimos /100;
        return String.format("%.2f€",saldoEuros);
    }

    public void pagarRecibo(Recibo recibo){
        if(recibo.getImporte()>=saldoCentimos){
            restarSaldo(recibo.getImporte());
            recibo.getCuentaQueRecibe().sumarSaldo(recibo.getImporte());
            Date fecha = new Date();
            recibo.setFechaPagado(fecha);
            recibo.setPagado(true);
            System.out.println("Recibo pagado en: " + fecha);
        }else {
            System.out.println("Saldo insuficiente para pagar el recibo");
        }
    }

    public Recibo generarRecibo(int importe, Cuenta cuentaQuePaga){
        return new Recibo(cuentaQuePaga,this,importe);
    }

    public void recibirAbono(int abono, Cuenta cuentaQuePaga){
        cuentaQuePaga.restarSaldo(abono);
        sumarSaldo(abono);
    }

    public int getnDeCuenta() {
        return nDeCuenta;
    }

    public void setnDeCuenta(int nDeCuenta) {
        this.nDeCuenta = nDeCuenta;
    }

    public int getSaldoCentimos() {
        return saldoCentimos;
    }

    public void setSaldoCentimos(int saldoCentimos) {
        this.saldoCentimos = saldoCentimos;
    }

    public void sumarSaldo(int saldoCentimos){
        this.saldoCentimos+=saldoCentimos;
    }

    public void restarSaldo(int saldoCentimos){
        this.saldoCentimos-=saldoCentimos;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nDeCuenta=" + nDeCuenta +
                ", saldoCentimos=" + mostrarSaldo() +
                '}';
    }
}
