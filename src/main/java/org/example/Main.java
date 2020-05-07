package org.example;

import org.example.managers.AdminManager;
import org.example.managers.CustomerManager;
import org.example.managers.PersonManager;
import org.example.models.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
            PersonManager personManager = context.getBean("personManager", PersonManager.class);
            System.out.println(personManager.getPerson()+"\n");

            CustomerManager CustomerManager = context.getBean("customerManager", CustomerManager.class);
            System.out.println(CustomerManager.getCustomer());

            AdminManager AdminManager = context.getBean("adminManager", AdminManager.class);
            System.out.println(AdminManager.getAdmin());
        }
    }
}
