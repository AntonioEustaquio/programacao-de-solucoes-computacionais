package prática1_JOptionpane;
import javax.swing.JOptionPane;

public class Atividade9 {
    public static void main(String[] args) {
        
        String cateto1Str = JOptionPane.showInputDialog("Digite o valor do primeiro cateto:");

        
        double cateto1 = Double.parseDouble(cateto1Str);

        
        String cateto2Str = JOptionPane.showInputDialog("Digite o valor do segundo cateto:");

        
        double cateto2 = Double.parseDouble(cateto2Str);

        
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        
        String mensagem = "Valor do primeiro cateto: " + cateto1 + "\n";
        mensagem += "Valor do segundo cateto: " + cateto2 + "\n";
        mensagem += "Hipotenusa: " + hipotenusa;

        
        JOptionPane.showMessageDialog(null, mensagem);

       
        System.exit(0);
    }
}

