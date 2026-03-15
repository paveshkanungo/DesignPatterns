package org.example.Behavioral.Strategy.example2.withoutstrategy;

public class PaymentProcessor {
    public void processPayment(String type, double amount){
        switch (type) {
            case "credit_card" -> {
                System.out.println("Paid $" + amount + " using credit card");
            }
            case "paypal" -> {
                System.out.println("Paid $" + amount + " using PayPal");
            }
            case "net_banking" -> {
                System.out.println("Paid $" + amount + " using bank transfer");
            }
            case "cash" -> {
                System.out.println("Paid $" + amount + " using cash");
            }
            default -> {
                throw new IllegalStateException("Unexpected value: " + type);
            }
            // Adding another payment method(crypto) requires modifying this class
            // This keeps growing with each new payment method bad design
        }
    }
}
