
package atividade1;

public class ContaCorrente {
	private int numero, agencia;
	private double saldo;

	public void iniciarContaCorrente(int n, int ag) {
		numero = n;
		agencia = ag;
		saldo = 0;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
		if(valor > saldo) {
			System.out.println("Saldo insuficiente para saque.");
			
		} else
			saldo -= valor;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public double consultarSaldo() {
		return (saldo);
	}
	public void exibe() {
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + numero);
		System.out.println("Saldo: R$" + saldo);
		
	}
	

}