package org.example.Behavioral.NullObject.example1.withNullObjectPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(type.equals("car")){
            return new Car("Toyota", "Red", 5, 60, true);
        } else if(type.equals("bike")){
            return new Bike("Yamaha", "Black", 2, 30, true);
        } else {
            return new NullVehicle(); // THE SOLUTION
        }
    }
}
