package prática6;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int somaPares = 0;
		int[] números = new int[10];

		for (int i = 0; i < números.length; i++) {

			System.out.print("Informe o " + (i + 1) + "° número: ");
			números[i] = input.nextInt();
			if (números[i] % 2 == 0) {
				somaPares += números[i];

			}
		}
		System.out.println("Vetor informado ");
		for (int i = 0; i < números.length; i++) {
			System.out.println(números[i] + " ");	
		}
		System.out.println("A soma dos números pares é: " + somaPares);
		input.close();

	}

}
