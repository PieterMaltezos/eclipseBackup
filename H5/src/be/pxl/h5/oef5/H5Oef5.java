package be.pxl.h5.oef5;

import java.util.Scanner;

public class H5Oef5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef uw bedrag in (in � en zonder eurocenten).");
		int bedrag = input.nextInt();
		int briefje = 20;
		int aantalBriefjes = bedrag / briefje;
		int restBedrag = bedrag % briefje;
		
		System.out.println("U ontvangt " + aantalBriefjes + " briefjes van �20.");
		System.out.println("Uw restbedrag bedraagt: �" + restBedrag + ".");
		
		input.close();
	}

}
