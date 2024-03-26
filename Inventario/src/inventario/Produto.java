package inventario;

public class Produto {

	//Declarações de campo de instância
	private String nomeProduto;
	private int idProduto;
	private int qtdeProduto;
	private double precoProduto;
	private boolean ativo;
	
	//Construtor padrão, declarado sem nada dentro.
	public Produto() {
		//Eu poderia não colocar nada aqui que ele já deixarias as variáveis vazias ou null.
		nomeProduto = "";
		idProduto = 0;
		qtdeProduto = 0;
		precoProduto = 0.0;
		ativo = true;
	}
	public Produto(String nomeProduto,int idProduto,int qtdeProduto,double precoProduto, boolean ativo) {
		
		this.nomeProduto = nomeProduto;
		this.idProduto = idProduto;
		this.qtdeProduto = qtdeProduto;
		this.precoProduto = precoProduto;
		this.ativo = true;
	}
	/**
	 * Esses serão métodos ACESSADORES. Utilizo eles pra poder acessar valores.
	 * 
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public int getQtdeProduto() {
		return qtdeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public boolean getAtivo() {
		return ativo;
	}
	/**
	 * Esses métodos são MODIFICADORES. Utilizo eles pra setar os valores nas variáveis.
	 * Eles são declarados com VOID pois não me retornam nenhum dado.
	 */
	public void setNomeProduto(String nome) {
		this.nomeProduto = nome;
	}
	public void setIdProduto(int id) {
		this.idProduto = id;
	}
	public void setQtdeProduto(int quantidade) {
		this.qtdeProduto = quantidade;
	}
	public void setPrecoProduto(double preco) {
		this.precoProduto = preco;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String toString() {
		return "ID do Produto:\t" + idProduto +
			   "\nNome do Produto:\t" + nomeProduto +
			   "\nQuantidade em estoque:\t" + qtdeProduto +
			   "\nPreço do Produto:\t" + precoProduto +
			   "\nStatus do Produto:\t" + ativo;
	}
}
