package com.hcl.bon;

public class VideoAdvertisement extends Advertisement {
	private int duration;

	public VideoAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int duration) {
		super(advertisementId, priority, noOfDays, clientName);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public float calculateAdvertisementCharge(float baseCost) {
		float baseAdvertisementCost = baseCost * duration * noOfDays;
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
