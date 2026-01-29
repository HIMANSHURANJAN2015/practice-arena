package dev.himanshu.tablestrategyexample.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.util.UUID;


@Entity(name = "jt_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    private String name;

    @Id
    private UUID id;
}