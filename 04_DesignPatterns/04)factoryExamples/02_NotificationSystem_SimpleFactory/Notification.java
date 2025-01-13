package com.assignment.question;

/*
step-1: Create prdduct hierarchy for which create abstract product interface. For this. shift 
common attributes and methods to the parent class.
Methods will be implemented in parent class or will be abstract and implemented in child class.
*/
public abstract class Notification {
    private String recipient;
    private String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public String getMessage() {
        return this.message;
    }

    public abstract void sendNotification();

    public abstract NotificationType notificationType();

}