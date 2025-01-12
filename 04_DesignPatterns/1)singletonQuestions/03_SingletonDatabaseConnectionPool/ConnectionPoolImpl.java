package com.assignment.question;

import java.util.*;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl instance;
    private int poolSize;

    /*
     * In my network pool, lets say I have 10 connections. For each connection, 
     * I need to identify this connection as well as mark whether its available or not
     * so, I will use a class with 2 field, id and isAvailable 
     */
    private ArrayList<DatabaseConnection> pool;//to store connection

    //Making constructor private
    private ConnectionPoolImpl(int poolSize) {
        this.poolSize = poolSize;
        this.pool = new ArrayList<DatabaseConnection>(); //without this, I was getting error!!!. My bad
        initializePool();
    }

    public static ConnectionPoolImpl getInstance(int maxConnections) {
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
        for(int i=0; i<this.poolSize; i++) {
            pool.add(new DatabaseConnection(i, true));
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        if(this.pool == null){
            throw new NullPointerException();
        }
        for(int i=0; i<this.poolSize; i++) {
            DatabaseConnection curr = this.pool.get(i);
            if(curr.isAvailable) {
                curr.isAvailable = false;
                return curr;
                //this.pool.set(i, new DatabaseConnection(i, false));
                //return this.pool.get(i);
            }
        }
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        if(this.pool == null){
            throw new NullPointerException();
        }
        for(int i=0; i<this.poolSize; i++) {
            DatabaseConnection curr = this.pool.get(i);
            if(curr.id == connection.id) {
                curr.isAvailable = true;
                //this.pool.set(i, new DatabaseConnection(i, true));
            }
        }

    }

    @Override
    public int getAvailableConnectionsCount() {
        if(this.pool == null){
            throw new NullPointerException();
        }
        int count = 0;
        for(int i=0; i<this.poolSize; i++) {
            if(this.pool.get(i).isAvailable) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getTotalConnectionsCount() {
        if(this.pool == null){
            throw new NullPointerException();
        }
        return this.poolSize;
    }
}