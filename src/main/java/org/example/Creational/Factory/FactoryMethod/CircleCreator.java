package org.example.Creational.Factory.FactoryMethod;

public class CircleCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
