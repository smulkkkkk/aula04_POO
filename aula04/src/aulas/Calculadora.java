package aulas;

public class Calculadora {
    public double calcular(int opcao, double n1, double n2) {
        switch (opcao) {
            case 1: return n1 + n2;
            case 2: return n1 - n2;
            case 3: return n1 * n2;
            case 4: return n1 / n2;
            default: return 0;
        }
    }
}
