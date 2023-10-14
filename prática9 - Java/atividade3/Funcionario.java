package atividade3;

public class Funcionario {

	private String nome, cargo, endereco, telefone;
	private int idade;
	private double salario;

	public Funcionario(String nome, int idade, String cargo, double salario, String endereco, String telefone) {
	}

	{
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salario = salario;
	}

	public void exibe() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + salario);
		System.out.println("Telefone: " + telefone);
		System.out.println("Endereço: " + endereco);

	}

}

