package com.cts;
//HAS-A
//Composition
public class Bathroom {
	private Tub tub;//has a dependency

	// Constructor to initialize the Tub
	public Bathroom() {
		tub = new Tub();
	}
	//aggregation
	//Constructor accepting an existing Tub
    public Bathroom(Tub tub) {
        this.tub = tub;
    }
	

	public void fill() {
		tub.fillTub();

	}
}