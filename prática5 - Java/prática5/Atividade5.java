package prática5;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valores[];
		int qnt_de_idades;
		int maior = 0;
		int menor = 0;

		System.out.println("Informe quantos números pretende digitar: ");

		qnt_de_idades = input.nextInt();

		valores = new int[(qnt_de_idades)];

		for (int i = 0; i < qnt_de_idades; i++) {
			System.out.println("Informe o " + (i + 1) + "° valor: ");
			valores[i] = input.nextInt();

			maior = valores[i];
			menor = valores[i];

		}

		for (int i = 0; i < qnt_de_idades; i++) {

			if (valores[i] > maior) {
				maior = valores[i];

			} else if (valores[i] < menor) {
				menor = valores[i];
			}
		}
		System.out.println("O maior número da sequência é: " + maior);
		System.out.println("O menor número da sequência é: " + menor);

	}

}