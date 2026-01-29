package dev.himanshu.tablestrategyexample.tablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tbc_instructors")
public class Instructor extends User{
    private Double ratings;
}