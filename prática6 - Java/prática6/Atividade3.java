package prática6;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeros[] = new int[10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + "° número: ");
			numeros[i] = input.nextInt();

		}
		System.out.println("Vetor informado");
		for (int i = 0; i < 10; i++) {
			System.out.print(numeros[i] + " ");

		}
		System.out.println("\nmaior e menor valor: ");
		for (int i = 0; i < 10; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			} else if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println("O maior número do vetor é " + maior);
		System.out.println("O menor número do vetor é " + menor);
		input.close();

	}

}
