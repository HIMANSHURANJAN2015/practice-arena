package com.assignment.question;

import org.springframework.boot.logging.LogLevel;
import java.io.*; //for Printwriter I need to import this package.
import java.time.LocalDateTime; //For adding timwstemp I need to import these 2 packages
import java.time.format.DateTimeFormatter;

public class LoggerImpl implements Logger {
    private static LoggerImpl instance;
    private String filepath;
    private PrintWriter pw;
    
    //step-1 make constructor private
    private LoggerImpl() {

    }

    //step-2 create static method to get the singleton instance
    public static LoggerImpl getInstance() {
        if(instance == null) {
            instance = new LoggerImpl();
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void setLogFile(String filePath) {
        try {
            this.filepath = filePath;
            this.pw = new PrintWriter(filePath);
        } catch(FileNotFoundException e) {
        }
    }

    @Override
    public void log(LogLevel level, String message) {
        if(this.pw==null) {
            throw new IllegalStateException();
        }
        // Get the current date and time 
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
        // Format the message with timestamp 
        String formattedMessage = now.format(formatter) + " - " + level.toString()+ message;
        try {
            this.pw.append(formattedMessage);
        } catch(IllegalStateException e) {
        }
    }

    @Override
    public String getLogFile() {
        return this.filepath;
    }

    @Override
    public void flush() {
        try {
            this.pw.flush();
        } catch(IllegalStateException e) {

        }
    }

    @Override
    public void close() {
        try {
            this.pw.close();
            this.pw = null;

        } catch(Exception e) {

        }
    }
}
