package prática7;

import java.util.Scanner;

public class Atividade2 {

	public static void SomaDasMatrizes(int[][] matriz1, int[][] matriz2, int[][] soma_matrizes) {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				soma_matrizes[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int matriz1[][] = new int[2][2];
		int matriz2[][] = new int[2][2];
		int soma_matrizes[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.print("Elementos da primeira matriz: [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz1[i][j] = input.nextInt();

			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Elementos da segunda matriz: [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz2[i][j] = input.nextInt();
			}
		}
		SomaDasMatrizes(matriz1, matriz2, soma_matrizes);

		System.out.print("Soma das matrizes");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(soma_matrizes[i][j] + "\t");

			}
		System.out.println();
		input.close();
		}
	}
}
