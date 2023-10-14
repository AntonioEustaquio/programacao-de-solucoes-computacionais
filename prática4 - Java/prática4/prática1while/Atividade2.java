package prática1while;
import java.util.Scanner;


public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o ano de nascimento: ");
            int anoNascimento = scanner.nextInt();

            System.out.print("Informe o ano atual: ");
            int anoAtual = scanner.nextInt();

            int idadeAtual = anoAtual - anoNascimento;
            int idade2050 = 2050 - anoNascimento;

            System.out.println("Idade atual: " + idadeAtual + " anos.");
            System.out.println("Idade em 2050: " + idade2050 + " anos.");

            System.out.print("Deseja calcular para outra pessoa? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}
