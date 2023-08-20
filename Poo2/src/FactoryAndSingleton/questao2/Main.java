package FactoryAndSingleton.questao2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Toyota fabricaToyota = Toyota.getInstance();
        Honda fabricaHonda = Honda.getInstance();

        ArrayList<IVehicle> vehicles = new ArrayList<>();

        vehicles.add(fabricaToyota.makeVehicle(Toyota.COROLLA));
        vehicles.add(fabricaToyota.makeVehicle(Toyota.HILUX));
        vehicles.add(fabricaToyota.makeVehicle(Toyota.ETIOS));
        vehicles.add(fabricaHonda.makeVehicle(Honda.CITY));
        vehicles.add(fabricaHonda.makeVehicle(Honda.CIVIC));
        vehicles.add(fabricaHonda.makeVehicle(Honda.FIT));

        for(IVehicle iv : vehicles){
            System.out.println("=================");
            iv.start();
            iv.drive();
            iv.stop();
            System.out.println("=================");
        }
    }
}
