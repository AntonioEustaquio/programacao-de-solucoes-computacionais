package prática3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int totalPessoasAssistindo = 0;
        int canal;

       
        while (true) {
            System.out.print("Informe o número do canal (ou 0 para encerrar): ");
            canal = input.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.print("Informe o número de pessoas assistindo a este canal: ");
            int pessoasAssistindo = input.nextInt();

            totalPessoasAssistindo += pessoasAssistindo;
            System.out.println("Audiência para o canal " + canal + ": " + pessoasAssistindo + " pessoas.");
        }

        
        input.close();
        input = new Scanner(System.in);

        while (totalPessoasAssistindo > 0) {
            System.out.print("Informe o número do canal para calcular o percentual de audiência: ");
            canal = input.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.println("Percentual de audiência para o canal " + canal + ": " +
                    ((double) pessoasAssistindoNoCanal(canal) / totalPessoasAssistindo) * 100 + "%");
        }
    }

    
    private static int pessoasAssistindoNoCanal(int canal) {
        Scanner scanner = new Scanner(System.in);        System.out.print("Informe o número de pessoas assistindo ao canal " + canal + ": ");
        return scanner.nextInt();
    }
}