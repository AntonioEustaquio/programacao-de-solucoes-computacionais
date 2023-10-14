package Atividade1;

public class Cadastro {
    private Veiculo[] veiculos;
    private int quantidadeVeiculos;

    public Cadastro(int tamanho) {
        veiculos = new Veiculo[tamanho];
        quantidadeVeiculos = 0;
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        if (quantidadeVeiculos < veiculos.length) {
            veiculos[quantidadeVeiculos] = veiculo;
            quantidadeVeiculos++;
        } else {
            System.out.println("Limite de cadastros atingido.");
        }
    }

    public void imprimirCadastro() {
        for (int i = 0; i < quantidadeVeiculos; i++) {
            System.out.println("Veículo " + (i + 1) + ":");
            veiculos[i].exibe();
            System.out.println();
        }
    }
}
