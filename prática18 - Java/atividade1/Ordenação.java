package atividade1;

import java.util.Arrays;
import java.util.Scanner;

class Ordenacao {
	public static void bolha(int[] vetor) {
		int n = vetor.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {

					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			}
		}
	}

	public static void selecao(int[] vetor) {
		int n = vetor.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (vetor[j] < vetor[minIndex]) {

					minIndex = j;
				}
			}

			int temp = vetor[i];
			vetor[i] = vetor[minIndex];
			vetor[minIndex] = temp;
		}
	}

	public static void insercao(int[] vetor) {
		int n = vetor.length;
		for (int i = 1; i < n; i++) {
			int key = vetor[i];
			int j = i - 1;

			while (j >= 0 && vetor[j] > key) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = key;
		}
	}

	public static void quicksort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {

			int posicaoPivo = particionar(vetor, inicio, fim);

			quicksort(vetor, inicio, posicaoPivo - 1);
			quicksort(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int particionar(int[] vetor, int inicio, int fim) {
		int pivot = vetor[fim];
		int i = inicio - 1;

		for (int j = inicio; j < fim; j++) {
			if (vetor[j] <= pivot) {
				i++;

				int temp = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = temp;
			}
		}

		int temp = vetor[i + 1];
		vetor[i + 1] = vetor[fim];
		vetor[fim] = temp;

		return i + 1;
	}

	public static void mergeSort(int[] vetor) {
		if (vetor.length > 1) {
			int meio = vetor.length / 2;

			int[] metadeEsquerda = Arrays.copyOfRange(vetor, 0, meio);
			int[] metadeDireita = Arrays.copyOfRange(vetor, meio, vetor.length);

			mergeSort(metadeEsquerda);
			mergeSort(metadeDireita);

			merge(vetor, metadeEsquerda, metadeDireita);
		}
	}

	private static void merge(int[] vetor, int[] metadeEsquerda, int[] metadeDireita) {
		int i = 0, j = 0, k = 0;

		while (i < metadeEsquerda.length && j < metadeDireita.length) {
			if (metadeEsquerda[i] <= metadeDireita[j]) {
				vetor[k] = metadeEsquerda[i];
				i++;
			} else {
				vetor[k] = metadeDireita[j];
				j++;
			}
			k++;
		}

		while (i < metadeEsquerda.length) {
			vetor[k] = metadeEsquerda[i];
			i++;
			k++;
		}

		while (j < metadeDireita.length) {
			vetor[k] = metadeDireita[j];
			j++;
			k++;
		}
	}
}
