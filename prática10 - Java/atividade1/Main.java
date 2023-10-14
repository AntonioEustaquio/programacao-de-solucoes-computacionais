package Atividade1;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(3); 

        Veiculo veiculo1 = new Veiculo("Toyota", "Corolla", "Preto", 12345, 54321);
        Veiculo veiculo2 = new Veiculo("Honda", "Civic", "Prata", 67890, 98765);

        cadastro.cadastrarVeiculo(veiculo1);
        cadastro.cadastrarVeiculo(veiculo2);

        cadastro.imprimirCadastro();
    }
}
