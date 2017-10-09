package be.pxl.h4.extra.oef1;

import java.util.Scanner;

//author: Pieter Maltezos
public class H4ExtraOef1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.println("Geef uw eerste getal in.");
		int getal1 = input.nextInt();
	System.out.println("Geef uw tweede getal in.");
		int getal2 = input.nextInt();
	
	if ( getal1 < getal2) {
		int kwadraat = getal1 * getal1;
	System.out.println(getal1 + " is uw kleinste getal.");
	System.out.println("Het kwadraat van " + getal1 + " is " + kwadraat + ".");
	}
	if ( getal2 < getal1) {
		int kwadraat = getal2 * getal2;
	System.out.println(getal2 + " is uw kleinste getal");
	System.out.println("Het kwadraat van " + getal2 + " is " + kwadraat + ".");
	}
		input.close();
	}
	
}
