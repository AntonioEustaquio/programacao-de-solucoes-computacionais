package atividade2;
public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", 30, 1.75, 75.0);
        System.out.println("Dados da Pessoa:");
        System.out.println(pessoa);

   
        Empregado empregado = new Empregado("Maria", 25, 1.60, 55.0, 123, 2500.0, 10.0);
        System.out.println("\nDados do Empregado:");
        System.out.println(empregado);
        System.out.println("Salário do Empregado: R$" + empregado.calcularSalario());

   
        Operario operario = new Operario("Pedro", 35, 1.80, 80.0, 456, 3000.0, 12.0, 5000.0, 5.0);
        System.out.println("\nDados do Operario:");
        System.out.println(operario);
        System.out.println("Salário do Operario: R$" + operario.calcularSalario());

   
        Administrador administrador = new Administrador("Ana", 40, 1.70, 70.0, 789, 4000.0, 15.0, 1000.0);
        System.out.println("\nDados do Administrador:");
        System.out.println(administrador);
        System.out.println("Salário do Administrador: R$" + administrador.calcularSalario());

   
        Cliente cliente = new Cliente("Lucas", 28, 1.85, 90.0, 1000.0, 500.0);
        System.out.println("\nDados do Cliente:");
        System.out.println(cliente);
        System.out.println("Saldo do Cliente: R$" + cliente.obterSaldo());
    }
}
