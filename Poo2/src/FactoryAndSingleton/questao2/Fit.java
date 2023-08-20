package FactoryAndSingleton.questao2;

public class Fit implements IVehicle{
    @Override
    public void start() {
        System.out.println("Starting Fit");
    }

    @Override
    public void drive() {
        System.out.println("Driving Fit");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Fit");
    }
}
