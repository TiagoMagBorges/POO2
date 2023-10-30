package StrategyAndVisitor.questao3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PrintVisitor pv = new PrintVisitor();
        AvisarDonoVisitor av = new AvisarDonoVisitor();
        Pessoa p1 = new Pessoa("Tiago");
        Pessoa p2 = new Pessoa("Joao");
        Pessoa p3 = new Pessoa("Lucas");
        Carro carro = new Carro(p1, "Preto", "Honda", "Civic");
        Bicicleta bicicleta = new Bicicleta(p2, "Azul");
        Onibus onibus = new Onibus(p3, 40, "2010");
        carro.accept(pv);
        carro.accept(av);
        bicicleta.accept(pv);
        bicicleta.accept(av);
        onibus.accept(pv);
        onibus.accept(av);
    }
}
