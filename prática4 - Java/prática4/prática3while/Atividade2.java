package prática3while;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe a matrícula do aluno (ou negativo para encerrar): ");
            int matricula = scanner.nextInt();

            if (matricula < 0) {
                break;
            }

            System.out.print("Informe as três notas do aluno: ");
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            if (media >= 70) {
                System.out.println("Aluno aprovado. Média: " + media);
            } else if (media >= 60) {
                System.out.println("Aluno em recuperação. Média: " + media);
            } else {
                System.out.println("Aluno reprovado. Média: " + media);
            }
        }

        scanner.close();
    }
}

