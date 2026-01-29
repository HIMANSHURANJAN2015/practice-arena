package dev.himanshu.tablestrategyexample.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_tas")
@PrimaryKeyJoinColumn(name = "emp_id")
public class TA extends User {
    private Integer helpRequests;

}
