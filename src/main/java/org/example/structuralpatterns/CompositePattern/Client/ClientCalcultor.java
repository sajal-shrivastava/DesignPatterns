package org.example.structuralpatterns.CompositePattern.Client;

import org.example.structuralpatterns.CompositePattern.Component.ArithmeticExpression;
import org.example.structuralpatterns.CompositePattern.Composite.Expression;
import org.example.structuralpatterns.CompositePattern.Enum.Operation;
import org.example.structuralpatterns.CompositePattern.Leaf.Number;

public class ClientCalcultor {
    public static void main(String[] args) {
        ArithmeticExpression fiveNumber = new Number(5);
        ArithmeticExpression sixNumber = new Number(6);
        ArithmeticExpression sevenNumber = new Number(7);

        //Example 1
        ArithmeticExpression addNumber = new Expression(fiveNumber, sixNumber, Operation.ADD);
        System.out.println("Addition result  " +addNumber.evaluate());

        //Example 2
        ArithmeticExpression multiplyExpression = new Expression(sixNumber, sevenNumber, Operation.MULTIPLY);
        ArithmeticExpression addMultipleResultExpression = new Expression(fiveNumber, multiplyExpression, Operation.ADD);
        System.out.println("Add Multiply Result  " +addMultipleResultExpression.evaluate());

    }
}
