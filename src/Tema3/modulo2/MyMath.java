package Tema3.modulo2;

public class MyMath {
    public static boolean esPar(int num){
        return (num % 2 == 0);
    }
    public  static double squarePerimeter(double lado){
        return 4*lado;
    }
    public static double squareArea(double lado){
        return lado*lado;
    }
    public static double rectanglePerimeter(double ladoA, double ladoB){
        return (ladoB*2)+(ladoA*2);
    }
    public  static double rectangleArea(double ladoA, double ladoB){
        return ladoB*ladoA;
    }
    public static double circlePerimeter(double radio){
        return 2*Math.PI*radio;
    }
    public static double circleArea(double radio){
        return Math.PI*radio*radio;
    }
    public static boolean esPrimo(int num){

        for (int i = num -1; i>1; i--){
            if (num %i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean noEsPrimo(int num){
        return !esPrimo(num);
    }
    public static int digitosDe(int num){
        int cont=0;
        while (num > 0 ){
            num=num/10;
            cont++;
        }
        return cont;
    }
    public static int numDePares(int num){
        int cont=0;
        while (num > 0 ){
            num=num/10;
            if (esPar(num)){
                cont++;
            }
        }
        return cont;
    }
    public static int numDeImpares(int num){
        int cont=0;
        while (num > 0 ){
            num=num/10;
            if (!esPar(num)){
                cont++;
            }
        }
        return cont;
    }
    public static int factorial(int num){
        for(int i=num-1;i>1;i--){
            num=num*i;
        }
        return num;
    }
    public static int facKtorial(int num){
        if (num == 0) return 1;
        else {
            return num * facKtorial(num - 1);
        }
    }
    public  static int disciminante(double a, double b, double c){
        double D = (b*b)-4*a*c;
        if (D>0){
            return 2;
        }else if(D == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int sumaDigito(int num){
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumaDigito(num / 10);
    }

}
