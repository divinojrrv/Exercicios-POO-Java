package PROVA_OO;

public class Ex2_Supermercado {
   public static void main(String[] args){
        Produto leite = new Produto("leite", 12, 2);
        Produto cafe = new Produto("cafe", 4, 7);
        Pedido pedido = new Pedido();
        
        
        pedido.adicionarItens(leite, 2);
        pedido.adicionarItens(cafe, 5);

        pedido.pagarPedido();
   }
}