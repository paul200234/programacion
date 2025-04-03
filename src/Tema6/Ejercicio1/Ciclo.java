package Tema6.Ejercicio1;

public abstract class Ciclo extends Vehiculo{

    protected int cilindrada;

    public boolean necesitaCarnet(){
        return cilindrada<50;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) throws Exception {
        if (cilindrada>1) {
            this.cilindrada = cilindrada;
        }else {
            throw new Exception(" error cilindrada negativa");
        }
    }

    public Ciclo(Combustible combustible, int edadMinima,int cilindrada) throws Exception {
        super(2, combustible, edadMinima);
        setCilindrada(cilindrada);
    }
}
