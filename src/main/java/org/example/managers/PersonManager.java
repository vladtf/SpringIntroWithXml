package org.example.managers;

import org.example.models.Person;

import java.sql.SQLOutput;

public class PersonManager {
    private final Person person;

    public PersonManager(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void postInit() {
        System.out.println("User: " + person + " was created.");
    }

    public void preDestroy() {
        System.out.println("User: " + person + " was destroyed.");
    }
}
