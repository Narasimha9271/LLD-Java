package factory;

import notification.SMSNotification;
import notification.Notification;

public class SMSFactory extends NotificationFactory {
    public Notification createNotification() {
        return new SMSNotification();
    }
}
