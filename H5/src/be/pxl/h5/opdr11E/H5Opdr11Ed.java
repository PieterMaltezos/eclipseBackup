package be.pxl.h5.opdr11E;

import java.util.Scanner;

public class H5Opdr11Ed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Wat is uw burgelijke staat? (1 = ongehuwd, 2 = gehuwd, 3 = weduwe)");
		int burgerlijkeStaat = input.nextInt();
		System.out.println("Wat is uw leeftijd?");
		int leeftijd = input.nextInt();
		int ongehuwd = 1;
		int gehuwd = 2;
		int weduwe = 3;
		double teBetalen = 0;

		if (burgerlijkeStaat == ongehuwd) {
			teBetalen = 25;
			System.out.println("U betaald: " + teBetalen + ".");
			} else {
		if (burgerlijkeStaat == gehuwd && leeftijd < 30) {
			teBetalen = 20;
			System.out.println("U betaald: " + teBetalen + ".");
				} else {
				teBetalen = 15;
				System.out.println("U betaald: " + teBetalen + ".");

			}

			input.close();
		}

	}
}
