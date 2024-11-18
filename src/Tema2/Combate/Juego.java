package Tema2.Combate;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random random = new Random(System.nanoTime());
        int limpiador;
        // declaración de stats
        int ndTurno=0;
        String palo ="|";
        double vel1 =1;
        double vel2 =1;
        double atq1 =1;
        double atq2 =1;
        double def1 =1;
        double def2 =1;
        double total=1;
        //puntos de vida
        double pv1 = 0;
        double pv2 = 0;
        int seleccion=3;
        while (seleccion!=1&&seleccion!=2){
            System.out.println("Seleccione crear personaje(1) o usar personaje predefinido(2)");
            seleccion = in.nextInt();
        }
        switch (seleccion){ //selección del primer personaje
            case 1:{
                /*                      ############################
############################################creación de personaje################################################
                                         ############################
                */
                do{
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

                break;
            }//creación de personaje
            case 2:{
                /*                       ############################
############################################selección de personaje################################################
                                         ############################
                */
                // Mostrar lista de personajes predefinidos
                System.out.println("Personajes predefinidos:");
                System.out.println("1. Guerrero (Vida: 150, Ataque: 120, Velocidad: 100, Defensa: 100)");
                System.out.println("2. Mago (Vida: 100, Ataque: 150, Velocidad: 90, Defensa: 80)");
                System.out.println("3. Arquero (Vida: 120, Ataque: 110, Velocidad: 150, Defensa: 80)");
                System.out.println("4. Tanque (Vida: 200, Ataque: 80, Velocidad: 50, Defensa: 170)");
                System.out.println("5. Asesino (Vida: 90, Ataque: 160, Velocidad: 180, Defensa: 70)");
                System.out.println("6. Cañón de Cristal (Vida: 60, Ataque: 190, Velocidad: 120, Defensa: 50)");
                System.out.println("Selecciona el personaje (1-6):");
                int personaje = in.nextInt();

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
                    case 999: //god
                        pv2 = 9999;
                        atq2 = 9999;
                        vel2 = 9999;
                        def2 = 9999;
                        break;
                    default:
                        pv1 = 2;
                        atq1 = 2;
                        vel1 = 2;
                        def1 = 2;
                        break;
                }
                in.nextLine();//leer la basura
            }//personaje por defecto
        }
        System.out.println("Tus estadisticas són:");
        System.out.println("Ataque: "+atq1);
        System.out.println("Vida: "+pv1);
        System.out.println("velocidad: "+vel1);
        System.out.println("Ddefensa: "+def1);
        System.out.println("Pulsa cualquier tecla para continuar");
        in.nextLine();
        System.out.println("############################################################################################");
        System.out.println("Quieres jugar contra un amigo(1) o tu solo(2)?");
        int modo = 0;
        modo = in.nextInt();
        switch (modo){
            case 1:{
                seleccion=3;
                while (seleccion!=1&&seleccion!=2){
                    System.out.println("Seleccione crear personaje(1) o usar personaje predefinido(2)");
                    seleccion = in.nextInt();
                }
                switch (seleccion){
                    case 1:{
                /*                      ############################
############################################creación de personaje################################################
                                         ############################
                */
                        do{
                            System.out.println("Introduce las estadisticas de tu personaje");
                            System.out.println("ten en cuenta que la suma no puede superar 500");
                            System.out.println("Cuanta vida tiene tu personaje?(1-200)");
                            pv2= in.nextInt();
                            if (pv2<1||pv2>200){
                                do{
                                    System.out.println("Valor ilegal, introduce un valor entre 1-200");
                                    pv2= in.nextInt();
                                }while (pv2<1||pv2>200);

                            }
                            total = 0;
                            total = total+ pv2;
                            System.out.println("Cuanto ataque tiene tu personaje?(1-200)");
                            atq2= in.nextInt();
                            if (atq2<1||atq2>200){
                                do{
                                    System.out.println("Valor ilegal, introduce un valor entre 1-200");
                                    atq2= in.nextInt();
                                }while (atq2<1||atq2>200);
                            }
                            total = total+ atq2;

                            System.out.println("Cuanta velocidad tiene tu personaje?(1-200)");
                            vel2= in.nextInt();
                            if (vel2<1||vel2>200){
                                do{
                                    System.out.println("Valor ilegal, introduce un valor entre 1-200");
                                    vel2= in.nextInt();
                                }while (vel2<1||vel2>200);
                            }
                            total = total+ vel2;
                            if (total >500){
                                System.out.println("El total ha superado el limite de 500");
                                continue;
                            }

                            System.out.println("Cuanta defensa tiene tu personaje?(1-200)");
                            def2= in.nextInt();
                            if (def2<1||def2>200){
                                do{
                                    System.out.println("Valor ilegal, introduce un valor entre 1-200");
                                    def2= in.nextInt();
                                }
                                while (def2<1||def2>200);
                            }
                            total = total+ def2;
                            if (total >500){
                                System.out.println("El total ha superado el limite de 500");
                            }
                            in.nextLine();
                        } while(total>500);
                        break;
                    }//crear personaje
                    case 2:{
                /*                       ############################
############################################selección de personaje################################################
                                         ############################
                */
                        // Mostrar lista de personajes predefinidos
                        System.out.println("Personajes predefinidos:");
                        System.out.println("1. Guerrero (Vida: 150, Ataque: 120, Velocidad: 100, Defensa: 100)");
                        System.out.println("2. Mago (Vida: 100, Ataque: 150, Velocidad: 90, Defensa: 80)");
                        System.out.println("3. Arquero (Vida: 120, Ataque: 110, Velocidad: 150, Defensa: 80)");
                        System.out.println("4. Tanque (Vida: 200, Ataque: 80, Velocidad: 50, Defensa: 170)");
                        System.out.println("5. Asesino (Vida: 90, Ataque: 160, Velocidad: 180, Defensa: 70)");
                        System.out.println("6. Cañón de Cristal (Vida: 60, Ataque: 190, Velocidad: 120, Defensa: 50)");
                        System.out.println("Selecciona el personaje (1-6):");
                        in.nextLine();
                        int personaje2 = in.nextInt();

                        // Asignación de estadísticas del personaje predefinido
                        switch (personaje2) {
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
                            case 999: //god
                                pv2 = 9999;
                                atq2 = 9999;
                                vel2 = 9999;
                                def2 = 9999;
                                break;
                            default:
                                pv2 = 2;
                                atq2 = 2;
                                vel2 = 2;
                                def2 = 2;
                                break;
                        }

                    }//selección de personaje
                }
                break;

            }//modo manual
            case 2: {
                int ia = random.nextInt(6)+1;
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

                }
            }//selección automatica
        }//selección de el otro personaje
        System.out.println("Las estadisticas del segundo personeje son:");
        System.out.println("Ataque: "+atq2);
        System.out.println("Vida: "+pv2);
        System.out.println("velocidad: "+vel2);
        System.out.println("Ddefensa: "+def2);
        System.out.println("Pulsa cualquier tecla para continuar");
        in.nextLine();
        System.out.println("############################################################################################");

    /*                                      #######################
    ################################################COMBATES############################################################
                                           #######################
    */
        boolean ganador = false;
        double velocidadVerdadera1 = vel1/10;//para simplificar el calculo
        double velocidadVerdadera2 = vel2/10;
        double meta = velocidadVerdadera1 * velocidadVerdadera2;
        double cont1=0;
        double cont2=0;
        double danyo_realizado=0;
        do{

            /*La velocidad es un stat importante, para evitar que la gente se ponga 1 de velocidad, vamos a hacer que
             sea relacional, por ejemplo si tienes el doble de velocidad atacas 2 veces, para ello hacemos que las 2
             velocidades vayan aumentandohasta llegar a un numero y se reseteen a su numero original, y ademas te añade
             hasta 25% de probabilidades de esquivar*/

            /*La defensa podria dar errores en caso de restar o dividir por eso dentro de la fórmula asi que la defensa
            es un multiplicador, en el caso de no tener defensa recibes el 100% del daño, y con 200 de defensa el daño
             que percibe es un 25% del original y a parte añade una probabilidad de bloqueo de un 25% a 200 de defensa*/

            cont1 += velocidadVerdadera1;
            cont2 += velocidadVerdadera2;

            if (cont1>=meta && !ganador){
                System.out.println("_____________________________________________________________");
                ndTurno++;
                System.out.println("Turno: "+ndTurno);
                danyo_realizado=0;
                System.out.println("Turno del jugador 1");
                if (random.nextInt(100)<vel2/8){
                    System.out.println("Ataque esquivado");
                } else if (random.nextInt(100)<def2/5) {
                    System.out.println("Ataque bloqueado");
                }else {
                    if (random.nextInt(100)<atq1/8){
                        System.out.println("¡ATAQUE CRÍTICO!");
                        danyo_realizado = random.nextInt(2)+2*(0.1*atq1*(1-(def2*0.00375)));
                        pv2 = pv2 - danyo_realizado;

                    }else {
                        danyo_realizado = random.nextInt(2)+0.1*atq1*(1-(def2*0.00375));
                        pv2 = pv2 - danyo_realizado;
                    }

                }
                if(pv2>=0) {
                    System.out.println("Daño realizado: " + danyo_realizado);
                    System.out.println("Vida restante del Jugador2: " + pv2);
                    System.out.println("Vida restante del Jugador1: "+palo.repeat((int)pv1/2));
                    System.out.println("Vida restante del Jugador2: "+palo.repeat((int)pv2/2));
                }else {
                    ganador=true;
                    System.out.println("Daño realizado: " + danyo_realizado);
                    System.out.println("HA GANADO EL JUGADOR1");
                }
                cont1=0;
                System.out.println("_____________________________________________________________");
                in.nextLine();//espera teclado
            }
            if (cont2>=meta && !ganador){
                System.out.println("_____________________________________________________________");
                ndTurno++;
                System.out.println("Turno: "+ndTurno);
                danyo_realizado=0;
                System.out.println("Turno del jugador 2");
                if (random.nextInt(100)<vel1/8){
                    System.out.println("Ataque esquivado");
                } else if (random.nextInt(100)<def1/5) {
                    System.out.println("Ataque bloqueado");
                }else {
                    if (random.nextInt(100)<atq2/8){
                        System.out.println("¡ATAQUE CRÍTICO!");
                        danyo_realizado = (random.nextInt(2)+(2*0.1*atq2*(1-(def1*0.00375))));
                        pv1 = pv1 - danyo_realizado;

                    }else {
                        danyo_realizado = (random.nextInt(2)+(0.1*atq2*(1-(def1*0.00375))));
                        pv1 = pv1 - danyo_realizado;

                    }

                }
                if(pv1>=0) {
                    System.out.println("Daño realizado: " + danyo_realizado);
                    System.out.println("Vida restante del Jugador1: " + pv1);
                    System.out.println("Vida restante del Jugador1: "+palo.repeat((int)pv1/2));
                    System.out.println("Vida restante del Jugador2: "+palo.repeat((int)pv2/2));
                }else {
                    ganador=true;
                    System.out.println("Daño realizado: " + danyo_realizado);
                    System.out.println("HA GANADO EL JUGADOR2");
                }
                cont2=0;
                System.out.println("_____________________________________________________________");
                in.nextLine();//espera teclado
            }


        }while (!ganador);








    in.close();
    }
}
