package com.assignment.question;

import java.util.*;

//step-5: If using registry DP, then implement the registry interface
public class FlyweightRegistryImpl implements FlyweightRegistry {
    private Map<String, UserIntrinsicState> registry;

    FlyweightRegistryImpl() {
        this.registry = new HashMap<String, UserIntrinsicState>();
    }


    public void addFlyweight(UserIntrinsicState flyweight) {
        this.registry.put(flyweight.getEmail(), flyweight);
    }

    public UserIntrinsicState getFlyweight(String email){
        return registry.get(email);
    }
    
}