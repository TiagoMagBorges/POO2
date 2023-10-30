package StrategyAndVisitor.questao2;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        PagamentoStrategy pix = new PixPagamento();
        FreteStrategy sedex = new SedexFrete();

        c.adicionaItem(new Item("RTX 3060", 1899.99));
        c.adicionaItem(new Item("Ryzen 7", 1299.99));
        c.adicionaItem(new Item("Monitor Samsung", 899.00));

        c.realizaPagamento(pix, sedex);
    }
}
