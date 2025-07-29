package org.example.structuralpatterns.BridgePattern.Client;

import org.example.structuralpatterns.BridgePattern.ConcreteImplementor.LandBreatheImplementationImplementor;
import org.example.structuralpatterns.BridgePattern.Implementor.BreatheProcessImplementor;
import org.example.structuralpatterns.BridgePattern.LivingThings;
import org.example.structuralpatterns.BridgePattern.RefinedAbstraction.Dogs;

public class ClientMain {
    public static void main(String[] args) {
        BreatheProcessImplementor breathImpl = new LandBreatheImplementationImplementor();
        LivingThings livingThings = new Dogs(breathImpl);
        livingThings.breatheProcess();
    }
}
