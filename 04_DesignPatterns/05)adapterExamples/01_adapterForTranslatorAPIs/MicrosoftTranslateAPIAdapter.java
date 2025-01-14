package com.assignment.question;

//I need these packages
import java.util.*;
import com.assignment.question.external.MicrosoftTranslateApi;

//step-3: Create concrete adapter classes
public class MicrosoftTranslateAPIAdapter implements TranslationProviderAdapter{
    private MicrosoftTranslateApi api;

    public MicrosoftTranslateAPIAdapter() {
        this.api = new MicrosoftTranslateApi();
    }

    public String translate(TranslationRequest request) {
        return this.api.translate(request.getText(), request.getSourceLanguage(), request.getTargetLanguage());
    }

    public List<String> getLanguages(){
        return this.api.getSupportedLanguages();
    }
}
