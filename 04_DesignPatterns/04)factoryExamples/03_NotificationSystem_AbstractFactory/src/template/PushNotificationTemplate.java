package com.assignment.question.template;

import com.assignment.question.NotificationType;

//step-2: create concrete products
public class PushNotificationTemplate extends NotificationTemplate{
    public PushNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Push notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}