package Tema4.reloj;

public class MainReloj {
    public static void main(String[] args) {

            // Crear un reloj con el constructor por defecto (00:00:00)
            Reloj reloj1 = new Reloj();
            System.out.println("Reloj 1 (constructor por defecto): " + reloj1);

            // Crear un reloj con valores específicos (14:30:45)
            Reloj reloj2 = new Reloj(14, 30, 45);
            System.out.println("Reloj 2 (14:30:45): " + reloj2);

            // Cambiar el formato de salida a 12 horas (AM/PM)
            reloj2.setPostMeridian(true);
            System.out.println("Reloj 2 (formato 12h): " + reloj2);

            // Crear un reloj con valores inválidos para probar validaciones
            Reloj reloj3 = new Reloj(25, 70, 80); // Hora, minuto y segundos inválidos
            System.out.println("Reloj 3 (valores inválidos): " + reloj3);

            // Establecer valores válidos manualmente
            reloj3.setHora(23);
            reloj3.setMinuto(59);
            reloj3.setSegundos(59);
            System.out.println("Reloj 3 (valores válidos): " + reloj3);

            // Probar el incremento de minutos y segundos
            reloj3.setSegundos(60); // Debería incrementar el minuto y reiniciar segundos
            System.out.println("Reloj 3 (incremento de segundos): " + reloj3);

            reloj3.setMinuto(60); // Debería incrementar la hora y reiniciar minutos
            System.out.println("Reloj 3 (incremento de minutos): " + reloj3);

            Reloj reloj4 = new Reloj(0, 0, 0); // Medianoche
            reloj4.setPostMeridian(true);
            System.out.println("Reloj 4 (medianoche, formato 12h): " + reloj4);

            Reloj reloj5 = new Reloj(12, 0, 0); // Mediodía
            reloj5.setPostMeridian(true);
            System.out.println("Reloj 5 (mediodía, formato 12h): " + reloj5);

        }
    }

