package Tema4.banco;

public class Persona {

    private String nombre;
    private int dni;
    private Cuenta[] cuentas = new Cuenta[3];
    private boolean moroso;

    public Persona(String nombre, int dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentas = cuentas;
    }
    public Persona(String nombre, int dni){
        this.nombre=nombre;
        this.dni = dni;
        for (int i = 0; i < 3; i++) {
            cuentas[i]=new Cuenta();
        }
    }
    public int primeraCuentaVacia(){
        for (int i = 0; i < 3; i++) {
            if(cuentas[i].getnDeCuenta()==0){
                return i;
            }
        }
        return -1;
    }
    public void crearCuenta(int numeroDeCuenta, int saldoInicial){
        if (primeraCuentaVacia()!=-1){ cuentas[primeraCuentaVacia()]= new Cuenta(numeroDeCuenta,saldoInicial);}
        else {
            System.out.println("No se pueden crear mas cuentas");
        }
    }
    public void asociarCuenta(Cuenta cuenta){
        cuentas[primeraCuentaVacia()]=cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public boolean isMoroso() {
        for (int i = 0; i < 3; i++) {
            if (cuentas[i].getSaldoCentimos()<0){
                setMoroso(true);
                return true;
            }
        }
        setMoroso(false);
        return false;
    }
    public boolean esMoroso(){
        return moroso;
    }
    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }
    @Override
    public String toString() {
        String cuentasStr = "";
        for (int i = 0; i < primeraCuentaVacia(); i++) {
            cuentasStr += "\n   " + cuentas[i].toString();
        }
        return "Persona {" +
                "\n  Nombre: " + nombre +
                "\n  DNI: " + dni +
                "\n  Cuentas: " + cuentasStr +
                "\n  Moroso: " + (isMoroso() ? "Sí" : "No") +
                "\n}";
    }
}
