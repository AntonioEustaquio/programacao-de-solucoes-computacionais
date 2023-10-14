package atividade4;
import java.util.Scanner;
public class Circulo {
    private int x;
    private int y;
    private double raio;

    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public void moveX(int x1) {
        this.x += x1;
    }

    public void moveY(int y1) {
        this.y += y1;
    }

    public void aumenta(double n) {
        this.raio *= n;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    public String exibe() {
        return String.format("Centro: (%d, %d)%nRaio: %.2f%nÁrea: %.2f%nPerímetro: %.2f",
                this.x, this.y, this.raio, calcularArea(), calcularPerimetro());
    }

    public static void main(String[] args) {
        // Exemplo de utilização
        Circulo circulo = new Circulo();

        // Solicita ao usuário as coordenadas e o raio
        int x, y;
        double raio;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a coordenada x: ");
        x = scanner.nextInt();
        System.out.print("Informe a coordenada y: ");
        y = scanner.nextInt();
        System.out.print("Informe o raio: ");
        raio = scanner.nextDouble();

        Circulo circuloPersonalizado = new Circulo(x, y, raio);

        // Exibir menu
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar raio");
            System.out.println("3 - Exibir informações");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a quantidade para mover em x: ");
                    int moveX = scanner.nextInt();
                    System.out.print("Informe a quantidade para mover em y: ");
                    int moveY = scanner.nextInt();
                    circuloPersonalizado.moveX(moveX);
                    circuloPersonalizado.moveY(moveY);
                    break;
                case 2:
                    System.out.print("Informe o fator de aumento do raio: ");
                    double fator = scanner.nextDouble();
                    circuloPersonalizado.aumenta(fator);
                    break;
                case 3:
                    System.out.println(circuloPersonalizado.exibe());
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                   scanner.close();
            }
        }
    }
}
