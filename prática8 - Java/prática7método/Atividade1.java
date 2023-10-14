package pratica7método;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] matriz = new int[5][5];

		System.out.println("Digite os elementos da matriz 5x5:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz[i][j] = input.nextInt();
			}
		}

		System.out.println("Matriz informada: ");
		imprimirMatriz(matriz);

		System.out.println("Elementos onde a linha é par e a coluna é ímpar: ");
		imprimirLinhasParesColunasImpares(matriz);

		System.out.println("Matriz transposta: ");
		imprimirMatriz(transporMatriz(matriz));

		trocarDiagonais(matriz);
		System.out.println("Matriz com diagonais trocadas: ");
		imprimirMatriz(matriz);
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void imprimirLinhasParesColunasImpares(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (j % 2 != 0) {
						System.out.print(matriz[i][j] + "\t");
					}
				}
				System.out.println();
			}
		}

	}

	public static int[][] transporMatriz(int[][] matriz) {
		int[][] transposta = new int[matriz[0].length][matriz.length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				transposta[j][i] = matriz[i][j];
			}
		}
		return transposta;
	}

	public static void trocarDiagonais(int[][] matriz) {
		int n = matriz.length;
		for (int i = 0; i < n; i++) {
			int temp = matriz[i][i];
			matriz[i][i] = matriz[i][n - i - 1];
			matriz[i][n - i - 1] = temp;

		}

	}

}
