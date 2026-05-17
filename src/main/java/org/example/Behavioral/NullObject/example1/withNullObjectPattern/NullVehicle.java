package org.example.Behavioral.NullObject.example1.withNullObjectPattern;

public class NullVehicle extends Vehicle {
    private final String model;
    private final String color;
    private final int seatingCapacity;
    private final int fuelTankCapacity;
    private final boolean isAvailableForTestDrive;

    public NullVehicle() {
        this.model = "Default";
        this.color = "Default";
        this.seatingCapacity = 0;
        this.fuelTankCapacity = 0;
        this.isAvailableForTestDrive = false;
    }

    @Override
    public void start() {
        // Do nothing - silent Vehicle
        System.out.print("\n[-] Null Vehicle: start() - do nothing");
    }

    @Override
    public void stop() {
        // Do nothing - silent Vehicle
        System.out.println("\n[-] Null Vehicle: stop() - do nothing");
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public boolean isAvailableForTestDrive() {
        return isAvailableForTestDrive;
    }
}
