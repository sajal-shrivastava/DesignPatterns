package org.example.structuralpatterns.BridgePattern.ConcreteImplementor;

import org.example.structuralpatterns.BridgePattern.Implementor.BreatheProcessImplementor;

public class WaterBasedImplementation implements BreatheProcessImplementor {

    @Override
    public void breatheProcess() {
        System.out.println("Breathe Through Gills");
        System.out.println("Absorbs Oxygen");
        System.out.println("Release Carbondioxide");
    }
}
