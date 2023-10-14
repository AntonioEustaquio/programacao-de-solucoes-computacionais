package prática3;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		
	
		while(true) {
			System.out.print(" Informe a matrícula (ou matrícula negativa para sair): ");
			int matrícula = input.nextInt();
			
				if(matrícula < 0) {
				break;	
				}
				System.out.print("Informe a primeira nota: ");
				int nota1 = input.nextInt();
				System.out.print("Informe a segunda nota: ");
				int nota2 = input.nextInt();
				System.out.print("Informe a segunda nota: ");
				int nota3 = input.nextInt();
				
				int média = (nota1 + nota2 + nota3) /3;
				
				if (média >= 70) {
					System.out.print("Aluno com matrícula " + matrícula + " aprovado.");
				} else if (média >= 60 && média < 70) {
					System.out.print("Aluno com matrícula " + matrícula + " está em recuperação.");
				} else  {
					System.out.print("Aluno com matrícula " + matrícula + " está Reprovado.");
				}
		     }	
				
	
	
		
	
	
	}
	

}
