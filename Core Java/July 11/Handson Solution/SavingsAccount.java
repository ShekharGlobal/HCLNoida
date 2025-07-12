package com.hcl.bank;

public class SavingsAccount extends Account implements MaintenanceCharge {
	public SavingsAccount(String customerName, String accountNumber, double balance) {
		super(accountNumber, customerName, balance);
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		float baseChargePerYear = 50;
		return (baseChargePerYear * noOfYears) + 50;
	}
}
