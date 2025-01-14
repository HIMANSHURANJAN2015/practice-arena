package com.assignment.question;

import java.util.*;

//step-2: Create abstract adapter interface
public interface TranslationProviderAdapter {
    /*For translation, looking at all the external tranlsation APis,
     I need (1) translate, (2) getSupportedLanguages
    */
    public String translate(TranslationRequest request);
    public List<String> getLanguages(); 
}