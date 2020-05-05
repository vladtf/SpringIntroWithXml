package org.example;

import org.example.managers.PersonManager;
import org.example.models.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
            PersonManager personManager = context.getBean("personManager", PersonManager.class);
            System.out.println(personManager.getPerson()+"\n");
        }
    }
}
