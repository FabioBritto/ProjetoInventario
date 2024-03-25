package inventario;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		String tempName;
		int tempNumber;
		int tempQuantidade;
		double tempPreco;
		
		
		System.out.println("Por favor, digite o nome do Produto:");
		tempName = sc.next();
		System.out.println("Agora, por favor, insira o código do Produto:");
		tempNumber = sc.nextInt();
		System.out.println("Também precisamos que forneça a quantidade de Produtos disponíveis:");
		tempQuantidade = sc.nextInt();
		System.out.println("Por último, por favor, declare o preço do Produto:");
		tempPreco = sc.nextDouble();
		
		Produto prod1 = new Produto(tempName,tempNumber,tempQuantidade,tempPreco);
		
		
		Produto prod2 = new Produto();
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
		
		sc.close();
	}
}
