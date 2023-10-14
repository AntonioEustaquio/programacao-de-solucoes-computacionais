package prática1while;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double somaNotas = 0;

		int contadorNotas = 0;

		int totalNotas = 3;

		while (contadorNotas < totalNotas) {
			System.out.print("Informe a nota " + (contadorNotas + 1) + ": ");
			double nota = scanner.nextDouble();

			if (nota >= 0 && nota <= 10) {

				somaNotas += nota;
				contadorNotas++;
			} else {
				System.out.println("A nota deve estar entre 0 e 10. Tente novamente.");
			}
		}

		double media = somaNotas / totalNotas;

		System.out.println("A média das " + totalNotas + " notas é: " + media);

		scanner.close();

	}

}
