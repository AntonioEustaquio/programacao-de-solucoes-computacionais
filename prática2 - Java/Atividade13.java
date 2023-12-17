package prática2;
import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Tipo de apartamento: ");
		String tipo_ap = input.next();
		double cobrança = 0.0;
		
		System.out.print("quantidade de dias hospedado: ");
		int quant_dias = input.nextInt();
		
		
		
		if(tipo_ap.equalsIgnoreCase("apsimples")) {
			if (quant_dias < 10) {
				cobrança = 100.0;			
		} else if(quant_dias >=10 && quant_dias < 15) {
				cobrança = 90.00;	
		} else {
				cobrança = 80.00;
		}		
		} else if(tipo_ap.equalsIgnoreCase("apduplo")) {
			if (quant_dias < 10) {
				cobrança = 140.0;			
		} else if(quant_dias >=10 && quant_dias < 15) {
				cobrança = 120.0;		
		} else {
				cobrança = 100.0;
		    }	
		} else {
			System.out.println("Apartamento não encontrado.");
			return;
		}
		System.out.format("O valor da diária é de: R$%.2f ", + cobrança);
			
		
		

		
		
		
		
	}
}

