package org.example.Creational.Factory.SimpleFactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        System.out.println("======= Simple Factory Design Pattern ======");

        // set the type you want
        ShapeType shapeType = ShapeType.SQUARE;

        // get the shape
        Shape shape = ShapeFactory.createShapeInstance(shapeType);

        shape.draw();
        shape.computeArea();
    }
}

/*
* Simple Factory:
* 1. Static method that creates objects based on parameters
* 2. Not a true design pattern, more of a programming idiom
* 3. Violates the Open/Closed principle when adding new types, as we are going to update ShapeFactory.
* */
