package com.assignment.question;

import com.assignment.question.notification.*;
import com.assignment.question.sender.*;
import com.assignment.question.template.*;

//step-3: abstract factory interface
public abstract class NotificationFactory {
    // Abstract method for getting the type of notification the factory supports
    public abstract NotificationType notificationType();
    
    // Abstract methods for creating different parts of a notification system
    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationTemplate createTemplate(String templateName);
    public abstract NotificationSender createSender(Notification notification);
}
/*
 * In this code, the NotificationFactory class is an abstract factory class that declares methods for creating 
 * different parts of a notification system (Notification, NotificationTemplate, and NotificationSender) 
 * and a method for getting the type of notification the factory supports. The EmailNotificationFactory and PushNotificationFactory classes 
 * are concrete factory classes that implement these methods to create email and push notifications, respectively. 

This is a classic implementation of the Abstract Factory Pattern. 
The Abstract Factory Pattern provides an interface for creating families of related or dependent objects 
without specifying their concrete classes. This pattern separates the details of implementation of a 
set of objects from their general usage and relies on 
object composition: object creation methods are implemented in methods exposed in the factory interface.
 */