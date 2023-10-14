package atividade1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ContaCorrente contaCorrente;

		System.out.print("Informe o número da conta: ");
		int numeroConta = input.nextInt();

		System.out.print("Infome a agência: ");
		int numeroAgencia = input.nextInt();

		 contaCorrente = new ContaCorrente();
		contaCorrente.iniciarContaCorrente(numeroConta, numeroAgencia);		
		System.out.print("Informe o valor para depósito: ");		
		double valorDeposito = input.nextDouble();
		contaCorrente.depositar(valorDeposito);
		
		System.out.print("Dados da conta após depósito: ");		
		contaCorrente.exibe();
		
		System.out.print(" Informe o valor do saque: ");		
		double valorSaque = input.nextDouble();
		
		contaCorrente.sacar(valorSaque);
		
		System.out.println("Dados da conta após saque: ");
		contaCorrente.exibe();
	}
}