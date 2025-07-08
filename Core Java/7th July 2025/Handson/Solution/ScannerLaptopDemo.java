package com.hcl.handson;
import java.util.Scanner;

public class ScannerLaptopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Display menu
            System.out.println("Enter Option:");
            System.out.println("Add - 1");
            System.out.println("Subtract - 2");
            System.out.println("Multiply - 3");
            System.out.println("Quit - 4");
            System.out.print("Your choice: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter two numbers to be added:");
                    int addNum1 = scanner.nextInt();
                    int addNum2 = scanner.nextInt();
                    int sum = addNum1 + addNum2;
                    System.out.println("The result is " + sum);
                    break;
                case 2:
                    System.out.println("Enter two numbers to be subtracted:");
                    int subNum1 = scanner.nextInt();
                    int subNum2 = scanner.nextInt();
                    int difference = subNum1 - subNum2;
                    System.out.println("The result is " + difference);
                    break;
                case 3:
                    System.out.println("Enter two numbers to be multiplied:");
                    int mulNum1 = scanner.nextInt();
                    int mulNum2 = scanner.nextInt();
                    int product = mulNum1 * mulNum2;
                    System.out.println("The result is " + product);
                    break;
                case 4:
                    System.out.println("Quitting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println(); 
        } while (option != 4);

        scanner.close();
    }
}
