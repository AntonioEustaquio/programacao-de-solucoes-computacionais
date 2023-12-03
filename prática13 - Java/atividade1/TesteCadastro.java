package atividade1;


public class TesteCadastro {
	public static void main(String args[]) {

		PF pessoaFisica = new PF("\nJoão - ", "123456789 ", "Rua A ", "12345 ", "67890 ");
		PJ pessoaJuridica = new PJ("\nEmpresa X - ", "987654321 ", "Rua B ", "54321 ", "09876 ");
		Amigo amigo = new Amigo("\nMaria - ", "111111111 ", "Rua C ", "11111 ", "22222 ", "blogamigo ");
		Parente parente = new Parente("\nJosé - ", "222222222 ", "Rua D ", "33333 ", "44444 ", "emailparente ");
		pessoaFisica.exibe();
		pessoaJuridica.exibe();
		amigo.exibe();
		parente.exibe();
	}
}
