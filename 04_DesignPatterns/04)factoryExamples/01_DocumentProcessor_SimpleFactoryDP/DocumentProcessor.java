package com.assignment.question;

public abstract class DocumentProcessor {
    /*Step-2.1: As this common parent class should have all attributes and methods that are common 
    to add document processors. So, shift them from other class
    to here
    1. attibte =  private String documentName;
    2. methods = along wth shifting, I also made them abstract if it is different for each child class
    Else I implement that method here.
        i. getDocumentName();
        ii. processDocument();
        iii. supportsType();
    */
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName(){
        return this.documentName;
    } 

    public abstract DocumentType supportsType();

    public abstract void processDocument();

}