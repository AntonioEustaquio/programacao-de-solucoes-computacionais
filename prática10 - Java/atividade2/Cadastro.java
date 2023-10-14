package atividade2;

public class Cadastro {
	Pessoa[] pessoas;
	private int count;

	public Cadastro(int tamanho) {
		pessoas = new Pessoa[tamanho];
		count = 0;
	}

	public void cadastrarPessoa(Pessoa pessoa) {
		pessoas[count] = pessoa;
		count++;
	}

	public void imprimirCadastro() {
		for (int i = 0; i < count; i++) {
			System.out.println("Nome: " + pessoas[i].getNome());

		}
	}

	}
