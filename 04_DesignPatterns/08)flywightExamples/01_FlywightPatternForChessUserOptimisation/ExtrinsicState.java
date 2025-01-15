package com.assignment.question;

/*
 * These import statements bring in the necessary classes from the 
 * java.lang.annotation package to create and manage annotations.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ExtrinsicState {
}

/*
 * @Retention(RetentionPolicy.RUNTIME)
 * This annotation specifies that the ExtrinsicState annotation should 
 * be retained at runtime. This means that the annotation will be
 *  available through reflection during runtime.
 * 
 * 
 * @Target(ElementType.TYPE)
 * This annotation specifies that the ExtrinsicState annotation can 
 * only be applied to types (i.e., classes, interfaces, enums, and 
 * annotation types).
 * 
 * public @interface ExtrinsicState
 * This declares a custom annotation called ExtrinsicState.
 * 
 * 
 * Thus, The ExtrinsicState annotation is likely being used to mark or 
 * categorize certain classes. Given the name, it might be related to 
 * the Flyweight design pattern, where the annotation is used to indicate
 *  that a class contains extrinsic state information—state that varies 
 * independently and is supplied externally to the shared objects 
 * (intrinsic state).
 */
