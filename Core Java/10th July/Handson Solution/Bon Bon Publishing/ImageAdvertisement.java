package com.hcl.bon;

public class ImageAdvertisement extends Advertisement {
	private int inches;

	public ImageAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int inches) {
		super(advertisementId, priority, noOfDays, clientName);
		this.inches = inches;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	@Override
	public float calculateAdvertisementCharge(float baseCost) {
		float baseAdvertisementCost = baseCost * inches * noOfDays;
		float boosterCost = 0;
		float serviceCost = 0;

		if (priority.equalsIgnoreCase("high")) {
			boosterCost = baseAdvertisementCost * 0.10f;
			serviceCost = 1000;
		} else if (priority.equalsIgnoreCase("medium")) {
			boosterCost = baseAdvertisementCost * 0.07f;
			serviceCost = 700;
		} else {
			serviceCost = 200;
		}

		return baseAdvertisementCost + boosterCost + serviceCost;
	}
}
