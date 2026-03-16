package org.example.Creational.Factory.SimpleFactory;

public class Square implements Shape {

    @Override
    public void computeArea() {
        System.out.println("Inside Square::computeArea() method.");
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
