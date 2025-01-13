package com.assignment.question;

//step-3: create a registry interface for using various types of objects
public interface UserPrototypeRegistry {

    //step3.1 to add prototype
    void addPrototype(User user);

    //step-3.2 to get protype
    User getPrototype(UserType type);

    //step-3.3 to clone a user of that type from the prototypes saved in the registry 
    User clone(UserType type);
}