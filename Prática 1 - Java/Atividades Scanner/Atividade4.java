package atividade1calculadora;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
	  Scanner input = new Scanner (System.in);
	  double porcentagem, aumento;
	  System.out.print("informe seu salário: ");
	  double salário = input.nextDouble();
	  porcentagem = 0.25;
	  aumento = salário * porcentagem;
	  double novo_salário = salário + aumento;
	  System.out.println ("seu novo salário é" + novo_salário + " reais");
	  
	 
	  	
	  	

	}

}
