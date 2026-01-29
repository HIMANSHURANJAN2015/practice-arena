package dev.himanshu.tablestrategyexample.tablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tbc_tas")
public class TA extends User{
    private Integer helpRequests;

}
