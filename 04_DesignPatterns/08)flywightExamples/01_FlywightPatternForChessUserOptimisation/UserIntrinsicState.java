package com.assignment.question;

import lombok.Getter;

//Step-2: Create class for intrinsic state
@IntrinsicState
@Getter
public class UserIntrinsicState {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Byte[] photo;
}