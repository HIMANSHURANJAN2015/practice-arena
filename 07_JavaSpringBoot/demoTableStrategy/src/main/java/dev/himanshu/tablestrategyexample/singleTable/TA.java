package dev.himanshu.tablestrategyexample.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TA")
public class TA extends User {
    private Integer helpRequests;

}
