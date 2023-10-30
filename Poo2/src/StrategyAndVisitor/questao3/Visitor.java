package StrategyAndVisitor.questao3;

public interface Visitor {
    void visit(Carro c);
    void visit(Onibus o);
    void visit(Bicicleta b);
}
