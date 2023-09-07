package Decorator.questao2;

import Decorator.questao1.*;

import java.util.ArrayList;

public class Cafeteria {
    public static void main(String[] args) {
        ArrayList<Cafe> cafes = new ArrayList<>();
        cafes.add(new Leite(new Canela(new Decaf())));
        cafes.add(new Chocolate(new Espresso()));

        for(Cafe c : cafes) {
            System.out.printf("%s\nPreco: R$%.2f\n", c.getDescricao(), c.custo());
        }
    }
}
