package prática1while;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o valor do primeiro cateto: ");
            double cateto1 = scanner.nextDouble();

            System.out.print("Informe o valor do segundo cateto: ");
            double cateto2 = scanner.nextDouble();

            // Teorema de Pitágoras: a^2 = b^2 + c^2
            double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

            System.out.println("A hipotenusa do triângulo é: " + hipotenusa);

            System.out.print("Deseja calcular para outros catetos? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}


