package atividade1;

public class Divisao {

	public static void dividir(int numerador, int denominador) throws ArithmeticException {
		if (denominador == 0) {
			throw new ArithmeticException("Erro: Divisão por zero não suportada. ");
		}
		if (numerador < 0) {
			
			throw new ArithmeticException("Erro: Dividendo menor que 0 não é permitido. ");
		}
		int resultado = numerador/denominador;
		System.out.println("Resultado: " + resultado);
	
	
	}
}
