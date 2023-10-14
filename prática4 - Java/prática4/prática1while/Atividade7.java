package prática1while;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o valor do salário mínimo: ");
            double salarioMinimo = scanner.nextDouble();

            System.out.print("Informe o salário do funcionário: ");
            double salarioFuncionario = scanner.nextDouble();

            double qtdSalariosMinimos = salarioFuncionario / salarioMinimo;

            System.out.println("A quantidade de salários mínimos que o funcionário recebe é: " + qtdSalariosMinimos);

            System.out.print("Deseja calcular para outro funcionário? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}
