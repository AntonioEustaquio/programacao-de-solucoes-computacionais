package atividade1calculadora;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
System.out.print ("informe seu ano de nascimento: ");
int nascimento = input.nextInt();
int anoAtual = 2023;
int idadeAtual = anoAtual - nascimento;
int idade2050 = 2050 - nascimento;
System.out.println ("Idade do ano atual: " +idadeAtual+ " anos");
System.out.println ("Idade em 2050: " + idade2050 + " anos");


	}

}
