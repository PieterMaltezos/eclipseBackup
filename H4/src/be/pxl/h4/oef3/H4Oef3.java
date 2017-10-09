package be.pxl.h4.oef3;

import java.util.Scanner;

//author: Pieter Maltezos
public class H4Oef3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int minimumBedrag = 500;
		int korting = 10;
		
		System.out.println("Geef het aantal van uw goederen in.");
		int aantal = input.nextInt();
		System.out.println("Geef de prijs per eenheid in.");
		int eenheidsPrijs = input.nextInt();
		
		int totaalPrijs = aantal * eenheidsPrijs;
		
		if (totaalPrijs > minimumBedrag) {
			int teBetalen = totaalPrijs - korting;
			System.out.println("U moet " + "€" + teBetalen + " betalen.");
	    } else { System.out.println("U moet " + "€" + totaalPrijs + " betalen.");
		input.close();
		
	    } 
	}

}
