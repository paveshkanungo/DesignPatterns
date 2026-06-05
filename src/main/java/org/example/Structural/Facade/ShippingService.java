package org.example.Structural.Facade;

// Subsystem C: Shipping
public class ShippingService {
    public void shipProduct(String productId) {
        System.out.println("Shipping product: " + productId);
    }
}
