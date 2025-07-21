package org.example.structuralpatterns.AdapterPattern.Adapter;

import org.example.structuralpatterns.AdapterPattern.Adaptee.WeightMachine;

public class AdapterImpl implements WeighingMachineAdapter{
    WeightMachine weightMachine;

    public AdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg(){
        return weightMachine.getWeightInPounds() * 0.45;
    }

}
