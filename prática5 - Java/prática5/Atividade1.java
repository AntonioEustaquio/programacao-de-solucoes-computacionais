package prática5;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int soma = 0;

		for (int i = 7; i <= 20; i++)

			soma = soma + i;
		System.out.println("Soma dos números de 1 a 20 é " + soma);
		
	}

}
