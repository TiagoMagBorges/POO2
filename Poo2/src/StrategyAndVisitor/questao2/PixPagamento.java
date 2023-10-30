package StrategyAndVisitor.questao2;

public class PixPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.printf("R$%.2f pago com Pix.\n", valor);
    }
}
