package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario colaborador = new Funcionario();
		
		colaborador.nome = "Joao Silva";
		colaborador.salarioBruto = 6000;
		colaborador.imposto = 1000;
		
		System.out.printf("Funcionario: %s , salario liquido: R$ %.2f\n " , colaborador.nome , colaborador.salarioLiquido());
		System.out.println();
		
		System.out.print("Quantos porcento deseja acrescentar? ");
		
		
		double porcentagem = sc.nextDouble();
		colaborador.aumentarSalario(porcentagem);
		
		System.out.printf("\n[dados atualizados] Funcionario: %s , salario liquido: R$ %.2f " , colaborador.nome , colaborador.salarioLiquido());
		
		
		
		
		sc.close();

	}

}
