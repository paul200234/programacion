package Tema4.hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        List<Hero> enemigos = new ArrayList<>();
        Hero heroe = new Hero();
        int nDeHordas = 0;

        crearPersonaje(heroe, in);
        nuevaHorda(enemigos, heroe, random);

        while (heroe.isAlive()) {
            if (random.nextInt(10) == 2) {
                heroe.drinkPotion();
            }
            if (random.nextInt(10) == 2 && !enemigos.isEmpty()) {
                enemigos.get(0).huir();
                enemigos.remove(0);
            }
            if (random.nextInt(1000) == 1) {
                heroe.rest();
            }
            if (enemigos.isEmpty()) {
                nuevaHorda(enemigos, heroe, random);
                nDeHordas++;
            }
            if (!enemigos.isEmpty()) {
                heroe.attack(enemigos.get(0));
                System.out.println("El heroe ha atacado a un enemigo");
                enemigosAtacan(enemigos, heroe);
            }
        }
        System.out.println("El heroe ha caido, numero de hordas: " + nDeHordas);
    }

    public static void nuevaHorda(List<Hero> horda, Hero heroe, Random random) {
        int nDEnemigos = random.nextInt(1, 3);
        for (int i = 0; i < nDEnemigos; i++) {
            horda.add(new Hero("Enemigo", heroe.getAttack() / 3, heroe.getAttack() / 3, heroe.getMaxHealth() / 3, heroe.getLevel() / 3));
        }
    }

    public static void crearPersonaje(Hero personaje, Scanner in) {
        System.out.println("Dime el nombre de tu personaje");
        personaje.setName(in.next());
        System.out.println("Cuanto ataque tiene tu personaje?");
        personaje.setAttack(in.nextInt());
        in.nextLine();
        System.out.println("Cuanta vida tiene tu personaje?");
        personaje.setMaxHealth(in.nextInt());
        personaje.setHealth(personaje.getMaxHealth());
        in.nextLine();
        System.out.println("Cuanta defensa tiene tu personaje?");
        personaje.setDefense(in.nextInt());
        in.nextLine();
    }

    public static void enemigosAtacan(List<Hero> enemigos, Hero heroe) {
        for (Hero enemigo : enemigos) {
            if (enemigo.isAlive()) {
                enemigo.attack(heroe);
                System.out.println("Un enemigo ha atacado al heroe, vida actual del heroe: " + heroe.getHealth());
            }
        }
    }
}