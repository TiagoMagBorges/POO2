package StrategyAndVisitor.questao1;

public class BoletoPagamento implements PagamentoStrategy{
    @Override
    public void pagar(double valor) {
        System.out.printf("R$%.2f pago com Boleto.\n", valor);
    }
}
