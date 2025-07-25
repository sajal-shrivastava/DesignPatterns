package org.example.structuralpatterns.DecoratorPattern.Component;

public class FarmhousePizza implements Pizza{


    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
