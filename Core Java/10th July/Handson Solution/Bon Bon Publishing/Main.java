package com.hcl.bon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the advertisement id");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("Enter the priority (high / medium / low)");
		String priority = sc.nextLine();

		System.out.println("Enter the no of days advertisement is published");
		int noOfDays = Integer.parseInt(sc.nextLine());

		System.out.println("Enter the client name");
		String clientName = sc.nextLine();

		System.out.println("Enter the type of Advertisement (video/image/text)");
		String type = sc.nextLine();

		Advertisement ad = null;
		float baseCost;

		switch (type.toLowerCase()) {
		case "video":
			System.out.println("Enter the duration in minutes");
			int duration = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the base cost");
			baseCost = Float.parseFloat(sc.nextLine());
			ad = new VideoAdvertisement(id, priority, noOfDays, clientName, duration);
			break;

		case "image":
			System.out.println("Enter the number of inches");
			int inches = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the base cost");
			baseCost = Float.parseFloat(sc.nextLine());
			ad = new ImageAdvertisement(id, priority, noOfDays, clientName, inches);
			break;

		case "text":
			System.out.println("Enter the number of characters");
			int chars = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the base cost");
			baseCost = Float.parseFloat(sc.nextLine());
			ad = new TextAdvertisement(id, priority, noOfDays, clientName, chars);
			break;

		default:
			System.out.println("Invalid Advertisement Type");
			sc.close();
			return;
		}

		float totalCost = ad.calculateAdvertisementCharge(baseCost);
		System.out.println("The Advertisement cost is " + totalCost);
		sc.close();
	}
}
