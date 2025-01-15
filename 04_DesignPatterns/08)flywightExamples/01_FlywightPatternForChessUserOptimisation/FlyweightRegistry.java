package com.assignment.question;

//step-4: create flyweght factory or flyweigh registry
public interface FlyweightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}