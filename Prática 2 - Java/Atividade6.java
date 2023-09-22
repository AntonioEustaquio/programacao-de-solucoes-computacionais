package prática2;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.print("informe os valores X, Y E Z");
	int X, Y, Z;
	
	X = input.nextInt();
	Y = input.nextInt();
	Z = input.nextInt();
	
	boolean condicao1 = Math.abs(Y - Z) < X && X < (X + Z);
	boolean condicao2 = Math.abs(X - Z) < Y && Y < (Y + Z);
	boolean condicao3 = Math.abs(Y - X) < Z && Z < (X + Y); 

	if (condicao1 && condicao2 && condicao3)
	            System.out.println("Os valores podem ser os comprimentos dos lados de um triângulo.");
	else
		 System.out.println("Os valores não podem ser os comprimentos dos lados de um triângulo.");		
		

	
	}

}
