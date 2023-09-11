package prática1_JOptionpane;
import javax.swing.JOptionPane;
public class Atividade7 {

	public static void main(String[] args) {
		double salário_Mínimo, qnt_Salários_Mínimos;
		String salário_funcionário_string = JOptionPane.showInputDialog ("valor salário do funcionário");
		double salário_funcionário = Double.parseDouble (salário_funcionário_string);
		salário_Mínimo = 1320;
		qnt_Salários_Mínimos = salário_funcionário / salário_Mínimo;
		JOptionPane.showMessageDialog (null,"O funcionário recebe" + qnt_Salários_Mínimos + "salários mínimos");
		
	}

}
