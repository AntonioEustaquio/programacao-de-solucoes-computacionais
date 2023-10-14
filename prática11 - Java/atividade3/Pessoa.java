package atividade3;

class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class PessoaFisica extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

class Cadastro {
    private Pessoa[] pessoas;
    private int quantidadePessoas;

    public Cadastro(int tamanho) {
        pessoas = new Pessoa[tamanho];
        quantidadePessoas = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (quantidadePessoas < pessoas.length) {
            pessoas[quantidadePessoas] = pessoa;
            quantidadePessoas++;
        } else {
            System.out.println("Limite de cadastros atingido.");
        }
    }

    public void imprimirCadastro() {
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Nome: " + pessoas[i].getNome());
            if (pessoas[i] instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) pessoas[i];
                System.out.println("CPF: " + pessoaFisica.getCpf());
            } else if (pessoas[i] instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoas[i];
                System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(10);

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("João");
        pessoaFisica.setCpf("123.456.789-00");
        cadastro.cadastrarPessoa(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Empresa XYZ");
        pessoaJuridica.setCnpj("12.345.678/0001-90");
        cadastro.cadastrarPessoa(pessoaJuridica);

        cadastro.imprimirCadastro();
    }
}
