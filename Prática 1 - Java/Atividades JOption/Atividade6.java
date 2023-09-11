package prática1_JOptionpane;
import javax.swing.JOptionPane;
public class Atividade6 {

	public static void main(String[] args) {
		
		String celsius_str = JOptionPane.showInputDialog ("informe a temperatura em C°: ");
		double celsius = Double.parseDouble (celsius_str);
		double  faren = celsius * 1.8 + 32;
		JOptionPane.showMessageDialog (null, "Temperatura em F°: " +faren);
		
	}

}
