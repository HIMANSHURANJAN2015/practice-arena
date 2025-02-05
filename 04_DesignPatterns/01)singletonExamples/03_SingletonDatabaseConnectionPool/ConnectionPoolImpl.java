package com.assignment.question;

import java.util.HashMap;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl instance;
    
     /*
     * In my network pool, lets say I have 10 connections. For each connection, 
     * I need to identify this connection as well as mark whether its available or not
     * so, I will use a class with 2 field, id and isAvailable 
     * 
     * Further, to save list of all connections, I have 2 options
     * 1. Store in arraylist
     * 2. Store in hashmap,
     * 
     * Clearly, hashmap is more time effieicnt, so using it
     */
    private int poolSize;
    private HashMap<Integer, DatabaseConnection> connectionPool = new HashMap<Integer, DatabaseConnection>();
    
    //step-1: Making contructor private
    private ConnectionPoolImpl(int maxConnections) {
        this.poolSize = maxConnections;
        initializePool();
    }
    
    //step-2: Create static getInstance
    public static ConnectionPoolImpl getInstance(int maxConnections) {
        /*Even without using synchronised, simple variant was also passing all test cases
          But its best to write code that supports multithreaded env  
        */
        if(instance==null) {
            synchronized(ConnectionPoolImpl.class) {
                if(instance == null) {
                    instance = new ConnectionPoolImpl(maxConnections);
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void initializePool() {
        //Connection n number of pools. they are avaiable for use
        for(int i=0; i<this.poolSize; i++) {
            this.connectionPool.put(i, new DatabaseConnection(i, true));
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        //Even without this check, the code was working and test cases were passing
        //but its good pracrice to check for exceptions 
        if(this.connectionPool == null){
            throw new NullPointerException();
        }
        for(int i=0; i<this.poolSize; i++) {
            DatabaseConnection con = this.connectionPool.get(i);
            if(con.isAvailable) {
                con.isAvailable = false;
                this.connectionPool.put(i, con);
                return con;
            }
        }
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        if(this.connectionPool == null){
            throw new NullPointerException();
        }
        int id = connection.id;
        connection.isAvailable = true;
        this.connectionPool.put(id, connection); 
    }

    @Override
    public int getAvailableConnectionsCount() {
        if(this.connectionPool == null){
            throw new NullPointerException();
        }
        int count = 0;
        for(int i=0; i<this.poolSize; i++) {
            if(this.connectionPool.get(i).isAvailable) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getTotalConnectionsCount() {
        if(this.connectionPool == null){
            throw new NullPointerException();
        }
        return this.poolSize;
    }
}