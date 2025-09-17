package aulas;

public class Medico {
	
	    private int crm;
	    private String nome;
	    private double salario;
	    private double valorConsulta;
	    private static int totalMedicos = 0;

	    public Medico(int crm, String nome, double salario, double valorConsulta) {
	        this.crm = crm;
	        this.nome = nome;
	        this.salario = salario;
	        this.valorConsulta = valorConsulta;
	        totalMedicos++;
	    }


	    public void pagamentoDinheiro() {
	        this.salario += valorConsulta;
	    }

	    public void pagamentoPlano() {
	        this.salario += valorConsulta * 0.7;
	    }

	    public int getCrm() { return crm; }
	    public String getNome() { return nome; }
	    public double getSalario() { return salario; }
	    public double getValorConsulta() { return valorConsulta; }

	    public static int getTotalMedicos() {
	        return totalMedicos;
	    }

	    public void exibirDados() {
	        System.out.println("CRM: " + crm);
	        System.out.println("Nome: " + nome);
	        System.out.println("Salário: " + salario);
	        System.out.println("Valor da consulta: " + valorConsulta);
	        System.out.println("------------------------");
	    }
	}

