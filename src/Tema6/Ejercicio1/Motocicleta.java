package Tema6.Ejercicio1;

public class Motocicleta extends Ciclo{
    public Motocicleta(Combustible combustible, int edadMinima, int cilindrada) throws Exception {
        super(combustible, edadMinima, cilindrada);
    }

    public void setCilindrada(int cilindrada) throws Exception {
        if (cilindrada>49){
            this.cilindrada=cilindrada;
        }else {
            throw new Exception(" menos de 50cc es un ciclomotor");
        }
    }

    @Override
    protected void claxon() {
        System.out.println("pip pip");
    }
}
