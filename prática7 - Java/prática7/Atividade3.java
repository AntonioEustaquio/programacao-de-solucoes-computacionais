package prática7;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int matriz1[][] = new int[2][2];
		int matriz2[][]= new int[2][2];
		int mult_matrizes[][] = new int[2][2];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j <2; j++) {
				System.out.print("Elementos da primeira matriz: [" + (i + 1) + "][" + (j + 1) + "] ");
				matriz1[i][j] = input.nextInt();
				
			}
			System.out.println();
		}
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("Elementos da segunda matriz: [" + (i + 1) + "][" + (j + 1) + "] ");
				matriz2[i][j] = input.nextInt();
			}

		}
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				mult_matrizes[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];
			}
		
			System.out.println();
		}System.out.print("multiplicação das Matrizes: ");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(mult_matrizes[i][j] + " ");
			}
		}
		
		
		input.close();
		
	}
	
}





