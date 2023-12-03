package atividade2;

public class Operario extends Empregado {

	public double valorProducao, comissao;

	public Operario(String nome, int idade, float altura, float peso, int numeroSecao, double INSS,
			double salarioBase, double ajudaDeCusto) {
		super(nome, idade, altura, peso, numeroSecao, INSS, salarioBase);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		double salarioEmpregado = super.calcularSalario();
		double salarioOperario = salarioEmpregado + (valorProducao * (comissao / 100));
		return salarioOperario;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}