package com.assignment.question;

//step-2 create concrete product
public class SmsNotification extends Notification{
    /* Shifting to the parent class
    private String recipient;
    private String message;
    */

    public SmsNotification(String recipient,  String message) {
        super(recipient, message);
    }

    public void sendNotification() {
        // Logic to send an SMS
        System.out.println("SMS sent to " + this.getRecipient());
        System.out.println("Message: " + this.getMessage());
    }

    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}