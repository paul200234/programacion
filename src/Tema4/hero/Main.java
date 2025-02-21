package Tema4.hero;

public class Main {
    public static void main(String[] args) {
        // Crear dos héroes
        Hero hero1 = new Hero("Aragorn", 20, 10, 100, 1);
        Hero hero2 = new Hero("Legolas", 15, 8, 80, 1);

        // Mostrar información inicial de los héroes
        System.out.println("=== Información inicial de los héroes ===");
        System.out.println(hero1.toString());
        System.out.println(hero2.toString());

        // Hero1 ataca a Hero2
        System.out.println("\n=== Hero1 ataca a Hero2 ===");
        hero1.attack(hero2);
        System.out.println("Vida de " + hero2.getName() + " después del ataque: " + hero2.getHealth());
        System.out.println("Experiencia de " + hero1.getName() + ": " + hero1.getExperience());

        // Hero2 bebe una poción
        System.out.println("\n=== Hero2 bebe una poción ===");
        hero2.drinkPotion();

        // Hero1 descansa
        System.out.println("\n=== Hero1 descansa ===");
        hero1.rest();

        // Hero2 ataca a Hero1
        System.out.println("\n=== Hero2 ataca a Hero1 ===");
        hero2.attack(hero1);
        System.out.println("Vida de " + hero1.getName() + " después del ataque: " + hero1.getHealth());
        System.out.println("Experiencia de " + hero2.getName() + ": " + hero2.getExperience());

        // Verificar si los héroes están vivos
        System.out.println("\n=== Verificación de estado ===");
        System.out.println(hero1.getName() + " está vivo: " + hero1.isAlive());
        System.out.println(hero2.getName() + " está vivo: " + hero2.isAlive());

        // Hero1 sube de nivel automáticamente si gana suficiente experiencia
        System.out.println("\n=== Hero1 gana experiencia adicional ===");
        hero1.setExperience(hero1.getExperience() + 45); // Añadir 45 puntos de experiencia
        System.out.println("Experiencia de " + hero1.getName() + ": " + hero1.getExperience());
        System.out.println("Nivel de " + hero1.getName() + ": " + hero1.getLevel());

        // Mostrar información final de los héroes
        System.out.println("\n=== Información final de los héroes ===");
        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }
}
