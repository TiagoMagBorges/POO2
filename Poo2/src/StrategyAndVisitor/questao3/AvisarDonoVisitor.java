package StrategyAndVisitor.questao3;

public class AvisarDonoVisitor implements Visitor{
    @Override
    public void visit(Carro c) {
        c.avisarDono("Favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Onibus o) {
        o.avisarDono("Atencao para atualizacao das licencas");
    }

    @Override
    public void visit(Bicicleta b) {
        b.avisarDono("Comemore no parque o dia do ciclismo");
    }
}
