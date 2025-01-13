package com.assignment.question;

//step-2: Create factory class with static method to create objects
public class NotificationFactory {

    public static Notification createNotification(NotificationType type, String recipient, String sender, String message) {
        switch(type) {
            case EMAIL: return new EmailNotification(recipient, sender, message);
            case PUSH: return new PushNotification(recipient, message);
            case SMS: return new SmsNotification(recipient, message);
            default: throw new IllegalArgumentException("unsupported type:"+type);
        }
    }
}