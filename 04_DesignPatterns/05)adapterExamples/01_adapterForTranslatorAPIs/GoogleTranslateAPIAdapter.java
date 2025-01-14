package com.assignment.question;

//I need these packages
import java.util.*;
import com.assignment.question.external.GoogleTranslateApi;
import com.assignment.question.external.GoogleTranslationRequest;

//step-3: Create concrete adapter classes
public class GoogleTranslateAPIAdapter implements TranslationProviderAdapter{
    private GoogleTranslateApi api;

    public GoogleTranslateAPIAdapter() {
        this.api = new GoogleTranslateApi();
    }

    public String translate(TranslationRequest request) {
        return this.api.convert(convertRequest(request));
    }

    //step-4: Transform request to the request format required by the original class(Google Translation Request)
    private GoogleTranslationRequest convertRequest(TranslationRequest request) {
        return new GoogleTranslationRequest(request.getText(), request.getSourceLanguage(), request.getTargetLanguage(), request.getConfidenceThreshold());
    }
    public List<String> getLanguages(){
        return this.api.getLanguages();
    }
}
