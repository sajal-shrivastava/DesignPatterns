package org.example.structuralpatterns.DecoratorPattern.Client;

import org.example.structuralpatterns.DecoratorPattern.Component.FarmhousePizza;
import org.example.structuralpatterns.DecoratorPattern.Component.Pizza;
import org.example.structuralpatterns.DecoratorPattern.Decorator.CheeseDecorator;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new FarmhousePizza();
        pizza = new CheeseDecorator(pizza);
        System.out.println("Pizza's Cost" +pizza.getCost());
    }
}
