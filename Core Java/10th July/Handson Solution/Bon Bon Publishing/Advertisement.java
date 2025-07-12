package com.hcl.bon;

public abstract class Advertisement {
	protected int advertisementId;
	protected String priority;
	protected int noOfDays;
	protected String clientName;

	public Advertisement(int advertisementId, String priority, int noOfDays, String clientName) {
		this.advertisementId = advertisementId;
		this.priority = priority;
		this.noOfDays = noOfDays;
		this.clientName = clientName;
	}

	public int getAdvertisementId() {
		return advertisementId;
	}

	public void setAdvertisementId(int advertisementId) {
		this.advertisementId = advertisementId;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public abstract float calculateAdvertisementCharge(float baseCost);
}
