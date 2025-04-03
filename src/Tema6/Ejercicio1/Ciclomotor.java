package Tema6.Ejercicio1;

public class Ciclomotor extends Ciclo {
    public Ciclomotor(Combustible combustible, int edadMinima, int cilindrada) throws Exception {
        super(combustible, edadMinima, cilindrada);
    }


    @Override
    public void setCilindrada(int cilindrada) throws Exception {
        if (cilindrada < 50 && cilindrada >0){
            this.cilindrada=cilindrada;
        }else {
            throw new Exception(" mas cilindrada se considera moto");
        }
    }

    @Override
    protected void claxon() {
        System.out.println("pep pep");
    }
}
