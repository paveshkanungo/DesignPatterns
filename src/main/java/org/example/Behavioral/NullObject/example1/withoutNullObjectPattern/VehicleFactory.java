package org.example.Behavioral.NullObject.example1.withoutNullObjectPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(type.equals("car")){
            return new Car("Toyota", "Red", 5, 60, true);
        } else if(type.equals("bike")){
            return new Bike("Yamaha", "Black", 2, 30, true);
        } else {
            return null; // THE PROBLEM
        }
    }
}
