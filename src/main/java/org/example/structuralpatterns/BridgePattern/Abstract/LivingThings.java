package org.example.structuralpatterns.BridgePattern;

import org.example.structuralpatterns.BridgePattern.Implementor.BreatheProcessImplementor;

public abstract class LivingThings {
    public BreatheProcessImplementor breatheImpl;

    public LivingThings(BreatheProcessImplementor breatheImpl){
        this.breatheImpl = breatheImpl;
    }

    public abstract void breatheProcess();
}
