package aplicacao;
import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Retangulo meuRetangulo = new Retangulo();

		meuRetangulo.altura = 3;
		meuRetangulo.largura = 4;
		
		double area = meuRetangulo.area();
		double perimetro = meuRetangulo.perimetro();
		double diagonal = meuRetangulo.diagonal();
		
		System.out.println("A area desse retangulo é: " + area);
		System.out.println("O perimetro desse retangulo é: " + perimetro);
		
		System.out.println("A diagonal desse retangulo é: " + diagonal);
		
	}

}
