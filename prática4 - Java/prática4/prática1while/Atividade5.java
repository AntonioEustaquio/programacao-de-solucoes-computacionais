package prática1while;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe a diagonal maior do losango: ");
            double diagonalMaior = scanner.nextDouble();

            System.out.print("Informe a diagonal menor do losango: ");
            double diagonalMenor = scanner.nextDouble();

            double area = (diagonalMaior * diagonalMenor) / 2;

            System.out.println("A área do losango é: " + area);

            System.out.print("Deseja calcular a área para outro losango? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}
