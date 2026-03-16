package org.example.Creational.Factory.FactoryMethod;

public class RectangleCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
