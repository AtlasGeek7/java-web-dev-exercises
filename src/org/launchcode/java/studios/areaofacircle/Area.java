package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r = -1;
		boolean isNumeric = false; // this will be set to true when a numeric value is entered
		while(!isNumeric || r < 0) {
		    try {
		    	System.out.println("Enter a radius: ");
		    	r = input.nextDouble();
		    	if (r < 0) {
		    		// display error message
		    		System.out.println("The radius must be a positive number!");
		    	}
		        input.nextLine();
		        isNumeric = true; // numeric value entered
		    } catch(InputMismatchException ime) {
		    	// display error message
		    	System.out.println("The radius must be a number!");
		    	input.nextLine(); // advance the scanner
		    }	
		}
		input.close();
		System.out.print("The area of a circle of radius " + r + " is: ");
		System.out.printf("%.2f", Circle.getArea(r));
	}
			
}
