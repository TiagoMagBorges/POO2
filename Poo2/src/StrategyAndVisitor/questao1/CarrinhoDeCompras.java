package StrategyAndVisitor.questao1;

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

    public void realizaPagamento(PagamentoStrategy strategy){
        strategy.pagar(this.calculaTotal());
    }
}
