package aulas;

import javax.swing.JOptionPane;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }

    public double calcularInss() {
        return salario * 0.11;
    }

    public double calcularValeTransporte() {
        return salario * 0.06;
    }

    public double calcularSalarioLiquido() {
        return salario - calcularInss() - calcularValeTransporte();
    }

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));

        Funcionario f = new Funcionario(nome, salario);

        String msg = "Nome: " + f.getNome()
                   + "\nSalário: " + f.getSalario()
                   + "\nINSS: " + f.calcularInss()
                   + "\nVale Transporte: " + f.calcularValeTransporte()
                   + "\nSalário líquido: " + f.calcularSalarioLiquido();

        JOptionPane.showMessageDialog(null, msg);
    }
}
