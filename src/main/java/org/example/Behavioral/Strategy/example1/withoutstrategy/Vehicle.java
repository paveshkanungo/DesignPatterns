package org.example.Behavioral.Strategy.example1.withoutstrategy;

public class Vehicle {
    public void drive(){
        System.out.print("\n" + this.getClass().getSimpleName() + ":");
        System.out.println("Driving Capability: Normal");
    }
}
