package be.pxl.h5.oef3;
		//author: Pieter Maltezos
import java.util.Scanner;


public class H5Oef3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hoeveel kilometer heeft u afgelegd dit jaar?");
		double kilometer = input.nextDouble();
		System.out.println("Wat is uw verbruik in liter per 100km?");
		double verbruik = input.nextDouble();
		System.out.println("Wat is de prijs van uw brandstof per liter?");
		double prijsL = input.nextDouble();
		
		
		double verbruikPerKilometer = verbruik / 100;
		double totalePrijs = (kilometer * verbruikPerKilometer * prijsL);
		double prijsKm = totalePrijs / kilometer;
		
		System.out.println("Uw verbruikskosten per jaar bedragen: �" + totalePrijs + ".");
		System.out.println("Per kilometer betaalt u: �" + prijsKm + ".");
		input.close();
	}

}
