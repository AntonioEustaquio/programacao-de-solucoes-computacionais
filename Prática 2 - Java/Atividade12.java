package prática2; 

import java.util.Scanner;

public class Atividade12 {

	 public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);




System.out.print("Informe seu sexo: ");
		        String sexo = input.next();

		        System.out.print("Informe sua idade: ");
		        int idade = input.nextInt();
		        double mensalidade = 0.0;

		        if (sexo.equalsIgnoreCase("Masculino")) {  
		            if (idade <= 15) {
		                mensalidade = 60.00;
		            } else if (idade >= 16 && idade <= 18) {
		                mensalidade = 75.00;
		            } else if (idade >= 19 && idade <= 30) {
		                mensalidade = 90.00;
		            } else if (idade >= 31 && idade <= 40) {
		                mensalidade = 85.00;
		            } else {  
		                mensalidade = 80.00;
		            }
		        } else if (sexo.equalsIgnoreCase("Feminino")) {  
		            if (idade <= 18) {
		                mensalidade = 60.00;
		            } else if (idade >= 19 && idade <= 25) {
		                mensalidade = 90.00;
		            } else if (idade >= 26 && idade <= 40) {
		                mensalidade = 85.00;
		            } else {  
		                mensalidade = 80.00;
		            }
		        } else {
		            System.out.println("Sexo não reconhecido.");
		            return;
		        }

		        System.out.println("A mensalidade a ser paga é: R$ " + mensalidade);

		        input.close();
		        
		        
    }
	 
	  
}
		        