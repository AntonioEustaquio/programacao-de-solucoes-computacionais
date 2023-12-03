package atividade1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Digite o numerador inteiro: ");
			int numerador = input.nextInt();

			System.out.print("Digite o denominador inteiro: ");
			int denominador = input.nextInt();
			Divisao.dividir(numerador, denominador);
			
		} catch (ArithmeticException e) {
			System.out.print(e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro: Insira valores inteiros válidos. ");

		} finally {
			input.close();
		}
	}

}
