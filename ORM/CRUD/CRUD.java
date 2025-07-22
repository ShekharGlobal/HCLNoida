package com.hcl.orm.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD {

    private static SessionFactory factory;

    // Static block to initialize SessionFactory
    static {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();
    }

    // Utility method to get a session
    private static Session getSession() {
        return factory.openSession();
    }

    // Method to insert an Employee
    public void insertEmployee(int id, String firstName, String lastName) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();

            Employee employee = new Employee();
            employee.setId(id);
            employee.setFirstName(firstName);
            employee.setLastName(lastName);

            session.save(employee);
            transaction.commit();

            System.out.println("Record Inserted Successfully");
        }
    }

    // Method to select an Employee by ID
    public void selectEmployee(int id) {
        try (Session session = getSession()) {
            Employee employee = session.get(Employee.class, id);

            if (employee != null) {
                System.out.println("ID: " + employee.getId());
                System.out.println("First Name: " + employee.getFirstName());
                System.out.println("Last Name: " + employee.getLastName());
            } else {
                System.out.println("Employee not found with ID: " + id);
            }
        }
    }

    // Method to update an Employee's last name by ID
    public void updateEmployee(int id, String newLastName) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();

            Employee employee = session.get(Employee.class, id);

            if (employee != null) {
                employee.setLastName(newLastName);
                session.update(employee);
                transaction.commit();

                System.out.println("Employee Updated Successfully");
            } else {
                System.out.println("Employee not found with ID: " + id);
            }
        }
    }

    // Method to delete an Employee by ID
    public void deleteEmployee(int id) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();

            Employee employee = session.get(Employee.class, id);

            if (employee != null) {
                session.delete(employee);
                transaction.commit();

                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Employee not found with ID: " + id);
            }
        }
    }

    // Closing the factory when the application shuts down
    public static void closeFactory() {
        if (factory != null) {
            factory.close();
            System.out.println("SessionFactory closed.");
        }
    }
}
