package prática1_JOptionpane;

import javax.swing.JOptionPane;

public class Atividade2 {

	public static void main(String[] args) {
	
		String nascimento_str = JOptionPane.showInputDialog ("informe seu ano de nascimento");
		int anoAtual = 2023;
		double nascimento = Double.parseDouble(nascimento_str);
		double idadeAtual = anoAtual - nascimento;
		double idade2050 = 2050 - nascimento;
		
		JOptionPane.showMessageDialog (null, "Idade do ano atual: " + idadeAtual);
		JOptionPane.showMessageDialog(null, "Idade em 2050: " + idade2050);
		
	}

}
