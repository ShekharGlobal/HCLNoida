package com.hcl.bank;

public class CurrentAccount extends Account implements MaintenanceCharge {
	public CurrentAccount(String customerName, String accountNumber, double balance) {
		super(accountNumber, customerName, balance);
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		float baseChargePerYear = 100;
		return (baseChargePerYear * noOfYears) + 200;
	}
}
