package atividade3;
public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo(int hora) {
        this.hora = validaHora(hora);
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo(int hora, int minuto) {
        this.hora = validaHora(hora);
        this.minuto = validaMinuto(minuto);
        this.segundo = 0;
    }

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = validaHora(hora);
        this.minuto = validaMinuto(minuto);
        this.segundo = validaSegundo(segundo);
    }

    public void setTime(int hora, int minuto, int segundo) {
        this.hora = validaHora(hora);
        this.minuto = validaMinuto(minuto);
        this.segundo = validaSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = validaHora(hora);
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = validaMinuto(minuto);
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = validaSegundo(segundo);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    private int validaHora(int hora) {
        return Math.max(0, Math.min(23, hora));
    }

    private int validaMinuto(int minuto) {
        return Math.max(0, Math.min(59, minuto));
    }

    private int validaSegundo(int segundo) {
        return Math.max(0, Math.min(59, segundo));
    }
}
