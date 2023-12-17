package prática1_JOptionpane;
import javax.swing.JOptionPane;
public class Atividade4 {

	public static void main(String[] args) {
		double porcentagem, aumento;
		
		String salário_str = JOptionPane.showInputDialog ("informe seu salário");
		double salário = Double.parseDouble (salário_str);
		porcentagem = 0.25;
		aumento = salário * porcentagem;
		double novo_salário = salário + aumento;
		JOptionPane.showMessageDialog (null, "seu novo salário é: R$ " + novo_salário);
		

	}

}
