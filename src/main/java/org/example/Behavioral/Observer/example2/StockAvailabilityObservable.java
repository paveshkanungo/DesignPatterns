package org.example.Behavioral.Observer.example2;

public interface StockAvailabilityObservable {
    void addStockObserver(StockNotificationObserver observer);
    void removeStockObserver(StockNotificationObserver observer);
    void notifyObservers();
    boolean purchase(int quantity);
    void restock(int quantity);
}
