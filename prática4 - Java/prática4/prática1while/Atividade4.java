package prática1while;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o salário atual: ");
            double salarioAtual = scanner.nextDouble();

            double aumento = salarioAtual * 0.25; // Aumento de 25%
            double novoSalario = salarioAtual + aumento;

            System.out.println("O novo salário após o aumento é: R$ " + novoSalario);

            System.out.print("Deseja calcular para outro salário? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}

