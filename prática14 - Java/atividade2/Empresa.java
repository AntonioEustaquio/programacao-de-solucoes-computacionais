package atividade2;

public class Empresa {
	private static final int MAX_EMPS = 1000;
	private int numEmps;
	private Empregado[] emps;

	public Empresa() {
		emps = new Empregado[MAX_EMPS];
		numEmps = 0; // número de empregados na lista
	}

	public void adicionaEmpregado(Empregado emp) {
		if (numEmps == MAX_EMPS)
			return; // lista cheia
		emps[numEmps] = emp;
		numEmps++;
	}

	public void reajustaSalarios(double perc) {
		for (int i = 0; i < numEmps; i++)
			emps[i].reajustaSalario(perc);
	}

	public String mostrEmpregados() {
		String result = "\n";
		for (int i = 0; i < numEmps; i++)

			result = result + emps[i];
		return result;
	}
}
