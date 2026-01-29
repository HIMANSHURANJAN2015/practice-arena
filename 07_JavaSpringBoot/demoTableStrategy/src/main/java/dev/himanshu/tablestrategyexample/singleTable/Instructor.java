package dev.himanshu.tablestrategyexample.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Instructor")
public class Instructor extends User {
    private Double ratings;
}