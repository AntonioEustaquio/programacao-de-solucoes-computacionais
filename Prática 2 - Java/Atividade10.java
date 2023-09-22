package prática2;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.print("Informe o 1° número: ");
	double número1 = input.nextDouble();
	
	System.out.print("Informe o 2° número: ");
	double número2 = input.nextDouble();
	double soma, subtração, divisão, multiplicação;
	int código;
	System.out.println("## Escolha a operação ##: ");
	System.out.println("[1]: Somar ");
	System.out.println("[2]: Multiplicar ");
	System.out.println("[3]: Subtrair ");
	System.out.println("[4]: Dividir ");
	System.out.println(" Insira o código: ");
	código = input.nextInt();
	switch (código) {
	case 1:
		soma = número1 + número2;
		System.out.println("A soma é: " + soma);
		break;
		
	case 2:
		multiplicação = número1 *número2;
		System.out.println("A multiplicação é: "  + multiplicação);
		break;
		
	case 3:
		if (número1 < número2) {
			System.out.println ("Operação inválida. ");
		} else {
		subtração = número1 - número2;
		System.out.println("S subtração é: " + subtração);
		}
		break;
		
	case 4:
		if (número1 == 0 || número2 == 0) {
			System.out.println("Operação inválida. ");
		} else {
			divisão = número1 / número2;
			System.out.println("A divisão é: " + divisão);
		}
		break;
		default:
			System.out.println("Operação inválida. ");
		
	     }
	
	
	
	}
	
}
