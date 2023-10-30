package StrategyAndVisitor.questao3;

public class PrintVisitor implements Visitor{
    @Override
    public void visit(Carro c) {
        System.out.println("===========Carro===========");
        System.out.printf("Cor: %s\n", c.getCor());
        System.out.printf("Marca: %s\n", c.getMarca());
        System.out.printf("Modelo: %s\n", c.getModelo());
        System.out.println("===========================");
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("===========Onibus==========");
        System.out.printf("Assentos: %d\n", o.getQtdLugares());
        System.out.printf("Ano de Fabricacao: %s\n", o.getAnoFabricacao());
        System.out.println("===========================");
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("==========Bicicleta========");
        System.out.printf("Cor: %s\n", b.getCor());
        System.out.println("===========================");
    }
}
