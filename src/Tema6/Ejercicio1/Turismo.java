package Tema6.Ejercicio1;

public class Turismo extends Vehiculo{
    private int plazas;
    private boolean usoProfesionalONo;

    public Turismo(int plazas, boolean usoProfesionalONo, Combustible combustible) throws Exception {
        super(4,combustible,18);
        this.plazas = plazas;
        this.usoProfesionalONo = usoProfesionalONo;
    }

    public Turismo() throws Exception {
        super(4,Combustible.GASOLINA,18);
    }

    @Override
    protected void claxon() {
        System.out.println("Pi PIII");
    }
}
