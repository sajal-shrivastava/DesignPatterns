package org.example.structuralpatterns.CompositePattern.Leaf;

import org.example.structuralpatterns.CompositePattern.Component.ArithmeticExpression;



public class Number implements ArithmeticExpression{
    int number;
    public Number(int number){
        this.number = number;
    }
    @Override
    public int evaluate() {
        return this.number;
    }
}
