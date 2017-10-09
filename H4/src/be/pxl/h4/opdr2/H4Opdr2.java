package be.pxl.h4.opdr2;
		//author: Pieter Maltezos
		import java.util.Scanner;

		public class H4Opdr2 {

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.println("Geef een eerste getal: ");
				int getal1 = input.nextInt();

				System.out.println("Geef een tweede getal: ");
				int getal2 = input.nextInt();

				int sum = getal1 + getal2;

				System.out.println("De som is " + sum );

				input.close();
			}

	
	}
