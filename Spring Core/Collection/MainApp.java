package com.coforge.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("list.xml");

        // Fetching the employee bean
        Employee employee = (Employee) context.getBean("employee1");

        // Displaying employee details
        employee.display();
    }
}
