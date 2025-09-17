package aulas;

import javax.swing.JOptionPane;

public class Produto {
    private String descricao;
    private double valor;
    private int quantidade;

    public Produto(String descricao, double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double calcularIcms() {
        return (valor * quantidade) * 0.12;
    }

    public double calcularTotal() {
        return valor * quantidade;
    }

    public static void main(String[] args) {
        String encerrar = "N";
        while (!encerrar.equalsIgnoreCase("S")) {
            String descricao = JOptionPane.showInputDialog("Digite a descrição do produto:");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));

            Produto p = new Produto(descricao, valor, quantidade);

            String msg = "Descrição: " + descricao
                       + "\nValor: " + valor
                       + "\nTotal: " + p.calcularTotal()
                       + "\nICMS: " + p.calcularIcms();

            JOptionPane.showMessageDialog(null, msg);

            encerrar = JOptionPane.showInputDialog("Deseja encerrar o programa? (S/N)");
        }
    }
}
