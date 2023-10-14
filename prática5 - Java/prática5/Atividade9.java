package prática5;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = input.nextInt();
		for (int i = 0; i <= numero; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
