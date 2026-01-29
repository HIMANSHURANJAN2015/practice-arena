package dev.himanshu.tablestrategyexample.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Mentor")
public class Mentor extends User {
    private String company;

}