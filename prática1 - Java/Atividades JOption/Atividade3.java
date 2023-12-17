package prática1_JOptionpane;
import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		
		String resultado_str = JOptionPane.showInputDialog ("quantidade em dólares: ");
		double resultado = Double.parseDouble (resultado_str);
		double dólar_em_real = 4.99;
		double reais = resultado * dólar_em_real;
		JOptionPane.showMessageDialog (null, "você tem em reais: R$" + reais);
	}

}
