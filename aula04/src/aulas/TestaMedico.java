package aulas;

public class TestaMedico {
	public static void main(String[] args) {
        Medico m1 = new Medico(12345, "Ana Maria", 0, 250);
        Medico m2 = new Medico(456789, "Antônio", 0, 300);

        m1.pagamentoDinheiro();
        m2.pagamentoPlano();

        m1.exibirDados();
        m2.exibirDados();

        System.out.println("Número total de médicos: " + Medico.getTotalMedicos());
    }
}
