package org.example.Behavioral.Observer.example2;

public interface StockNotificationObserver {
    void update();
    String getNotificationMethod();
    String getUserId();
}
