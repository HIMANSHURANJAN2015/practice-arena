package com.assignment.question.sender;

import com.assignment.question.NotificationType;
import com.assignment.question.notification.Notification;


//step-2: create concrete products
public class EmailNotificationSender extends NotificationSender {

    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Email notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}