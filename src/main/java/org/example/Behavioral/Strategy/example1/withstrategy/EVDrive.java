package org.example.Behavioral.Strategy.example1.withstrategy;

public class EVDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability: Electric");
    }
}
