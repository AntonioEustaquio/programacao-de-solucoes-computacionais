package pratica7método;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matriz1[][] = new int[2][2];
		int matriz2[][] = new int[2][2];

		lerMatriz(input, matriz1, "Matriz1");
		lerMatriz(input, matriz2, "Matriz1");

		int multMatrizes[][] = multMatrizes(matriz1, matriz2);
		System.out.print("Multiplicação das matrizes: ");
		imprimirMatriz(multMatrizes);
		input.close();
	}

	public static void lerMatriz(Scanner input, int[][] matriz, String nomeMatriz) {
		System.out.print("Digite os elementos de " + nomeMatriz + ":");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz[i][j] = input.nextInt();
			}
		}
	}

	public static int[][] multMatrizes(int[][] matriz1, int[][] matriz2) {
		int[][] multMatrizes = new int[matriz1.length][matriz1[0].length];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				multMatrizes[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];
			}
		}
		return multMatrizes;
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		System.out.println();
		}
	}
}
