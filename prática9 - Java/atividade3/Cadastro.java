package atividade3;

public class Cadastro {

	private Funcionario[] funcionarios;
	private int quantidadeFuncionarios;

	public Cadastro(int tamanho) {
		funcionarios = new Funcionario[tamanho];
		quantidadeFuncionarios = 0;
	}

	public void cadastrarFuncionario(Funcionario funcionario) {
		if (quantidadeFuncionarios < funcionarios.length) {
			funcionarios[quantidadeFuncionarios] = funcionario;
			quantidadeFuncionarios++;
		} else {
			System.out.print("Limite de cadastros atingido.");
		}
	}

	public void imprimirCadastro() {
		for (int i = 0; i < quantidadeFuncionarios; i++) {
			System.out.print("Funcionário " + (i + 1) + ": ");
			funcionarios[i].exibe();
			System.out.println();
		}
	}

}
