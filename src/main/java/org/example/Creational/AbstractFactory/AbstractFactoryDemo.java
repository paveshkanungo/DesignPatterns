package org.example.Creational.AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("===== Abstract Factory Design Pattern =====");

        // Get Factory Provider
        CarFactoryProvider carFactoryProvider = new CarFactoryProvider();

        // Get Economy Car Factory
        CarFactory economyCar = carFactoryProvider.getFactory(CarType.ECONOMY, "Honda");
        economyCar.produceCompleteVehicle();

        // Get Luxury Car Factory
        CarFactory luxuryCar = carFactoryProvider.getFactory(CarType.LUXURY, "Mercedes");
        luxuryCar.produceCompleteVehicle();
    }
}

/*
* Factory Method vs Abstract Factory:
* 1. One product, many variants → Use Factory Method
* 2. Many products, grouped by family (theme, platform, brand, etc.) → Use Abstract Factory
* */