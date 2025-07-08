package com.hcl.handson;

public class EmployeeTax {
    public static void main(String[] args) {
        // Test Case 1
        TaxCalculator tc1 = new TaxCalculator();
        tc1.citizenship = true;
        tc1.basicSalary = 25000;
        tc1.calculateTax();
        tc1.deductTax();
        tc1.validateSalary();

        System.out.println(); // Separator between test cases

        // Test Case 2
        TaxCalculator tc2 = new TaxCalculator();
        tc2.citizenship = true;
        tc2.basicSalary = 125000;
        tc2.calculateTax();
        tc2.deductTax();
        tc2.validateSalary();
    }
}
