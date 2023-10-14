package prática2while;
import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Escolha uma operação:");
            System.out.println("1 - Somar os dois números.");
            System.out.println("2 - Multiplicar os dois números.");
            System.out.println("3 - Subtrair o número maior pelo número menor.");
            System.out.println("4 - Dividir o primeiro número pelo segundo.");

            int escolha = scanner.nextInt();

            double resultado;

            switch (escolha) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 3:
                    resultado = Math.abs(num1 - num2); // Subtrai o maior pelo menor
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }

            System.out.print("Deseja fazer outra operação? (S para sim, N para não): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        scanner.close();
    }
}
