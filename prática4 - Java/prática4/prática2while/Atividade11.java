package prática2while;

import java.util.Scanner;

public class Atividade11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o número de diárias: ");
            int numDiarias = input.nextInt();

            double valorDiaria = 500.0;
            double taxaServicos;

            if (numDiarias < 15) {
                taxaServicos = 15.0 * numDiarias;
            } else if (numDiarias == 15) {
                taxaServicos = 10.0 * numDiarias;
            } else {
                taxaServicos = 5.0 * numDiarias;
            }

            double totalPagar = (valorDiaria * numDiarias) + taxaServicos;

            System.out.println("Total a ser pago: R$" + totalPagar);

            System.out.print("Deseja calcular para mais diárias? (S para sim, N para não): ");
            String continuar = input.next();

            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        input.close();
    }
}
