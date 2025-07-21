package org.example.structuralpatterns.AdapterPattern.Adaptee;

public class WeighingMachineBabies implements WeightMachine {

    @Override
    public double getWeightInPounds() {
        return 45;
    }
}
