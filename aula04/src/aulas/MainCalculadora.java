package aulas;

import javax.swing.JOptionPane;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int opcao = 0;

        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair"));

            if (opcao == 5) break;

            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número:"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número:"));

            double resultado = calc.calcular(opcao, n1, n2);

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
    }
}
