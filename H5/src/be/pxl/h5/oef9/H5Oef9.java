package be.pxl.h5.oef9;

import java.util.Scanner;

public class H5Oef9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Voer uw eerste getal in.");
		int a = input.nextInt();
		System.out.println("Voer uw tweede getal in.");
		int b = input.nextInt();
		System.out.println("Voer uw bewerkingscode in. (1 = +, 2 = -, 3 = x, 4 = a², 5 = b²)");
		int bewerkingscode = input.nextInt();
		
		switch (bewerkingscode) { 
		case 1:
			System.out.println("a + b = " + (a + b));
			break;
		case 2:
			System.out.println("a - b = " + (a - b));
			break;
		case 3:
			System.out.println("a x b = " + (a * b));
			break;
		case 4:
			System.out.println("a² = " + (a * a));
			break;
		case 5: 
		    System.out.println("b² = " + (b * b));
			break;
			default:
			System.out.println("Ongeldige bewerkingscode.");
			

	}
		input.close();
}
}
