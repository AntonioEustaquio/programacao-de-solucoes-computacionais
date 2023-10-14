package prática2while;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Tabela de Preços:");
            System.out.println("Código | Produto | Preço");
            System.out.println("1      | Sapato  | R$ 99,99");
            System.out.println("2      | Bolsa   | R$ 103,89");
            System.out.println("3      | Camisa  | R$ 49,98");
            System.out.println("4      | Calça   | R$ 89,72");
            System.out.println("5      | Blusa   | R$ 97,35");

            System.out.print("Digite o código do produto (ou qualquer outro valor para sair): ");
            int codigo = scanner.nextInt();

            double preco = 0.0;

            switch (codigo) {
                case 1:
                    preco = 99.99;
                    break;
                case 2:
                    preco = 103.89;
                    break;
                case 3:
                    preco = 49.98;
                    break;
                case 4:
                    preco = 89.72;
                    break;
                case 5:
                    preco = 97.35;
                    break;
                default:
                    System.out.println("Você saiu. Até logo!");
                    scanner.close();
                    return;
            }

            System.out.println("O preço do produto é: R$" + preco);

            System.out.print("Deseja consultar outro produto? (S para sim, qualquer outra tecla para sair): ");
            char opcao = scanner.next().charAt(0);
            if (opcao != 'S' && opcao != 's') {
                System.out.println("Você saiu. Até logo!");
                scanner.close();
                break;
            }
        }
    }
}
