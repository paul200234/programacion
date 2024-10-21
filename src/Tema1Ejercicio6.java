import java.util.Scanner;

public class Tema1Ejercicio6
{
    public static void main(String[] args)
    {
        System.out.println("Introduce el valor del radio");
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        float a = 3.14F * r * r;
        System.out.println("El area del círculo es: " + a);
    }
}
