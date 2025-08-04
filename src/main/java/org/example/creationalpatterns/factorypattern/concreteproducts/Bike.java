package org.example.creationalpatterns.factorypattern.concreteproducts;

import org.example.creationalpatterns.factorypattern.productinterface.Vehicle;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started");
    }
}
