package prática1while;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação para " + numero + ":");

        int i = 0;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }

        scanner.close();
    }
}

