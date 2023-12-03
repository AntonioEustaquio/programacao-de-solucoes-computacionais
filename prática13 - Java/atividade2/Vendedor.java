package atividade2;

public class Vendedor extends Empregado {

	public double valorVendas, comissao;

	public Vendedor(String nome, int idade, float altura, float peso, int numeroSecao, double INSS, double salarioBase,
			double ajudaDeCusto) {
		super(nome, idade, altura, peso, numeroSecao, INSS, salarioBase);
		this.valorVendas = valorVendas;
		this.comissao = comissao;

	}

	@Override
	public double calcularSalario() {
		double salarioEmpregado = super.calcularSalario();
		double salarioVendedor = salarioEmpregado + (valorVendas * (comissao / 100));
		return salarioVendedor;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}