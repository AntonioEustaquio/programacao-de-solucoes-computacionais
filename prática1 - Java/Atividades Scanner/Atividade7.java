package atividade1calculadora;
import java.util.Scanner;
public class Atividade7 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        double salario_Mínimo, salário_Funcionário, qnt_Salários_Minimos;
        salario_Mínimo = 1320;
       System.out.print("Digite o valor do salário do funcionário: ");
     salário_Funcionário = input.nextDouble();
        qnt_Salários_Minimos = salário_Funcionário / salario_Mínimo;
       System.out.println("O funcionário recebe " + qnt_Salários_Minimos + " salários mínimos.");
       
	}

}
