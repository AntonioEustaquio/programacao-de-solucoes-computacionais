package prática1_JOptionpane;

import javax.swing.JOptionPane;


public class Atividade10{
	
    public static void main(String[] args) {
        
        String raioStr = JOptionPane.showInputDialog("Digite o raio da esfera:");

       
        double raio = Double.parseDouble(raioStr);
        double comprimento = 2 * Math.PI * raio;      
        double area = Math.PI * Math.pow(raio, 2);      
        double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

        
        String mensagem = "Raio da esfera: " + raio + "\n";
        mensagem += "Comprimento da esfera: " + comprimento + "\n";
        mensagem += "Área da esfera: " + area + "\n";
        mensagem += "Volume da esfera: " + volume;

        
        JOptionPane.showMessageDialog(null, mensagem);

        
        System.exit(0);
    }
}
