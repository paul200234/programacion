package Tema6.Ejercicio1;

public class Camion extends Vehiculo{

    protected int masaMaximaAutorizada;
    protected boolean mercanciaPeligrosa;

    public Camion(int ruedas, Combustible combustible, int edadMinima, int masaMaximaAutorizada, boolean mercanciaPeligrosa) throws Exception {
        super(ruedas, combustible, edadMinima);
        this.masaMaximaAutorizada = masaMaximaAutorizada;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    public int getMasaMaximaAutorizada() {
        return masaMaximaAutorizada;
    }

    public void setMasaMaximaAutorizada(int masaMaximaAutorizada) {
        this.masaMaximaAutorizada = masaMaximaAutorizada;
    }

    public boolean isMercanciaPeligrosa() {
        return mercanciaPeligrosa;
    }

    public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    @Override
    protected void claxon() {
        System.out.println("Paaaaa");
    }
}
