package Wrapper.questao2;

public class CalculadoraBinariaAdapter implements Calculadora{
    CalculadoraBinaria calculadoraBinaria;

    public CalculadoraBinariaAdapter(CalculadoraBinaria calculadoraBinaria){
        this.calculadoraBinaria = calculadoraBinaria;
    }
    @Override
    public int somar(int a, int b) {
        String res = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(res, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String res = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(res, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
