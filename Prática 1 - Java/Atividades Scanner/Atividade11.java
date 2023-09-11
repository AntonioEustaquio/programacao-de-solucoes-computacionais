package atividade1calculadora;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int vezes0, vezes1, vezes2, vezes3, vezes4, vezes5, vezes6, vezes7, vezes8, vezes9, vezes10;
		
		System.out.print ("tabuada de : ");
		int número = input.nextInt();
		vezes0 = número * 0;
		vezes1 = número * 1;
		vezes2 = número * 2;
		vezes3 = número * 3;
		vezes4 = número * 4;
		vezes5 = número * 5;
		vezes6 = número * 6;
		vezes7 = número * 7;
		vezes8 = número * 8;
		vezes9 = número * 9;
		vezes10 = número * 10;
		System.out.println (número + vezes0);
		System.out.println (número + vezes1);
		System.out.println (número + vezes2);
		System.out.println (número + vezes3);
		System.out.println (número + vezes4);
		System.out.println (número + vezes5);
		System.out.println (número + vezes6);
		System.out.println (número + vezes7);
		System.out.println (número + vezes8);
		System.out.println (número + vezes9);
		System.out.println (número + vezes10);
	}


}
