package org.example.structuralpatterns.DecoratorPattern.Decorator;

import org.example.structuralpatterns.DecoratorPattern.Component.Pizza;

public class CheeseDecorator implements Decorator {

    Pizza pizza;
    public CheeseDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return "Cheese Topping";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 20;
    }
}
