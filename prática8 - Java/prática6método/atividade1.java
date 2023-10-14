package pratica6método;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numeros[] = new int[10];
		LerNumeros(input, numeros);
		int somaPares = calcularSomaPares(numeros);
		imprimirVetor(numeros);
		System.out.print("A soma dos numeros pares é: " + somaPares);
		input.close();
	}

	public static void LerNumeros(Scanner input, int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° número: ");
			numeros[i] = input.nextInt();
		}
	}

	public static int calcularSomaPares(int[] numeros) {
		int somaPares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
			}
		}
		return somaPares;

	}

	public static void imprimirVetor(int[] numeros) {
		System.out.print("Vetor informado:");
		for (int i = 0; i < numeros.length; i++) {
			
		System.out.print(numeros[i] + " ");
		}
	}

}
