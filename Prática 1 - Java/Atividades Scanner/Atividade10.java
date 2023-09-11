package atividade1calculadora;
import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.print ("raio da esfera: ");
		double raio = input.nextDouble();
		double comprimento = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow (raio, 2);
		double volume = (3.0 / 4.0) *Math.PI * Math.pow(area, 3);
		
		System.out.println ("comprimento da esfera" + comprimento);
		System.out.println ("comprimento da area" + area);
		System.out.println ("comprimento do volume" + volume);
	}
			
	
}