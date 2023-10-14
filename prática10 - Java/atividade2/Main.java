package atividade2;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(3);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        cadastro.cadastrarPessoa(pessoa);

        PessoaFísica pessoaFisica = new PessoaFísica();
        pessoaFisica.setNome("João");
        pessoaFisica.setCPF("12345678900");
        cadastro.cadastrarPessoa(pessoaFisica);

        PessoaJurídica pessoaJuridica = new PessoaJurídica();
        pessoaJuridica.setNome("Empresa X");
        pessoaJuridica.setCNPJ("12345678000100");
        cadastro.cadastrarPessoa(pessoaJuridica);

        cadastro.imprimirCadastro();
    }
}
