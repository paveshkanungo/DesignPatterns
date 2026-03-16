package org.example.Creational.AbstractFactory;

public class EconomyCarExterior implements CarExterior {
    @Override
    public void addExteriorComponents() {
        System.out.println("Adding basic exterior components for Economy Car.");
    }
}
