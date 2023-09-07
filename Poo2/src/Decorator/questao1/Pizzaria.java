package Decorator.questao1;

import java.util.ArrayList;

public class Pizzaria {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Tomate(new Queijo(new Ovo(new MassaFinaPizza()))));
        pizzas.add(new Tomate(new Queijo(new MassaEspessaPizza())));

        for(Pizza p : pizzas) {
            System.out.printf("%s\nPreco: R$%.2f\n", p.getDescricao(), p.custo());
        }
    }
}
