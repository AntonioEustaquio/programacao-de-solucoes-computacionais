package prática3;
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSalarios = 0;
        int totalPessoas = 0;
        int totalFilhos = 0;

        
        while (true) {
            System.out.print("Informe o salário (ou salário negativo para encerrar): ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Informe o número de filhos: ");
            int numFilhos = scanner.nextInt();

            totalSalarios += salario;
            totalFilhos += numFilhos;
            totalPessoas++;
        }

        if (totalPessoas == 0) {
            System.out.println("Nenhum dado foi inserido.");
        } else {
            double mediaSalarial = totalSalarios / totalPessoas;
            double mediaFilhos = (double) totalFilhos / totalPessoas;

            System.out.println("Média salarial da população: " + mediaSalarial);
            System.out.println("Média do número de filhos: " + mediaFilhos);
        }
        
        scanner.close();
    }
}
