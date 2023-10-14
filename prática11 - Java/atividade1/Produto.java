package atividade1;
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private static int ultimo_id = 0;

    public Produto() {
        this.id = ++ultimo_id;
        this.nome = "Nome não informado";
        this.preco = 0;
    }

    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
    }

    public void reajustaPreco(double percentual) {
        this.preco *= (1 + percentual / 100);
    }

    public void exibe() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto 1: ");
        String nomeProduto1 = scanner.nextLine();
        System.out.print("Informe o preço do produto 1: ");
        double precoProduto1 = scanner.nextDouble();

        System.out.print("Informe o nome do produto 2: ");
        scanner.nextLine(); // Limpa o buffer
        String nomeProduto2 = scanner.nextLine();
        System.out.print("Informe o preço do produto 2: ");
        double precoProduto2 = scanner.nextDouble();

        Produto produto1 = new Produto(nomeProduto1, precoProduto1);
        Produto produto2 = new Produto(nomeProduto2, precoProduto2);

        System.out.print("Informe o percentual de reajuste: ");
        double percentual = scanner.nextDouble();

        produto1.reajustaPreco(percentual);
        produto2.reajustaPreco(percentual);

        produto1.exibe();
        produto2.exibe();

        System.out.println("Último ID gerado: " + ultimo_id);

        scanner.close();
    }
}
