package pratica16;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Informe a primeira sequência de números: ");
		int[] sequencia1 = lerSequencia(input);
		
		System.out.print("Informe a segunda sequencia de números: ");
		int[] sequencia2 = lerSequencia(input);
		
				Arrays.sort(sequencia1);
				Arrays.sort(sequencia2);
		int[] conjuntoA = removerDuplicatas(sequencia1);
		int[] conjuntoB = removerDuplicatas(sequencia2);	
		int[] conjuntoC = uniaoConjuntos(conjuntoA, conjuntoB);
		
		exibirConjunto("ConjuntoA", conjuntoA);
		exibirConjunto("ConjuntoB", conjuntoB);
		exibirConjunto("ConjuntoC (A ∪ B)",conjuntoC);
		
		
		
		input.close();

	
	}

	private static int[] lerSequencia(Scanner input) {
		String scanner = input.nextLine();
		String[] tokens = scanner.split("\s+");
		int[] sequencia = new int[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			sequencia[i] = Integer.parseInt(tokens[i]);

		}
		return sequencia;
	}

	private static int[] removerDuplicatas(int[] sequencia) {
		int[] resultado = Arrays.copyOf(sequencia, sequencia.length);
		int tamanho = 1;
		for (int i = 0; i < resultado.length; i++) {
			if (Arrays.binarySearch(resultado, 0, tamanho, resultado[i]) < 0) {
				resultado[tamanho] = resultado[i];
				tamanho++;
			}
		}
		return Arrays.copyOf(resultado, tamanho);

	}

	private static int[] uniaoConjuntos(int[] conjuntoA, int[] conjuntoB) {
		int[] resultado = new int[conjuntoA.length + conjuntoB.length];
		System.arraycopy(conjuntoA, 0, resultado, 0, conjuntoA.length);
		System.arraycopy(conjuntoB, 0, resultado, conjuntoA.length, conjuntoB.length);

		return removerDuplicatas(resultado);
	}

	private static void exibirConjunto(String nome, int[] conjunto) {
		System.out.print(nome + ": ");
		for (int elemento : conjunto) {
			System.out.print(elemento + " ");
		}
		System.out.println();
	}
}