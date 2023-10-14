package pratica7método;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];

		lerMatriz(input, matriz1, "Matriz 1");
		lerMatriz(input, matriz2, "Matriz 2");

		int[][] somaMatrizes = somaMatrizes(matriz1, matriz2);

		System.out.println("Soma das matrizes:");
		imprimirMatriz(somaMatrizes);

		input.close();
	}

	public static void lerMatriz(Scanner input, int[][] matriz, String nomeMatriz) {
		System.out.println("Digite os elementos para a " + nomeMatriz + ":");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz[i][j] = input.nextInt();
			}
		}
	}

	public static int[][] somaMatrizes(int[][] matriz1, int[][] matriz2) {
		int[][] somaMatrizes = new int[matriz1.length][matriz1[0].length];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		return somaMatrizes;
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
