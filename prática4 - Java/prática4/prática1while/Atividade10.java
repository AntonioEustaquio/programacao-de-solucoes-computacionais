package prática1while;

import java.util.Scanner;

public class Atividade10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o raio da esfera: ");
            double raio = scanner.nextDouble();

            // Cálculo do comprimento da esfera: C = 2 * π * R
            double comprimento = 2 * Math.PI * raio;

            // Cálculo da área da esfera: A = π * R^2
            double area = Math.PI * Math.pow(raio, 2);

            // Cálculo do volume da esfera: V = (3/4) * π * R^3
            double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

            System.out.println("Comprimento da esfera: " + comprimento);
            System.out.println("Área da esfera: " + area);
            System.out.println("Volume da esfera: " + volume);

            System.out.print("Deseja calcular para outro raio? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}

