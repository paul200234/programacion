package Tema3.modulo2.JuegoDeMetodos;

import java.util.Random;
import java.util.Scanner;

public class GameTools {
    public static int menuInicial(){
         Scanner in = new Scanner(System.in);
        int seleccion;
        System.out.println("############################################################");
        System.out.println();
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡇⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⠟⠀⣀⣠⠄⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⢠⣶⣿⠟⠁⢠⣾⠋⠁⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠹⣿⡇⠀⠀⠸⣿⡄⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠙⠷⡀⠀⠀⢹⠗⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⢀⣤⣴⡖⠒⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠒⢶⣄");
        System.out.println("⠀⠀⠈⠙⢛⣻⠿⠿⠿⠟⠛⠛⠛⠋⠉⠀⠀⠀⣸⡿");
        System.out.println("⠀⠀⠀⠀⠛⠿⣷⣶⣶⣶⣶⣾⠿⠗⠂⠀⢀⠴⠛⠁");
        System.out.println("⠀⠀⠀⠀⠀⢰⣿⣦⣤⣤⣤⣴⣶⣶⠄⠀⠀⠀⠀⠀");
        System.out.println("⣀⣤⡤⠄⠀⠀⠈⠉⠉⠉⠉⠉⠀⠀⠀⠀⢀⡀⠀⠀");
        System.out.println("⠻⣿⣦⣄⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣠⣴⠾⠃⠀⢀");
        System.out.println("⠀⠀⠈⠉⠛⠛⠛⠛⠛⠛⠛⠛⠋⠉⠁⠀⣀⣤⡶⠋");
        System.out.println("⠀⠀⠀⠀⠐⠒⠀⠠⠤⠤⠤⠶⠶⠚⠛⠛⠉⠀⠀⠀");
        System.out.println();
        System.out.println("############################################################");
        System.out.println("Combate por turnos java selecciona una opción");
        System.out.println("(1) Combate ⚔️   (2) Archivo 📖  (3)Salir ❌");
        seleccion = in.nextInt();
        while (seleccion>3 || seleccion<1){
            System.out.println("Error, valor incorrecto elija una de las opciones");
            seleccion = in.nextInt();

        }

        return seleccion;
    }
    public static void limpiarPantalla(){
        for (int i = 0; i < 10; i++) {
            System.out.println("\n\n\n");
        }
    }
    public static void enterAceptar(){
        System.out.println("Pulsa enter para continuar...");
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }
    public static double[] menuCreacionPersonaje(double[] personaje){
        int opcion;
        Scanner in = new Scanner(System.in);
        System.out.println("############################################################");
        System.out.println();
        System.out.println("         /^\\     .");
        System.out.println("    /\\   \"V\"");
        System.out.println("   /__\\   I      O  o");
        System.out.println("  //..\\   I     .");
        System.out.println("  \\.`7/   I");
        System.out.println("  /l\\/j\\ I    .  O");
        System.out.println(" /. ~~ ,\\/I          .");
        System.out.println(" \\\\L__j^/I       o");
        System.out.println("  \\/--v}  I     o   .");
        System.out.println("  |    |   I   _________");
        System.out.println("  |    |   I c(`       ')o");
        System.out.println("  |    l   I   \\ .     ,/");
        System.out.println("_/j  L l\\_!  _//^---^\\_ ");
        System.out.println();
        System.out.println("############################################################");
        System.out.println("->(0)Personaje al azár🎲");
        System.out.println("->(1)Usar personaje predefinido🧙‍♂️");
        System.out.println("->(2)Crear personaje desde 0🖌️");
        System.out.println("->(3)Salir...🏃‍♀️‍➡️");
        System.out.println("############################################################");

        opcion = in.nextInt();
        while (opcion  <0 || opcion >3){
            System.out.println("Error, introduce una opción válida....");
            System.out.println("->(0)Personaje al azár🎲");
            System.out.println("->(1)Usar personaje predefinido🧙‍♂️");
            System.out.println("->(2)Crear personaje desde 0🖌️");
            System.out.println("->(3)Salir...🏃‍♀️‍➡️");
            System.out.println("############################################################");

            opcion = in.nextInt();

        }
        GameTools.limpiarPantalla();
        switch (opcion){
            case 0->{
                personaje = personajeAleatorio();
            }
            case 1->{
                personaje=selecionDePersonaje();
            }
            case 2->{
                personaje=personajeManual();
            }
            default->{
                System.out.println("Saliendo...");
            }
        }

        return personaje;
    }
    public static void mostrarStats(double[] personaje){
        System.out.println("############################################################");
        System.out.println();
        System.out.println("Las estadisticas són:");
        System.out.print("⚔️Ataque: ");
        numeroEnPalos(personaje[3]);
        System.out.println();
        System.out.print("❤️Vida: ");
        numeroEnPalos(personaje[2]);
        System.out.println();
        System.out.print("🏃‍♀️‍➡️velocidad: ");
        numeroEnPalos(personaje[0]);
        System.out.println();
        System.out.print("🛡️Ddefensa: ");
        numeroEnPalos(personaje[1]);
        System.out.println();
        System.out.println("############################################################");
        enterAceptar();
        limpiarPantalla();
    }
    public static double[] personajeAleatorio(){
        Random random = new Random(System.nanoTime());
        int ia = random.nextInt(6)+1;
        double pv2;
        double atq2;
        double vel2;
        double def2;
        switch (ia) {
                case 1: // Guerrero
                pv2 = 150;
                atq2 = 120;
                vel2 = 100;
                def2 = 100;
                break;
            case 2: // Mago
                pv2 = 100;
                atq2 = 150;
                vel2 = 90;
                def2 = 80;
                break;
            case 3: // Arquero
                pv2 = 120;
                atq2 = 110;
                vel2 = 150;
                def2 = 80;
                break;
            case 4: // Tanque
                pv2 = 200;
                atq2 = 80;
                vel2 = 50;
                def2 = 170;
                break;
            case 5: // Asesino
                pv2 = 90;
                atq2 = 160;
                vel2 = 180;
                def2 = 70;
                break;
            case 6: // Cañón de Cristal
                pv2 = 60;
                atq2 = 190;
                vel2 = 120;
                def2 = 50;
                break;
            default:{
                pv2=50;
                def2=50;
                vel2=50;
                atq2=50;
            }

        }
        return new double[]{vel2,def2,pv2,atq2,0};
    }
    public static double[] personajeManual(){
         Scanner in = new Scanner(System.in);
        double vel1 =1;
        double atq1 =1;
        double def1 =1;
        double total=1;
        double pv1 = 0;
        int seleccion=3;
        do {
        System.out.println("Introduce las estadisticas de tu personaje");
        System.out.println("ten en cuenta que la suma no puede superar 500");
        System.out.println("Cuanta vida tiene tu personaje?(1-200)");
        pv1= in.nextInt();
        if (pv1<1||pv1>200){
            do{
                System.out.println("Valor ilegal, introduce un valor entre 1-200");
                pv1= in.nextInt();}
            while (pv1<1||pv1>200);
        }
        total = total+ pv1;
        System.out.println("Cuanto ataque tiene tu personaje?(1-200)");
        atq1= in.nextInt();
        if (atq1<1||atq1>200){ do{
            System.out.println("Valor ilegal, introduce un valor entre 1-200");
            atq1= in.nextInt();}while (atq1<1||atq1>200);
        }
        total = total+ atq1;
        if (total >500){
            System.out.println("El total ha superado el limite de 500");
            continue;
        }

        System.out.println("Cuanta velocidad tiene tu personaje?(1-200)");
        vel1= in.nextInt();
        if (vel1<1||vel1>200){ do{
            System.out.println("Valor ilegal, introduce un valor entre 1-200");
            vel1= in.nextInt();}while (vel1<1||vel1>200);
        }
        total = total+ vel1;
        if (total >500){
            System.out.println("El total ha superado el limite de 500");
            continue;
        }

        System.out.println("Cuanta defensa tiene tu personaje?(1-200)");
        def1= in.nextInt();
        if (def1<1||def1>200){
            do{
                System.out.println("Valor ilegal, introduce un valor entre 1-200");
                def1= in.nextInt();}
            while (def1<1||def1>200);
        }
        total = total+ def1;
        if (total >500){
            System.out.println("El total ha superado el limite de 500");
        }
        in.nextLine();
    } while(total>500);
    return new double[]{vel1,def1,pv1,atq1, 0};
    }
    public static double[] selecionDePersonaje(){
             Scanner in = new Scanner(System.in);


                /*                       ############################
############################################selección de personaje################################################
                                         ############################
                */
        // Mostrar lista de personajes predefinidos
        System.out.println("############################################################");
        System.out.println("Personajes predefinidos:");
        System.out.println("1. Guerrero 🏇");
        System.out.println("2. Mago 🧙‍♂️ ");
        System.out.println("3. Arquero 🏹");
        System.out.println("4. Tanque 🏰");
        System.out.println("5. Asesino 🗡️");
        System.out.println("6. Cañón de Cristal 💥");
        System.out.println("Selecciona el personaje (1-6):");
        System.out.println("############################################################");

        int personaje = in.nextInt();
        GameTools.limpiarPantalla();
        double vel1 =1;
        double atq1 =1;
        double def1 =1;
        double pv1 = 0;
        // Asignación de estadísticas del personaje predefinido
        switch (personaje) {
            case 1: // Guerrero
                pv1 = 150;
                atq1 = 120;
                vel1 = 100;
                def1 = 100;
                break;
            case 2: // Mago
                pv1 = 100;
                atq1 = 150;
                vel1 = 90;
                def1 = 80;
                break;
            case 3: // Arquero
                pv1 = 120;
                atq1 = 110;
                vel1 = 150;
                def1 = 80;
                break;
            case 4: // Tanque
                pv1 = 200;
                atq1 = 80;
                vel1 = 50;
                def1 = 170;
                break;
            case 5: // Asesino
                pv1 = 90;
                atq1 = 160;
                vel1 = 180;
                def1 = 70;
                break;
            case 6: // Cañón de Cristal
                pv1 = 60;
                atq1 = 190;
                vel1 = 120;
                def1 = 50;
                break;
            default:
                pv1 = 2;
                atq1 = 2;
                vel1 = 2;
                def1 = 2;
                break;

        }
        in.nextLine();//leer la basura
        return new double[]{vel1,def1,pv1,atq1,0};

    }//personaje por defecto
    public static int menuPvPoPvE(){
        int opcion;
        Scanner in = new Scanner(System.in);

        System.out.println("############################################################");
        System.out.println();
        System.out.println("Elige un modo de juego:");
        System.out.println("->(0)PNJ contra PNJ 👾");
        System.out.println("->(1)Jugador contre PNJ🤖");
        System.out.println("->(2)Jugador contra Jugador ⚔️");
        System.out.println("->(3)Salir🏃‍♀️‍➡️");
        System.out.println("############################################################");
        opcion = in.nextInt();
        while (opcion<0 || opcion>3){
            System.out.println("Error, elija una de las siguientes opciónes");
            System.out.println("->(0)PNJ contra PNJ 👾");
            System.out.println("->(1)Jugador contre PNJ🤖");
            System.out.println("->(2)Jugador contra Jugador ⚔️");
            System.out.println("->(3)Salir🏃‍♀️‍➡️");
            System.out.println("############################################################");
            opcion= in.nextInt();
        }
        GameTools.limpiarPantalla();
        return opcion;
    }
    public static void combate(double[] personaje1, double[] personaje2){
        System.out.println("############################################################");
        System.out.println();
        boolean ganador = false;
        int contador=1;
        do {
        switch (Combate.turnoDe(personaje1[0],personaje2[0],contador )){
            case 0-> {
                contador++;
                if (personaje1[2]<=0||personaje2[2]<=0){
                    ganador=true;
                }
            }
            case 1->{
                contador++;
                System.out.println("############################################################");
                System.out.println();
                System.out.println("Turno del jugador 1");
                System.out.println();
                System.out.println("############################################################");

                if (personaje1[4]==1){
                    switch (Combate.menuJugadorEnCombate()){
                        case 0->{
                            Combate.tomarLaPocion();
                        }
                        case 1->{
                            personaje2=Combate.violencia(personaje1,personaje2);

                        }
                        case 2->{
                            mostrarStats(personaje2);
                        }
                        case 3-> {
                            if (personaje1[0]>personaje2[0]){
                                System.out.println("Ha ganado el jugador1");
                            }else {
                                System.out.println("Ha ganado el jugador2");
                            }
                            ganador=true;
                        }
                    }
                }else {
                    personaje2 = Combate.violencia(personaje1,personaje2);

                    System.out.println("############################################################");

                }

            }
            case 2->{
                contador++;
                System.out.println("############################################################");
                System.out.println();
                System.out.println("Turno del jugador2");
                System.out.println();
                System.out.println("############################################################");

                if (personaje2[4]==1){
                    switch (Combate.menuJugadorEnCombate()){
                        case 0->{
                            Combate.tomarLaPocion();
                        }
                        case 1->{
                            personaje1=Combate.violencia(personaje2,personaje1);
                        }
                        case 2->{
                            mostrarStats(personaje1);
                        }
                        case 3-> {
                            if (personaje1[0]>=personaje2[0]){
                                System.out.println("Ha ganado el jugador1");
                            }else {
                                System.out.println("Ha ganado el jugador2");
                            }
                            ganador=true;
                        }
                    }

                }else {
                    personaje1= Combate.violencia(personaje2,personaje1);

                }


            }
        }

        }while (!ganador);
    }
    public static double[] menuArchivo(){
        Scanner in = new Scanner(System.in);
        System.out.println("############################################################");
        System.out.println();
        System.out.println("             .--.           .---.        .-.");
        System.out.println("         .---|--|   .-.     | A |  .---. |~|    .--.");
        System.out.println("      .--|===|Ch|---|_|--.__| S |--|:::| |~|-==-|==|---.");
        System.out.println("      |%%|NT2|oc|===| |~~|%%| C |--|   |_|~|CATS|  |___|-. ");
        System.out.println("      |  |   |ah|===| |==|  | I |  |:::|=| |    |GB|---|=|");
        System.out.println("      |  |   |ol|   |_|__|  | I |__|   | | |    |  |___| |");
        System.out.println("      |~~|===|--|===|~|~~|%%|~~~|--|:::|=|~|----|==|---|=|");
        System.out.println("  hjw ^--^---'--^---^-^--^--^---'--^---^-^-^-==-^--^---^-' ");
        System.out.println("############################################################");
        System.out.println("Bienvenido al archivo aqui puedes leer sobre los personajes:");
        return selecionDePersonaje() ;
    }
    public static double[] personajeJugable(double[] personaje) {
        personaje = menuCreacionPersonaje(personaje);
        //Este valor se tiene en cuenta durante el combate para decidir si puede elejir o no que hacer
        personaje[4] = 1;
        return personaje;
    }
    public static double[] personajeNoJugable() {
        double[] personaje = personajeAleatorio();
        //Este valor se tiene en cuenta durante el combate para decidir si puede elejir o no que hacer
        personaje[4] = 0;
        return personaje;
    }
    public static void numeroEnPalos(double numeoDePalos){
        for (int i = 0; i < numeoDePalos/10; i++) {
            System.out.print("|");

        }
        System.out.println();
    }
}



