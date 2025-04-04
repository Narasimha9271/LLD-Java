// NotificationFactory/
// ├── Main.java
// ├── factory/
// │   ├── NotificationFactory.java     ← Abstract Creator
// │   ├── EmailFactory.java            ← Concrete Factory
// │   └── SMSFactory.java              ← Concrete Factory
// ├── notification/
// │   ├── Notification.java            ← Product Interface
// │   ├── EmailNotification.java       ← Concrete Product
// │   └── SMSNotification.java         ← Concrete Product


import factory.EmailFactory;
import factory.SMSFactory;
import factory.NotificationFactory;
import notification.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory;

        // Example: change based on user input or config
        String type = "sms";

        if (type.equalsIgnoreCase("email")) {
            factory = new EmailFactory();
        } else {
            factory = new SMSFactory();
        }

        Notification notification = factory.createNotification();
        notification.notifyUser();
    }
}
