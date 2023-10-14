package prática5;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sexo;
		int idade, MulheresEntre20e40 = 0;
		
		
		
		
		for(int i = 1; i <=10; i++) {
			System.out.println("Informe a idade da " + i + "° pessoa: ");
			idade = input.nextInt();
			input.nextLine();
			
			System.out.println("Informe seu sexo(digite M para masculino, ou F para feminino: ");
			sexo = input.nextLine();			
		 if(sexo.equalsIgnoreCase("F") && idade >=20 && idade <= 40) {
			MulheresEntre20e40++;
			}
		}
		
		System.out.println("A quantidade de mulheres entre 20 e 40 anos é de: " + MulheresEntre20e40);
		
		
		
	input.close();
	}

}
