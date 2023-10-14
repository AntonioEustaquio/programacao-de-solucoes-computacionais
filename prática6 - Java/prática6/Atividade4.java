package prática6;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + "° número: ");
			numeros[i] = input.nextInt();
			
		}
		System.out.println("Números armazenados nas posições pares: ");
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		
		
		
		
		
		input.close();

	}

}
