package PROVA_OO;

public class Produto {
	
	private double preco;
	private double quantidade;
	private String descricao;
	
    public Produto(String descricao, double preco, double quantidade){
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
	
	public double getQuantidade() {
		return quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
}
