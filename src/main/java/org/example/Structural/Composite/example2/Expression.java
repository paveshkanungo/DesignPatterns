package org.example.Structural.Composite.example2;

public class Expression implements ArithmeticExpression {
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    OperationType operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, OperationType operationType){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operationType;
    }

    public int evaluate(){
        int value = 0;
        switch (operation) {
            case OperationType.ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case OperationType.SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case OperationType.DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case OperationType.MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }
        System.out.println("Expression value is:" + value);
        return value;
    }
}
