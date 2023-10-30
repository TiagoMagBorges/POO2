package StrategyAndVisitor.questao2;

public class SedexFrete implements FreteStrategy{
    @Override
    public double valorFrete() {
        return 30;
    }
}
