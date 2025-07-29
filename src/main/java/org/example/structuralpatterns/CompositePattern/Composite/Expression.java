package org.example.structuralpatterns.CompositePattern.Composite;

import org.example.structuralpatterns.CompositePattern.Component.ArithmeticExpression;
import org.example.structuralpatterns.CompositePattern.Enum.Operation;

public class Expression implements ArithmeticExpression {
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;
    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }
    @Override
    public int evaluate() {
        int result = 0;
       switch(this.operation){
           case ADD :
               result = this.leftExpression.evaluate() + this.rightExpression.evaluate();
               break;
           case SUBTRACT:
               result = this.leftExpression.evaluate() - this.rightExpression.evaluate();
               break;
           case MULTIPLY:
               result = this.leftExpression.evaluate() * this.rightExpression.evaluate();
               break;
           case DIVIDE:
               result = this.leftExpression.evaluate() / this.rightExpression.evaluate();
               break;
       }
       return result;
    }
}
