package org.example.structuralpatterns.BridgePattern.ConcreteImplementor;

import org.example.structuralpatterns.BridgePattern.Implementor.BreatheProcessImplementor;

public class LandBreatheImplementationImplementor implements BreatheProcessImplementor {
    public void breatheProcess(){
        System.out.println("Breathe Through Nose");
        System.out.println("Inhales Oxygen");
        System.out.println("Exhales Carbondioxide");
    }
}
