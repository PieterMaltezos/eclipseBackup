package be.pxl.h5.oef7;

import java.util.Scanner;

public class H5Oef7 {

	public static void main(String[] args) {
		// input
		Scanner input = new Scanner(System.in);
		System.out.println("Voer uw afstand van uw vlucht in KM.");
		int afstand = input.nextInt();
		System.out.println("Voer uw klasse in. (1 = toerist, 2 = charter, 3 = zakenreis)");
		int klasse = input.nextInt();
		// berekening prijs
		double korteAfstandVlucht = 0.25;
		double middellangeAfstandVlucht = 0.20;
		double langeAfstandVlucht = 0.12;
		double charter = 0.20;
		double zakenreis = 0.30;
		double prijsAfstand = 0;
		double prijsKlasse = 0;
		double totalePrijs = 0;

		if (afstand < 1000) {
			prijsAfstand = afstand * korteAfstandVlucht;
		} else {
			if (afstand > 1000 && afstand < 3000) {
				prijsAfstand = afstand * middellangeAfstandVlucht;
			} else {
				if (afstand > 3000) {
					prijsAfstand = afstand * langeAfstandVlucht;			
				}	
			}
		}
		
		switch (klasse) {
		case 2:
			prijsKlasse = (prijsAfstand * charter);
			totalePrijs = prijsAfstand - prijsKlasse;
			break;
		case 3:
			prijsKlasse = (prijsAfstand * zakenreis);
			totalePrijs = prijsAfstand + prijsKlasse;
		}
		System.out.println("Uw vliegtuigticket kost: " + totalePrijs + ".");
		input.close();
	}
}