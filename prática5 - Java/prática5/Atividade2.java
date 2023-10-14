package prática5;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o primeiro número: ");
		int numero1 = input.nextInt();

		System.out.print("Informe o segundo número: ");
		int numero2 = input.nextInt();

		for (int i = numero1; i < numero2; i++)
			System.out.println (i);

	}

}
