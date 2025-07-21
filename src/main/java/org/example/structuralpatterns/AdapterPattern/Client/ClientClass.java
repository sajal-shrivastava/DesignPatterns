package org.example.structuralpatterns.AdapterPattern.Client;

import org.example.structuralpatterns.AdapterPattern.Adaptee.WeighingMachineBabies;
import org.example.structuralpatterns.AdapterPattern.Adapter.AdapterImpl;
import org.example.structuralpatterns.AdapterPattern.Adapter.WeighingMachineAdapter;

public class ClientClass {
    public static void main(String[] args) {
        WeighingMachineAdapter adapter = new AdapterImpl(new WeighingMachineBabies());

        System.out.println("Weight In kg" + adapter.getWeightInKg());
    }
}
