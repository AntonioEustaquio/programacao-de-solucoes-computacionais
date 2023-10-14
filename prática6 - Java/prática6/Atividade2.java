package prática6;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] numeros = new double[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + "º número real: ");
			numeros[i] = scanner.nextDouble();
		}

		System.out.println("Vetor informado:");
		for (int i = 0; i < 10; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

		System.out.print("Posições com números negativos: ");
		for (int i = 0; i < 10; i++) {
			if (numeros[i] < 0) {
				System.out.print(i + " ");
				scanner.close();
			}
		}
	}
}
