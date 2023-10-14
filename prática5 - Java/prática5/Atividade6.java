package prática5;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade, contador = 0;
		double media = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe a " + i + "° idade: ");
			idade = input.nextInt();

			if (idade > 0) {
				contador++;
				media += idade;

			}

		}
		media = media / contador;
		System.out.println("A média das idades é igual a: " + media);

	}

}
