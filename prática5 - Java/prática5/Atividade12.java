package prática5;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite um número: ");
		n = input.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " +(n * i ));
			
		}
		
		
		
		
		input.close();

	}

}
