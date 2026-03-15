package org.example.Behavioral.Strategy.example1.withstrategy;

public class SportsDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability: Sports");
    }
}
