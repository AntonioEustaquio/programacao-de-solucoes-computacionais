package pratica16;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

      
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o número a ser pesquisado: ");
            int numeroBusca = scanner.nextInt();

            System.out.print("Escolha o algoritmo de busca (1 - Sequencial, 2 - Sequencial com Sentinela): ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    pesquisarSequencial(vetor, numeroBusca);
                    break;
                case 2:
                    pesquisarSequencialSentinela(vetor, numeroBusca);
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }

            System.out.print("Deseja realizar outra pesquisa? (S para Sim, N para Não): ");
            char opcao = scanner.next().charAt(0);
            continuar = opcao == 'S' || opcao == 's';
        }

        scanner.close();
    }

    private static void pesquisarSequencial(int[] vetor, int numeroBusca) {
        int comparacoes = 0;
        for (int i = 0; i < vetor.length; i++) {
            comparacoes++;
            if (vetor[i] == numeroBusca) {
                System.out.println("Número encontrado na posição " + i);
                System.out.println("Número de comparações realizadas: " + comparacoes);
                return;
            }
        }

        System.out.println("Número não encontrado");
        System.out.println("Número de comparações realizadas: " + comparacoes);
    }

    private static void pesquisarSequencialSentinela(int[] vetor, int numeroBusca) {
        int comparacoes = 0;
        int indice = 0;

        // Adiciona um sentinela no final do vetor
        vetor[vetor.length - 1] = numeroBusca;

        while (vetor[indice] != numeroBusca) {
            comparacoes++;
            indice++;
        }

        if (indice < vetor.length - 1) {
            System.out.println("Número encontrado na posição " + indice);
            System.out.println("Número de comparações realizadas: " + comparacoes);
        } else {
            System.out.println("Número não encontrado");
            System.out.println("Número de comparações realizadas: " + comparacoes);
        }
    }
}
