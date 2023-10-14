package prática2while;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o lado 1 do triângulo: ");
            double lado1 = scanner.nextDouble();

            System.out.print("Digite o lado 2 do triângulo: ");
            double lado2 = scanner.nextDouble();

            System.out.print("Digite o lado 3 do triângulo: ");
            double lado3 = scanner.nextDouble();

            String tipoTriangulo;

            if (lado1 == lado2 && lado2 == lado3) {
                tipoTriangulo = "Equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                tipoTriangulo = "Isósceles";
            } else {
                tipoTriangulo = "Escaleno";
            }

            System.out.println("Tipo do triângulo: " + tipoTriangulo);

            // Pergunta se deseja identificar outro tipo de triângulo
            System.out.print("Deseja identificar outro tipo de triângulo? (S para Sim, N para Não): ");
            char opcao = scanner.next().charAt(0);
            if (opcao != 'S' && opcao != 's') {
                break; // Encerra o loop se a opção for diferente de 'S' ou 's'
            }
        }

        scanner.close();
    }
}

