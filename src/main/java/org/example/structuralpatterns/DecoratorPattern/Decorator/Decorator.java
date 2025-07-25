package org.example.structuralpatterns.DecoratorPattern.Decorator;

import org.example.structuralpatterns.DecoratorPattern.Component.Pizza;

public interface Decorator extends Pizza {
    int getCost();
}
