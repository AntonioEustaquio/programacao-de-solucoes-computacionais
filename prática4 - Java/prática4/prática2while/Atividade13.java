package prática2while;

import java.util.Scanner;

public class Atividade13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o tipo de apartamento (S para simples, D para duplo): ");
            char tipoApartamento = input.next().charAt(0);

            System.out.print("Digite o número de diárias: ");
            int numDiarias = input.nextInt();

            double precoDiaria;

            if (tipoApartamento == 'S' || tipoApartamento == 's') {
                if (numDiarias < 10) {
                    precoDiaria = 100.00;
                } else if (numDiarias <= 15) {
                    precoDiaria = 90.00;
                } else {
                    precoDiaria = 80.00;
                }
            } else if (tipoApartamento == 'D' || tipoApartamento == 'd') {
                if (numDiarias < 10) {
                    precoDiaria = 140.00;
                } else if (numDiarias <= 15) {
                    precoDiaria = 120.00;
                } else {
                    precoDiaria = 100.00;
                }
            } else {
                System.out.println("Tipo de apartamento inválido. Digite S para simples ou D para duplo.");
                continue;
            }

            double totalPagar = precoDiaria * numDiarias;
            System.out.println("Total a ser pago: R$" + totalPagar);

            System.out.print("Deseja calcular para outro hóspede? (S para sim, N para não): ");
            String continuar = input.next();

            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        input.close();
    }
}

