package prática5;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sexo;
		int peso, MulheresEntre50e70Kg = 0, HomensEntre60e80Kg = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o peso da " + i + "° pessoa: ");
			peso = input.nextInt();
			input.nextLine();
			System.out.println("Informe seu sexo(digite M para masculino, ou F para feminino: ");
			sexo = input.nextLine();

			if (sexo.equalsIgnoreCase("F") && peso >= 50 && peso <= 70) {
				MulheresEntre50e70Kg++;
			} else if (sexo.equalsIgnoreCase("M") && peso >= 60 && peso <= 80) {
				HomensEntre60e80Kg++;

			} else {
				System.out.println("Sexo não reconhecido.");
			}

		}
		System.out.println("A quantidade de mulheres entre 50 e 70 Kilos é de: " + MulheresEntre50e70Kg);
		System.out.println("A quantidade de homens entre 60 e 80 Kilos é de: " + HomensEntre60e80Kg);
		
		input.close();

	}

}
