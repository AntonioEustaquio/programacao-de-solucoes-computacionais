package prática5;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int idade, somaIdades = 0, contador = 0;

		for (;;) {
			System.out.print("informe uma idade: ");
			idade = input.nextInt();

			if (idade > 0) {
				somaIdades += idade;
				contador++;
			} else {
				if (contador == 0) {
					System.out.print("idade inválida");
				} else {
					double média = (double) somaIdades / contador;
					System.out.println("A média das idades é " + média);
				}
				break;
			}

		}

	}

}
