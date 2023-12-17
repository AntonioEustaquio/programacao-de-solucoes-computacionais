package prática2;
import java.util.Scanner;
public class Atividade14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o comando Git (clone, fetch ou pull): ");
        String gitCommand = input.nextLine();

        switch (gitCommand) {
            case "clone":
                System.out.println("Comando Git: git clone");
                System.out.println("Explicação: Clona um repositório Git existente para um novo diretório.");
                System.out.println("Exemplo: git clone https://github.com/usuario/meu-repositorio.git");
                break;
            case "fetch":
                System.out.println("Comando Git: git fetch");
                System.out.println("Explicação: Busca os commits mais recentes de um repositório remoto.");
                System.out.println("Exemplo: git fetch origin");
                break;
            case "pull":
                System.out.println("Comando Git: git pull");
                System.out.println("Explicação: Busca e mescla automaticamente os commits mais recentes de um repositório remoto com o branch local.");
                System.out.println("Exemplo: git pull origin master");
                break;
            default:
                System.out.println("Comando Git não reconhecido.");
        }

        input.close();
		}

	}


