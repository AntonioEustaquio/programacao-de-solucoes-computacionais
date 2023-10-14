package atividade2;

public class Retangulo {
	private float altura, largura, area, perimetro;
	

	public Retangulo() {
		altura = 0;
		largura = 0;
		area = 0;
		perimetro = 0;
	}

	public float getAltura() {
		return (altura);
	}

	public void setAltura(float alt) {
		altura = alt;
	}

	public float getLargura() {
		return (largura);
	}

	public void setLargura(float larg) {
		largura = larg;
	}
	
	public float calculaArea() {
		area = altura * largura;
		return area;	
	}
	
	public float calculaPerimetro() {
		perimetro =  2 * (altura + 2 * largura);
		return perimetro;	
	}
	public void exibe() {
		System.out.println("Altura: " + altura);
		System.out.println("Largura: " + largura);
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
	}
}

