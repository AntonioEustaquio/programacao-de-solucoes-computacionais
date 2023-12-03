package atividade2;

public class Diretor extends Empregado {
    private String departamento;

    public Diretor(String nome, double salario, int anoContratacao, String departamento) {
        super(nome, salario, anoContratacao);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void reajustaSalario(double porcentagem) {
        // Adiciona 2% de bônus para cada ano de serviço
        double bonus = 2 * (ANO_BASE - getAnoContratacao());
        super.reajustaSalario(porcentagem + bonus);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + getDepartamento();
    }
}
