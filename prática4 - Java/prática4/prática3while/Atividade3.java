package prática3while;
import java.util.Scanner;

public class Atividade3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int[] audienciaPorCanal = new int[5];

        while (true) {
            System.out.print("Informe o número do canal (ou 0 para encerrar): ");
            int numeroCanal = scanner.nextInt();

            if (numeroCanal == 0) {
                break;
            }

            System.out.print("Informe o número de pessoas assistindo ao canal: ");
            int numPessoas = scanner.nextInt();

            if (numeroCanal >= 2 && numeroCanal <= 12) {
                audienciaPorCanal[numeroCanal - 2] += numPessoas;
                totalPessoas += numPessoas;
            } else {
                System.out.println("Canal inválido.");
            }
        }

        System.out.println("Resultado da pesquisa:");
        for (int i = 0; i < audienciaPorCanal.length; i++) {
            double percentual = (audienciaPorCanal[i] / (double) totalPessoas) * 100;
            System.out.println("Canal " + (i + 2) + ": " + percentual + "% de audiência.");
        }

        scanner.close();
    }
}
