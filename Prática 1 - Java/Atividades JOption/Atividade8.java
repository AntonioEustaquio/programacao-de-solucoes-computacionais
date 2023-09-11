package prática1_JOptionpane;

import javax.swing.JOptionPane;

public class Atividade8 {
    public static void main(String[] args) {
        
        String pesoStr = JOptionPane.showInputDialog("Digite o peso atual da pessoa:");

        
        double pesoAtual = Double.parseDouble(pesoStr);

      
        double pesoEngordar = pesoAtual * 1.15;

      
        double pesoEmagrecer = pesoAtual * 0.80;

       
        String mensagem = "Peso atual: " + pesoAtual + " kg\n";
        mensagem += "Se a pessoa engordar 15%, o novo peso será: " + pesoEngordar + " kg\n";
        mensagem += "Se a pessoa emagrecer 20%, o novo peso será: " + pesoEmagrecer + " kg";

        
        JOptionPane.showMessageDialog(null, mensagem);

        
        System.exit(0);
    }
}

