package com.assignment.question;

//step-1: Create abstract observable/publisher
public abstract class Publisher {

    public abstract void addObserver(Observer o);
    public abstract void removeObserver(Observer o);
    public abstract void notifyObservers(Long taskId, Long userId);
}