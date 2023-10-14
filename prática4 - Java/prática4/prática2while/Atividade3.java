package prática2while;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a nota 2: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;
            String situacao;

            if (media >= 7) {
                situacao = "Aprovado";
            } else if (media >= 3) {
                situacao = "Exame";
            } else {
                situacao = "Reprovado";
            }

            System.out.println("Situação do aluno: " + situacao);

            // Pergunta se deseja avaliar a situação de outro aluno
            System.out.print("Deseja avaliar a situação de outro aluno? (S para Sim, N para Não): ");
            char opcao = scanner.next().charAt(0);
            if (opcao != 'S' && opcao != 's') {
                break; // Encerra o loop se a opção for diferente de 'S' ou 's'
            }
        }

        scanner.close();
    }
}

