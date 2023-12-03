package atividade1;

import java.util.Scanner;

public class Main extends Ordenação {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			int vetor[] = new int[10];
			for (int i = 0; i < vetor.length; i++) {
				System.out.print("Informe o número " + (i + 1) + ": ");
				vetor[i] = input.nextInt();
			}
			System.out.print("Vetor original");
			printArray(vetor);

			System.out.print(
					"Selecione a ordenação que deseja efetuar (1 para bolha, 2 para seleção, 3 para inserção): ");
			int escolha = input.nextInt();

			switch (escolha) {
			case 1:
				bubbleSort(vetor);
				System.out.println("Vetor ordendado usando Bubble Sort: ");
				printArray(vetor);
				break;
			case 2:
				selectionSort(vetor);
				System.out.println("Vetor ordendado usando Bubble Sort: ");
				printArray(vetor);
				break;
			case 3:
				insertionSort(vetor);
				System.out.print("Vetor ordendado usando Bubble Sort: ");
				printArray(vetor);
				break;
			default:
				System.out.print("Escolha inválida. ");
			}
			System.out.print("Deseja realizar outra ordenação? (S para sim, N para não): ");
			char opcao = input.next().charAt(0);
			if (opcao != 'S' && opcao != 's') {
				continuar = false;
			}

		}

		input.close();
	}

}
