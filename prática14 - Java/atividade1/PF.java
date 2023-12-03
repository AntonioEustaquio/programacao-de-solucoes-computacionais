package atividade1;

public class PF extends Pessoa {
	private String RG;
	private String CPF;

	public PF() {
		super();
		RG = "";
		CPF = "";
	}

	public PF(String nome, String telefone, String endereco, String RG, String CPF) {
		super(nome, telefone, endereco);
		this.RG = RG;
		this.CPF = CPF;
	}

	public String toString() {	
		return super.toString() + "RG = " + RG + "\nCPF = " + CPF;
	}

}