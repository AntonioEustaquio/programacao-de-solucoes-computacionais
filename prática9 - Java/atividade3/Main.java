package atividade3;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(3); // Podemos cadastrar até 3 funcionários

        Funcionario func1 = new Funcionario("João", 30, "Analista", 3000, "123456789", "Rua A, 123");
        Funcionario func2 = new Funcionario("Maria", 25, "Programador", 2500, "987654321", "Rua B, 456");
        Funcionario func3 = new Funcionario("Carlos", 35, "Gerente", 4000, "111222333", "Rua C, 789");

        cadastro.cadastrarFuncionario(func1);
        cadastro.cadastrarFuncionario(func2);
        cadastro.cadastrarFuncionario(func3);

        cadastro.imprimirCadastro();
    }
}
