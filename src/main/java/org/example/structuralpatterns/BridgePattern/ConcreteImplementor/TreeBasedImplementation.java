package org.example.structuralpatterns.BridgePattern.ConcreteImplementor;

import org.example.structuralpatterns.BridgePattern.Implementor.BreatheProcessImplementor;

public class TreeBasedImplementation implements BreatheProcessImplementor {
    @Override
    public void breatheProcess() {
        System.out.println("Breathe Through Leaves");
        System.out.println("Inhales Carbondioxide");
        System.out.println("Exhales Oxygen");
    }
}
