package StrategyAndVisitor.questao2;

public class NormalFrete implements FreteStrategy{
    @Override
    public double valorFrete() {
        return 15;
    }
}
