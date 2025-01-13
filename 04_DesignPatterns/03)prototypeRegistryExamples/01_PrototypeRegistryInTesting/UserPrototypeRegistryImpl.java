package com.assignment.question;

import java.util.HashMap;

//step-4:  Implement the registry interface.Adding a new file for it.
public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {
    //step-4.1 Have a registry in the form of Hashmap
    private HashMap<UserType, User> registry = new HashMap<UserType, User>();

    
    public void addPrototype(User user) {
        registry.put(user.getType(), user);
    }

    public User getPrototype(UserType type){
        return registry.get(type);
    }

    public User clone(UserType type){
        return registry.get(type).cloneObject();
    }
}
