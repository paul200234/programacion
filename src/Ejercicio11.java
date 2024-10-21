import java.util.Scanner;

public class Ejercicio11 {
    public static void main(){

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu año:");
        int fentanilo = in.nextInt();
        if(fentanilo%4==0){
            System.out.println("Tu año es bisiesto");
        }
        else {
            System.out.println("Tu año no es bisiesto");
        }

    }
}
