package be.pxl.h5.oef4;

import java.util.Scanner;

public class H5Oef4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef uw aantal seconden in.");
		long aantalSeconden = input.nextLong();
		long uren;
		long minuten;
		long seconden;
		
		uren = aantalSeconden / 3600;
		minuten = (aantalSeconden % 3600) / 60;
		seconden = (aantalSeconden % 3600) % 60;
		

		
		System.out.println("Uw aantal seconden vertaald naar: " + " Uren: " + uren + "  Minuten:  " + minuten + "  Seconden:  " + seconden + ".");

		input.close();
	}
	
}
