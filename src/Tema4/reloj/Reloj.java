package Tema4.reloj;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundos;
    private boolean postMeridian;

    @Override
    public String toString() {
        if (isPostMeridian()) {
            int horaFormato12 = hora % 12;
            if (horaFormato12 == 0) {
                horaFormato12 = 12;
            }
            String periodo = (hora < 12) ? "AM" : "PM";
            return String.format("%02d:%02d:%02d %s", horaFormato12, minuto, segundos, periodo);
        } else {

            return String.format("%02d:%02d:%02d", hora, minuto, segundos);
        }
    }

    public Reloj() {
        hora=0;
        minuto=0;
        segundos=0;
        postMeridian=false;
    }

    public Reloj(int hora, int minuto, int segundos) {
        setHora(hora);
        setMinuto(minuto);
        setSegundos(segundos);
        this.postMeridian = false;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora <0 || hora >24){
            this.hora=0;
            System.out.println("Error Hora invalida; Horas = 0");
        }else if (hora ==24){
            this.hora=0;
        }else {
            this.hora = hora;
        }

    }

    public int getMinuto() {

        return minuto;

    }

    public void setMinuto(int minuto) {
        if(minuto<0||minuto>60){
            System.out.println("Error Minuto inválido; minutos = 0");
            this.minuto=0;
        } else if (minuto==60) {
            setHora(hora++);
            this.minuto=0;
        }else {
            this.minuto = minuto;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(segundos<0||segundos>60){
            System.out.println("Error Segundo inválido; Segundos = 0");
            this.segundos=0;
        } else if (segundos==60) {
            setMinuto(minuto++);
            this.segundos=0;
        }else {
            this.segundos = segundos;
        }
    }

    public boolean isPostMeridian() {
        return postMeridian;
    }

    public void setPostMeridian(boolean postMeridian) {
        this.postMeridian = postMeridian;
    }

}
