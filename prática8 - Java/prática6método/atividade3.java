package pratica6método;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numeros[] = new int[10];
		LerNumero(input, numeros);
		MaioreMenor(numeros);
		imprimirVetor(numeros);
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
			System.out.print("\n" + numeros[i] + " ");
		}
	}

	public static void MaioreMenor(int[] numeros) {
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}

		}
		System.out.print("\nO maior valor é: " + maior);
		System.out.print("\nO menor valor é: " + menor);

	}

}
