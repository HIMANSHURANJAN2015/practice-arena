package com.assignment.question;

//step-2 create concrete product
public class EmailNotification extends Notification {
    /*sender was not in Push and SMS notification, so was not shifted and left here only */
    private String sender;

    public EmailNotification(String recipient, String sender, String message) {
        super(recipient, message);
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }
    
    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + this.getRecipient() + " from " + sender);
        System.out.println("Message: " + this.getMessage());
    }

    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}