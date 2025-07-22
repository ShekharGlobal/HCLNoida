package com.hcl.orm.crud;

import java.util.Scanner;

public class Mains {

    public static void main(String[] args) {
        CRUD crud = new CRUD(); // Create a CRUD instance
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        int choice;

        do {
            System.out.println("\n=== Hibernate CRUD Operations ===");
            System.out.println("1. Insert Employee");
            System.out.println("2. Select Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Insert Operation
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.next();
                    crud.insertEmployee(id, firstName, lastName);
                    break;

                case 2: // Select Operation
                    System.out.print("Enter Employee ID to Select: ");
                    id = scanner.nextInt();
                    crud.selectEmployee(id);
                    break;

                case 3: // Update Operation
                    System.out.print("Enter Employee ID to Update: ");
                    id = scanner.nextInt();
                    System.out.print("Enter New Last Name: ");
                    String newLastName = scanner.next();
                    crud.updateEmployee(id, newLastName);
                    break;

                case 4: // Delete Operation
                    System.out.print("Enter Employee ID to Delete: ");
                    id = scanner.nextInt();
                    crud.deleteEmployee(id);
                    break;

                case 5: // Exit
                    System.out.println("Exiting the application...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close(); // Close the scanner
        CRUD.closeFactory(); // Close the Hibernate session factory
    }
}
