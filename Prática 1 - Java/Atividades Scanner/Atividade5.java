package atividade1calculadora;
import 	java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.print ("diagonal maior: ");
	double diagonal_maior = input.nextDouble();
	
	System.out.print ("diagonal menor: ");
	double diagonal_menor = input.nextDouble();
	
	System.out.println ("a área do losango é " + diagonal_maior * diagonal_menor /2);
	
	
	
	}

}
