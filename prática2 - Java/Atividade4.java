package prática2;
import javax.swing.JOptionPane;

public class Atividade4 {

	public static void main(String[] args) {
		
		double IMC;
		
		String pesostr = JOptionPane.showInputDialog("Informe seu peso:");
		String alturastr = JOptionPane.showInputDialog("Informe sua altura:");
		
		double peso = Double.parseDouble (pesostr);
		double altura = Double.parseDouble (alturastr);
		IMC = peso / (altura * altura);
		if (IMC < 20)
			 JOptionPane.showMessageDialog(null,"Você está abaixo do peso.");
		
		else if (IMC >= 20 && IMC <= 25)
			 JOptionPane.showMessageDialog(null,"Seu peso está normal.");
		
		else if (IMC >25 && IMC <= 30)
			JOptionPane.showMessageDialog(null,"Você está com sobrepeso.");
		
		else if (IMC == 30 && IMC <= 40)
			 JOptionPane.showMessageDialog(null,"Você está obeso.");
		
		else
			 JOptionPane.showMessageDialog(null,"seus resultados apresentam que você está no estado de obesidade mórbida.");
		
	}

}
