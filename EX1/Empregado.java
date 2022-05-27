package PROVA_OO;

public class Empregado {
	private String nome;
	private String sobrenome;
    private Double salario;
    
    public Empregado(){
    	this.nome = "";
    	this.sobrenome = "";
    	this.salario = 0.0;
    }
    
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public Double getSalario() {
		return salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setSalario(Double salario) {
		if(salario < 0) {
			salario = 0.0;
		} else {
			this.salario = salario;
		}
	}
}
