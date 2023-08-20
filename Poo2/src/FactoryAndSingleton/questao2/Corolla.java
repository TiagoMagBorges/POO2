package FactoryAndSingleton.questao2;

public class Corolla implements IVehicle{

    @Override
    public void start() {
        System.out.println("Starting Corolla");
    }

    @Override
    public void drive() {
        System.out.println("Driving Corolla");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Corolla");
    }
}
