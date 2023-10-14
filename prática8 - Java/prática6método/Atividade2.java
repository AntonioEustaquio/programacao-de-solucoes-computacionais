package pratica6método;

import java.util.Scanner;

public class Atividade2 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int[10];
		LerNumeros(input, numeros);
		imprimirVetor(numeros);
		numerosNegativos(numeros);
		input.close();
	}
	public static void LerNumeros(Scanner input, int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° número: ");
			numeros[i] = input.nextInt();
		}
	}
	public static void imprimirVetor(int[] numeros) {
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");	
		}
	}
	public static void numerosNegativos(int[] numeros) {
		System.out.print("\nPosições com números negativos: ");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 0) {
				System.out.print( i + " ");
			}
		}
	}



}


