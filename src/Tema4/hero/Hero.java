package Tema4.hero;

import java.util.Random;

public class Hero {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    Random random = new Random();
    public Hero() {
        defense=0;
        attack=0;
        maxHealth=0;
        health=0;
        level=0;
        experience=0;
        name = "Heroe sin nombre";
    }

    public Hero(String name, int attack, int defense, int maxHealth, int level ) {
        this.defense = defense;
        this.attack = attack;
        this.maxHealth = maxHealth+(5*level);
        this.health = maxHealth;
        this.level = level;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level>0){
        this.level = level;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health>maxHealth){
            this.health=maxHealth;
        } else if (health<=0) {
            this.health=0;
        }else {
            this.health = health;
        }
    }
    public void huir(){
        health = 0;
        System.out.println(name+ " ha huido!");
    }
    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        if (maxHealth>0){
        this.maxHealth = maxHealth;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience>0&&experience<50) {
            this.experience = experience;
        }else if (experience>50){
            for (int i = 0; i < experience/50; i++) {
                level++;
                levelUp();
            }
        }

    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack>0){
        this.attack = attack;
        }
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if (defense>0){
        this.defense = defense;
        }

    }

    public void drinkPotion(){
        health +=10;
        if (health>maxHealth){
            health = maxHealth;
        }
        System.out.println(name +" ha encontrado una pocion  y recupera 10 pt de vida \n" +
                "vida actual: "+health);
    }
    public void rest(){
        health +=50;
        if (health>maxHealth){
            health = maxHealth;
        }
        System.out.println(name +" ha descansado tras un duro combate y recupera 50 pt de vida \n" +
                "vida actual: "+health);
    }
    @Override
    public String toString() {
        return  "╔════════════════════════════════════════╗\n" +
                "║          Información del Héroe         ║\n" +
                "╠════════════════════════════════════════╣\n" +
                "║ Nombre: " + String.format("%-31s", name) + "║\n" +
                "║ Nivel: " + String.format("%-32d", level) + "║\n" +
                "║ Salud: " + String.format("%-32d", health) + "║\n" +
                "║ Salud Máxima: " + String.format("%-25d", maxHealth) + "║\n" +
                "║ Ataque: " + String.format("%-31d", attack) + "║\n" +
                "║ Defensa: " + String.format("%-30d", defense) + "║\n" +
                "║ Experiencia: " + String.format("%-26d", experience) + "║\n" +
                "╚════════════════════════════════════════╝";
    }
    public void attack(Hero atacado){
        int danio = random.nextInt(1,Math.max(this.attack-atacado.getDefense(),10));
        atacado.setHealth(atacado.getHealth()-danio);
        setExperience(getExperience()+10);
    }
    public boolean isAlive(){
        return health>0;
    }
    public void levelUp(){
        maxHealth+=5;
        health+=5;
        attack++;
        defense++;
    }
}
