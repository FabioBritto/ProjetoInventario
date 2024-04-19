package inventario;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Produto produtos[];
		int maxSize;
				
		getMenuOption(sc);
		
		maxSize = getNumProducts(sc);
		//Posso construir o ARRAY fora do if ou dentro
		produtos = new Produto[maxSize];
		if(maxSize != 0) {
			
			addToInventory(produtos,sc);

		}
		else {
			System.out.println("Não há produtos!");
		}
		displayInventory(produtos);
		sc.close();
	}
	public static int getMenuOption(Scanner sc) {
		int resp=-1;
		do {
			try {
				System.out.println("----MENU PRINCIPAL----\n" +
						   "\n" +
						   "1.EXIBIR INVENTÁRIO\n" +
						   "2.ADICIONAR ESTOQUE\n" +
						   "3.DEDUZIR ESTOQUE\n" +
						   "4.DESCONTINUAR PRODUTO\n" +
						   "0.SAIR\n" +
						   "\n" +
						   "INSIRA UMA OPÇÃO DO MENU:\n");
				resp = sc.nextInt();
				try {
					if(resp ==0) {
						throw new Exception("Ok! Até logo!");
						//É aqui que eu uso o FINALLY?
					}
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("Por favor, insira uma opção válida!");
			}
		} while(resp < 0 || resp > 4);
		return resp;
	}
	
	//Era pra retornar valor, mas aqui no caso já é um for each que imprime os produtos
	public static void displayInventory(Produto[] produto) {
		for(Produto prod : produto) {
			System.out.println(prod);
		}
	}
	public static void addToInventory(Produto[] produto,Scanner sc) {
		String tempName;
		int tempNumber;
		int tempQuantidade;
		double tempPreco;
		boolean ativo;
		for(int i = 0;i< produto.length;i++) {
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
			produto[i] = prod;
		}
	}
	/*
	 * O método ficou estático por ORDENS DO ECLIPSE
	 * Acho que entendi porque...
	 * O public static void main É STATIC. E um método
	 * static só pode chamar outro método static. Certo?
	 */
	public static int getNumProducts(Scanner sc) {
		int maxSize = -1;
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
		return maxSize;
	}
	public int getProductNumber(Produto[] produto,Scanner sc) {
		int productChoice = -1;
		for(int i = 0;i < produto.length;i++) {
			String nomeProduto = produto[i].getNomeProduto();
			System.out.println(i+1+ "º " + nomeProduto);
		}
		do {
			try {
				System.out.println("Por favor, escolha o produto pelo seu índice");
				productChoice = sc.nextInt();
				if(productChoice - 1 > 0 && productChoice - 1 < produto.length) {
					throw new Exception("Por favor, insira um índice válido!");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}while(productChoice - 1 > 0 && productChoice - 1 < produto.length);
		return productChoice;
	}
	public void addInventory(Produto[] produto, Scanner sc) {
		int productChoice;
		int updateValue = -1;
		
		productChoice = getProductNumber(produto, sc);
		do {
			try {
				System.out.println("Quantos produtos deseja adicionar?");
				updateValue = sc.nextInt();
				
				if(updateValue <= 0) {
					throw new Exception("Por favor, insira uma quantidade válida!");
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}while(updateValue <= 0);
	}
}
