package prática2;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner  (System.in);
		
		System.out.print ("nota do aluno: ");
		double nota = input.nextDouble();
		
		if (nota >= 7)
		    System.out.println("você foi aprovado! ");
		
		else
		    System.out.println("você foi reprovado! ");
			
			
	}

}
