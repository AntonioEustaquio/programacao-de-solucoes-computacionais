package prática2;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		System.out.println ("informe os lado do triângulo: ");
		double lado_1, lado_2, lado_3;
		
		lado_1 = input.nextDouble();
		lado_2 = input.nextDouble();
		lado_3 = input.nextDouble();
		
		
		if (lado_1 == lado_2 && lado_2 == lado_3)
		System.out.println ("Equilátero");
		
		else if (lado_1 == lado_2 || lado_1 == lado_3 || lado_2 == lado_3)
			System.out.println ("Isósceles");
		else 
			System.out.println ("Escaleno");
		  input.close();
		
		
	}

}
