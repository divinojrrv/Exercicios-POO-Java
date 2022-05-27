package PROVA_OO;

import java.util.Scanner;

public class Pedido {
    private Produto[] itens = new Produto[50];
    private int quantidadeItens = 0;

    public void adicionarItens(Produto produto, int quantidade){
        for (int i = 0; i < quantidade; i++){
            itens[quantidadeItens] = produto;
            quantidadeItens++;
        }
    }
    
    public double getTotal(){
        float total = 0;
        for(int i = 0; i < quantidadeItens; i++){
            total += itens[i].getPreco();
        }
        return total;
    }

    public void pagarPedido(){
        String metodoDePagamento;
        double dinheiroRecebido;
        
        Scanner Ler = new Scanner(System.in);
        
        System.out.println("Digite o metodo de pagamento: ");
        metodoDePagamento = Ler.nextLine();

        switch(metodoDePagamento){
        
            case "cartao":
                System.out.printf("O total da compra foi %.2f\n", this.getTotal());
                System.out.println("Insira o cartao");
                System.out.println("Insira a senha");
                System.out.println("Pagamento aprovado");
                break;
                
            case "dinheiro":
                System.out.printf("O total do seu pedido é: %.2f. \n", this.getTotal());
                dinheiroRecebido = Ler.nextDouble();
                if (dinheiroRecebido >= this.getTotal()){
                    System.out.printf("Seu troco foi de %.2f", (dinheiroRecebido - this.getTotal()));
                    System.out.println("Aproveite!");
                }
                else{
                    System.out.println("Pagamento Insuficiente");
                }
                break;
                
            case "cheque":
            System.out.println("Obrigado por comprar conosco!");
            break;
            
        }
        Ler.close();
    }
}