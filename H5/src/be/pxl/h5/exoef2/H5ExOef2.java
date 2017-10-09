package be.pxl.h5.exoef2;

import java.util.Scanner;

//author: Pieter Maltezos
public class H5ExOef2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Voer uw graden in fahrenheit in.");
		double fahrenheit = input.nextDouble();
		
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.println("Graden in celsius: " + celsius + ".");

		input.close();
	}

}
