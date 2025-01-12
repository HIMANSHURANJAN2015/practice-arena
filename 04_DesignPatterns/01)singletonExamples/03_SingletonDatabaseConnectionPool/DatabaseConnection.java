package com.assignment.question;

public class DatabaseConnection {
    /*
     * why this structure is explaiend in ConnectionPoolImp.java
     */
    public int id;
    public boolean isAvailable;

    DatabaseConnection(int id, boolean isAvailable) {
        this.id = id;
        this.isAvailable = isAvailable;
    }
}