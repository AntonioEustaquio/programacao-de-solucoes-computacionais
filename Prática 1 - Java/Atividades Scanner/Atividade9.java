package atividade1calculadora;
import java.util.Scanner;
public class Atividade9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print ("cateto oposto: ");
		double cateto1 = input.nextDouble();
		
		System.out.print ("cateto adjacente: ");
		double cateto2 = input.nextDouble();
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.print ("A hipotenusa é " + hipotenusa);
	}

}
