package org.example.Behavioral.Observer.example2;

public class EcommerceStockNotificationApp {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("###### E-commerce Store - Stock Availability Notification Feature Demo ######");

        StockAvailabilityObservable iphoneProduct = new IphoneProductObservable(200, "iphone 15", "ip_17", 10);

        StockNotificationObserver John_PUSH = new PushNotificationObserver("John123", "JohnDeviceP1");
        StockNotificationObserver Katy_PUSH = new PushNotificationObserver("Katy678", "KatyDeviceP2");

        StockNotificationObserver Jane_EMAIL = new EmailNotificationObserver("Jane783", "jane783@gmail.com");
        StockNotificationObserver George_EMAIL = new EmailNotificationObserver("George993", "george993@gmail.com");

        // Purchase all 10 units
        iphoneProduct.purchase(10);
        // Stock unavailability leads to users subscribing to notifications
        boolean success = iphoneProduct.purchase(1); // Failed purchase

        if (!success) {
            // Register observers - John, Katy, Jane, George subscribe for notifications upon stock availability
            iphoneProduct.addStockObserver(John_PUSH); // John
            iphoneProduct.addStockObserver(Katy_PUSH); // Katy
            iphoneProduct.addStockObserver(Jane_EMAIL); // Jane
            iphoneProduct.addStockObserver(George_EMAIL); // George
        }

        // Restock 20 units of iPhone 15
        iphoneProduct.restock(20); // All 4 observers are notified

        iphoneProduct.purchase(1); // John purchases 1 unit
        iphoneProduct.purchase(1); // Katy purchases 1 unit

        iphoneProduct.removeStockObserver(John_PUSH);
        iphoneProduct.removeStockObserver(Katy_PUSH);

        // NYE Sale - All 18 units sold
        iphoneProduct.purchase(18);
        iphoneProduct.restock(5); // Only Jane & George are notified

        iphoneProduct.purchase(1); // // Jane purchases 1 unit
        iphoneProduct.purchase(1); // George purchases 1 unit

        // Jane & George unsubscribe from notifications
        iphoneProduct.removeStockObserver(Jane_EMAIL);
        iphoneProduct.removeStockObserver(George_EMAIL);
    }
}
