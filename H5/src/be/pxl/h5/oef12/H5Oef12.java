package be.pxl.h5.oef12;

import java.util.Scanner;

public class H5Oef12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef uw percentage t.o.v planeet 1 in.");
		double percentagePlaneet1 = input.nextDouble();
		System.out.println("Geef uw percentage t.o.v planeet 2 in");
		double percentagePlaneet2 = input.nextDouble();
		System.out.println("Geef uw percentage t.o.v planeet 3 in");
		double percentagePlaneet3 = input.nextDouble();
		double gewichtAarde = 50;
		double planeet1;
		double planeet2;
		double planeet3;

		System.out.println("AARDE\tMAAN\tJUPITER\tMARS");
		for (gewichtAarde = 50; gewichtAarde <= 120; gewichtAarde += 5) {
			planeet1 = ((gewichtAarde / 100) * percentagePlaneet1);
			planeet2 = ((gewichtAarde / 100) * percentagePlaneet2);
			planeet3 = ((gewichtAarde / 100) * percentagePlaneet3);
			System.out.println(gewichtAarde + "\t" + String.format("%.2f", planeet1) + "\t" + String.format("%.2f", planeet2) + "\t" + String.format("%.2f", planeet3));
		}
		
		input.close();
	}

}
