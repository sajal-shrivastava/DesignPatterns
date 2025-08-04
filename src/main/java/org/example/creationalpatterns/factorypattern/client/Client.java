package org.example.creationalpatterns.factorypattern.client;

import org.example.creationalpatterns.factorypattern.factory.VehicleFactory;
import org.example.creationalpatterns.factorypattern.productinterface.Vehicle;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("BIKE");
        Vehicle vehicle1 = VehicleFactory.getVehicleObject("CAR");

        vehicle.start();
        vehicle1.start();
    }
}
