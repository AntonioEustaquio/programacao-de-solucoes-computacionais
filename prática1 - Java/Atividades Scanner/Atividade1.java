package atividade1calculadora;

import java.util.Scanner;

public class Atividade1Calculadora {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println ("informe o numero 1: ");
Double numero1 = input.nextDouble();

System.out.println ("informe o numero 2: ");
Double numero2 = input.nextDouble();

System.out.println ("informe o numero 3: ");
Double numero3 = input.nextDouble(); 

Double resp = (numero1 + numero2 + numero3)/3;
System.out.print("resultado: " + resp);




	}

}
