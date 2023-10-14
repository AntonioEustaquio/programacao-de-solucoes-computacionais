package prática3while;
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSalarios = 0;
        int totalFilhos = 0;
        int contador = 0;

        while (true) {
            System.out.print("Informe o salário (ou valor negativo para encerrar): ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Informe o número de filhos: ");
            int numFilhos = scanner.nextInt();

            totalSalarios += salario;
            totalFilhos += numFilhos;
            contador++;
        }

        if (contador == 0) {
            System.out.println("Nenhum dado foi inserido.");
        } else {
            double mediaSalarios = totalSalarios / contador;
            double mediaFilhos = totalFilhos / (double) contador;

            System.out.println("Resultados da pesquisa:");
            System.out.println("Média salarial: " + mediaSalarios);
            System.out.println("Média do número de filhos: " + mediaFilhos);
        }

        scanner.close();
    }
}
