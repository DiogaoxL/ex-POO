package aplicacao;
import java.util.*;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Valor: ");
		produto.valor = sc.nextDouble();
		
		System.out.print("Qnt no estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto + "\n");
		
		System.out.print("Digite a quantidade de produtos que deseja adicionar ao estoque: " );
		int quantidade = sc.nextInt();
		produto.AddProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizado: " + produto);
		
		System.out.print("Digite a quantidade de produtos que deseja remover ao estoque: " );
		quantidade = sc.nextInt();
		produto.RemoverProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizado: " + produto);
		
		sc.close();

	}

}
