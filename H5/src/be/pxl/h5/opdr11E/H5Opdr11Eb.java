package be.pxl.h5.opdr11E;

import java.util.Scanner;

public class H5Opdr11Eb {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Wat is uw burgelijke staat? (1 = ongehuwd, 2 = gehuwd, 3 = weduwe)");
		int burgerlijkeStaat = input.nextInt();
		System.out.println("Wat is uw leeftijd?");
		int leeftijd = input.nextInt();
		double prijs = 25;
		double prijs2 = 15;

		if (burgerlijkeStaat < 2 && leeftijd < 25) { 
			System.out.println("U betaald: " + prijs);
		} else {
			System.out.println("U betaald: " + prijs2);
				
		}
		
		input.close();
		}

		
	}

	


