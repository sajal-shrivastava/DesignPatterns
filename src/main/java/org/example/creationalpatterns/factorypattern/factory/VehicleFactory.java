package org.example.creationalpatterns.factorypattern.factory;

import org.example.creationalpatterns.factorypattern.concreteproducts.Bike;
import org.example.creationalpatterns.factorypattern.concreteproducts.Car;
import org.example.creationalpatterns.factorypattern.productinterface.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String type){
        Vehicle vehicle = null;
        switch (type) {
            case "BIKE" :
                vehicle = new Bike();
                break;
            case "CAR" :
                vehicle = new Car();
                break;
        }
        return vehicle;
    }
}
