package prática2;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print ("número de dias hospedado: ");
		int dias = input.nextInt();
		double diária = dias * 500;
		
		 if (dias < 15) {
			 System.out.format ("valor da diária + serviço: R$%.2f ", + diária + (dias * 15));
			 
		 } else if (dias == 15) {
			 System.out.format ("valor da diária + serviço: R$%.2f ", diária + (dias * 10));
			 
	     
	     } else if (dias > 15) {
	    	 System.out.format ("valor da diária + serviço: R$%.2f ", diária + (dias * 5));
	     
	     }
		 
	}

}
