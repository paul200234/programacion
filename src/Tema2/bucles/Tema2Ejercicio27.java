package Tema2.bucles;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {
        int c = 2;
        int a=3;
        int i;
        boolean primo=false;
        System.out.println(1+"->"+2);
        while (c<=20){
            primo=true;
            for (i=a-1;i>1;i--){
                if (a%i==0){
                    primo=false;
                }
            }
            if (primo){
                System.out.println(c+"->"+a);
                c++;
            }
            a++;

        }
    }
}
