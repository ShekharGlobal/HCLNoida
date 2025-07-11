package com.cts;

public class Main {

	public static void main(String[] args) {
		//Composition
		  Bathroom bathroom = new Bathroom(); 
		  bathroom.fill();
		  
		  //Aggregation
		  //Create a Tub independently
			//The Tub is not created inside the Bathroom.
	        Tub tub = new Tub();
	        // Pass the Tub into the Bathroom
	        //It is passed in (e.g., through the constructor or setter), 
	        //so it can exist independently
	        Bathroom bathroom2 = new Bathroom(tub);

	        bathroom2.fill();
		  
		 

	}

}
