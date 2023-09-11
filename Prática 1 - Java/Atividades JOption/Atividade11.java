package prática1_JOptionpane;
import javax.swing.JOptionPane;

public class Atividade11 {

	public static void main(String[] args) {
	
		
		String número_str = JOptionPane.showInputDialog ("digite o número: ");
		int número = Integer.parseInt(número_str);
		String mensagem = "Tabuada de multiplicação para" + número + ":\n";
		
		 for (int i = 1; i <= 10; i++) {
	            int resultado = número * i;
	            mensagem += número + " x " + i + " = " + resultado + "\n";
		 }
		JOptionPane.showMessageDialog(null, mensagem);
    }
}

