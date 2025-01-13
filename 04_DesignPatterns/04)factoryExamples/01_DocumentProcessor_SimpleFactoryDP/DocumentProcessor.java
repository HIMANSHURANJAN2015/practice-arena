package com.assignment.question;

/*
step-1: Create prdduct hierarchy for which create abstract product interface. For this. shift 
common attributes and methods to the parent class.
Methods will be implemented in parent class or will be abstract and implemented in child class.
*/
public abstract class DocumentProcessor {
    /*So, shift them from other class
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