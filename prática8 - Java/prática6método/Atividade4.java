package pratica6método;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numeros[] = new int[10];
		LerNumero(input, numeros);
		imprimirVetor(numeros);
		vetoresPares(numeros);
		input.close();

	}

	public static void LerNumero(Scanner input, int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° número: ");
			numeros[i] = input.nextInt();
		}
	}

	public static void imprimirVetor(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("\n" + numeros[i] + " ");
		}
	}

	public static void vetoresPares(int[] numeros) {
		int posiçõesPares = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 == 0) {
				System.out.print( + numeros[i] + " ");
			}

		}

	}

}
