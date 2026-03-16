package org.example.Creational.Factory.FactoryMethod;

public class SquareCreator extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
