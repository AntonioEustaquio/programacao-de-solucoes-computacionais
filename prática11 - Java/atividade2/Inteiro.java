package atividade2;

public class Inteiro {
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        return (b >= 0) ? resultado : -resultado;
    }

    public int potencia(int a, int b) {
        if (b < 0) {
            return -1;  // Não é possível calcular potência negativa com inteiros
        }

        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }

        int resultado = 0;
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        while (absA >= absB) {
            absA = subtracao(absA, absB);
            resultado++;
        }

        return (a > 0 && b > 0 || a < 0 && b < 0) ? resultado : -resultado;
    }

    public int resto(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        while (absA >= absB) {
            absA = subtracao(absA, absB);
        }

        return (a >= 0) ? absA : -absA;
    }

    private int subtracao(int a, int b) {
        return a + (-b);
    }

    public static void main(String[] args) {
        Inteiro inteiro = new Inteiro();

        int a = 10;
        int b = 3;

        System.out.println("Multiplicação: " + inteiro.multiplicacao(a, b));
        System.out.println("Potência: " + inteiro.potencia(a, b));
        System.out.println("Divisão: " + inteiro.divisao(a, b));
        System.out.println("Resto: " + inteiro.resto(a, b));
    }
}
