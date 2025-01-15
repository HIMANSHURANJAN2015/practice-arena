package com.assignment.question;

/*
 * The rationale for ExtrinsicState.java and Intrinsic state.java is explained 
 * in Extrinsicstate.java
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IntrinsicState {
}