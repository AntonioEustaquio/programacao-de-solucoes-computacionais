package prática1while;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe a cotação do dólar em reais: ");
            double cotacaoDolar = scanner.nextDouble();

            System.out.print("Informe a quantidade de dólares que você possui: ");
            double quantidadeDolares = scanner.nextDouble();

            double valorEmReais = cotacaoDolar * quantidadeDolares;

            System.out.println("O valor em reais é: R$ " + valorEmReais);

            System.out.print("Deseja calcular para outra quantia? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}

