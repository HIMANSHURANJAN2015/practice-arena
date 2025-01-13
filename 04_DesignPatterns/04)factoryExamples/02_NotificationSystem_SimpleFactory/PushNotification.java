package com.assignment.question;

//step-2 create concrete product
public class PushNotification extends Notification {

    public PushNotification(String recipient, String message) {
        super(recipient, message);
    }

    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + this.getRecipient());
        System.out.println("Message: " + this.getMessage());
    }

    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}