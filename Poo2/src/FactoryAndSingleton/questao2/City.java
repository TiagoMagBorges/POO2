package FactoryAndSingleton.questao2;

public class City implements IVehicle{
    @Override
    public void start() {
        System.out.println("Starting City");
    }

    @Override
    public void drive() {
        System.out.println("Driving City");
    }

    @Override
    public void stop() {
        System.out.println("Stopping City");
    }
}
