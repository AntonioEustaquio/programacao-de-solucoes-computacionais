package prática3while;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunos90 = 0;
        int alunosReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double totalNotas = 0;
        int totalAlunos = 0;

        while (true) {
            System.out.print("Informe a nota do aluno (ou negativo para encerrar): ");
            double nota = scanner.nextDouble();

            if (nota < 0) {
                break;
            }

            System.out.print("Informe o total de faltas do aluno: ");
            int faltas = scanner.nextInt();

            totalAlunos++;
            totalNotas += nota;

            if (nota >= 90) {
                alunos90++;
            }

            if (nota < 70 || faltas >= 20) {
                alunosReprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        double mediaNotas = totalNotas / totalAlunos;

        System.out.println("a. Alunos com nota maior ou igual a 90: " + alunos90);
        System.out.println("b. Alunos reprovados por nota ou falta: " + alunosReprovados);
        System.out.println("c. Maior nota: " + maiorNota);
        System.out.println("   Menor nota: " + menorNota);
        System.out.println("d. Média de notas da turma: " + mediaNotas);

        scanner.close();
    }
}

