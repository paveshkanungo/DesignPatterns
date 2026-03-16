package org.example.Behavioral.Observer.example2;

import java.util.ArrayList;
import java.util.List;

public class IphoneProductObservable implements StockAvailabilityObservable {
    private final List<StockNotificationObserver> observers;
    private int stockQuantity;
    private final double price;
    private final String productId;
    private final String productName;

    public IphoneProductObservable(double price, String productId, String productName, int stockQuantity) {
        this.price = price;
        this.productId = productId;
        this.productName = productName;
        this.stockQuantity = stockQuantity;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addStockObserver(StockNotificationObserver observer) {
        observers.add(observer);
        System.out.println("[+]" + observer.getUserId() + " subscribed for notifications on " + productName);
    }

    @Override
    public void removeStockObserver(StockNotificationObserver observer) {
        observers.remove(observer);
        System.out.println("[-]" + observer.getUserId() + " unsubscribed for notifications on " + productName);
    }

    @Override
    public void notifyObservers() {
        if(stockQuantity > 0 && !observers.isEmpty()){
            System.out.println("Notifying " + observers.size() + " subscribers... ");
            List<StockNotificationObserver> observersToNotify = new ArrayList<>(observers);
            for (StockNotificationObserver observer : observersToNotify) {
                observer.update();
            }
        }
    }

    @Override
    public boolean purchase(int quantity) {
        if (stockQuantity >= quantity) {
            stockQuantity -= quantity;
            System.out.println("PURCHASE SUCCESS: " + quantity + " units of "
                                + productName + " | " + "Remaining stock: " + stockQuantity);
            return true;
        } else {
            System.out.println("PURCHASE FAILED: " + productName + " is out of stock! | "
                                + "Available Quantity: " + stockQuantity);
            return false;
        }
    }

    @Override
    public void restock(int quantity) {
        boolean wasOutOfStock = (stockQuantity == 0);
        stockQuantity += quantity;
        System.out.println("RESTOCKED: " + productName + " - Added " +
                            quantity + " items " + " | " + "Current stock: " + stockQuantity);
        if (wasOutOfStock && stockQuantity > 0) {
            notifyObservers();
        }
    }
}
