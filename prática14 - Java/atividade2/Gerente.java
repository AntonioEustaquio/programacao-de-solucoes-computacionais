package atividade2;

public class Gerente extends Empregado {
	private String nomeSecretaria;

	public Gerente(String nome, double salario, int anoContratacao) {
		super(nome, salario, anoContratacao);
		nomeSecretaria = "";
	}

	public void reajustaSalario(double porcentagem) {
// Adiciona 1% de bônus para cada ano de servico
		double bonus = (ANO_BASE - getAnoContratacao());
		super.reajustaSalario(porcentagem + bonus);
	}
}


