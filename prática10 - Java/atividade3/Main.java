package atividade3;

public class Main {
    public static void main(String[] args) {
        Tempo tempo1 = new Tempo();
        System.out.println("Tempo1: " + tempo1.toString());

        Tempo tempo2 = new Tempo(12);
        System.out.println("Tempo2: " + tempo2.toString());

        Tempo tempo3 = new Tempo(15, 30);
        System.out.println("Tempo3: " + tempo3.toString());

        Tempo tempo4 = new Tempo(9, 45, 15);
        System.out.println("Tempo4: " + tempo4.toString());

        tempo4.setTime(8, 30, 45);
        System.out.println("Tempo4 after setTime: " + tempo4.toString());
    }
}
