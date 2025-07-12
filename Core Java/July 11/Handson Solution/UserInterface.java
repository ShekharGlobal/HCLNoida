package com.hcl.bank;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("Enter your choice:");
		int choice = Integer.parseInt(sc.nextLine());

		System.out.println("Enter the Account number");
		String accNumber = sc.nextLine();

		System.out.println("Enter the Customer Name");
		String custName = sc.nextLine();

		System.out.println("Enter the Balance amount");
		double balance = Double.parseDouble(sc.nextLine());

		System.out.println("Enter the number of years");
		float years = Float.parseFloat(sc.nextLine());

		if (choice == 1) {
			SavingsAccount sa = new SavingsAccount(custName, accNumber, balance);
			float charge = sa.calculateMaintenanceCharge(years);

			System.out.println("Customer Name " + sa.getCustomerName());
			System.out.println("Account Number " + sa.getAccountNumber());
			System.out.println("Account Balance " + sa.getBalance());
			System.out.println("Maintenance Charge for Savings Account is Rs " + charge);
		} else if (choice == 2) {
			CurrentAccount ca = new CurrentAccount(custName, accNumber, balance);
			float charge = ca.calculateMaintenanceCharge(years);

			System.out.println("Customer Name " + ca.getCustomerName());
			System.out.println("Account Number " + ca.getAccountNumber());
			System.out.println("Account Balance " + ca.getBalance());
			System.out.println("Maintenance Charge for Current Account is Rs " + charge);
		} else {
			System.out.println("Invalid Choice");
		}

		sc.close();
	}
}
