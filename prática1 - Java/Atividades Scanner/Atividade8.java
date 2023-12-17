package atividade1calculadora;

import java.util.Scanner;

public class Atividade8 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    double peso_15, peso_maior, peso_20, peso_menor;
    System.out.print("coloque seu peso: ");
    double peso_pessoa = input.nextDouble();
    peso_15 = peso_pessoa * 0.15;
    peso_maior = peso_pessoa + peso_15;
    System.out.print ("Seu peso com +15% é " + peso_maior + ". ");   
    peso_20 = peso_pessoa * 0.15;
    peso_menor = peso_pessoa - peso_20;
System.out.println ("Seu peso com -20% é " + peso_menor + ".");

	}

}
