package com.assignment.question;

import lombok.NoArgsConstructor;
/*
 * import lombok.AllArgsConstructor is part of the Project Lombok library, 
 * which is used in Java to reduce boilerplate code. 
 * When you import lombok.AllArgsConstructor, you're utilizing Lombok's 
 * ability to automatically generate a constructor with 
 * one parameter for each field in your class.
 * 
 * With the @AllArgsConstructor annotation, 
 * Lombok will automatically create a constructor.
 * 
 * Note that: Lombok is not part of Java's built-in libraries. It's a separate third-party library 
 * that you need to add to your project as a dependency. 
 * Java itself doesn't include Lombok or its features out of the box. 
 * You can easily include Lombok in your project by adding it as a dependency through your build tool, 
 * such as Maven or Gradle. This allows you to use Lombok's annotations and features to reduce boilerplate code and make your Java code more concise and readable.
 */
import lombok.Getter;
/*
 * import lombok.Getter is another useful annotation provided by 
 * Project Lombok. When you use @Getter, Lombok automatically 
 * generates getter methods for all the fields in your class. 
 * This saves you from writing boilerplate code to 
 * manually create these methods.
 */

// DO NOT REMOVE THE NO-ARG CONSTRUCTOR ANNOTATION
@NoArgsConstructor
@Getter
public class TranslationRequest {
    /*GoogleTransltaion APIs need Tranlation Request while Microsoft 
    Micosoft trnalsation reqjet APIs dont need.
    To create a harmony, in my adapter interface, I will use Tranlation reuqest.Its better 
    than passing each paramters 1 by 1.
    */
    //copy the same format as used in external Gogle tranlation aPIs
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;
}