package FactoryAndSingleton.questao2;

public class Civic implements IVehicle{
    @Override
    public void start() {
        System.out.println("Starting Civic");
    }

    @Override
    public void drive() {
        System.out.println("Driving Civic");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Civic");
    }
}
