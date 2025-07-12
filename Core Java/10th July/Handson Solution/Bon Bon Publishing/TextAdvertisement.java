package com.hcl.bon;

public class TextAdvertisement extends Advertisement {
	private int noOfCharacters;

	public TextAdvertisement(int advertisementId, String priority, int noOfDays, String clientName,
			int noOfCharacters) {
		super(advertisementId, priority, noOfDays, clientName);
		this.noOfCharacters = noOfCharacters;
	}

	public int getNoOfCharacters() {
		return noOfCharacters;
	}

	public void setNoOfCharacters(int noOfCharacters) {
		this.noOfCharacters = noOfCharacters;
	}

	@Override
	public float calculateAdvertisementCharge(float baseCost) {
		float baseAdvertisementCost = baseCost * noOfCharacters * noOfDays;
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
