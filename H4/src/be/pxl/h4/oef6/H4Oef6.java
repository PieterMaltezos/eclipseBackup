package be.pxl.h4.oef6;

import java.util.Scanner;

//author: Pieter Maltezos
public class H4Oef6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geef uw getal in.");
		int vermenigvuldiger = input.nextInt();
		int getal;

		for (getal = 1; getal <= 20; getal++) {
			int uitkomst = getal * vermenigvuldiger;
			System.out.println(getal + " x " + vermenigvuldiger + " = " + uitkomst);
		}
		input.close();
	}
}