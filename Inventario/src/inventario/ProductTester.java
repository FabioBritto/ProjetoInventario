package inventario;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Produto produtos[];
		int maxSize = -1;
		String tempName;
		int tempNumber;
		int tempQuantidade;
		double tempPreco;
		boolean ativo;

		do {
			try {
				System.out.println("Por favor, insira uma quantidade positiva de produtos que deseja adicionar:\n"
						+ "Insira 0(zero) se não quiser adicionar produtos");
				maxSize = sc.nextInt();
				try {
					/*
					 * Aqui eu verifico o valor lido de maxSize Se o valor for igual a 0 eu LANÇO
					 * uma exeção
					 */
					if (maxSize == 0) {
						throw new Exception("Ok! Sem produtos a adicionar!");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					// break;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Tipo incorreto de dados inseridos!");
			}
		} while (maxSize < 0);
		
		//Posso construir o ARRAY fora do if ou dentro
		produtos = new Produto[maxSize];
		if(maxSize != 0) {
			//produtos = new Produto[maxSize];
			for(int i = 0;i< produtos.length;i++) {
				sc.nextLine();
				System.out.println("Por favor, digite o nome do Produto:");
				tempName = sc.nextLine();
				//sc.nextLine();
				System.out.println("Agora, por favor, insira o código do Produto:");
				tempNumber = sc.nextInt();
				System.out.println("Também precisamos que forneça a quantidade de Produtos disponíveis:");
				tempQuantidade = sc.nextInt();
				System.out.println("Por último, por favor, declare o preço do Produto:");
				tempPreco = sc.nextDouble();
				Produto prod = new Produto(tempName,tempNumber,tempQuantidade,tempPreco,true);
				produtos[i] = prod;
			}

		}
		else {
			System.out.println("Não há produtos!");
		}
		for(Produto prod : produtos) {
			System.out.println(prod);
		}
		sc.close();
	}
	public static void displayInventory(Produto[] produto) {
		
	}
}
