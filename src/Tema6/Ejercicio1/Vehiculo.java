package Tema6.Ejercicio1;

public abstract class Vehiculo {
    protected int ruedas;
    protected Combustible combustible;
    protected int edadMinima;

    public Vehiculo(int ruedas, Combustible combustible, int edadMinima) throws Exception {
        setRuedas(ruedas);
        this.combustible = combustible;
        setEdadMinima(edadMinima);
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) throws Exception {
        if (ruedas<0){
            throw new Exception(" no se aceptan vehiculos sin ruedas");
        }else if (ruedas % 2 !=0){
            throw new Exception(" no aceptamos monociclos ni triciclos");
        }else {
            this.ruedas=ruedas;
        }
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) throws Exception {
        if (edadMinima<15) {
            this.edadMinima = edadMinima;
        }throw new Exception(" edad minima ilegal");
    }

    protected abstract void claxon();

}
