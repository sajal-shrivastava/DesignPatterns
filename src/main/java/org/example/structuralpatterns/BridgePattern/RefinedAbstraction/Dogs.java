package org.example.structuralpatterns.BridgePattern.RefinedAbstraction;

import org.example.structuralpatterns.BridgePattern.Implementor.BreatheProcessImplementor;
import org.example.structuralpatterns.BridgePattern.LivingThings;

public class Dogs extends LivingThings {

    public Dogs(BreatheProcessImplementor breatheImpl){
        super(breatheImpl);
    }
    @Override
    public void breatheProcess() {
        breatheImpl.breatheProcess();
    }
}
