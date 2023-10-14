package prática1while;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 1.8) + 32;

            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

            System.out.print("Deseja converter outra temperatura? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}
