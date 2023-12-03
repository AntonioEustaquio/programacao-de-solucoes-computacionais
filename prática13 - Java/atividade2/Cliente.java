package atividade2;

public class Cliente extends Pessoa {

	public double credMax, valorEmDivida;

	public Cliente(String nome, int idade, float altura, float peso, double credMax, double valorEmDivida) {
		super(nome, idade, altura, peso);
		this.credMax = credMax;
		this.valorEmDivida = valorEmDivida;
	}

	public double obterSaldo() {
		return credMax - valorEmDivida;
	}

	public double getCredMax() {
		return credMax;
	}

	public void setCredMax(double credMax) {
		this.credMax = credMax;
	}

	public double getValorEmDivida() {
		return valorEmDivida;
	}

	public void setValorEmDivida(double valorEmDivida) {
		this.valorEmDivida = valorEmDivida;
	}
}