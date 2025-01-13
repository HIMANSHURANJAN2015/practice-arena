package com.assignment.question;

//step-1: Create product hierarchy. For this, shift common attributes and methods
//to the parent class. The methods wil be impleemnted here if possible, else abstract it and implement in child class.
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