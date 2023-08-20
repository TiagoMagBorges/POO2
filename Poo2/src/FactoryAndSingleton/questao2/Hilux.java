package FactoryAndSingleton.questao2;

public class Hilux implements IVehicle{
    @Override
    public void start() {
        System.out.println("Starting Hilux");
    }

    @Override
    public void drive() {
        System.out.println("Driving Hilux");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Hilux");
    }
}
