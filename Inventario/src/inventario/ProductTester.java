package inventario;

public class ProductTester {

	public static void main(String[]args) {
		
		Produto prod1 = new Produto();
		Produto prod2 = new Produto();
		prod1.setNomeProduto("Arroz");
		prod1.setIdProduto(101);
		prod1.setQtdeProduto(43);
		prod1.setPrecoProduto(19.90);
		prod2.setNomeProduto("Feijão");
		prod2.setIdProduto(102);
		prod2.setQtdeProduto(58);
		prod2.setPrecoProduto(7.85);
		Produto prod3 = new Produto("Sal",103,32,7.85);
		Produto prod4 = new Produto("Acúcar",104,23,10.35);
		Produto prod5 = new Produto("Refrigerante",105,83,7.99);
		Produto prod6 = new Produto("Leite",106,120,4.90);
	
		System.out.println(prod1.toString());
		System.out.println("\n"+ prod2.toString());
		System.out.println("\n"+ prod3.toString());
		System.out.println("\n"+ prod4.toString());
		System.out.println("\n"+ prod5.toString());
		System.out.println("\n"+ prod6.toString());
		
	}
}
