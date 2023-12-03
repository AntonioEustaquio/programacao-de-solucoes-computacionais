package atividade2;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Adiciona alguns empregados, gerentes e diretores
        empresa.adicionaEmpregado(new Empregado("Empregado1", 50000, 2010));
        empresa.adicionaEmpregado(new Gerente("Gerente1", 70000, 2008));
        empresa.adicionaEmpregado(new Diretor("Diretor1", 90000, 2005, "TI"));

        // Reajusta os salários em 10%
        empresa.reajustaSalarios(10);

        // Mostra a lista de empregados após o reajuste
        System.out.println(empresa.mostrEmpregados());
    }
}
