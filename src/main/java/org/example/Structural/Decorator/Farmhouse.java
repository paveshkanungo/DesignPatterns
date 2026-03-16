package org.example.Structural.Decorator;

public class Farmhouse implements BasePizza {

    @Override
    public String getDescription() {
        return "Farmhouse";
    }

    @Override
    public double getCost() {
        return 300.00;
    }
}
