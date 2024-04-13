package inventario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantProdutos=0;
		String tempName;
		int tempNumber;
		int tempQuantidade;
		double tempPreco;
		boolean ativo;
		
		do {
			System.out.println("Por favor, insira uma quantidade positiva de produtos que deseja adicionar:");
			quantProdutos = sc.nextInt();
			try {
				/*
				 * Aqui eu verifico o valor lido de quantProdutos
				 * Se o valor for igual a 0 eu LANÇO uma exeção
				 */
				if(quantProdutos == 0) {
					throw new InputMismatchException("Insira um número maior que zero!");
				}
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
			}
			
		}while(quantProdutos <= 0);
		
		
		
		System.out.println("Por favor, digite o nome do Produto:");
		tempName = sc.next();
		System.out.println("Agora, por favor, insira o código do Produto:");
		tempNumber = sc.nextInt();
		System.out.println("Também precisamos que forneça a quantidade de Produtos disponíveis:");
		tempQuantidade = sc.nextInt();
		System.out.println("Por último, por favor, declare o preço do Produto:");
		tempPreco = sc.nextDouble();
		
		//Preciso descobrir como referenciar o "getAtivo".
		Produto prod1 = new Produto(tempName,tempNumber,tempQuantidade,tempPreco,true);
		
		/*
		 * Apesar de no meu caso, eu não ter passado pelo mesmo erro que o projeto preveu,
		 * eu colocarei o "in.nextLine();" como forma de LIMPAR O BUFFER
		 */
		
		sc.nextLine();
		System.out.println("Por favor, digite o nome do Produto:");
		tempName = sc.next();
		System.out.println("Agora, por favor, insira o código do Produto:");
		tempNumber = sc.nextInt();
		System.out.println("Também precisamos que forneça a quantidade de Produtos disponíveis:");
		tempQuantidade = sc.nextInt();
		System.out.println("Por último, por favor, declare o preço do Produto:");
		tempPreco = sc.nextDouble();
		
		Produto prod2 = new Produto(tempName,tempNumber,tempQuantidade,tempPreco,true);
		
		Produto prod3 = new Produto("Sal",103,32,7.85,true);
		Produto prod4 = new Produto("Acúcar",104,23,10.35,true);
		Produto prod5 = new Produto("Refrigerante",105,83,7.99,true);
		Produto prod6 = new Produto("Leite",106,120,4.90,true);
		prod6.setAtivo(false);
	
		System.out.println(prod1.toString());
		System.out.println("\n"+ prod2.toString());
		System.out.println("\n"+ prod3.toString());
		System.out.println("\n"+ prod4.toString());
		System.out.println("\n"+ prod5.toString());
		System.out.println("\n"+ prod6.toString());
		
		sc.close();
	}
}
