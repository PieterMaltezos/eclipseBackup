package be.pxl.h5.oef8;

//author: Pieter Maltezos
import java.util.Scanner;

public class H5Oef8 {

	public static void main(String[] args) {
		// verzamelen van input
		Scanner input = new Scanner(System.in);
		System.out.println("Voer het behaalde resultaat in van test 1.");
		int resultaat1 = input.nextInt();
		System.out.println("Voer het behaalde resultaat in van test 2.");
		int resultaat2 = input.nextInt();
		System.out.println("Voer het behaalde resultaat in van test 3.");
		int resultaat3 = input.nextInt();

		// percentage berekening
		double maximum = 60;
		double totaalResultaat = resultaat1 + resultaat2 + resultaat3;
		double percentage = (totaalResultaat / maximum) * 100;
		double afgerondPercentage = Math.round(percentage * 10) / 10;
		System.out.println("U behaalde percentage: " + afgerondPercentage + ".");

		// voorwaardelijke output
		if (percentage < 60) {
			System.out.println("Onvoldoende.");
		} else {
			if (percentage < 70) {
				System.out.println("Voldoende.");
			} else {
				if (percentage < 80) {
					System.out.println("Onderscheiding.");
				} else {
					if (percentage < 90) {
						System.out.println("Grote Onderscheiding.");
					} else {
						if (percentage >= 90) {
							System.out.println("Grootste onderscheiding.");
						}
					}
				}
			}
		}
		input.close();
	}
}
