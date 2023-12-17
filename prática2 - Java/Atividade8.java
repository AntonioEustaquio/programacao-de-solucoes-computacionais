package prática2;

import javax.swing.JOptionPane;



public class Atividade8 {

    public static void main(String[] args) {
      
        double[] precos = { 99.99, 103.89, 49.98, 89.72, 97.35 };

       
        

       
        String codigoProduto = JOptionPane.showInputDialog("Informe o código do produto (1 a 5):");

    
        int codigo = Integer.parseInt(codigoProduto);
        if (codigo < 1 || codigo > 5) {
            JOptionPane.showMessageDialog(null, "Código de produto inválido.");
            return;
        }

       
        int indice = codigo - 1;

        
        String produto = "";
        switch (codigo) {
            case 1:
                produto = "Sapato";
                break;
            case 2:
                produto = "Bolsa";
                break;
            case 3:
                produto = "Camisa";
                break;
            case 4:
                produto = "Calça";
                break;
            case 5:
                produto = "Blusa";
                break;
            default:
                break;
        }

        JOptionPane.showMessageDialog(null, "O preço do " + produto + " é: R$ " + precos[indice]);
    }


}


