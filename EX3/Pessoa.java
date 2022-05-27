package PROVA_OO;

public class Pessoa {
    String nome;
    int idade;

    //Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
   
    
    /*Inicio dos Metodos acessores */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /*Final dos Metodos acessores */
    
    
}
