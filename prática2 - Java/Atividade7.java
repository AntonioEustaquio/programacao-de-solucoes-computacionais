package prática2;
import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double a, b, c, Discriminante;
		System.out.print ("Informe a");
		a = input.nextDouble();
		
		System.out.print ("Informe b");
		b = input.nextDouble();
		
		System.out.print ("Informe c");
		c = input.nextDouble();
		
		Discriminante = b * b - 4 * a * c;
					
		if (a == 0 && b == 0 && c == 0) {
			System.out.println ("igualdade Confirmada: 0 = 0");
		
		} else if (a == 0 && b == 0 && c != 0 ) {
			System.out.println ("Coeficientes informados incorretamente");
		
		} else if (a == 0 && b != 0) {
			double raiz = -c / b;
		
			System.out.println ("Esta é uma equação de primeiro grau");
			System.out.println ("raiz da equação: x= -c / b " + raiz);
			
		} else {
			System.out.println ("Está é uma ecuação de segundo grau");
			
		if (Discriminante <0) {
			System.out.println ("Esta equação não possui raízes reais");
			
		} else if (Discriminante == 0) {
			
				double raiz = -b / (2 * a);
		
			System.out.println ("Esta equação possui duas raízes reais iguais");
			System.out.println ("Raízes da equação (x1 = x2" + raiz);
		} else { 
			  double raiz1 = (-b + Math.sqrt(Discriminante)) / (2 * a);
              double raiz2 = (-b - Math.sqrt(Discriminante)) / (2 * a);
              System.out.println("Esta equação possui duas raízes reais diferentes.");
              System.out.println("Raízes da equação (x1): " + raiz1);
              System.out.println("Raízes da equação (x2): " + raiz2);
		   }
		
	   }

   }

}	