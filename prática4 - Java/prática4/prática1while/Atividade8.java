package prática1while;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o peso da pessoa: ");
            double peso = scanner.nextDouble();

            // Engordar 15%
            double novoPesoEngordar = peso * 1.15;
            System.out.println("Se a pessoa engordar 15%, o novo peso será: " + novoPesoEngordar);

            // Emagrecer 20%
            double novoPesoEmagrecer = peso * 0.8;
            System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + novoPesoEmagrecer);

            System.out.print("Deseja calcular para outro peso? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}
