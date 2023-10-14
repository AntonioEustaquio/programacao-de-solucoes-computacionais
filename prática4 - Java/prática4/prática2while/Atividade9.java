package prática2while;
import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha um planeta (1 - Terra, 2 - Marte, 3 - Júpiter): ");
            int escolhaPlaneta = input.nextInt();

            double gravidade;
            switch (escolhaPlaneta) {
                case 1: // Terra
                    gravidade = 9.81;
                    break;
                case 2: // Marte
                    gravidade = 3.71;
                    break;
                case 3: // Júpiter
                    gravidade = 24.79;
                    break;
                default:
                    System.out.println("Escolha de planeta inválida.");
                    input.close();
                    return;
            }

            System.out.print("Digite a velocidade inicial (m/s): ");
            double v0 = input.nextDouble();
            System.out.print("Digite o instante t (s): ");
            double t = input.nextDouble();

            double vt = v0 - gravidade * t;
            double ht = v0 * t - 0.5 * gravidade * t * t;

            System.out.println("Velocidade v(t) no instante t: " + vt + " m/s");
            System.out.println("Altura h(t) no instante t: " + ht + " m");

            System.out.print("Deseja calcular mais algum planeta? S para sim ou N para não: ");
            char opcao = input.next().charAt(0);
            if (opcao != 'S' && opcao != 's') {
                break;
            }
        }

        input.close();
    }
}

