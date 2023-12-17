package prática2;
import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		
		String notastr = JOptionPane.showInputDialog ("Digite sua nota: ");
		
		int nota = Integer.parseInt (notastr);
		
		if (nota >= 7 && nota <= 10) 
			JOptionPane.showMessageDialog (null,"Você foi aprovado! ");
				
		else if (nota >= 3 && nota < 7)
			JOptionPane.showMessageDialog (null, "Você irá fazer exame! ");
		
		else if (nota >= 0 && nota < 3)
			JOptionPane.showMessageDialog (null, "Você foi reprovado! ");
			

	}

}
