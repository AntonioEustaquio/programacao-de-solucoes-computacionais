package atividade1;

public class Cadastro {
	Pessoa[] pessoas;
	private int count;

	public Cadastro(int tamanho) {
		pessoas = new Pessoa[tamanho];
		count = 0;
	}

	public void cadastrarPessoa(Pessoa pessoa) {
		if (count < pessoas.length) {
			count++;
			System.out.print("Pessoa cadastrada com sucesso!");
		} else {
			System.out.print("Capacidade máxima de cadastro atingida.");
		}
	}

	public void imprimirCadastro() {
		System.out.println("Lista de cadastro: ");
		for (int i = 0; i < count; i++) {
			System.out.print("Nome :" + pessoas[i].getNome());
			if (pessoas[i] instanceof PessoaFísica) {
				System.out.println("CPF: " + ((PessoaFísica) pessoas[i]).getcpf());
			} else if (pessoas[i] instanceof PessoaJuridica) {
				System.out.println("CNPJ: " + ((PessoaJuridica) pessoas[i]).getcnpj());
			}
			System.out.println();
		}
	}

}
