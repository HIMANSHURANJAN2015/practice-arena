package com.assignment.question;

import com.assignment.question.notification.*;
import com.assignment.question.sender.*;
import com.assignment.question.template.*;

//step-4: Create concrete factory
public class PushNotificationFactory extends NotificationFactory {

    // Concrete method for getting the type of notification the factory supports
    public NotificationType notificationType(){
        return NotificationType.PUSH;
    }
    
    // Concrete methods for creating different parts of a notification system
    public  Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient, template);

    }
    public NotificationTemplate createTemplate(String templateName){
        return new PushNotificationTemplate(templateName);
    }
    public NotificationSender createSender(Notification notification) {
        return new PushNotificationSender(notification);
    }
    
}