package pratica16;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);

		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o numero " + (i + 1) + ": "
					+ "OBS: Coloque os números de forma ordenada para realizar a pesquisa binária. ");
			vetor[i] = input.nextInt();
		}
		boolean continuar = true;

		while (continuar) {
			System.out.print("Digite o numero a ser pesquisado: ");
			int numeroBusca = input.nextInt();
			System.out.print("Tecle '1' para pesquisa binária ou tecle '2' para sair: ");
			int escolha = input.nextInt();
			switch (escolha) {
			case 1:
				pesquisaBinaria(vetor, numeroBusca);
			case 2:
				System.out.print("\nPrograma encerrado.");
				break;
			default:
				System.out.print("Escolha inválida. ");
			}
			System.out.print("Deseja realizar outra pesquisa? (Tecle S para sim ou N para não): ");
			char opcao = input.next().charAt(0);
			continuar = opcao == 'S' || opcao == 's';
		}

		input.close();
	}

	private static void pesquisaBinaria(int[] vetor, int numeroBusca) {
		int resultado = search(vetor, numeroBusca);
		if (resultado != -1) {
			System.out.println("Número encontrado na posição " + resultado);
		} else {
			System.out.println("Número não encontrado no vetor. ");
		}
	}

	private static int search(int[] array, int target) {
			int left  = 0;
			int right = array.length - 1;
			while (left <= right) {
				int mid = (left + right) /2;
				if(array[mid] == target) {
					return mid;
				} else if(array [mid] < target){
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		return 1;
		}

}