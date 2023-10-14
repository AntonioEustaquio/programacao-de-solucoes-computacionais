package prática5;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int base, expoente, resultado = 1;
		
		System.out.print("Informe o primeiro número inteiro: ");
		 base = input.nextInt();
		
		
		System.out.print("Informe o segundo número inteiro: ");
		 expoente = input.nextInt();
		
		for (int i = expoente; i >= 1; i--) {
			 resultado = resultado * base;
		}
	
	System.out.print("Resultado: " + resultado);
	
	
	
	}

}
