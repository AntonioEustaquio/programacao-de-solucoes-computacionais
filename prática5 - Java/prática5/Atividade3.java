package prática5;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, fat = 1;
		System.out.print("Informe um número inteiro: ");
		n = input.nextInt();

		if (n >= 0) {
			for (int i = 1; i <= n; i++) {
				fat = fat * i;
			}
			System.out.println("Fatorial de " + n + " é: " + fat);
		} else {
			System.out.print("Número inválido.");
		}

	}

}
