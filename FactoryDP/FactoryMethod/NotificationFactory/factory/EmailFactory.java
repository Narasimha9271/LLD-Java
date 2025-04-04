package factory;

import notification.EmailNotification;
import notification.Notification;

public class EmailFactory extends NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}
