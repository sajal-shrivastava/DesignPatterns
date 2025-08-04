package org.example.creationalpatterns.factorypattern.concreteproducts;

import org.example.creationalpatterns.factorypattern.productinterface.Vehicle;

public class Car implements Vehicle {


    @Override
    public void start() {
        System.out.println("Car has started");
    }
}
