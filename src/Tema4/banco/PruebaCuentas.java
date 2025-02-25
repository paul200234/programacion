package Tema4.banco;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona[] personas = new Persona[5];
        Cuenta[] cuentas = new Cuenta[15];
        int numeroDePersonas = 0;
        int numCuentas=0;
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir Persona");
            System.out.println("2. Crear cuenta y asociarla a una persona");
            System.out.println("3. Mostrar datos de una persona (por su dni)");
            System.out.println("4. Recibir la nómina mensual de una persona (por dni y núm de cuenta)");
            System.out.println("5. Recibir un pago (por dni y núm de cuenta)");
            System.out.println("6. Realizar transferencia entre cuentas");
            System.out.println("7. Imprimir las personas morosas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = in.nextInt();
            in.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    numeroDePersonas = instanciarPersona(personas, numeroDePersonas);
                    break;
                case 2:
                    numCuentas= instanciarCuenta(personas,cuentas,numCuentas);
                    break;
                case 3:
                    mostrarDatosPersona( personas);
                    break;
                case 4:
                    recibirNomina(cuentas);
                    break;
                case 5:
                    recibirPago(cuentas);
                    break;
                case 6:
                    realizarTransferencia(cuentas);
                    break;
                case 7:
                    imprimirMorosos(personas,numeroDePersonas);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static int instanciarPersona(Persona[] personas, int contador) {
        Scanner in = new Scanner(System.in);
        if (contador < 5) {
            System.out.print("Ingrese el DNI: ");
            int dni = in.nextInt();
            System.out.print("Ingrese el nombre: ");
            String nombre = in.nextLine();
            personas[contador] = new Persona(nombre, dni);
            System.out.println("Persona creada exitosamente.");
            return contador + 1;
        } else {
            System.out.println("No se pueden agregar más personas. Límite alcanzado.");
            return contador;
        }
    }
    public static int instanciarCuenta(Persona[] personas,Cuenta[] cuentas, int numeroCuentas){
        Scanner in = new Scanner(System.in);
        boolean cuentaCreable=true;
        System.out.println("Introduce un dni");
        int dni = in.nextInt();
        if(personas[buscarPersonaPorDni(dni,personas)].primeraCuentaVacia()==-1){
            cuentaCreable=false;
            System.out.println("Esta persona no puede crear mas cuentas");
        }

        System.out.println("Introduce el numero de cuenta");
        int nDeCuenta = in.nextInt();

        for (int i = 0; i < numeroCuentas; i++) {
            if (cuentas[i].getnDeCuenta()==nDeCuenta){
                System.out.println("Numero de cuenta ya existente");
                cuentaCreable=false;
            }
        }

        System.out.println("Introduce el saldo inicial");
        int saldoInicial = in.nextInt();
        if (saldoInicial<0){
            System.out.println("Saldo insuficiente para crear la cuenta");
            cuentaCreable=false;
        }
        Cuenta cuenta = new Cuenta(nDeCuenta,saldoInicial);

        if (cuentaCreable){
            cuentas[numeroCuentas]=cuenta;
            System.out.println(cuenta);
        }
        if (cuentaCreable){
        personas[buscarPersonaPorDni(dni,personas)].asociarCuenta(cuenta);
        return numeroCuentas+1;
        }else {return numeroCuentas;}



    }
    public static int buscarPersonaPorDni(int dni, Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            if (dni== personas[i].getDni()){
                return i;
            }
        }
        return -1;
    }

    public static void mostrarDatosPersona(Persona[] personas){
         Scanner in = new Scanner(System.in);
        System.out.println("Introduce el  dni");
        int dni = in.nextInt();
        System.out.println(personas[buscarPersonaPorDni(dni,personas)]);
    }
    public static void recibirNomina(Cuenta[] cuentas) {
         Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = in.nextInt();
        Cuenta cuenta = cuentas[buscarCuentaPorNumero(numeroCuenta,cuentas)];
        if (cuenta != null) {
            System.out.print("Ingrese el monto de la nómina: ");
            int monto = in.nextInt();
            cuenta.sumarSaldo(monto);
            System.out.println("Nómina recibida exitosamente.");
            System.out.println("Saldo actual: "+ cuenta.mostrarSaldo());
        } else {
            System.out.println("No se encontró la cuenta.");
        }
    }
    public static int buscarCuentaPorNumero(int numeroDeCuenta, Cuenta[] cuentas){
        for (int i = 0; i < cuentas.length; i++) {
            if (numeroDeCuenta== cuentas[i].getnDeCuenta()) {
                return i;
            }
        }
        return -1;
    }
    public static void recibirPago(Cuenta[] cuentas){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = in.nextInt();
        Cuenta cuenta = cuentas[buscarCuentaPorNumero(numeroCuenta,cuentas)];
        if (cuenta != null) {
            System.out.print("Ingrese el monto dl pago: ");
            int monto = in.nextInt();
            cuenta.sumarSaldo(monto);
            System.out.println("Nómina recibida exitosamente.");
            System.out.println("Saldo actual: "+ cuenta.mostrarSaldo());
        } else {
            System.out.println("No se encontró la cuenta.");
        }
    }
    public static void realizarTransferencia(Cuenta[] cuentas){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la cuenta de origen");
        int numeroOrigen = in.nextInt();
        Cuenta cuentaOrigen = cuentas[buscarCuentaPorNumero(numeroOrigen, cuentas)];
        System.out.println("Introduce la cuenta de destino");
        int numeroDestino = in.nextInt();
        Cuenta cuentaDestino = cuentas[buscarCuentaPorNumero(numeroDestino, cuentas)];
        System.out.println("Introduce la cuantia del importe");
        int cantidad = in.nextInt();

        cuentaDestino.recibirAbono(cantidad,cuentaOrigen);
        System.out.println("Operacion realizada con exito:");
        System.out.println("Saldo actual de la cuenta de origen: "+cuentaOrigen.mostrarSaldo());

    }
    private static void imprimirMorosos(Persona[] personas, int contadorPersonas) {
        System.out.println("Personas morosas:");
        for (int i = 0; i < contadorPersonas; i++) {
            if (personas[i].esMoroso()) {
                System.out.println(personas[i]);
            }
        }
    }

}
