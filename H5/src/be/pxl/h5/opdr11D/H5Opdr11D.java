package be.pxl.h5.opdr11D;

import java.util.Scanner;

public class H5Opdr11D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef uw lengte in. (in meter)");
		int lengte = input.nextInt();
		System.out.println("Geef uw gewicht in. (in kilogram)");
		int gewicht = input.nextInt();
		
		float bmi = gewicht / (lengte * lengte);
		
		if (bmi < 18 ) {
			System.out.println("U heeft ondergewicht.");
		} else {
		if (bmi < 25 ) {
			System.out.println("U heeft een OK gewicht.");
			} else {
		if (bmi < 30 ) {
			System.out.println("U heeft overgewicht.");
				} else {
		if (bmi < 40 ) {
			System.out.println("U heeft obesitas.");
					} else {
		if (bmi > 50 ) {
			System.out.println("U heeft ziekelijke obesitas.");
		}
		input.close();
	}

}
		}
		}
	}
}
