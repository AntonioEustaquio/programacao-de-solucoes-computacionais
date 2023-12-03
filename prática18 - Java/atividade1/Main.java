package atividade1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ordenacao ordenacao = new Ordenacao();

		do {
			System.out.println("Escolha o método de ordenação:");
			System.out.println("1. Bolha");
			System.out.println("2. Seleção");
			System.out.println("3. Inserção");
			System.out.println("4. Quicksort");
			System.out.println("5. Mergesort");
			System.out.println("0. Sair");

			int escolha = scanner.nextInt();

			if (escolha == 0) {
				System.out.println("Programa encerrado.");
				break;
			}

			System.out.println("Informe um vetor de 10 números:");

			int[] vetor = new int[10];
			for (int i = 0; i < 10; i++) {
				vetor[i] = scanner.nextInt();
			}

			switch (escolha) {
			case 1:
				ordenacao.bolha(vetor);
				break;
			case 2:
				ordenacao.selecao(vetor);
				break;
			case 3:
				ordenacao.insercao(vetor);
				break;
			case 4:
				ordenacao.quicksort(vetor, 0, vetor.length - 1);
				break;
			case 5:
				ordenacao.mergeSort(vetor);
				break;
			default:
				System.out.println("Escolha inválida. Tente novamente.");
				continue;
			}

			System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

			System.out.println("Deseja executar novamente? (1 para sim, 0 para não)");
		} while (scanner.nextInt() == 1);

		scanner.close();
	}
}