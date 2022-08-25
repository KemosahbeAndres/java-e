import java.util.Random;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public Reloj(){
        Random r = new Random();
        this.horas = r.nextInt(24);
        this.minutos = r.nextInt(60);
        this.segundos = r.nextInt(60);
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public String toTime() {
        /**String hora = String.format("%02d", this.horas);
        String minuto = String.format("%02d", this.minutos);
        String segundo = String.format("%02d", this.segundos);
        return hora + ":" + minuto + ":" + segundo;**/
        return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
    }

    public void aumentarMinuto(){
        if(this.minutos == 59) {
            this.minutos = 0;
            if(this.horas == 59){
                this.horas = 0;
            }else{
                this.horas++;
            }
        }else{
            this.minutos++;
        }
    }

    public String toShortTime(){
        /**
        if(this.horas >= 12){
            return String.valueOf(this.horas-12) + ":" + String.valueOf(this.minutos) + "pm";
        }else{
            return String.valueOf(this.horas) + ":" + String.valueOf(this.minutos) + "am";
        }**/
        if(this.horas >= 12){
            return String.format("%02d:%02dpm", (this.horas-12), this.minutos);
        }else{
            return String.format("%02d:%02dam", this.horas, this.minutos);
        }
    }
}
