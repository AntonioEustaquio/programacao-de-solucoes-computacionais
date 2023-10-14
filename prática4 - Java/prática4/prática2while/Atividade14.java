
package prática2while;
import java.util.Scanner;

public class Atividade14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Comandos Git disponíveis:");
            System.out.println("1. git clone");
            System.out.println("2. git fetch");
            System.out.println("3. git pull");
            System.out.print("Escolha um comando (1, 2, 3) ou digite 'sair' para encerrar: ");
            String comandoEscolhido = scanner.nextLine().trim();

            if (comandoEscolhido.equalsIgnoreCase("sair")) {
                break;
            }

            switch (comandoEscolhido) {
                case "1":
                    System.out.println("Comando: git clone");
                    System.out.println("Descrição: Cria uma cópia local de um repositório Git existente.");
                    System.out.println("Exemplo: git clone https://github.com/usuario/repositorio.git");
                    break;
                case "2":
                    System.out.println("Comando: git fetch");
                    System.out.println("Descrição: Baixa objetos e refs de outro repositório.");
                    System.out.println("Exemplo: git fetch origin");
                    break;
                case "3":
                    System.out.println("Comando: git pull");
                    System.out.println("Descrição: Recupera as alterações de um repositório remoto e as mescla com seu repositório local.");
                    System.out.println("Exemplo: git pull origin master");
                    break;
                default:
                    System.out.println("Comando inválido.");
            }

            System.out.print("Deseja visualizar outro comando? (S para sim, N para não): ");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        scanner.close();
    }
}
