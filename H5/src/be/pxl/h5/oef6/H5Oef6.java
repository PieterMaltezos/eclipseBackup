package be.pxl.h5.oef6;

import java.util.Scanner;

public class H5Oef6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double eenheidsPrijs = 11.5;
		double btwPercentage = 0.21;
		double korting = 0.10;

		System.out.println("Voer uw aantal in.");
		double aantalArtikelen = input.nextInt();
		double totalePrijsExclBtw = aantalArtikelen * eenheidsPrijs;
		double totalePrijsInclBtw = totalePrijsExclBtw + (totalePrijsExclBtw * btwPercentage);

		if (totalePrijsInclBtw > 1000) {
			double prijsNaKorting = totalePrijsInclBtw - (totalePrijsInclBtw * korting);
			System.out.println("U betaalt: " + prijsNaKorting + ".");
		} else {
			System.out.println("U betaalt: " + totalePrijsInclBtw);

		}
		input.close();
	}

}
