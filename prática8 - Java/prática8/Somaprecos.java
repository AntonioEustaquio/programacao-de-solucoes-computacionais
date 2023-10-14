package prática8;

import java.util.Scanner;

public class Somaprecos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos preços deseja somar? ");
        int quantidadePrecos = scanner.nextInt();

        double[] precos = new double[quantidadePrecos];

        for (int i = 0; i < quantidadePrecos; i++) {
            System.out.print("Informe o preço " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        double soma = somarPrecos(precos);
        System.out.println("A soma dos preços é: " + soma);

        scanner.close();
    }

    public static double somarPrecos(double[] precos) {
        double soma = 0;
        for (double preco : precos) {
            soma += preco;
        }
        return soma;
    }
}
