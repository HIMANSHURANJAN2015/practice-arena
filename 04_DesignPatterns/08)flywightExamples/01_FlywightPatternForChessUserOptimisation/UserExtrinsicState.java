package com.assignment.question;

//Step-3: Create class for extrinsic state
import lombok.Getter;

@ExtrinsicState
@Getter
public class UserExtrinsicState {
    private Colour colour;
    /*its was not clear whether colour is extrinsic or intrinsic.
    Test case failed and so I got to know that colour is extrinsic property.
    */
    private int currentGameStreak;
    private UserIntrinsicState user;
}