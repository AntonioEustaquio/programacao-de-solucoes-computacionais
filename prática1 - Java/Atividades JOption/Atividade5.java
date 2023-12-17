package prática1_JOptionpane;

import javax.swing.JOptionPane;

public class Atividade5 {

	public static void main(String[] args) {
		
		String diagonal_maior_str = ("diagonal maior");
		String diagonal_menor_str = ("diagonal menor");
		
		double diagonal_maior = Double.parseDouble(diagonal_maior_str);
		double diagonal_menor = Double.parseDouble(diagonal_menor_str);
		
		JOptionPane.showMessageDialog (null, "a área do losango é" + diagonal_maior + diagonal_menor /2);
	}

}
