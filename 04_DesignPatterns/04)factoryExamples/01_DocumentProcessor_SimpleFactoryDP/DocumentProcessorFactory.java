package com.assignment.question;

//step-3: Create factory class with static method to create objects
public class DocumentProcessorFactory {

    //since its  simple factory DP, so creating static method.
    public static DocumentProcessor creatDocumentProcessor(DocumentType type, String documentName) {
        //step-3.1 using switch case
        switch(type) {
            case TEXT: return new TextDocumentProcessor(documentName);
            case PRESENTATION: return new PresentationDocumentProcessor(documentName);
            case SPREAD_SHEET: return new SpreadsheetDocumentProcessor(documentName);
            default: throw new IllegalArgumentException("Unsupported document type:"+documentName);
        }

    }
}