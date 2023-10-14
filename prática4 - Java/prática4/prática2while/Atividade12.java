package prática2while;

import java.util.Scanner;

public class Atividade12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a idade do cliente: ");
            int idade = input.nextInt();

            System.out.print("Digite o sexo do cliente (M para masculino, F para feminino): ");
            char sexo = input.next().charAt(0);

            double mensalidade;

            if (sexo == 'M' || sexo == 'm') {
                if (idade <= 15) {
                    mensalidade = 60.00;
                } else if (idade <= 18) {
                    mensalidade = 75.00;
                } else if (idade <= 30) {
                    mensalidade = 90.00;
                } else if (idade <= 40) {
                    mensalidade = 85.00;
                } else {
                    mensalidade = 80.00;
                }
            } else if (sexo == 'F' || sexo == 'f') {
                if (idade <= 18) {
                    mensalidade = 60.00;
                } else if (idade <= 25) {
                    mensalidade = 90.00;
                } else if (idade <= 40) {
                    mensalidade = 85.00;
                } else {
                    mensalidade = 80.00;
                }
            } else {
                System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
                continue;
            }

            System.out.println("Mensalidade a ser paga: R$" + mensalidade);

            System.out.print("Deseja calcular para outro cliente? (S para sim, N para não): ");
            String continuar = input.next();

            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        input.close();
    }
}
