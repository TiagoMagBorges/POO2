package StrategyAndVisitor.questao2;

public class CartaoPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.printf("R$%.2f pago com Cartao.\n", valor);
    }
}
