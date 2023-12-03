package atividade2;

public class Empregado extends Pessoa {

	private int numeroSecao;
	private double INSS, salarioBase;

	public Empregado(String nome, int idade, float altura, float peso, int numeroSecao, double INSS,
			double salarioBase) {
		super(nome, idade, altura, peso);
		this.numeroSecao = numeroSecao;
		this.salarioBase = salarioBase;
		this.INSS = INSS;
	}

	public double calcularSalario() {
		double salarioFinal = salarioBase - (salarioBase * (INSS / 100));
		return salarioFinal;
	}

	public int getNumeroSecao() {
		return numeroSecao;
	}

	public void setNumeroSecao(int numeroSecao) {
		this.numeroSecao = numeroSecao;

	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getINSS() {
		return INSS;
	}

	public void setINSS(double INSS) {
		this.INSS = INSS;
	}
}
