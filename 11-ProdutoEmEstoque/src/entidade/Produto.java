package entidade;

public class Produto {
	public String nome;
	public double valor;
	public int quantidade;
	
	public double ValorTotalEmEstoque() {
		return valor * quantidade;
	}
	
	public void AddProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void RemoverProduto(int quantidade){
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + " , $ " + String.format("%.2f", valor) + " , " + quantidade + " unidades , Total: $" + String.format("%.2f", ValorTotalEmEstoque()) ;
	}
	
	
}
