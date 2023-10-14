package prática2while;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2;
        double media;

        while (true) {
            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();

            // Calcula a média das notas
            media = (nota1 + nota2) / 2;

            System.out.println("Média: " + media);

            // Verifica a situação do aluno
            if (media >= 7.0) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }

            // Pergunta se deseja calcular para outro aluno
            System.out.print("Deseja calcular para outro aluno? (S para Sim, N para Não): ");
            char opcao = scanner.next().charAt(0);
            if (opcao != 'S' && opcao != 's') {
                break; // Encerra o loop se a opção for diferente de 'S' ou 's'
            }
        }

        scanner.close();
    }
}
