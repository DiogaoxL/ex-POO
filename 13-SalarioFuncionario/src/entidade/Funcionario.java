package entidade;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		double liquido = salarioBruto - imposto;
		return liquido;
	}
	
	public void aumentarSalario( double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100;
	}
	
}
