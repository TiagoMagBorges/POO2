package FactoryAndSingleton.questao2;

public class Etios implements IVehicle{
    @Override
    public void start() {
        System.out.println("Starting Etios");
    }

    @Override
    public void drive() {
        System.out.println("Driving Etios");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Etios");
    }
}
