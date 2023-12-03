package atividade2;

public class Administrador extends Empregado {

	public double ajudaDeCusto;

	public Administrador(String nome, int idade, float altura, float peso, int numeroSecao, double INSS,
			double salarioBase, double ajudaDeCusto) {
		super(nome, idade, altura, peso, numeroSecao, INSS, salarioBase);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calcularSalario() {
		double salarioEmpregado = super.calcularSalario();
		return salarioEmpregado + ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
}
