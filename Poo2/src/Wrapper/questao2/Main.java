package Wrapper.questao2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new CalculadoraBinariaAdapter(new CalculadoraBinaria());
        System.out.println(calculadora.somar(10, 3));
        System.out.println(calculadora.subtrair(10, 3));
        System.out.println(calculadora.multiplicar(10, 3));
    }
}
