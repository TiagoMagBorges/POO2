package StrategyAndVisitor.questao2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itens;

    public CarrinhoDeCompras(){
        this.itens = new ArrayList<Item>();
    }

    public void adicionaItem(Item item){
        this.itens.add(item);
    }

    public void removeaItem(Item item){
        this.itens.remove(item);
    }

    public double calculaTotal(){
        double soma = 0;
        for(Item i : itens)
            soma += i.getPreco();
        return soma;
    }

    public double calculaFrete(FreteStrategy strategy){
        return strategy.valorFrete();
    }

    public void realizaPagamento(PagamentoStrategy strategy, FreteStrategy freteStrategy){
        strategy.pagar(this.calculaTotal() + this.calculaFrete(freteStrategy));
    }
}
